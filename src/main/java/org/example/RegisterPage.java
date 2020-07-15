package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterPage extends Util{
    //Registration locators
    private By _gender = By.id("//input[@id=\"gender-female\"]");
    private By _firstName = By.id("//input[@id=\"FirstName\"]");
    private By _lastName = By.id("//input[@id=\"LastName\"]");
    private By _dateOfBirthday = By.xpath("//select[@name=\"DateOfBirthDay\"]");
    private By _dateOfBirthMonth = By.xpath("/select[@name=\"DateOfBirthMonth\"]");
    private By _dateOfBirthYear = By.xpath("//select[@name=\"DateOfBirthYear\"]");
    private By _emailField = By.id("//input[@id=\"Email\"]");
    private By _companyName = By.id("//input[@id=\"Company\"]");
    private By _newsLetter = By.id("//input[@id=\"Newsletter\"]");
    private By _password = By.xpath("//input[@id=\"Password\"]");
    private By _confirmPassword = By.id("//input[@id=\"ConfirmPassword\"]");
    private By _registerSubmitButton = By.id("//input[@id=\"register-button\"]");

    public void verifyUserIsOnRegistrationPage(){
        Assert.assertTrue(driver.getCurrentUrl().contains("registerPage"));
    }
    public void userEnterRegistrationDetails(){
        clickOnElement(_gender);
        typeText(_firstName,"Anjana");
        typeText(_lastName,"Valand");
        selectFromDropDownByVisibleText(_dateOfBirthday,"15");
        selectFromDropDownByVisibleText(_dateOfBirthMonth,"March");
        selectFromDropDownByVisibleText(_dateOfBirthYear,"2000");
        typeText(_emailField,"\"kavyanjali2614+\"+timestamp()+\"@gmail.com");
        typeText(_companyName,"ABC Ltd");
        clickOnElement(_newsLetter);
        typeText(_password,"unique");
        typeText(_confirmPassword,"unique");

    }
    public void userClickOnSubmitButton(){
        sleep1(2000);
        clickOnElement(_registerSubmitButton);
    }
}
