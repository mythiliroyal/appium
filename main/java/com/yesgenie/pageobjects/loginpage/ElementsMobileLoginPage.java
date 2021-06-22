package com.yesgenie.pageobjects.loginpage;

public class ElementsMobileLoginPage extends ElementsLoginPage {

    ElementsMobileLoginPage(){
        super.loginUsernameField = this.registerUserName;
        super.loginPassword =this.registerPwd;
        super.loginButton =this.loginButton;
        super.continueBtn = this.continueBtn;
        super.otpFields = this.otpFields;
        super.finalPwd =this.loginPwd;
    }

    public String registerNowLabel = "xpath~//android.widget.TextView"
            + "[@content-desc=\"testID_Registration_RegistrationTitle\"]";

    public String registerNowSubText = "xpath~//android.widget.TextView"
            + "[@content-desc=\"testID_Registration_RegistrationDesc\"]";

    public String loginUserIdLabel = "xpath~//android.view.ViewGroup"
            + "[@content-desc=\"testID_Registration_RegistrationMain\"]"
            + "/android.view.ViewGroup[1]/android.widget.TextView";

    public String registerUserName = "accessibilityId~testID_Registration_userID";

    public String loginPasswordLabel = "xpath~//android.view.ViewGroup"
            + "[@content-desc=\"testID_Registration_RegistrationMain\"]"
            + "/android.view.ViewGroup[3]/android.widget.TextView";

    public String registerPwd= "accessibilityId~testID_Registration_Password";

    public String loginButton = "xpath~//android.view.ViewGroup[@content-desc=\"testID_Button_Submit_onPress\"]";

    public String footerRightsText = "xpath~//android.view.ViewGroup"
            + "[@content-desc=\"testID_Registration_RegistrationMain\"]"
            + "/android.view.ViewGroup[6]/android.widget.TextView";

    public String continueBtn = "xpath~//android.view.ViewGroup"
            + "[@content-desc=\"testID_Button_Continue_onPress\"]/android.view.ViewGroup";

    public String otpFields = "xpath~//android.widget.EditText"
            + "[contains(@content-desc,\"testID_OTPInputView_OTPInputField\")]";

    public String loginPwd= "accessibilityId~testID_LoginPage_password";

}
