package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterSuccessPage extends Util {
    private By _registerSuccessfulMessage = By.xpath("//div[text()='Your registration completed']");
    String expectedRegisterSuccessfulMessage = "Your registration completed";

  public void verifyUserIsOnRegisterResultPage(){
      assertURL("registerresult");
  }



  public void userCanSeeSuccessfulMessage(){
      assertTextMessage(getTextFromElements(_registerSuccessfulMessage),expectedRegisterSuccessfulMessage,"user on register page");
      System.out.println(_registerSuccessfulMessage);
  }


}
