package selenide;

import static com.codeborne.selenide.Selenide.$x;

public class Helper {
    public static void selectDropdown(String dropdownLocator, String value) {
        String optionPatternXpath = "//div[@id='delivery_payment']//div[@class='fake-select-options']//div[text()='%s']";
        String optionXpath = String.format(optionPatternXpath, value);
        $x(dropdownLocator).click();
        $x(optionXpath).click();
    }
}