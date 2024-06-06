package org.example.com.dicoding.kotlin;

import org.openqa.selenium.WebDriver;

public class ResultPage {
    WebDriver driver;

    public ResultPage(WebDriver driver){
        this.driver = driver;
    }
    public String getWebTitle(){
        return driver.getTitle();
    }
}