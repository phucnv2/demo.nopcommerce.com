package SeleniumTestNGPOM.testcases.login;

import SeleniumTestNGPOM.common.BaseTest;
import SeleniumTestNGPOM.pages.login.LoginPageCommerce;
import helpers.ExcelHelper;
import org.testng.annotations.Test;

public class LoginTestCommerce extends BaseTest {
    LoginPageCommerce loginPageCommerce;
    @Test
    public void loginPageSuccess(){
        loginPageCommerce = new LoginPageCommerce();
        ExcelHelper excelHelper = new ExcelHelper();
        excelHelper.setExcelFile("src/test/resources/datatest/Crm.xlsx","Login");
        loginPageCommerce.loginSuccess(excelHelper.getCellData("EMAIL",1),excelHelper.getCellData("PASSWORD",1));
    }
}
