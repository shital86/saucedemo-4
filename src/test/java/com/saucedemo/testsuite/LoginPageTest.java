package com.saucedemo.testsuite;

import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.ProductPage;
import com.saucedemo.testbase.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class LoginPageTest extends TestBase {
    HomePage homePage = new HomePage();
    ProductPage productPage=new ProductPage();

    @Test
    public void verigyingLogo() {
        homePage.enterUserName("standard_user");
        homePage.enterPassword("secret_sauce");
        homePage.clickOnLoginButton();
        productPage.verifyThatSixProductsAreDisplayedOnPage();
        productPage.verifyingNumberOfProductsOnThePage();
        List<WebElement> number= driver.findElements(By.xpath("//div[@class='inventory_item']"));
        int actualnumber=number.size();
        int expectednumber= 6;
        Assert.assertEquals("6 product not displayed",expectednumber,actualnumber);

    }
}
