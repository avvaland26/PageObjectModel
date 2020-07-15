package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailSentSuccessfully extends Util {
    private By _messageSuccessfully = By.xpath("//div[@class=\"result\"]");
    String expected = "Email Sent Successfully";

    public void verifyUserSentEmailSuccessfully() {

        assertURL("message successfully");
    }

    public void userCanSeeSuccessfulMessage() {
        assertTextMessage(getTextFromElements(_messageSuccessfully), expected, "user on register page");
        System.out.println(_messageSuccessfully);

    }
}