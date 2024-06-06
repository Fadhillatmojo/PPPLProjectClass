import org.example.com.dicoding.kotlin.ResultPage;
import org.example.com.dicoding.kotlin.SearchPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.SQLOutput;
import java.time.Duration;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class GoogleSearchTest {
    WebDriver driver;
    @BeforeAll
    public void setUp(){

        driver = new ChromeDriver();
        //default u/ v4.11 ke bawah
//        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver.get("https://google.com");
    }

    //    @Test
//    public void driverTestChrome() {
//        String title = driver.getTitle();
//        System.out.println(title);
//        //assert
//        //quit
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//        WebElement search_bar = driver.findElement(By.name("q"));
//        search_bar.sendKeys("annisa urohmah");
//
//
//        WebElement button = driver.findElement(By.name("btnK"));
//        button.click();
////        driver.quit();
//    }
//
//    @Test
//    public void driverTestFirefox() {
//        WebDriver driver;
//        driver = new FirefoxDriver();
//        driver.get("https://sv.ugm.ac.id/");
//        String title = driver.getTitle();
//        System.out.println(title);
//        //assert
//        //quit
//        driver.quit();
////        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//    }
    @Test
    public void driverTest(){
        //buat objek dari halaman Search
        SearchPage search = new SearchPage(driver);
        //masukkan query
        search.setSearch_bar("Annisa Urohmah");
        //klik pencarian
        ResultPage result = search.clickSearch();
        Assertions.assertTrue(result.getWebTitle().contains("Annisa Urohmah"));
        driver.quit();;
    }

}