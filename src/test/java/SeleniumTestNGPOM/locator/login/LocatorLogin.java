package SeleniumTestNGPOM.locator.login;

import org.openqa.selenium.By;

public class LocatorLogin {
    public static By headerPage = By.xpath("//div[@class='page-title']//h1");
    public static By titlePage = By.xpath("//div[@class='title']//strong");
    public static By inputEmail = By.xpath("//input[@id='Email']");
    public static By inputPassword = By.xpath("//input[@id='Password']");
    public static By buttonLogin = By.xpath("//button[normalize-space()='Log in']");
    public static By messageEmailNull = By.xpath("//span[@id='Email-error']");

    public static By messageErrorEmailInvalid = By.xpath("//div[@class='message-error validation-summary-errors']//li");

    public static By messagePasswordInvalid = By.xpath("//div[@class='message-error validation-summary-errors']//li");
    public static By checkboxRemember = By.xpath("//div[@class='inputs reversed']//input");
}
