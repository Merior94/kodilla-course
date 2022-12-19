package com.kodilla.testing2.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverConfig {
    public final static String CHROME = "CHROME_DRIVER";
    public static WebDriver getDriver(final String driver) {

        //System.setProperty("webdriver.chrome.driver", "/Users/Bartosz/IdeaProjects/demo/kodilla-course/chromedriver");
        //System.setProperty("webdriver.chrome.driver", "/Users/Documents/Development/Projects/Kodilla/chromedriver");
        //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Chrome/chromedriver");
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");


        if (driver.equals(CHROME)) {
            return new ChromeDriver();
        } else {
            return null;
        }
    }
}
