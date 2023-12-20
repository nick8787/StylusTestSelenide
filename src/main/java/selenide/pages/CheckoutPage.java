package selenide.pages;

import com.codeborne.selenide.SelenideElement;
import dto.AddPersonData;
import enums.DeliveryStreet;
import enums.LaptopName;
import enums.PaymentType;
import generator.FakeRandomGenerator;
import selenide.Helper;
import selenide.locators.CheckoutLocators;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;

public class CheckoutPage {
    DeliveryStreet deliveryStreet = FakeRandomGenerator.getRandomOption(DeliveryStreet.class);

    public CheckoutPage finishOrderCreation(AddPersonData personData){
        setDeliveryStreet();
        setLastName(personData.getLastName());
        setPhoneNumber(personData.getPhoneNumber());
        addPaymentType(personData.getPaymentType());
        return this;
    }

    public CheckoutPage setLastName(String lastname){
        $x(CheckoutLocators.LASTNAME_FIELD_XPATH).sendKeys(lastname);
        return this;
    }

    public CheckoutPage setPhoneNumber(String phoneNumber){
        $x(CheckoutLocators.PHONE_NUMBER_FIELD_XPATH).sendKeys(phoneNumber);
        return this;
    }

    public CheckoutPage setDeliveryStreet(){
        $x(CheckoutLocators.DELIVERY_STREET_FIELD_XPATH).shouldBe(visible).setValue(deliveryStreet.getType());
        return this;
    }

    public CheckoutPage scrollToPaymentType() {
        SelenideElement paymentTypeElement = $x(CheckoutLocators.PAYMENT_METHOD_DROPDOWN_XPATH);
        paymentTypeElement.scrollTo();
        return this;
    }

    public CheckoutPage addPaymentType(PaymentType paymentType){
        scrollToPaymentType();
        Helper.selectDropdown(CheckoutLocators.PAYMENT_METHOD_DROPDOWN_XPATH, paymentType.getType());
        return this;
    }

    public CheckoutPage acceptOrder(){
        $x(CheckoutLocators.ACCEPT_ORDER_BTN_XPATH).click();
        return this;
    }

    public void verifyOrderCreated(LaptopName laptopName){
        $x(CheckoutLocators.THANK_FOR_ORDER_HEADER_XPATH).shouldBe(visible);
        $x(CheckoutLocators.ADDRESS_INFO_BLOCK_XPATH).shouldBe(visible);
        $x(CheckoutLocators.getLaptopTitleXpath(laptopName.getValue())).shouldBe(visible);
    }
}
