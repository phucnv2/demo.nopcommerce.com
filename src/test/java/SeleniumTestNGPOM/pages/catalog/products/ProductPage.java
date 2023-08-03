package SeleniumTestNGPOM.pages.catalog.products;

import org.testng.Assert;

import static SeleniumTestNGPOM.locator.catalog.products.LocatorProducts.*;
import static keyword.WebUI.*;

public class ProductPage {
    private String PAGE_TEXT = "Products";
    public void verifyProductsPage(){
        Assert.assertEquals(getTextElement(headerProductPage),PAGE_TEXT,"Fail!");
    }
    public AddNewProductPage clickBtnAddNewProduct(){
        verifyProductsPage();
//        waitForElementVisible(buttonAddCustomer,10);
        clickElement(buttonAddNewProduct);
        return new AddNewProductPage();
    }
}
