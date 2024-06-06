import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginJourneyTest {
    public static String url = "https://practicetestautomation.com/practice-test-login/";
    public String expectedUrl = "https://practicetestautomation.com/logged-in-successfully/";
    public static WebDriver driver;
    @BeforeAll
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @Test
    public void loginTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        loginPage.enterUsername("student");
        loginPage.enterPassword("Password123");
        loginPage.clickButton();

        // assert
        homePage.getSuccessfullText();
        homePage.getLogoutButton();
        assertEquals(homePage.getActualUrl(), expectedUrl);
    }
    @AfterAll
    public static void terminateBrowser() {
        driver.quit();
    }
}