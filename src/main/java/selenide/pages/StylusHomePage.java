package selenide.pages;

import com.codeborne.selenide.Selenide;
import selenide.components.LoginPopup;
import selenide.locators.ProfileLocators;
import selenide.locators.HomePageLocators;
import utils.Constants;

import static com.codeborne.selenide.Selenide.$x;

public class StylusHomePage {
    LoginPopup loginPopup = this.openAutorization();

    public StylusHomePage open(){
        Selenide.open(Constants.BASE_URL);
        return this;
    }

    public StylusHomePage chooseLanguage(){
        $x(HomePageLocators.CHOOSE_UK_LANGUAGE_BTN_XPATH).click();
        return this;
    }

    public LoginPopup openAutorization(){
        $x(HomePageLocators.LOGIN_PROFILE_BTN_XPATH).click();
        return new LoginPopup();
    }

    public ProfilePage authorizeUser(String email, String password){
        chooseLanguage();
        openAutorization();

        loginPopup.setLogin(email)
                  .setPassword(password)
                  .acceptPopup();
        return new ProfilePage();
    }


}
