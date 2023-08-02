package SeleniumTestNGPOM.locator.catalog.categories;

import org.openqa.selenium.By;

public class LocatorAddNewCategories {
    public static By headerAddNewCategories = By.xpath("//div[@class='content-header clearfix']//h1");
    public static By buttonSaveCategories = By.xpath("//button[@name='save']");
    public static By inputNameCategories = By.xpath("//input[@id='Name']");
    public static By inputDescriptionCategories = By.xpath("//div[@class='tox-edit-area']");
    public static By buttonUploadFile = By.xpath("//input[@title='file input']");
    public static By buttonRemoveCategories = By.xpath("//div[@class='upload-button-container']//div//span[contains(text(),'Remove picture')]");
    public static By cardHeaderCategoryInfo = By.xpath("//div[contains(text(),'Category info')]");
}
