package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class DesktopPage extends Util {

    private By _desktop = By.name("//div[@class=\"item-grid\"]/div[1]/div[1]/h2/a");

    public void verifyUserIsOnRegistrationDetails() {
        Assert.assertTrue(driver.getCurrentUrl().contains("registerPage"));
    }

    public void userToClickOnDesktop(){

        clickOnElement(_desktop);
    }


}
