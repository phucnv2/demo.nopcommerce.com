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

    private String textErrEmailNull = "Please enter your email";
    private String textErrEmailWrong = "No customer account found";
    private String textErrPasswordWrongFormat = "The credentials provided are incorrect";
    private String textErrEmailWrongFormat = "Wrong email";

    public void verifyLoginPage() {
        Assert.assertEquals(getTextElement(headerPage), pageHeader, "Fail! Header is not match.");
        Assert.assertEquals(getTextElement(titlePage), pageTitle, "Fail! Title is not match.");
    }

    public void checkUsernameNull() {
        Assert.assertEquals(getTextElement(messageEmailNull), textErrEmailNull, "Fail!");
    }

    public void checkUsernameWrong() {
        Assert.assertEquals(getTextElement(messageErrorEmailInvalid), textErrEmailWrong, "Fail!");
    }
    public void checkPasswordWrong(){
        Assert.assertEquals(getTextElement(messagePasswordInvalid),textErrPasswordWrongFormat,"Fail!");
    }
    public void checkEmailWrongFormat(){
        Assert.assertEquals(getTextElement(messageEmailWrongFormat),textErrEmailWrongFormat,"Fail!");
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

    public void loginUsernameNull(String email, String password) {
        openURL(PropertiesHelper.getValue("urlCommerce"));
        verifyLoginPage();
        clearTextInput();
        inputEmail(email);
        inputPassword(password);
        clickbtnLogin();
        checkUsernameNull();
    }

    public void loginUsernameWrong(String email, String password) {
        openURL(PropertiesHelper.getValue("urlCommerce"));
        verifyLoginPage();
        clearTextInput();
        inputEmail(email);
        inputPassword(password);
        clickbtnLogin();
        checkUsernameWrong();
    }
    public void loginPasswordWrong(String email,String password){
        openURL(PropertiesHelper.getValue("urlCommerce"));
        verifyLoginPage();
        clearTextInput();
        inputEmail(email);
        inputPassword(password);
        clickbtnLogin();
        checkPasswordWrong();
    }
    public void loginEmailWrongFormat(String email, String password){
        openURL(PropertiesHelper.getValue("urlCommerce"));
        verifyLoginPage();
        clearTextInput();
        inputEmail(email);
        inputPassword(password);
        clickbtnLogin();
        checkEmailWrongFormat();
    }
}
