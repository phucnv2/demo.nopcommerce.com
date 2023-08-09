package SeleniumTestNGPOM.pages.catalog.products;

import org.testng.Assert;

import static SeleniumTestNGPOM.locator.catalog.products.LocatorProducts.*;
import static keyword.WebUI.*;

public class AddNewProductPage {
    private String PAGE_TEXT = "Add a new product";

    public void verifyAddNewProductsPage(){
        Assert.assertEquals(getTextElement(headerProductPage),PAGE_TEXT,"Fail!");
    }

    public void addNewProduct(String nameProduct){
        verifyAddNewProductsPage();
        senkeyText(inputNameProduct,nameProduct);
        senkeyText(textareaShortDescription,"NGUYEN VAN PHUC");
        senkeyText(textareaFulldescription,"NGUYEN VAN PHUC NGUYEN VAN PHUC");
        senkeyText(inputSKU,"PHUC");
        clickElement(dropdownCategories);
        senkeyText(inputCategories_dropdown,"Computers");
        clickElement(buttonSaveProduct);
        waitForPageLoaded();
    }
}
