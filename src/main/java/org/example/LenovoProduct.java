package org.example;

import org.openqa.selenium.By;

public class LenovoProduct extends Util{
    private By _lenovo = By.name("//a[text()='Lenovo IdeaCentre 600 All-in-One PC']");

    public void userWantsToReferProduct(){
        clickOnElement(_lenovo);
    }

}
