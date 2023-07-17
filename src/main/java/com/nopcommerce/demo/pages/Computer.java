package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Computer extends Utility {

    @CacheLookup

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computerMenu;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']")
    WebElement desktopsTab;

    @FindBy(xpath = "//option[contains(text(),'Name: Z to A')]")
    WebElement sortByZtoA;

    @FindBy(xpath = "//option[contains(text(),'Name: A to Z')]")
    WebElement sortByAtoZ;

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]")
    WebElement addToCart;

    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement buildText;

    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processor;

    @FindBy(xpath = "//select[@id='product_attribute_2']" )
    WebElement ram;

    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement radioButton;

    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement vistaPremium;

    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement totalCommander;

    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement microsoftOffice;

    @FindBy(xpath ="//span[@id='price-value-1']" )
    WebElement getAmount;

    @FindBy(xpath ="//button[@id='add-to-cart-button-1']" )
    WebElement addToCart1;

    @FindBy(xpath = "//p[contains(text(),'product ')]")
    WebElement message;

    @FindBy(xpath ="//body/div[@id='bar-notification']/div[1]/span[1]" )
    WebElement closeTheBar;

    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement shoppingCart;

    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement goToCart;

    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]" )
    WebElement shoppingCartMessage;
    @FindBy(className = "qty-input")
    WebElement qtyBox;

    @FindBy(xpath = "//button[@id='updatecart']")
    WebElement updateShoppingCart;

    @FindBy(xpath = "//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]")
    WebElement totalAmount;

    @FindBy(xpath ="//input[@id='termsofservice']" )
    WebElement agreeTermsOfService;

    @FindBy(xpath ="//button[@id='checkout']" )
    WebElement checkoutBox;

    @FindBy(xpath ="//h1[contains(text(),'Welcome, Please Sign In!')]" )
    WebElement welcomeMessage;

    @FindBy(xpath = "//button[contains(text(),'Checkout as Guest')]")
    WebElement checkoutAsGuest;

    @FindBy(xpath = "//input[@id='BillingNewAddress_FirstName']" )
    WebElement firstName;

    @FindBy(xpath ="//input[@id='BillingNewAddress_LastName']" )
    WebElement lastName;

    @FindBy(xpath = "//input[@id='BillingNewAddress_Email']")
    WebElement email;

    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement country;

    @FindBy(xpath ="//input[@id='BillingNewAddress_City']" )
    WebElement city;

    @FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
    WebElement address1;

    @FindBy(xpath ="//input[@id='BillingNewAddress_ZipPostalCode']" )
    WebElement postalCode;

    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement phoneNumber;

    @FindBy(xpath ="//button[@onclick='Billing.save()']" )
    WebElement continueButton;

    @FindBy(xpath ="//input[@id='shippingoption_1']" )
    WebElement radioButtonShipping;

    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement continueShipping;

    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement radioCreditCard;

    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement continueOnCreditCard;

    @FindBy(xpath ="//select[@id='CreditCardType']" )
    WebElement creditCardType;

    @FindBy(xpath = "//input[@id='CardholderName']")
    WebElement cardHolderName;

    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement cardNumber;

    @FindBy(xpath = "//select[@id='ExpireMonth']" )
    WebElement expDate;

    @FindBy(xpath ="//select[@id='ExpireYear']" )
    WebElement expYear;

    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cardCode;

    @FindBy(xpath ="//button[@class='button-1 payment-info-next-step-button']" )
    WebElement continueToPay;

    @FindBy(xpath = "//li[@class='payment-method']")
    WebElement getPaymentMethodText;

    @FindBy(xpath ="//li[@class='shipping-method']" )
    WebElement getShippingMethod;

    @FindBy(xpath = "//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]")
    WebElement totalPaymentPaid;

    @FindBy(xpath ="//button[normalize-space()='Confirm']" )
    WebElement confirmToPayment;

    @FindBy(xpath = "//h1[contains(text(),'Thank you')]" )
    WebElement thankYouMessage;

    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement successfullyProcessed;

    @FindBy(xpath = "//button[contains(text(),'Continue')]" )
    WebElement continueOnPay;

    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement welcomeToOrStore;


    // By computerMenu = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    // By desktopsTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']");
    // By sortByZtoA = By.xpath("//option[contains(text(),'Name: Z to A')]");
    // By sortByAtoZ = By.xpath("//option[contains(text(),'Name: A to Z')]");
    // By addToCart = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");
    // By buildText = By.xpath("//h1[contains(text(),'Build your own computer')]");
    //  By processor = By.xpath("//select[@id='product_attribute_1']");
    //  By ram = By.xpath("//select[@id='product_attribute_2']");
    // By radioButton = By.xpath("//input[@id='product_attribute_3_7']");
    // By vistaPremium = By.xpath("//input[@id='product_attribute_4_9']");
    // By totalCommander = By.xpath("//input[@id='product_attribute_5_12']");
    // By microsoftOffice = By.xpath("//input[@id='product_attribute_5_10']");
    // By getAmount = By.xpath("//span[@id='price-value-1']");
    //  By addToCart1 = By.xpath("//button[@id='add-to-cart-button-1']");
    // By message = By.xpath("//p[contains(text(),'product ')]");
    //   By closetheBar = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    //  By shoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    //  By goToCart = By.xpath("//button[contains(text(),'Go to cart')]");
    //  By shoppingCartMessage = By.xpath("//h1[contains(text(),'Shopping cart')]");
    // By qtyBox = By.className("qty-input");
    // By updateShoppingCart = By.xpath("//button[@id='updatecart']");
    // By totalAmount = By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]");
    //  By agreeTermsOfService = By.xpath("//input[@id='termsofservice']");
    //By checkoutBox = By.xpath("//button[@id='checkout']");
    // By welcomeMessage = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    // By checkoutAsGuest = By.xpath("//button[contains(text(),'Checkout as Guest')]");
    // By firstName = By.xpath("//input[@id='BillingNewAddress_FirstName']");
   // By lastName = By.xpath("//input[@id='BillingNewAddress_LastName']");
   // By email = By.xpath("//input[@id='BillingNewAddress_Email']");
   // By country = By.xpath("//select[@id='BillingNewAddress_CountryId']");
   // By city = By.xpath("//input[@id='BillingNewAddress_City']");
   // By address1 = By.xpath("//input[@id='BillingNewAddress_Address1']");
   // By postalCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
   // By phoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    // By continueButton = By.xpath("//button[@onclick='Billing.save()']");
    //  By radioButtonShipping = By.xpath("//input[@id='shippingoption_1']");
    //  By continueShipping = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    // By radioCreditCard = By.xpath("//input[@id='paymentmethod_1']");
    // By continueOnCreditCard = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    //  By creditCardType = By.xpath("//select[@id='CreditCardType']");
    // By cardHolderName = By.xpath("//input[@id='CardholderName']");
    //By cardNumber = By.xpath("//input[@id='CardNumber']");
    //By expDate = By.xpath("//select[@id='ExpireMonth']");
    // By expYear = By.xpath("//select[@id='ExpireYear']");
    // By cardCode = By.xpath("//input[@id='CardCode']");
    // By continueToPay = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    // By getPaymentMethodText = By.xpath("//li[@class='payment-method']");
    // By getShippingMethod = By.xpath("//li[@class='shipping-method']");
    // By totalPaymentPaid = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]");
    // By confirmToPayment = By.xpath("//button[normalize-space()='Confirm']");
    // By thankYouMessage = By.xpath("//h1[contains(text(),'Thank you')]");
    // By successfullyProcessed = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    // By continueOnPay = By.xpath(" //button[contains(text(),'Continue')]");
    // By welcomeToOrStore = By.xpath("//h2[contains(text(),'Welcome to our store')]");


    public void clickOnComputerMenu() {
        mouseHoverToElement(computerMenu);
    }
    public void clickOnDesktopsTab() {
        mouseHoverToElementAndClick(desktopsTab);
    }
    public void sortByNameZtoA() {
        clickOnElement(sortByZtoA);
    }
    public String getSortByNameZtoA() {
        return getTextFromElement(sortByZtoA);
    }

    // 2.3 Select Sort By position "Name: A to Z"
    public void sortByNameAtoZ() {
        clickOnElement(sortByAtoZ);
    }
    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }
    //  Verify the Text "Build your own computer
    public String getText() {
        return getTextFromElement(buildText);
    }
    //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
    public void selectProcessor() {
        selectByIndexFromDropDown(processor, 1);
    }
    //2.7.Select "8GB [+$60.00]" using Select class.
    public void selectRam() {
        selectByIndexFromDropDown(ram, 3);
    }
    //2.8 Select HDD radio "400 GB [+$100.00]"
    public void selectRadioButton() {
        clickOnElement(radioButton);
    }
    //2.9 Select OS radio "Vista Premium [+$60.00]"
    public void selectVistaPremium() {
        clickOnElement(vistaPremium);
    }
    //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"

    public void checkTwoBoxes() {
        clickOnElement(microsoftOffice);
        clickOnElement(microsoftOffice);
        clickOnElement(totalCommander);
    }

    //  Verify the price "$1,475.00
    public String getTotalAmount() {
        return getTextFromElement(getAmount);

    }
    // 2.12 Click on "ADD TO CARD" Button
    public void clickToAddToCart() {
        clickOnElement(addToCart1);

    }
    public String getTheMessage() {
        return getTextFromElement(message);
    }
    // After that close the bar clicking on the cross button.
    public void closeTheBar() {
        clickOnElement(closeTheBar);
    }
    // Then MouseHover on "Shopping cart" and Click on "GO TO CART" button
    public void shoppingCart() {
        mouseHoverToElement(shoppingCart);
    }
    public void clickToGoCart() {
        clickOnElement(goToCart);
    }
    // Verify the message "Shopping cart"
    public String getShoppingCartMessage() {
        return getTextFromElement(shoppingCartMessage);
    }
    //2.16 Change the Qty to "2" and Click on "Update shopping cart"
    public void clearAndAddQuantity() {
        clearTextOnElement(qtyBox);
        sendTextToElement(qtyBox, "2");
        clickOnElement(updateShoppingCart);
    }
    // 2.17 Verify the Total"$2,950.00"
    public String getTotalAmount1() {
        return getTextFromElement(totalAmount);
    }
    public void clickOnTermsOfService() {
        clickOnElement(agreeTermsOfService);
    }
    public void clickOnCheckOut() {
        clickOnElement(checkoutBox);
    }
    public String getWelcomeMessage() {
        return getTextFromElement(welcomeMessage);
    }
    // 2.21Click on “CHECKOUT AS GUEST” Tab
    public void clickOnCheckOutAsGuest() {
        clickOnElement(checkoutAsGuest);
    }
    //2.22 Fill the all mandatory field
    public void firstNameField() {
        sendTextToElement(firstName, "Champa");
    }
    public void lastNameField() {
        sendTextToElement(lastName, "Chameli");
    }
    public void emailField() {
        sendTextToElement(email, "thursday@gmail.com");
    }
    public void countryField() {
        selectByValueFromDropDown(country, "233");
    }
    public void cityField() {
        sendTextToElement(city, "London");
    }
    public void address1Field() {
        sendTextToElement(address1, "12 Lindsay Avenue");
    }
    public void postalCodeField() {
        sendTextToElement(postalCode, "RG1 8NG");
    }
    public void phoneNumberField() {
        sendTextToElement(phoneNumber, "07852698543");
    }
    public void clickOnContinue() {
        clickOnElement(continueButton);
    }
    public void clickOnRadioButton() {
        clickOnElement(radioButtonShipping);
    }
    public void clickOnContinueShippingMethod() {
        clickOnElement(continueShipping);
    }
    public void clickOnRadioCreditCard() {
        clickOnElement(radioCreditCard);
    }

    public void clickOnContinueOnCreditCard() {
        clickOnElement(continueOnCreditCard);
    }
    // Select “Master card” From Select credit card dropdown
    //2.28 Fill all the details
    //2.29 Click on “CONTINUE”
    public void selectMasterCard() {
        selectByValueFromDropDown(creditCardType, "MasterCard");
    }
    public void cardHolderNameField() {
        sendTextToElement(cardHolderName, "Champa Chameli");
    }
    public void creditCardNumberField() {
        sendTextToElement(cardNumber, "5368392055488809");
    }
    public void selectExpiryMonthField() {
        selectByValueFromDropDown(expDate, "2");
    }
    public void selectExpiryYearField() {
        selectByValueFromDropDown(expYear, "2024");
    }
    public void cardCodeNumberField() {
        sendTextToElement(cardCode, "236");
    }
    public void clickContinueToPayment() {
        clickOnElement(continueToPay);
    }
    //2.30 Verify “Payment Method” is “Credit Card”
    public String getPaymentMethod() {
        return getTextFromElement(getPaymentMethodText);
    }
    //2.32 Verify “Shipping Method” is “Next Day Air”
    public String getShippingMethod() {
        return getTextFromElement(getShippingMethod);
    }
    //2.33 Verify Total is “$2,950.00”
    public String getTotalPaymentPaid() {
        return getTextFromElement(totalPaymentPaid);
    }
    //2.34 Click on “CONFIRM”
    public void clickConfirmToPay() {
        clickOnElement(confirmToPayment);
    }
    //2.35 Verify the Text “Thank You”
    public String getVerifyTheThankYouMessage() {
        return getTextFromElement(thankYouMessage);
    }
    //2.36 Verify the message “Your order has been successfully processed!”
    public String getToVerifyYourOrderHasBeenSuccessfullyProcessed() {
        return getTextFromElement(successfullyProcessed);
    }
    //2.37 Click on “CONTINUE”
    public void clickOnContinue3() {
        clickOnElement(continueOnPay);
    }
    //2.37 Verify the text “Welcome to our store
    public String getToVerifyWelcomeToOurStore() {
        return getTextFromElement(welcomeToOrStore);
    }





}
