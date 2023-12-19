package selenide.pages;

import selenide.components.AddToCartPopup;
import selenide.locators.AsusRogLocators;

import static com.codeborne.selenide.Selenide.$x;

public class AsusRogPage {
    public AddToCartPopup buyLaptop(){
        $x(AsusRogLocators.BUY_BTN_XPATH).click();
        return new AddToCartPopup();
    }

}
