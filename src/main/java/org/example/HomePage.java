package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends Util {
    private By _RegistrationButton = By.xpath("//a[@class=\"ico-register\"]");//user click on register button
    private By _welcomeToOurStore = By.xpath("//h2[text()=\"Welcome to our store\"]");//click on welcome store link
    String expected = "Welcome to our store";//compare result
    private By _searchButton = By.xpath("//input[@class=\"button-1 search-box-button\"]");//user click on search button
    private By _newOnlineStoreIsOpen = By.xpath("//div[@class=\"news-items\"]/div[1]/div[1]/a");//click on new online button
    private By _clickOnFaceBookButton = By.linkText("Facebook");//user click on facebook button
    private By _clickOnCurrencyButton = By.id("customerCurrency");//user click on currency button
    //user click on euro button
    private By _clickOnEuroButton = By.xpath("//option[@value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]");
    String getExpected = "Euro";//getting string

    public void verifyUserIsOnHomePage()
    {
        assertTextMessage(getTextFromElements(_welcomeToOurStore), expected, "user is on homepage");

    }

    public void clickOnRegisterButton() {
        clickOnElement(_RegistrationButton);//method for register button
    }

    public void clickOnSearchButton() {
        clickOnElement(_searchButton);//method for search button

    }

    public void clickOnNewOnlineStoreIsOpenButton() {
      clickOnElement(_newOnlineStoreIsOpen);//method for link text on home page

    }

    public void clickOnFaceBookButton(){
        clickOnElement(_clickOnFaceBookButton);//method for facebook button
        driver.getWindowHandle();
        driver.getWindowHandles();
    }
    public void clickOnCurrencyButton(){
        clickOnElement(_clickOnCurrencyButton);//method for currency button
        clickOnElement(_clickOnEuroButton);
        assertTextMessage(getTextFromElements(_clickOnEuroButton),getExpected,"symbol not match");

    }


}