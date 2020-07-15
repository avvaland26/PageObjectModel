package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Util{

    public static void SetUpBrowser(){
    //setting up Chrome driver path
        System.setProperty("webdriver.chrome.driver", "C://Soft//chromedriver_win32//chromedriver.exe");
    //creating Chrome driver object to open google chrome browser
    driver = new ChromeDriver();
    //Maximising screen
        driver.manage().window().maximize();
    //applying implicitly wait of 10 second to the driver instance
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    //open the URL
        driver.get("http://demo.nopcommerce.com");}
    public static void setCloseBrowser(){

        driver.close();
    }
}
