package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Books extends Util{
    private By _books = By.xpath("//ul[@class=\"top-menu notmobile\"]/li[5]/a");

    public void verifyUserOnHomePage() {

        assertURL("books");//to verify user on book page
    }

    public void userShouldBeAbleToAddProductToBasketSuccessfully(){
        clickOnElement(_books);

    }
}
