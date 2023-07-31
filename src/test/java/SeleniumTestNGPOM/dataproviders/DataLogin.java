package SeleniumTestNGPOM.dataproviders;

import helpers.ExcelHelper;
import helpers.SystemsHelper;
import org.testng.annotations.DataProvider;

public class DataLogin {
    @DataProvider(name = "dataLoginCRM",parallel = true)
    public Object[][] dataLoginCRM() {
        return new Object[][]{
                {"admin@example.com", "123456"},
                {"admin1@example.com", "123456"},
                {"admin2@example.com", "123456"}
        };
    }

    @DataProvider(name = "dataLoginCMS")
    public Object[][] dataLoginCMS() {
        return new Object[][]{
                {"admin@example.com", "123456", 123},
                {"admin@example.com", "123456", 1234}
        };
    }
    @DataProvider(name = "data_provider_login_excel",parallel = true)
    public Object[][] dataLoginHRMFromExcel() {
        ExcelHelper excelHelpers = new ExcelHelper();
        Object[][] data = excelHelpers.getExcelData(SystemsHelper.getCurrentDir() + "src/test/resources/datatest/Crm.xlsx", "Login");
        System.out.println("Login Data from Excel: " + data);
        return data;
    }
}
