package SeleniumTestNGPOM.testcases;

import SeleniumTestNGPOM.common.BaseTest;
import drivers.DriverManager;
import helpers.CaptureHelpers;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.AssertJUnit;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

public class TestScreenshot extends BaseTest {
    @Test
    public void testHomePage2(Method method) {
        DriverManager.getDriver().get("https://anhtester.com/login");
        AssertJUnit.assertEquals(DriverManager.getDriver().getTitle(), "Login");
    }
    @AfterMethod
    public void tearDown(ITestResult iTestResult){
        if (iTestResult.getStatus() == ITestResult.FAILURE){
            // Chụp màn hình step này lại
            CaptureHelpers.captureScreenshot(iTestResult.getName());
        }
    }
}
