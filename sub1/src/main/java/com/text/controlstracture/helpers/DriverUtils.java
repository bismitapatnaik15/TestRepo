package com.text.controlstracture.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtils {

    public static WebDriver driver;
    int x=0;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        if(driver==null) {
            System.setProperty("webdriver.chrome.driver", "/Users/bismitapatnaik/Desktop/chromeDriver/chromedriver");
            driver = new ChromeDriver();
        }
       // DriverUtils.driver = driver;


    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
