package selenide.components;

import selenide.locators.HomePageLocators;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPopup  {
    public LoginPopup setLogin(String email){
        $x(HomePageLocators.EMAIL_FIELD_XPATH).sendKeys(email);
        return new LoginPopup();
    }

    public LoginPopup setPassword(String password){
        $x(HomePageLocators.PASSWORD_FIELD_XPATH).sendKeys(password);
        return new LoginPopup();
    }

    public LoginPopup acceptPopup(){
        $x(HomePageLocators.LOGIN_BTN_XPATH).click();
        return new LoginPopup();
    }
}
