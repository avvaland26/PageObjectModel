package org.example;
import org.openqa.selenium.By;
import org.testng.Assert;
import java.util.Iterator;
import java.util.Set;

public class FaceBookPage extends Util {
    private By _creatAPage = By.xpath("//button[@class=\"_4jy0 _4jy3 _4jy2 _51sy selected _42ft\"]");
    String expected = "Create a Page";

    public void verifyUserOnFaceBookPage(){
        String MainWindow=driver.getWindowHandle();
    // To handle all new opened window.
    Set<String> s1=driver.getWindowHandles();
    Iterator<String> i1=s1.iterator();

        while(i1.hasNext())
    {
        String ChildWindow=i1.next();

        if(!MainWindow.equalsIgnoreCase(ChildWindow))
        {
            // Switching to Child window
            driver.switchTo().window(ChildWindow);
           assertTextMessage(getTextFromElements(_creatAPage),expected,"user is not on facebook page");

            // Closing the Child Window.
            driver.close();
        }
    }
    // Switching to Parent window i.e Main Window.
            driver.switchTo().window(MainWindow);
}
}
