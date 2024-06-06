package org.example.pages;

import org.example.objects.LoginObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    LoginObject loginObject;
    BasePage basePage;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        loginObject = new LoginObject(driver);
        basePage = new BasePage(driver);
    }

    public void enterUsername(String query) {
        By usernameElement = loginObject.getInputUsername();
        try {
            basePage.inputText(usernameElement, query);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void enterPassword(String query){
        By passwordElement = loginObject.getInputPassword();
        try {
            basePage.inputText(passwordElement, query);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickButton(){
        By buttonElement = loginObject.getButtonSubmit();
        try {
            basePage.click(buttonElement);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}