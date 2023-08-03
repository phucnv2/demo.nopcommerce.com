package SeleniumTestNGPOM.testcases.catalog.product;

import SeleniumTestNGPOM.common.BaseTest;
import SeleniumTestNGPOM.pages.catalog.products.AddNewProductPage;
import SeleniumTestNGPOM.pages.catalog.products.ProductPage;
import SeleniumTestNGPOM.pages.dashboard.DashboardPageCommerce;
import SeleniumTestNGPOM.pages.login.LoginPageCommerce;
import helpers.CaptureHelpers;
import org.testng.annotations.Test;

public class ProductsTest extends BaseTest {
    ProductPage productPage;
    LoginPageCommerce loginPageCommerce;
    DashboardPageCommerce dashboardPageCommerce;
    AddNewProductPage addNewProductPage;


//    AddNewProductPage productPage;
    @Test
    public void addNewProduct(){
        CaptureHelpers.startRecord("addNewProduct");
        String productName ="Hoang";
        loginPageCommerce = new LoginPageCommerce();
        dashboardPageCommerce = loginPageCommerce.loginSuccess("admin@yourstore.com","admin");
        productPage = dashboardPageCommerce.openProductPage();
        addNewProductPage = productPage.clickBtnAddNewProduct();
        addNewProductPage.addNewProduct(productName);
        CaptureHelpers.stopRecord();
    }
}
