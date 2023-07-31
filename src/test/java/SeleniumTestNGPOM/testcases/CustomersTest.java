package SeleniumTestNGPOM.testcases;

import SeleniumTestNGPOM.common.BaseTest;
import SeleniumTestNGPOM.pages.customers.AddCustomerPage;
import SeleniumTestNGPOM.pages.customers.CustomerDetailPage;
import SeleniumTestNGPOM.pages.customers.CustomersPage;
import SeleniumTestNGPOM.pages.dashboard.DashboardPage;
import SeleniumTestNGPOM.pages.login.LoginPage;
import helpers.CaptureHelpers;
import org.testng.annotations.Test;

public class CustomersTest extends BaseTest {
    CustomersPage customersPage;
    LoginPage loginPage;
    DashboardPage dashboardPage;
    AddCustomerPage addCustomerPage;
    CustomerDetailPage customerDetailPage;
    @Test
    public void addNewCustomer(){
        CaptureHelpers.startRecord("addNewCustomer");
        String CUSTOMER_NAME = "QQQQQ";
        loginPage = new LoginPage();
        dashboardPage = loginPage.pageLoginSuccess("admin@example.com","123456");
        customersPage = dashboardPage.openCustomerPage();
//        customersPage.verifyPageCustomer();
        addCustomerPage = customersPage.clickBtnAddNewCustomer();
        addCustomerPage.addNewCustomer(CUSTOMER_NAME);
        dashboardPage.openCustomerPage();
        customersPage.searchRecordAddNew(CUSTOMER_NAME);
        customerDetailPage = customersPage.clickCustomerDetail();
        customerDetailPage.checkCustomerDetail(CUSTOMER_NAME);
        CaptureHelpers.stopRecord();
    }

}
