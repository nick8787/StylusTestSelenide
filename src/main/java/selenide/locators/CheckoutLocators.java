package selenide.locators;

public class CheckoutLocators {
    public static final String LASTNAME_FIELD_XPATH = "//input[@id='checkout:name_last']";
    public static final String PHONE_NUMBER_FIELD_XPATH = "//input[@id='checkout:tel']";
    public static final String DELIVERY_STREET_FIELD_XPATH = "//input[@name='form_delivery_street']";
    public static final String PAYMENT_METHOD_DROPDOWN_XPATH = "//span[text()='Спосіб оплати']/following-sibling::div/div[@class='select-label']/following-sibling::div/div[@class='fake-select-title']";
    public static final String ACCEPT_ORDER_BTN_XPATH = "//div[@class='checkout-action-block']//button[@type='submit']";
    public static final String THANK_FOR_ORDER_HEADER_XPATH = "//h1[text()='Дякуємо! Ваша заявка прийнята']";
    public static final String ADDRESS_INFO_BLOCK_XPATH = "//div[@class='address-block-info']";
    private static final String laptopTitleBlockPatternXpath = "//div[@class='name-block']//a[@title='%s']";
    public static String getLaptopTitleXpath(String title){
        return String.format(laptopTitleBlockPatternXpath, title);
    }
}