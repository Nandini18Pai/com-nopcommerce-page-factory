package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class Electronics extends Utility {

    @CacheLookup

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")
    WebElement electronics;

    @FindBy(xpath ="//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']" )
    WebElement cellPhone;

    @FindBy(tagName ="h1" )
    WebElement cellPhoneText;

    @FindBy(xpath ="//a[contains(text(),'List')]" )
    WebElement listView;

    @FindBy(xpath = "//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]")
    WebElement nokiaLumia1020;

    @FindBy(xpath ="//h1[contains(text(),'Nokia Lumia 1020')]" )
    WebElement getTextNokia;

    @FindBy(xpath = "//span[@id='price-value-20']")
    WebElement verifyThePrice;

    @FindBy(xpath ="//input[@id='product_enteredQuantity_20']" )
    WebElement quantity;

    @FindBy(xpath ="//button[@id='add-to-cart-button-20']" )
    WebElement addToCart;

    @FindBy(xpath ="//p[@class='content']" )
    WebElement verifyTheMessage;

    @FindBy(xpath = "//span[@title='Close']")
    WebElement closeTheBar;

    @FindBy(xpath ="//li[@id='topcartlink']" )
    WebElement shoppingCart;

    @FindBy(xpath ="//button[contains(text(),'Go to cart')]" )
    WebElement goToCart;

    @FindBy(xpath = "//h1[normalize-space()='Shopping cart']")
    WebElement shoppingCartText;

    @FindBy(css ="#itemquantity11243" )
    WebElement verifyQuantity;

    @FindBy(xpath = "//span[@class='product-subtotal']")
    WebElement verifyTheTotal;

    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement checkBox;

    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkOut;

    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeMessage;

    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement register;

    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;

    @FindBy(xpath ="//input[@id='gender-female']")
    WebElement gender;

    @FindBy(xpath ="//input[@id='FirstName']")
    WebElement firstName;

    @FindBy(xpath ="//input[@id='LastName']")
    WebElement lastName;

    @FindBy(xpath ="//input[@id='Email']")
    WebElement email;

    @FindBy(xpath ="//input[@name= 'Password']")
    WebElement password;

    @FindBy(xpath ="//input[@id='ConfirmPassword']")
    WebElement confirmPassword;

    @FindBy(xpath ="//button[@id='register-button']")
    WebElement registerTab;

    @FindBy(xpath ="//div[contains(text(),'Your registration completed')]")
    WebElement registerCompleteText;

    @FindBy(xpath ="//a[contains(text(),'Continue')]" )
    WebElement continueAfterRegistration;

    @FindBy(xpath = "//a[@class='ico-login']")
    WebElement login;

    @FindBy(xpath ="//input[@id='Email']" )
    WebElement emailLoginField;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordLoginField;

    @FindBy(xpath ="//button[normalize-space()='Log in']" )
    WebElement loginButton;

    @FindBy(xpath = "//h1[normalize-space()='Shopping cart']")
    WebElement shoppingCartText1;

    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement checkBoxTermsOfService;

    @FindBy(xpath = "//button[@id='checkout']")
    WebElement finalCheckOut;

    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement countryField;









    @FindBy(xpath ="//select[@id='BillingNewAddress_StateProvinceId']" )
    WebElement stateField;

    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
    WebElement cityNameField;


    @FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
    WebElement addressField;

    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement postalCodeField;

    @FindBy(xpath ="//input[@id='BillingNewAddress_PhoneNumber']" )
    WebElement phoneNumber;

    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement updateContinue;

    @FindBy(xpath = "//input[@id='shippingoption_2']")
    WebElement shippingOption2;

    @FindBy(xpath ="//button[@class='button-1 shipping-method-next-step-button']")
    WebElement continueButton;

    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement paymentMethod;

    @FindBy(xpath ="//button[@class='button-1 payment-method-next-step-button']" )
    WebElement continueAfterCard;

    @FindBy(xpath ="//select[@id='CreditCardType']" )
    WebElement selectCardType;

    @FindBy(xpath ="//input[@id='CardholderName']" )
    WebElement cardHolderNameField;

    @FindBy(xpath ="//input[@id='CardNumber']" )
    WebElement cardNumberField;

    @FindBy(xpath ="//select[@id='ExpireMonth']" )
    WebElement selectExpDate;

    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement selectExpYear;

    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cardCodeFiled;

    @FindBy(xpath ="//button[@class='button-1 payment-info-next-step-button']" )
    WebElement continueAfterPaymentDetails;

    @FindBy(xpath = " //li[@class='payment-method']")
    WebElement paymentByCreditCard;

    @FindBy(xpath = "//li[@class='shipping-method']")
    WebElement shippingMethodBy2ndDayAir;

    @FindBy(xpath ="//span[@class='value-summary']//strong[contains(text(),'$698.00')]" )
    WebElement totalPaymentToPay;

    @FindBy(xpath = "//button[normalize-space()='Confirm']")
    WebElement confirmAfterPayment;

    @FindBy(xpath = "//h1[normalize-space()='Thank you']")
    WebElement thankYouMessage;

    @FindBy(xpath ="//strong[normalize-space()='Your order has been successfully processed!']" )
    WebElement successfullyProcessedMessage;

    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueAfterSuccessfullyMessage;

    @FindBy(xpath = "//h2[normalize-space()='Welcome to our store']")
    WebElement welcomeToOurStore;

    @FindBy(xpath ="//a[@class='ico-logout']" )
    WebElement logOut;




    // By electronics = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    // By cellPhone = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");
    // By cellPhoneText = By.tagName("h1");
    //  By listView = By.xpath("//a[contains(text(),'List')]");
    //  By nokiaLumia1020 = By.xpath("//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]");
    // By getTextNokia = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
    // By verifyThePrice = By.xpath("//span[@id='price-value-20']");
    //By quantity = By.xpath("//input[@id='product_enteredQuantity_20']");
    // By addToCart = By.xpath("//button[@id='add-to-cart-button-20']");
    // By verifyTheMessage = By.xpath("//p[@class='content']");
    // By closeTheBar = By.xpath("//span[@title='Close']");
    // By shoppingCart = By.xpath("//li[@id='topcartlink']");
    // By goToCart = By.xpath("//button[contains(text(),'Go to cart')]");
    // By shoppingCartText = By.xpath("//h1[normalize-space()='Shopping cart']");
    // By verifyQuantity = By.cssSelector("#itemquantity11243");
    //By verifyTheTotal = By.xpath("//span[@class='product-subtotal']");
    // By checkBox = By.xpath("//input[@id='termsofservice']");
    // By checkOut = By.xpath("//button[@id='checkout']");
    // By welcomeMessage = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    //By register = By.xpath("//button[contains(text(),'Register')]");
    // By registerText = By.xpath("//h1[contains(text(),'Register')]");
    // By gender = By.xpath("//input[@id='gender-female']");
    //  By lastName = By.xpath("//input[@id='LastName']");
    //  By email = By.xpath("//input[@id='Email']");
    //  By password = By.xpath("//input[@name= 'Password']");
    //  By confirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    //  By registerTab = By.xpath("//button[@id='register-button']");
    //  By registerCompleteText = By.xpath("//div[contains(text(),'Your registration completed')]");
  //  By continueAfterRegistration = By.xpath("//a[contains(text(),'Continue')]");
  //  By login = By.xpath("//a[@class='ico-login']");
  //  By emailLoginField = By.xpath("//input[@id='Email']");
  //  By passwordLoginField = By.xpath("//input[@id='Password']");
 //   By loginButton = By.xpath("//button[normalize-space()='Log in']");
  //  By shoppingCartText1 = By.xpath("//h1[normalize-space()='Shopping cart']");
  //  By checkBoxTermsOfService = By.xpath("//input[@id='termsofservice']");
  //  By finalCheckOut = By.xpath("//button[@id='checkout']");
    //By countryField = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    //By stateField = By.xpath("//select[@id='BillingNewAddress_StateProvinceId']");
    // By cityNameField = By.xpath("//input[@id='BillingNewAddress_City']");
    // By addressField = By.xpath("//input[@id='BillingNewAddress_Address1']");
    //  By postalCodeField = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    //  By phoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    //  By updateContinue = By.xpath("//button[@onclick='Billing.save()']");
    //  By shippingOption2 = By.xpath("//input[@id='shippingoption_2']");
    //  By continueButton = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    // By paymentMethod = By.xpath("//input[@id='paymentmethod_1']");
    // By continueAfterCard = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    // By selectCardType = By.xpath("//select[@id='CreditCardType']");
    // By cardHolderNameField = By.xpath("//input[@id='CardholderName']");
    //  By cardNumberField = By.xpath("//input[@id='CardNumber']");
    // By selectExpDate = By.xpath("//select[@id='ExpireMonth']");
    //  By selectExpYear = By.xpath("//select[@id='ExpireYear']");
    // By cardCodeFiled = By.xpath("//input[@id='CardCode']");
    // By continueAfterPaymentDetails = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    // By paymentByCreditCard = By.xpath(" //li[@class='payment-method']");
    // By shippingMethodBy2ndDayAir = By.xpath("//li[@class='shipping-method']");
    //  By totalPaymentToPay = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]");
    //  By confirmAfterPayment = By.xpath("//button[normalize-space()='Confirm']");
    //  By thankYouMessage = By.xpath("//h1[normalize-space()='Thank you']");
    //  By successfullyProcessedMessage = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    //  By continueAfterSuccessfullyMessage = By.xpath("//button[normalize-space()='Continue']");
    //   By welcomeToOurStore = By.xpath("//h2[normalize-space()='Welcome to our store']");
    //   By logOut=By.xpath("//a[@class='ico-logout']");





    //1.1 Mouse Hover on “Electronics” Tab
    public void mouseHoverOnElectronics() {
        mouseHoverToElement(electronics);
    }

    //1.2 Mouse Hover on “Cell phones” and click
    public void mouseHoverAndClickOnCellPhones() {
        mouseHoverToElementAndClick(cellPhone);
    }

    //1.3 Verify the text “Cell phones”
    public String GetTextCellPhones() {
        return getTextFromElement(cellPhoneText);
    }
    //2.1 Mouse Hover on “Electronics” Tab
    //2.2 Mouse Hover on “Cell phones” and click
    //2.3 Verify the text “Cell phones”
    // 2.4 Click on List View Tab

    public void clickOnListViewTab() {
        clickOnElement(listView);
    }

    //2.5 Click on product name “Nokia Lumia 1020” link
    public void clickOnNokiaLumia1020() {
        clickOnElement(nokiaLumia1020);
    }

    //2.6 Verify the text “Nokia Lumia 1020”//2.7
    public String getTextNokiaLumia1020() {
        return getTextFromElement(getTextNokia);
    }

    // Verify the price “$349.00”//
    public String getToVerifyThePrice() {
        return getTextFromElement(verifyThePrice);
    }

    // 2.8 Change quantity to 2
    public void changeQuantityTo2() {
        clearTextOnElement(quantity);
        sendTextToElement(quantity, "2");
    }

    //2.9 Click on “ADD TO CART” tab
    public void clickAddToCart() {
        clickOnElement(addToCart);
    }
    //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar

    public String getToVerifyTheMessage() {
        return getTextFromElement(verifyTheMessage);
    }

    // After that close the bar clicking on the cross button

    public void closeTheBarClickingOnTheCrossButton() {
        clickOnElement(closeTheBar);
    }
    //2.11  Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.

    public void mouseHoverShoppingCart() {

        mouseHoverToElement(shoppingCart);
    }

    public void clickToGoCart() {
        clickOnElement(goToCart);
    }

    //2.12 Verify the message "Shopping cart"
    public String getShoppingCartMessage() {
        return getTextFromElement(shoppingCartText);
    }

    //2.13 Verify the quantity is 2
    public String getVerifyTheQuantity() {
        return getTextFromElement(verifyQuantity);
    }

    //2.14 Verify the Total $698.00
    public String getToVerifyTheTotal() {
        return getTextFromElement(verifyTheTotal);
    }

    //2.15 click on checkbox “I agree with the terms of service”
    public void clickToCheckBox() {
        clickOnElement(checkBox);
    }

    //2.16 Click on “CHECKOUT”
    public void clickToCheckOut() {
        clickOnElement(checkOut);
    }

    // 2.17 Verify the Text “Welcome, Please Sign In!”
    public String getToVerifyWelcomeMessage() {
        return getTextFromElement(welcomeMessage);
    }

    // 2.18 Click on “REGISTER” tab
    public void clickOnRegister() {
        clickOnElement(register);
    }

    //2.19 Verify the text “Register”
    public String getToVerifyRegisterText() {
        return getTextFromElement(registerText);
    }

    //2.20 Fill the mandatory fields

    public void clickOnGenderField() {
        clickOnElement(gender);
    }

    public void firstNameField() {
        sendTextToElement(firstName, "Ruby");
    }

    public void lastNameField() {
        sendTextToElement(lastName, "Nasker");
    }


    public void emailField() {
        sendTextToElement(email, "ruby07@gmail.com");
    }

    public void passwordField() {
        sendTextToElement(password, "Ruby@12354");
    }

    public void confirmPasswordField() {
        sendTextToElement(confirmPassword, "Ruby@12354");
    }

    //2.21 Click on “REGISTER” Button

    public void clickOnRegisterTab() {
        clickOnElement(registerTab);
    }
    //2.22 Verify the message “Your registration completed”

    public String getToVerifyRegisteraionComplete() {
        return getTextFromElement(registerCompleteText);
    }

    //2.23 Click on “CONTINUE” tab
    public void clickOnContinueAfterRegistration() {
        clickOnElement(continueAfterRegistration);
    }
    // Login again because cart is empty

    public void clickOnLoginAbove() {
        clickOnElement(login);
    }

    public void inputOnEmailLoginField() {
        sendTextToElement(emailLoginField, "ruby07@gmail.com");
    }

    public void inputOnPasswordLoginField() {
        sendTextToElement(passwordLoginField, "Ruby@12354");
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

//2.24 Verify the text “Shopping cart”

    public String getToVerifyShoppingCartText() {
        return getTextFromElement(shoppingCartText1);
    }

    //2.25 click on checkbox “I agree with the terms of service”
    public void clickOnCheckBox() {
        clickOnElement(checkBoxTermsOfService);
    }
    // 2.26 Click on “CHECKOUT”

    public void clickOnFinalCheckOut() {
        clickOnElement(finalCheckOut);
    }

    // 2.27 Fill the Mandatory fields
    public void selectCountryField() {
        selectByValueFromDropDown(countryField, "1");
    }

    public void selectStateField() {
        selectByValueFromDropDown(stateField, "52");
    }

    public void inputOnCityField() {
        sendTextToElement(cityNameField, "Rugby");
    }

    public void inputOnAddressField() {
        sendTextToElement(addressField, "MK");
    }

    public void inputOnPostalField() {
        sendTextToElement(postalCodeField, "NN1 1PD");
    }

    public void inputOnPhoneNumber() {
        sendTextToElement(phoneNumber, "0123456789");
    }

    //2.28 Click on “CONTINUE”
    public void clickOnContinueAfterAllMandatoryFields() {
        clickOnElement(updateContinue);
    }

    // 2.29 Click on Radio Button “2nd Day Air ($0.00)”
    public void clickOnShipping2Option() {
        clickOnElement(shippingOption2);
    }

    // 2.30 Click on “CONTINUE”
    public void clickOnContinueButtonAfterSelectingShippingOption() {
        clickOnElement(continueButton);
    }

    // 2.31 Select Radio Button “Credit Card”
    public void clickOnRadioButton() {
        clickOnElement(paymentMethod);
    }

    public void continueAfterCreditCard() {
        clickOnElement(continueAfterCard);
    }

    //2.33 Fill all the details
    public void selectCreditCardType() {
        selectByValueFromDropDown(selectCardType, "visa");
    }

    public void inputCardHolderName() {
        sendTextToElement(cardHolderNameField, "Ruby Nasker");
    }

    public void inputCardNumberField() {
        sendTextToElement(cardNumberField, "5368392055488809");
    }

    public void selectExpiryDateField() {
        selectByValueFromDropDown(selectExpDate, "3");
    }

    public void selectExpiryYearField() {
        selectByValueFromDropDown(selectExpYear, "2024");
    }

    public void inputCreditCardCode() {
        sendTextToElement(cardCodeFiled, "236");
    }

    //2.34 Click on “CONTINUE”
    public void continueAftersSuccessfullyProcessed() {
        clickOnElement(continueAfterPaymentDetails);
    }

    //2.35 Verify “Payment Method” is “Credit Card”
    public String getToVerifyPaymentMethodByCard(){
        return getTextFromElement(paymentByCreditCard);
    }

    //2.36 Verify “Shipping Method” is “2nd Day Air”
    public String getToVerifyShippingMethod(){
        return getTextFromElement(shippingMethodBy2ndDayAir);
    }

    //2.37 Verify Total is “$698.00”

    public String getToVerifyTotalFinalAmount(){
        return getTextFromElement(totalPaymentToPay);
    }

    //2.38 Click on “CONFIRM”
    public void clickOnConfirmAfterPayment() {
        clickOnElement(confirmAfterPayment);
    }


    //2.39 Verify the Text “Thank You”

    public String getToVerifyThankYouMessage() {
        return getTextFromElement(thankYouMessage);
    }

    //2.40 Verify the message “Your order has been successfully processed!”

    public String getToVerifySuccessfullyProcessedMessage(){
        return getTextFromElement(successfullyProcessedMessage);
    }

    //2.41 Click on “CONTINUE”
    public void clickOnContinueAfterSuccessfullyMessage() {
        clickOnElement(continueAfterSuccessfullyMessage);
    }


    //2.42 Verify the text “Welcome to our store”
    public String getToVerifyWelcomeToOurStoreMessage(){
        return getTextFromElement(welcomeToOurStore);
    }

    //2.43 Click on “Logout” link
    public void clickOnLogOut(){
        clickOnElement(logOut);
    }


        //2.44 Verify the URL is “https://demo.nopcommerce.com/
            public void checkTheCurrentUrl(){
            driver.getCurrentUrl();
            }

}



//2.44 Verify the URL is “https://demo.nopcommerce.com/


