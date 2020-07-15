package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ClickOnEmailFriend extends Util{
    private By _emailFriendbutton = By.xpath("//input[@value=\"Email a friend\"]");

    public void verifyUserIsOnRegistrationDetails() {
        Assert.assertTrue(driver.getCurrentUrl().contains("registerPage"));
    }

    public void UserShouldBeAbleToReferAProductToAFriendSuccessfully() {
        clickOnElement(_emailFriendbutton);
    }
}