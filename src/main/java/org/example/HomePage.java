package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends Util{
    private By _RegistrationButton = By.xpath("//a[@class=\"ico-register\"]");
    private By _welcomeToOurStore = By.xpath("//h2[text()=\"Welcome to our store\"]");
    private String expected = "Welcome to our store";

    public void verifyUserIsOnHomePage(){
        assertTextMessage(getTextFromElements(_welcomeToOurStore),expected,"user is on homepage");

    }

    public void clickOnRegisterButton()
    {
        clickOnElement(_RegistrationButton);
    }



}
