package tests;

import config.Config;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import pageobjects.TakeAlotPageObjects;

import java.time.Duration;

public class AddToCartTest {

    static WebDriver driver = new ChromeDriver();
    static JavascriptExecutor js = (JavascriptExecutor) driver;
    static Config config = new Config();
    static WebDriverWait wait = null;


    @BeforeClass
    public static void launchBrowser() throws InterruptedException {
        //Config config = new Config();
        driver = new ChromeDriver();
        driver.get(config.url);
        driver.manage().window().maximize();
        Thread.sleep(5000); //Want to use wait method instead
    }

    @Test(testName = "Add Item To Cart")
    public void addToCart() throws InterruptedException {
        //driver.get(config.url);
        //Click on the load shedding tab
        TakeAlotPageObjects landingPage = new TakeAlotPageObjects(driver);
        landingPage.load_shedding();
        //Assertion
        Assert.assertEquals(driver.getTitle(), "Load Shedding Solutions | Buy all your Load Shedding Essentials at takealot.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        landingPage.got_it_btn();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //scroll down a bit
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,100)");
        landingPage.load_shedding_item();
        //assertion
        landingPage.add_to_cart();
        landingPage.view_cart();
        //Assertion
    }

    @AfterClass
    public static void closeBrowser(){
        driver.quit();
    }
}
