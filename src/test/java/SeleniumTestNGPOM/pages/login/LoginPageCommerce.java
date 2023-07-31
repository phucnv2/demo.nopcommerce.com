package SeleniumTestNGPOM.pages.login;

import SeleniumTestNGPOM.locator.login.LocatorLogin;
import SeleniumTestNGPOM.pages.dashboard.DashboardPageCommerce;
import helpers.PropertiesHelper;
import org.testng.Assert;
import org.testng.AssertJUnit;

import static SeleniumTestNGPOM.locator.login.LocatorLogin.*;
import static keyword.WebUI.*;

public class LoginPageCommerce {
    private String pageTitle = "Welcome, please sign in!";
    private String pageHeader = "Admin area demo";

    public void verifyLoginPage() {
        Assert.assertEquals(getTextElement(headerPage), pageHeader, "Fail! Header is not match.");
        Assert.assertEquals(getTextElement(titlePage), pageTitle, "Fail! Title is not match.");
    }

    public void inputEmail(String email) {
        senkeyText(inputEmail, email);
    }

    public void inputPassword(String password) {
        senkeyText(inputPassword, password);
    }

    public void clickbtnLogin() {
        clickElement(buttonLogin);
    }

    public void clearTextInput() {
        clearText(inputEmail);
        clearText(inputPassword);
    }

    public DashboardPageCommerce loginSuccess(String email, String password) {
        openURL(PropertiesHelper.getValue("urlCommerce"));
        verifyLoginPage();
        clearTextInput();
        inputEmail(email);
        inputPassword(password);
        clickbtnLogin();
        return new DashboardPageCommerce();
    }

}
