package SeleniumTestNGPOM.locator.catalog.categories;

import org.openqa.selenium.By;

public class LocatorCategories {
    public static By headerCategories = By.xpath("//div[@class='content-header clearfix']//h1");
    public static By inputSearchCategoriesName = By.xpath("//input[@id='SearchCategoryName']");
    public static By dropdownCategories = By.xpath("//select[@id='SearchPublishedId']");
    public static By buttonSearchCategories = By.xpath("//button[@id='search-categories']");
    public static By buttonAddNewCategories = By.xpath("//a[normalize-space()='Add new']");
    public static By buttonDeeleteCategories = By.xpath("//button[@id='delete-selected']");
    public static By buttonIconCollapse = By.xpath("//div[@class='icon-collapse']");
}
