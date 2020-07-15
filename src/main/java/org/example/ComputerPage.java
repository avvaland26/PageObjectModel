package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ComputerPage extends Util {
    private By _computerPage = By.xpath("//ul[@class=\"top-menu notmobile\"]/li[1]/a");


    public void verifyUserIsOnComputerPage() {
        Assert.assertTrue(driver.getCurrentUrl().contains("registerPage"));
    }

    public void userWantsToClickOnComputerButton(){

        clickOnElement(_computerPage);
    }

}
