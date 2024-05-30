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
//    @Test
//    public void driverTestChrome()
//    {
//        // create object webdriver dan setting browser yang akan digunakan
//        WebDriver driver;
//        driver = new ChromeDriver();
//        // default utk v4.11 kebawah
//        // System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
//
//        driver.get("https://google.com/");
//        String title = driver.getTitle();
//        System.out.println(title);
//
//        // assert disini samakan apakah testingnya titlenya itu benar google
//        assertEquals(title,"Google");
//        // driver.quit();
//    }
//
//    @Test
//    public void driverTestFirefox()
//    {
//        // create object webdriver dan setting browser yang akan digunakan
//        WebDriver driver;
//        driver = new FirefoxDriver();
//        driver.get("https://sv.ugm.ac.id/");
//
//        String title = driver.getTitle();
//        System.out.println(title);
//
//        // assert disini samakan apakah testingnya titlenya itu benar google
//        assertEquals(title,"Sekolah Vokasi UGM – Sekolah Vokasi UGM");
//         driver.quit();
//    }

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

//        // create object webdriver dan setting browser yang akan digunakan
//        WebDriver driver;
//        driver = new ChromeDriver();
//        driver.get("https://practicetestautomation.com/practice-test-login/");
//
//        // temukan input username
//        WebElement inputUsername = driver.findElement(By.id("username"));
//        inputUsername.sendKeys("student");
//
//        // temukan input password
//        WebElement inputPassword = driver.findElement(By.id("password"));
//        inputPassword.sendKeys("Password123");
//
//        // temukan button submit
//        WebElement buttonSubmit = driver.findElement(By.id("submit"));
//
//        // click button submit
//        buttonSubmit.click();
//
//        // verify and validate url
//        String expectedUrl = "https://practicetestautomation.com/logged-in-successfully/";
//        String actualUrl = driver.getCurrentUrl();
//        assertEquals(actualUrl, expectedUrl);
//
//        // wait website kita agar ngeload terlebih dahulu
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//
//        // verify and validate text ('Congratulations' or 'successfully logged in')
//        WebElement successfullTest = driver.findElement(By.xpath("//*[contains(text(), 'Congratulations')]"));
//        successfullTest.isDisplayed();
//
//        // verify and validate logout button is displayed
//        WebElement logoutButton = driver.findElement(By.xpath("//a[contains(., 'Log out')]"));
//        logoutButton.isDisplayed();
    }

    @AfterAll
    public static void terminateBrowser() {
        driver.quit();
    }
}