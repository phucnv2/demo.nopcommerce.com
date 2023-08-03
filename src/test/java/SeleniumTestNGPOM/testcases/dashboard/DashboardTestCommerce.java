package SeleniumTestNGPOM.testcases.dashboard;

import SeleniumTestNGPOM.common.BaseTest;
import SeleniumTestNGPOM.pages.dashboard.DashboardPageCommerce;
import SeleniumTestNGPOM.pages.login.LoginPageCommerce;
import keyword.WebUI;
import org.testng.annotations.Test;

public class DashboardTestCommerce extends BaseTest {
    LoginPageCommerce loginPageCommerce;
    DashboardPageCommerce dashboardPageCommerce;

    @Test
    public void openMenuCatalog() {
        loginPageCommerce = new LoginPageCommerce();
        dashboardPageCommerce = loginPageCommerce.loginSuccess("admin@yourstore.com", "admin");
        dashboardPageCommerce.verifyDashboardPage();
        dashboardPageCommerce.openProductPage();
//        WebUI.sleep(5);
    }
}
