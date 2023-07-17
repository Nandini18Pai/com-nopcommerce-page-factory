package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisters.CustomListeners;
import com.nopcommerce.demo.pages.TopMenu;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListeners.class)
public class TopMenuTest extends BaseTest {

    TopMenu topMenu;

    public void selectMenu(String menu) {
        clickOnElement(By.xpath(menu));
    }


    @BeforeMethod(alwaysRun = true)
    public void inIT() {
        topMenu = new TopMenu();
    }

    @Test(groups = {"sanity","smoke", "regression"})
    public void verifyPageNavigation() {
        topMenu.selectMenu("Computer");
        topMenu.clickOnComputer();


    selectMenu("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");
    String expectedText = "Computers";
    String actualText = topMenu.getToVerifyText();
    Assert.assertEquals("Text not verified", actualText, expectedText);
}



    }



