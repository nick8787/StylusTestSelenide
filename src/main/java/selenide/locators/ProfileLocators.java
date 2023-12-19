package selenide.locators;

public class ProfileLocators {
    // Header container
    private static final String HEADER_CONTAINER_XPATH = "//div[@class='header-bottom']";
    public static final String CATALOG_MENU_DROPDOWN_XPATH = HEADER_CONTAINER_XPATH.concat("//button[@id='header_catalog']");

    //Catalog block
    private static final String CATALOG_BLOCK_XPATH = "//div[@class='catalog-block']";
    public static final String LAPTOP_PC_TABLET_ITEM_XPATH = CATALOG_BLOCK_XPATH.concat("//a[@title='Ноутбуки, ПК, Планшети']");
}
