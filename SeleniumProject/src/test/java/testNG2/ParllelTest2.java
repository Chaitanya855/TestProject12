package testNG2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class ParllelTest2 {
   WebDriver driver;
	
	//@BeforeClass
	@Parameters({"browser"})
	void setup(String br)
	{
		switch(br.toLowerCase())
		{
		case "chrome": driver=new ChromeDriver(); break;
		case "edge" : driver=new EdgeDriver();break;
		
		default: System.out.println("Invalid browser");return;
			
		}
		
		driver.get("https://ibm-learning.udemy.com/organization/home/");
		driver.manage().window().maximize();
		
		
	}


}
