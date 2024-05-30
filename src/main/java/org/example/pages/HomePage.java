package org.example.pages;

import org.example.objects.HomeObject;
import org.example.objects.LoginObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    HomeObject homeObject;
    BasePage basePage;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        homeObject = new HomeObject(driver);
        basePage = new BasePage(driver);
    }

    public void getSuccessfullText() {
        By textElement = homeObject.getSuccessfullText();
        try {
            basePage.verifyElementVisible(textElement);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void getLogoutButton() {
        By buttonLogoutElement = homeObject.getLogoutButton();
        try {
            basePage.verifyElementVisible(buttonLogoutElement);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public String getActualUrl() {
        return driver.getCurrentUrl();
    }


}
