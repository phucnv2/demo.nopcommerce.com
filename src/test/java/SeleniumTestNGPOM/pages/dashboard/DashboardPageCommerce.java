package SeleniumTestNGPOM.pages.dashboard;

import SeleniumTestNGPOM.pages.catalog.products.AddNewProductPage;
import SeleniumTestNGPOM.pages.catalog.products.ProductPage;
import org.testng.Assert;

import static SeleniumTestNGPOM.locator.dashboard.LocatorDashboard.*;
import static keyword.WebUI.*;

public class DashboardPageCommerce {
    private String PAGE_URL = "https://admin-demo.nopcommerce.com/login?returnurl=%2Fadmin%2F";
    private String PAGE_TEXT = "Dashboard";
    public void verifyDashboardPage(){
        Assert.assertEquals(getTextElement(headerPageDashboard),PAGE_TEXT,"Fail! Page is not Dashboard.");
    }
//    public AddNewCategoriesPage openCategoriesPage(){
//        waitForPageLoaded();
//        clickElement(menuCatalog);
//        clickElement(submenuCategories);
//        return new AddNewCategoriesPage();
//    }
    public ProductPage openProductPage(){
        waitForPageLoaded();
        clickElement(menuCatalog);
        clickElement(submenuProducts);
        return new ProductPage();
    }
}
