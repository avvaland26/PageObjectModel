package org.example;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;

public class Util extends BasePage {
    public static void waitUntilElementIsClickable(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void sleep1(int n) {
        try {
            Thread.sleep(n * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public static void typeText(By by, String text) {
        driver.findElement(by).sendKeys(text);

    }

    public static String getTextFromElements(By by) {

        return driver.findElement(by).getText();
    }

    public static long timestamp() {
        return (System.currentTimeMillis());

    }

    public static void assertTextMessage(String actual, String expected, String message) {
        Assert.assertEquals(actual, expected, "");//comparing two message
    }

    public static void assertURL(String text) {
        Assert.assertTrue(driver.getCurrentUrl().contains(text));
    }

    public static void selectFromDropDownByVisibleText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    ////
//    public static void takeScreenShot(String s) {
//        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        //The below method will save the screen shot in d drive with test method name
//        try {
//            FileUtils.copyFile(scrFile, new File(+methodName + ".png"));
//            System.out.println("**Placed screen shot in " + filePath + " **");
//        } catch (IOException e)
//        {
//            e.printStackTrace();
//        }
//    }
    public static void takeScreenShot(String fileName) {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //The below method will save the screen shot in d drive with test method name
        try {
            FileUtils.copyFile(scrFile, new File("src\\ScreenShot" + fileName + ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}