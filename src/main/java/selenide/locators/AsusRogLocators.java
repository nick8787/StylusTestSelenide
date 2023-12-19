package selenide.locators;

public class AsusRogLocators {
    public static final String BUY_BTN_XPATH = "(//button[@class='buy-btn js-action'])[1]";
    private static final String CONFIRM_ACTION_BLOCK_XPATH = "//div[@class='actions']";
    public static final String CONFIRM_NEW_ORDER_BTN_XPATH = CONFIRM_ACTION_BLOCK_XPATH.concat("//button[@type='submit']");
}
