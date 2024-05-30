package org.example.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginObject {
    WebDriver driver;

    public LoginObject(WebDriver driver) {
        this.driver = driver;
    }

    public By getInputUsername(){
        return By.id("username");
    }
    public By getInputPassword(){
        return By.id("password");
    }
    public By getButtonSubmit(){
        return By.id("submit");
    }

}
