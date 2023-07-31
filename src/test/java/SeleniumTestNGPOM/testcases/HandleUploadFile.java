package SeleniumTestNGPOM.testcases;

import SeleniumTestNGPOM.common.BaseTest;
import drivers.DriverManager;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class HandleUploadFile extends BaseTest {
    @Test
    public void testUploadFile2() throws InterruptedException {
        DriverManager.getDriver().get("https://files.fm/");

        Thread.sleep(2000);

        By textOnPage = By.xpath("//div[@id='file_select_dragndrop_text']");
        By divFileUpload = By.xpath("//div[@id='uploadifive-file_upload']");
        By inputFileUpload = By.xpath("//div[@id='file_select_button']//input[@id='file_upload']");

        String filePath = "D:\\anh.jpg";

        //Click để mở form upload
        DriverManager.getDriver().findElement(divFileUpload).click();
        Thread.sleep(3);

        // Khởi tạo Robot class
        Robot rb = null;
        try {
            rb = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }

        // Copy File path vào Clipboard
        StringSelection str = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

        Thread.sleep(1000);

        // Nhấn Control+V để dán
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);

        // Xác nhận Control V trên
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);

        Thread.sleep(1000);

        // Nhấn Enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(4000);
    }
}
