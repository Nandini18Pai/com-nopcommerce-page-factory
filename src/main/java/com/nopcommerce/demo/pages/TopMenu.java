package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 *
 * 1.1 create method with name "selectMenu" it has one parameter name "menu" of type string
 * 1.2 This method should click on the menu whatever name is passed as parameter.
 * 1.3. create the @Test method name verifyPageNavigation.use selectMenu method to
 *       select the Menu and click on it and verify the page navigation.
 */

public class TopMenu extends Utility {
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li")
    List<WebElement> topMenuTab;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computerLink;

    @FindBy(xpath="//h1[contains(text(),'Computers')]")
    WebElement computerText;

// By topMenuTab = "//ul[@class='top-menu notmobile']/li");
// By computerLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");



    public void clickOnComputer(){
        clickOnElement(computerLink);
    }


    public void selectMenu(String menu) {
        clickOnElement(By.xpath(menu));
    }

    public String getToVerifyText(){
       return getTextFromElement(computerText);
    }

   // String expectedPage = "https://demo.nopcommerce.com/computers";
  //  String actualPage =   topMenu.currentUrl();
  //  Assert.assertEquals(expectedPage,actualPage, "Does not navigate");


}
