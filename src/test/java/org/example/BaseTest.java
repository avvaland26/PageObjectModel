package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Util{
    BrowserManager browserManager = new BrowserManager();


    @BeforeMethod
    public void openBrowser(){

        browserManager.SetUpBrowser();
    }

    @AfterMethod
    public void closeBrowser(){
        browserManager.setCloseBrowser();
    }
}



