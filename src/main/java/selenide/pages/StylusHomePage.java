package selenide.pages;

import com.codeborne.selenide.Selenide;
import selenide.components.LoginPopup;
import selenide.locators.HomePageLocators;
import utils.Constants;

import static com.codeborne.selenide.Selenide.$x;

public class StylusHomePage {
    LoginPopup loginPopup = this.openAuthorization();

    public StylusHomePage open(){
        Selenide.open(Constants.BASE_URL);
        return this;
    }

    public StylusHomePage chooseLanguage(){
        $x(HomePageLocators.CHOOSE_UK_LANGUAGE_BTN_XPATH).click();
        return this;
    }

    public LoginPopup openAuthorization(){
        $x(HomePageLocators.LOGIN_PROFILE_BTN_XPATH).click();
        return new LoginPopup();
    }

    public ProfilePage authorizeUser(String email, String password){
        chooseLanguage();
        openAuthorization();

        loginPopup.setLogin(email)
                  .setPassword(password)
                  .acceptPopup();
        return new ProfilePage();
    }


}
