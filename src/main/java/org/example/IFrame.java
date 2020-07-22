package org.example;

import org.openqa.selenium.By;

public class IFrame extends Util{
  private By _topic = By.xpath("//input[@type=\"text\"]");
  private By _checkBox = By.xpath("//input[@id=\"a\"]");
  private By _selectAnimals = By.id("\"animals\"");

  public void verifyUserOnIFramePage(){
      assertURL("frames-example-selenium-webdriver");
  }
    public void userFillDetails(){
      typeText(_topic,"Unique");
      clickOnElement(_checkBox);
      selectFromDropDownByVisibleText(_selectAnimals,"Avatar");
    }
}
