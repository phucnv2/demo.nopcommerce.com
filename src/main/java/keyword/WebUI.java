package keyword;

import com.aventstack.extentreports.Status;
import com.ibm.icu.impl.Assert;
import drivers.DriverManager;
import io.appium.java_client.functions.ExpectedCondition;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import reports.ExtentTestManager;

import java.time.Duration;
import java.util.List;

import static drivers.DriverManager.getDriver;

public class WebUI {
    private static int EXPLICIT_WAIT_TIMEOUT = 10;
    private static int WAIT_PAGE_LEADED_TIMEOUT = 20;

    public static void hoverOnElement(By by) {
        waitForElementVisible(by);
        Actions actions = new Actions(getDriver());
        actions.moveToElement(getWebElement(by));
        logConsole("Hover on Element" + by);
        ExtentTestManager.logMessage(Status.PASS,"Hover on Element" + by);
    }

    public static WebElement highLightElement(By by) {
        // Tô màu border ngoài chính element chỉ định - màu đỏ (có thể đổi màu khác)
        waitForElementVisible(by);
        if (getDriver() instanceof JavascriptExecutor) {
            ((JavascriptExecutor) getDriver()).executeScript("arguments[0].style.border='3px solid red'", getWebElement(by));
            sleep(1);
        }
        return getWebElement(by);
    }

    public static void rightClick(By by) {
        waitForElementVisible(by);
        Actions actions = new Actions(getDriver());
        actions.contextClick(getWebElement(by));
        logConsole("Click mouse right" + by);
        ExtentTestManager.logMessage(Status.PASS,"Click mouse right" + by);
    }

    public static void logConsole(String message) {
        System.out.println(message);
    }

    @Step("Mở URL: {0}")
    public static void openURL(String URL) {
        getDriver().get(URL);
        waitForPageLoaded();
        logConsole("Mở URL" + URL);
        ExtentTestManager.logMessage(Status.PASS,"Mở URL: " + URL);
    }
    @Step("Lấy URL: {0}")
    public static String getCurrentUrl() {
        waitForPageLoaded();
        logConsole("Lấy URL" + getDriver().getCurrentUrl());
        ExtentTestManager.logMessage(Status.PASS,"Lấy URL: " + getDriver().getCurrentUrl());

        return getDriver().getCurrentUrl();
    }

    public static WebElement getWebElement(By by) {
        return getDriver().findElement(by);
    }
    @Step("Click on element: {0}")
    public static void clickElement(By by) {
        waitForElementVisible(by);
        highLightElement(by);
        getWebElement(by).click();
        logConsole("Click on element: " + by);
        ExtentTestManager.logMessage(Status.PASS,"Click on element: " + by);

    }
    @Step("Set text {1} on element {0}")
    public static void senkeyText(By by, String value) {
        waitForElementVisible(by);
        getWebElement(by).sendKeys(value);
        logConsole("Set text " + value + " on element " + by);
        ExtentTestManager.logMessage(Status.PASS,"Set text " + value + " on element " + by);

    }
    @Step("Hiển thị text element: {0}")
    public static String getTextElement(By by) {
        waitForElementVisible(by);
        logConsole("Hiển thị text element " + by);
        logConsole("=> Text: " + getWebElement(by).getText());
        ExtentTestManager.logMessage(Status.PASS,"Hiển thị text element: " + by);
        ExtentTestManager.logMessage(Status.INFO,"=> Text: " + getWebElement(by).getText());
        return getWebElement(by).getText();
    }
    @Step("Hiển thị giá trị {1} value of element {0}")
    public static String getAttribute(By by, String attributeName) {
        logConsole("Hiển thị giá trị element " + by);
        logConsole("=> Value: " + getWebElement(by).getAttribute(attributeName));
        ExtentTestManager.logMessage(Status.PASS,"Hiển thị giá trị element: " + by);
        ExtentTestManager.logMessage(Status.INFO,"=> Value: " + getWebElement(by).getAttribute(attributeName));
        return getWebElement(by).getAttribute(attributeName);
    }

    public static void scrollToElementWithJS(By by) {
        waitForElementPresent(by);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", getWebElement(by));
    }

    public static void sleep(double seconds) {
        try {
            Thread.sleep((long) (1000 * seconds));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public static boolean verifyElementVisible(By by, int second) {
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(second), Duration.ofMillis(500));
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;
        } catch (TimeoutException e) {
            e.printStackTrace();
            return false;
        }

    }

    public static boolean verifyElementNotVisible(By by, int second) {
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(second), Duration.ofMillis(500));
            wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
            return true;
        } catch (TimeoutException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean verifyElementNotPresent(By by) {
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(EXPLICIT_WAIT_TIMEOUT), Duration.ofMillis(500));
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
            return false;
        } catch (Exception e) {
            return true;
        }
    }

    public static void waitForElementVisible(By by, int second) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(second), Duration.ofMillis(500));

        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static void waitForElementVisible(By by) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(EXPLICIT_WAIT_TIMEOUT), Duration.ofMillis(500));

        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static void waitForElementPresent(By by, int second) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(second));

        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public static void waitForElementPresent(By by) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(EXPLICIT_WAIT_TIMEOUT));

        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public static void waitForElementClickable(By by, int second) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(second));

        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static Boolean checkElementExist(By by) {
        List<WebElement> listElement = getDriver().findElements(by);

        if (listElement.size() > 0) {
            System.out.println("Element " + by + " existing.");
            return true;
        } else {
            System.out.println("Element " + by + " NOT exist.");
            return false;
        }
    }

    public static Boolean checkElementExist(String xpath) {
        List<WebElement> listElement = getDriver().findElements(By.xpath(xpath));

        if (listElement.size() > 0) {
            System.out.println("Element " + xpath + " existing.");
            return true;
        } else {
            System.out.println("Element " + xpath + " NOT exist.");
            return false;
        }
    }

    /**
     * Wait for Page loaded
     * Chờ đợi trang tải xong (Javascript tải xong)
     */
    public static void waitForPageLoaded() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(WAIT_PAGE_LEADED_TIMEOUT), Duration.ofMillis(500));
        JavascriptExecutor js = (JavascriptExecutor) getDriver();

        //Wait for Javascript to load
        ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                return js.executeScript("return document.readyState").toString().equals("complete");
            }
        };

        //Check JS is Ready
        boolean jsReady = js.executeScript("return document.readyState").toString().equals("complete");

        //Wait Javascript until it is Ready!
        if (!jsReady) {
            System.out.println("Javascript is NOT Ready.");
            //Wait for Javascript to load
            try {
                wait.until(jsLoad);
            } catch (Throwable error) {
                error.printStackTrace();
                Assert.fail("FAILED. Timeout waiting for page load.");
            }
        }
    }
}
