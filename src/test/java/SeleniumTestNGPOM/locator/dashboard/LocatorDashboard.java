package SeleniumTestNGPOM.locator.dashboard;

import org.openqa.selenium.By;

public class LocatorDashboard {

    public static By headerPageDashboard = By.xpath("//div[@class='content-header']//h1");

    public static By menuCatalog = By.xpath("//p[normalize-space()='Catalog']");
    public static By submenuCategories = By.xpath("//p[normalize-space()='Categories']");
    public static By submenuProducts = By.xpath("//p[normalize-space()='Products']");
}
