package SeleniumTestNGPOM.testcases;

import SeleniumTestNGPOM.dataproviders.DataLogin;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider {
    @Test(dataProvider = "dataLoginCRM", dataProviderClass = DataLogin.class)
    public void testLoginCRM(String email, String password) {
        System.out.println(email + " - " + password);
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.quit();
    }

    @Test(dataProvider = "dataLoginCMS", dataProviderClass = DataLogin.class)
    public void testLoginCMS(String email, String password, int pin) {
        System.out.println(email + " - " + password + " - " + pin);
    }
}
