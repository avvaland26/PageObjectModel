package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class AddToCart extends Util {
    private By _firstBook = By.xpath("//div[@class=\"item-grid\"]/div[1]/div[1]/div[2]/div[3]/div[2]/input[1]");
    private By _secondBook = By.xpath("//div[@class=\"product-grid\"]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/input[1]");
    private By _shoppingCart = By.xpath("//a/span[@class=\"cart-label\"]");

    public void verifyUserIsOnBookPage() {
        assertURL("books");

    }
    public void userClickOnFirstBookToAddCart(){
        clickOnElement(_firstBook);//user click on first book to add cart
    }

    public void userClickONSecondBookToAddToCart() {

        clickOnElement(_secondBook);//user click on add in shopping cart
    }
    public void userClickOnShoppingCart(){
        clickOnElement(_secondBook);//user click on shopping cartto checks item is saved
    }
}