package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class ProductPage extends Utility {
    By products = By.className("title");
    By numberOfproducts = By.xpath("//div[@class='inventory_item']");

    public String verifyThatSixProductsAreDisplayedOnPage() {
        return getTextFromElement(products);
    }

    public String verifyingNumberOfProductsOnThePage() {
        return getTextFromElement(numberOfproducts);
    }
}
