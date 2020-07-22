package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NewOnlineStoreOpen extends Util {
    private By _title = By.id("AddNewComment_CommentTitle");
    private By _comment = By.id("AddNewComment_CommentText");
    private By _clickOnNewCommentButton = By.name("add-comment");
    String  expected = "News comment is successfully added.";
    private By _SuccessfulMessage = By.xpath("//div[@class=\"result\"]");


    public void verifyUserOnNewsOnlineStoreIsOpenPage(){
        assertURL("new-online-store-is-open");
    }
    public void userEnterLeaveYourCommentDetails(){
       // sleep1(2);
        typeText(_title,"Unique");
        typeText(_comment,"Om Namah Shivay");
        //sleep1(2);
        clickOnElement(_clickOnNewCommentButton);
    }

    public void verifyUserGetSuccessfulMessage()
    {
        assertTextMessage(getTextFromElements(_SuccessfulMessage),expected,"Message Not match");
    }

}
