package SeleniumTestNGPOM.locator.catalog.products;

import org.openqa.selenium.By;

public class LocatorProducts {
    public static By headerProductPage = By.xpath("//div[@class='content-header clearfix']//h1");
    public static By inputProductName = By.xpath("//input[@id='SearchProductName']");
    public static By buttonSearchProduct = By.xpath("//button[@id='search-products']");
    public static By buttonAddNewProduct = By.xpath("//a[normalize-space()='Add new']");
    public static By cardHeaderProduct = By.xpath("//div[@id='product-info']//div[@class='card-header with-border clearfix']");//input[@id='Name']
    public static By inputNameProduct = By.xpath("//input[@id='Name']");
    public static By textareaShortDescription = By.xpath("//textarea[@id='ShortDescription']");
    public static By textareaFulldescription = By.xpath("//div[@class='tox-edit-area']");
    public static By inputSKU = By.xpath("//input[@id='Sku']");
    public static By dropdownCategories = By.xpath("//div[@class='form-group row']//div[@role='listbox']");
    public static By inputCategories_dropdown = By.xpath("//div[@class='form-group row']//input[@role='listbox']");
    public static By dropdownManufacturers = By.xpath("//div[@class='form-group row']//div[@role='listbox']");
    public static By checkboxPublished = By.xpath("//div[@class='form-group row']//div[@role='listbox']");
    public static By inputProductTags = By.xpath("//div[@class='form-group row']//div[@role='listbox']");
    public static By inputPrice = By.xpath("//div[@id='product-price-area']//input[@title='0.0000 USD']");
    public static By textareaAdminComment = By.xpath("//textarea[@id='AdminComment']");

    public static By buttonSaveProduct = By.xpath("//button[@name='save']");
}
