package selenide.pages;

import selenide.locators.ProfileLocators;

import static com.codeborne.selenide.Selenide.$x;

public class ProfilePage {
    public LaptopPcTabletPage openCatalog(){
        $x(ProfileLocators.CATALOG_MENU_DROPDOWN_XPATH).click();
        $x(ProfileLocators.LAPTOP_PC_TABLET_ITEM_XPATH).click();
        return new LaptopPcTabletPage();
    }
}