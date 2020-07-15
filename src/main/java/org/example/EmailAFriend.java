package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailAFriend extends Util{
    private By _emailFriend = By.xpath("/input[@value=\"Email a friend\"]");
    private By _yourEmail = By.id("//input[@id=\"Email\"]");
    private By _personalMessage = By.xpath("//textarea[@id=\"PersonalMessage\"]");
    private By _sendEmailButton = By.xpath("//input[@class=\"button-1 send-email-a-friend-button\"]");

    public void verifyUserIsOnRegistrationDetails() {
        Assert.assertTrue(driver.getCurrentUrl().contains("registerPage"));
    }


    public void UserShouldBeAbleToReferAProductToAFriendSuccessfully(){
        typeText(_emailFriend,"anjalivishal09@gmail.com");
        typeText(_yourEmail,"kavyanjali2614+"+timestamp()+"@gmail.com");
        typeText(_personalMessage,"hi anjali how are you");
        clickOnElement(_sendEmailButton);
    }
}
