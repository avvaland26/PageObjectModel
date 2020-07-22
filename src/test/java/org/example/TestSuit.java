package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;

public class TestSuit extends BaseTest {
    HomePage homePage = new HomePage();
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
    NewOnlineStoreOpen newOnlineStoreOpen = new NewOnlineStoreOpen();
    FaceBookPage faceBookPage = new FaceBookPage();
    IFrame iFrame = new IFrame();

    @Test
    public void verifyEachProductHaveName() {
        List<WebElement> productList = driver.findElements(By.xpath("//div[@class='item-grid']/div/div[1]/div[2]/h2/a"));
        System.out.println("product count :" + productList.size());
    }

    @Test
    public void verifyUserShouldAbleToRegistrationDetails() {
        homePage.verifyUserIsOnHomePage();//verify user on home page
        homePage.clickOnRegisterButton();//click on register button
        registerPage.verifyUserIsOnRegistrationPage();//verify user on register page
        registerPage.userEnterRegistrationDetails();//verify user on enter register details
        registerPage.userClickOnSubmitButton();//verify user click on submit button
        registerSuccessPage.verifyUserIsOnRegisterResultPage();//verify user on register successful page
        registerSuccessPage.userCanSeeSuccessfulMessage();//verifying message

    }

    @Test
    public void UserShouldBeAbleToReferAProductToAFriendSuccessfully() {
        computerPage.userWantsToClickOnComputerButton();// user  click on computer button
        desktopPage.userToClickOnDesktop();//user click on desktop
        lenovoProduct.userWantsToReferProduct();//click on product
        clickOnEmailFriend.UserShouldBeAbleToReferAProductToAFriendSuccessfully();//user click on email friend
        emailAFriend.UserShouldBeAbleToReferAProductToAFriendSuccessfully();//product refer to friend
        emailSentSuccessfully.verifyUserSentEmailSuccessfully();//send email successfully
    }

    @Test
    public void UserShouldBeAbleToAddProductToBasketSuccessfully() {
        homePage.verifyUserIsOnHomePage();//on homepage
        books.userShouldBeAbleToAddProductToBasketSuccessfully();//product in add to cart
        addToCart.verifyUserIsOnBookPage();//user click on book
        addToCart.userClickOnFirstBookToAddCart();//fist book to add to cart
        addToCart.userClickONSecondBookToAddToCart();//second book add to cart
        addToCart.userClickOnShoppingCart();//check in shopping cart
        shoppingCart.userIsOnShoppingCartPage();// user compare in shopping cart
    }
        @Test
        public void verifyUserCanClickOnSearchButton()
        {
        homePage.clickOnSearchButton();//on homepage
        driver.switchTo().alert().getText();//use for alert message get text
        driver.switchTo().alert().dismiss();//use for alert message to delete

        }
       @Test
      public void verifyUserClickOnNewOnlineStoreSuccessfully()
       {
        homePage.clickOnNewOnlineStoreIsOpenButton();//user click on register button
        newOnlineStoreOpen.verifyUserOnNewsOnlineStoreIsOpenPage();//user click on news online store
        newOnlineStoreOpen.userEnterLeaveYourCommentDetails();//user enter leave comments on box
        newOnlineStoreOpen.verifyUserGetSuccessfulMessage();//user get message
        List<WebElement> commentList = driver.findElements(By.linkText("//div[@class=\"comments\"]/div/div[2]/div[3]"));
        System.out.println("commentlist :"+commentList.size());
         for  (WebElement comment:commentList)
         {
            WebElement webElement = commentList.get(commentList.lastIndexOf(0)-1);
            System.out.println(comment.getText());
         }

           }
           @Test
          public void verifyUserClickOnSuccessfullyOnFaceBookPage(){
           homePage.clickOnFaceBookButton();//user click on facebook button
           faceBookPage.verifyUserOnFaceBookPage();//verifying user on facebook page

          }
          @Test
          public void verifyUserCanClickOnEuroButtonSuccessfully(){
          homePage.clickOnCurrencyButton();//user click on currency button

          }

          @Test
           public void verifyUserOnIFramePage(){
           iFrame.verifyUserOnIFramePage();
           iFrame.userFillDetails();
          }

       }








