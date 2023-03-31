package com.cybertek.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaScript {
   public static WebDriver driver;
    public static void scrollDown(int pixels){

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0",pixels);

    }

}
