package selenide.components;

import selenide.locators.AsusRogLocators;
import selenide.pages.AsusRogPage;
import selenide.pages.CheckoutPage;

import static com.codeborne.selenide.Selenide.$x;

public class AddToCartPopup {
    public CheckoutPage confirmNewOrder(){
        $x(AsusRogLocators.CONFIRM_NEW_ORDER_BTN_XPATH).click();
        return new CheckoutPage();
    }
}
