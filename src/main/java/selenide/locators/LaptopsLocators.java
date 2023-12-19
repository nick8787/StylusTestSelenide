package selenide.locators;

public class LaptopsLocators {
    private static final String LAPTOP_CONTENT_BLOCK_XPATH = "//div[@class='content-block']";
    private static final String laptopTitlePatternXpath = LAPTOP_CONTENT_BLOCK_XPATH.concat("//a[@title='%s']");
    public static String getLaptopTitleXpath(String title){
        return String.format(laptopTitlePatternXpath, title);
    }
}