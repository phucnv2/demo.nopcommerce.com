package SeleniumTestNGPOM.pages.customers;

import SeleniumTestNGPOM.common.BaseTest;
import keyword.WebUI;
import static keyword.WebUI.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AddCustomerPage{
    private String PAGE_URL = "https://crm.anhtester.com/admin/clients/client";
    private String PAGE_TEXT = "Customer Details";

    public By tabCustomerDetail = By.xpath("//a[@aria-controls='contact_info']");
    public By inputCompany = By.xpath("//input[@id='company']");
    public By inputVat = By.xpath("//input[@id='vat']");
    public By inputPhoneNumber = By.xpath("//input[@id='phonenumber']");
    public By inputWebsite = By.xpath("//input[@id='website']");
    public By dropdownGroups = By.xpath("//label[@for='groups_in[]']/following-sibling::div");
    public By inputGroups = By.xpath("//label[@for='groups_in[]']/following-sibling::div//input[@type='search']");
    private By inputCurrency = By.xpath("//button[@data-id='default_currency']");
    private By inputLanguage = By.xpath("//button[@data-id='default_language']");
    private By inputAddress = By.xpath("//textarea[@id='address']");
    private By inputCity = By.xpath("//input[@id='city']");
    private By inputState = By.xpath("//input[@id='state']");
    private By inputZipcode = By.xpath("//input[@id='zip']");
    private By dropdownCountry = By.xpath("//label[@for='country']/following-sibling::div");
    private By inputCountry = By.xpath("//div[@app-field-wrapper='country']//input");
    private By buttonSave = By.xpath("//div[@id='profile-save-section']//button[normalize-space()='Save']");

    public void selectGroups(String groupName){
        clickElement(dropdownGroups);
        getWebElement(inputGroups).sendKeys(groupName, Keys.ENTER);
        clickElement(dropdownGroups);
    }
    public void selectCountry(String country){
        clickElement(dropdownCountry);
        getWebElement(inputGroups).sendKeys(country, Keys.ENTER);
    }
    public void  addNewCustomer(String CUSTOMER_NAME){
        senkeyText(inputCompany,CUSTOMER_NAME);
        senkeyText(inputVat,"10");
        senkeyText(inputPhoneNumber,"0123456789");
        senkeyText(inputWebsite,"https://anhtester.com/");
        selectGroups("Gold");
        senkeyText(inputAddress,"Viet Nam");
        senkeyText(inputCity,"Can Tho");
        senkeyText(inputState,"Can Tho");
        senkeyText(inputZipcode,"1000");
        sleep(2);
        clickElement(buttonSave);
        waitForPageLoaded();
    }
}
