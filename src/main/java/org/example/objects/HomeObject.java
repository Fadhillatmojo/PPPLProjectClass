package org.example.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeObject {
    WebDriver driver;

    public HomeObject(WebDriver driver) {
        this.driver = driver;
    }

    public By getSuccessfullText() {
        return By.xpath("//*[contains(text(), 'Congratulations')]");
    }
    public By getLogoutButton() {
        return By.xpath("//a[contains(., 'Log out')]");
    }
}
