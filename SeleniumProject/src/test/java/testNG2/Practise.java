package testNG2;

import java.time.Duration;

/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




public class Practise {
	
	WebDriver driver;
	
	@BeforeMethod
	  public void beforeMethod() 
	{
		
		System.out.println("Starting the browser session");
	  }
	
	
	
	@Test
	public void A() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://time.ibm.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		/*WebElement n = driver.findElement(By.id("credentialSignin"));
		n.sendKeys("Mallem.Chaitanya@ibm.com");*/
		
		/*WebDriverWait wait = new  WebDriverWait(driver, 10); // 10 seconds timeout
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("credentialSignin")));
		
        element.click();*/
		
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds timeout
        
        // Wait for the element to be clickable
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("credentialSignin")));

        // Scroll to the element if necessary
        //((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

        // Perform actions on the element
        element.click();
        element.sendKeys("Mallem.Chaitanya@ibm.com");
		
	}
	
	
	 
	  /*@AfterMethod
	  public void afterMethod() 
	  {
	  	  System.out.println("Closing the browser session");
	  	  driver.quit();
	  }*/
	
	

}

