package com.yesgenie.pageobjects.bindings;

import java.lang.reflect.Field;

import com.google.inject.AbstractModule;
import com.google.inject.TypeLiteral;
import com.google.inject.matcher.AbstractMatcher;
import com.google.inject.matcher.Matchers;
import com.google.inject.spi.InjectionListener;
import com.google.inject.spi.TypeEncounter;
import com.google.inject.spi.TypeListener;
import com.yesgenie.pageobjects.ElementsApp;


public class ElementsBinding extends AbstractModule {

    public void configure() {
        bindListener(Matchers.any(), new TypeListener() {
            public <I> void hear(TypeLiteral<I> type, TypeEncounter<I> encounter) {
                encounter.register(InitInvoker.INSTANCE);
            }
        });
    }

    static class HasInitMethod extends AbstractMatcher<TypeLiteral<?>> {
        public static final HasInitMethod INSTANCE = new HasInitMethod();

        public boolean matches(TypeLiteral<?> tpe) {
            try {
                return tpe.getRawType().getFields() != null;
            } catch (Exception e) {
                return false;
            }
        }
    }

    static class InitInvoker implements InjectionListener {
        public static final InitInvoker INSTANCE = new InitInvoker();

        public void afterInjection(Object injectee) {
            try {
                Class classA = injectee.getClass();
                Field[] fields = classA.getDeclaredFields();
                for (Field field : fields) {
                    boolean isSubClass;
                    try {
                        field.getType().asSubclass(ElementsApp.class);
                        isSubClass = true;
                    } catch (Exception e) {
                        isSubClass = false;
                    }
                    if (isSubClass) {
                        field.setAccessible(true);
                        Class elementInstance = field.getType();
                        Object instance = elementInstance.newInstance();
                        field.set(injectee, instance);

                        System.out.println(classA.getSuperclass().getSimpleName());
                        Class superClass = classA.getSuperclass();

                        Field[] superClassDeclaredFields = superClass.getDeclaredFields();

                        for (Field superClassField : superClassDeclaredFields) {
                            boolean isFieldSubClass = false;
                            try {
                                superClassField.getType().asSubclass(ElementsApp.class);
                                isFieldSubClass = true;
                            } catch (Exception e) {
                                isFieldSubClass = false;
                            }

                            if (isFieldSubClass) {
                                superClassField.setAccessible(true);
                                superClassField.set(injectee, instance);
                                break;
                            }
                        }

                        injectee.getClass().getMethod("init").invoke(injectee);
                        break;
                    }


                }

            } catch (Exception e) {
                /* do something to handle errors here */
                e.printStackTrace();
            }
        }
    }
}
