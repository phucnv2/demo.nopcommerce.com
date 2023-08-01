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
    @Test
    public void loginUsernameNull(){
        loginPageCommerce = new LoginPageCommerce();
        loginPageCommerce.loginUsernameNull("","admin");
    }
    @Test
    public void loginUsernameWrong(){
        loginPageCommerce = new LoginPageCommerce();
        loginPageCommerce.loginUsernameWrong("admin@yourstore.comm","admin");
        loginPageCommerce.checkUsernameWrong();
    }
    @Test
    public void loginPasswordWrong(){
        loginPageCommerce = new LoginPageCommerce();
        loginPageCommerce.loginPasswordWrong("admin@yourstore.com","adminn");
        loginPageCommerce.checkPasswordWrong();
    }
    @Test
    public void loginEmailWrongFormat(){
        loginPageCommerce = new LoginPageCommerce();
        loginPageCommerce.loginEmailWrongFormat("admin","adminn");
        loginPageCommerce.checkEmailWrongFormat();
    }
}
