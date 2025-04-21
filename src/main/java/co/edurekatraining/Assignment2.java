package co.edurekatraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rediff.com/");

		// 1. Inspecting the Money Element using the Xpath , css selector and class name

		WebElement xpaath = driver.findElement(By.xpath("//a[@class='linkcolor bold' and text()='Money']"));

		WebElement cssSelector = driver.findElement(By.cssSelector("a.linkcolor.bold.selected"));

		WebElement className = driver.findElement(By.className("linkcolor"));

		/*
		 * 2. Inspect all the text boxes with the below-mentioned locators. A)Inspect
		 * with name locator B)Inspect with id locator
		 */

		driver.findElement(By.name("srchquery_tbox"));
		driver.findElement(By.name("query"));

		driver.findElement(By.id("srchquery_tbox"));
		driver.findElement(By.id("query"));

		/*
		 * 3. Inspect the below-mentioned elements. A)Rediffmail.com, enterprise email,
		 * videos, business email, shopping, sign in,and create an account B)Inspect all
		 * the links present on Rediff.com
		 * 
		 */

		WebElement rediffmail = driver.findElement(By.xpath("//a[text()='Rediffmail']"));
		WebElement enterpriseEmail = driver.findElement(By.xpath("//a[text()='Enterprise Email']"));
		WebElement businessEmail = driver.findElement(By.xpath("//a[text()='Business Email']"));
		WebElement signIn = driver.findElement(By.xpath("//a[text()='Sign in']"));
		WebElement createAccount = driver.findElement(By.xpath("//a[text()='Create Account']"));

		// Videos and Shopping options are not available on the site

		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
//		for (WebElement link : allLinks) {
//		    System.out.println("Link Text: " + link.getText() + " | URL: " + link.getDomAttribute("href"));
//		}

		/*
		 * 
		 * 4. Inspect the “sign in” link and click on it (Highlighted in red).
		 */

		WebElement signIn1 = driver.findElement(By.xpath("//a[text()='Sign in']"));
		signIn1.click();

	}

}
