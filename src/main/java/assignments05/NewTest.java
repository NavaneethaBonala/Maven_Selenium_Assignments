package assignments05;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class NewTest {

    WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Running beforeSuite()");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Running afterSuite()");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Running beforeTest()");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Running afterTest()");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Running beforeClass()");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Running afterClass()");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Running beforeMethod()");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Running afterMethod()");
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void method() throws InterruptedException {

    	driver = new FirefoxDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        Thread.sleep(60000); 

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.not(ExpectedConditions.titleIs("Facebook")));

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("example@test.com");

        System.out.println("Executed method() - Facebook test");
    }

    @Test
    public void method1() throws InterruptedException {
    	
        driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        Thread.sleep(20000); // wait 20 seconds

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium WebDriver");
        searchBox.sendKeys(Keys.RETURN);

        System.out.println("Executed method1() - Google with sleep");
    }

    @Test
    public void method2() {
        driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofHours(5));

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Implicit wait example");
        searchBox.sendKeys(Keys.RETURN);

        System.out.println("Executed method2() - Google with implicit waits");
    }
}
