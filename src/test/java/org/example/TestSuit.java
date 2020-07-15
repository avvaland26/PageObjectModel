package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest{
    HomePage homePage= new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage();
    ComputerPage computerPage = new ComputerPage();
    DesktopPage desktopPage = new DesktopPage();
    LenovoProduct lenovoProduct = new LenovoProduct();
    ClickOnEmailFriend clickOnEmailFriend = new ClickOnEmailFriend();
    EmailAFriend emailAFriend = new EmailAFriend();
    EmailSentSuccessfully emailSentSuccessfully = new EmailSentSuccessfully();
    Books books = new Books();
    AddToCart addToCart = new AddToCart();
    ShoppingCart shoppingCart = new ShoppingCart();
    BrowserManager browserManager = new BrowserManager();




    @Test
    public void verifyUserShouldAbleToRegistrationDetails(){
        homePage.verifyUserIsOnHomePage();//verify user on home page
        homePage.clickOnRegisterButton();//click on register button
        registerPage.verifyUserIsOnRegistrationPage();//verify user on register page
        registerPage.userEnterRegistrationDetails();//verify user on enter register details
        registerPage.userClickOnSubmitButton();//verify user click on submit button
        registerSuccessPage.verifyUserIsOnRegisterResultPage();//verify user on register successful page
        registerSuccessPage.userCanSeeSuccessfulMessage();//verifying message

    }

    @Test
    public void UserShouldBeAbleToReferAProductToAFriendSuccessfully(){
        computerPage.userWantsToClickOnComputerButton();// user  click on computer button
        desktopPage.userToClickOnDesktop();//user click on desktop
        lenovoProduct.userWantsToReferProduct();//click on product
        clickOnEmailFriend.UserShouldBeAbleToReferAProductToAFriendSuccessfully();//user click on email friend
        emailAFriend.UserShouldBeAbleToReferAProductToAFriendSuccessfully();//product refer to friend
        emailSentSuccessfully.verifyUserSentEmailSuccessfully();//send email successfully
    }
    @Test
    public void UserShouldBeAbleToAddProductToBasketSuccessfully(){
        homePage.verifyUserIsOnHomePage();//on homepage
        books.userShouldBeAbleToAddProductToBasketSuccessfully();//product in add to cart
        addToCart.verifyUserIsOnBookPage();//user click on book
        addToCart.userClickOnFirstBookToAddCart();//fist book to add to cart
        addToCart.userClickONSecondBookToAddToCart();//second book add to cart
        addToCart.userClickOnShoppingCart();//check in shopping cart
        shoppingCart.userIsOnShoppingCartPage();// user compare in shopping cart
    }
}

