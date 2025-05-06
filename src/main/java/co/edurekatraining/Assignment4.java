package co.edurekatraining;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public void rediff() {

		WebDriver driver = new ChromeDriver(); //Launch the chromeDriver

		driver.get("https://www.rediff.com/"); // open the rediff web site

		//Click on sign in link
		WebElement signIn = driver.findElement(By.xpath("//a[@class='signin']"));
		signIn.click();

		// click on login button without entering user mail and password  
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();

		//Validate the alert and close the alert
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			System.out.println("Alert text is: " + alertText);

			if (alertText.contains("Please enter a valid user name")) {
				System.out.println("Test Passed: Alert displayed as expected.");
			} else {
				System.out.println("Test Failed: Unexpected alert text.");
			}

			alert.accept();
		} catch (Exception e) {
			System.out.println("Test Failed: No alert was displayed.");
		}

		driver.quit();

	}

	public void demoqa()	
	{

		WebDriver driver = new ChromeDriver();
		
//Launch URL:https://demoqa.com/browser-windows

		driver.get("https://demoqa.com/browser-windows");
		
		String mainWindow = driver.getWindowHandle();

		//Click on New Tab, New Window,andNew Window Message.
        driver.findElement(By.id("tabButton")).click();            
        driver.findElement(By.id("windowButton")).click();        
        driver.findElement(By.id("messageWindowButton")).click(); 

        Set<String> windowHandles = driver.getWindowHandles();

        //Print the list of window handles()for all the newly opened tabs
        System.out.println("Window Handles:");
        for (String handle : windowHandles) {
            System.out.println(handle);
        }

        //Print the total window count size.
        System.out.println("Total number of windows: " + windowHandles.size());

        for (String handle : windowHandles) {
            if (!handle.equals(mainWindow)) {
                driver.switchTo().window(handle);
                driver.close();
            }
        }

        driver.switchTo().window(mainWindow);

        driver.quit();
		
	}

	public static void main(String[] args) {


		Assignment4 obj = new Assignment4();
		
		obj.rediff();
		obj.demoqa();

	}

}
