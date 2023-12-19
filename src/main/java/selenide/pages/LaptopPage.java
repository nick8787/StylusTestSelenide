package selenide.pages;

import enums.LaptopName;
import selenide.locators.LaptopsLocators;

import static com.codeborne.selenide.Selenide.$x;

public class LaptopPage {
    public AsusRogPage openAsusRog(LaptopName laptopName){
        $x(LaptopsLocators.getLaptopTitleXpath(laptopName.getValue())).click();
        return new AsusRogPage();
    }
}
