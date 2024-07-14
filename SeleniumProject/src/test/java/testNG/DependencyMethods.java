package testNG;

import org.testng.annotations.Test;

import org.testng.Assert;

public class DependencyMethods {
	
	@Test(priority = 0) 
	public void SignIn() {
		  System.out.println("User has signed in successfully");
		  //Assert.assertTrue(true);
		  
	
	  }

	  @Test(priority = 1)
	  public void OpenBrowser() {
		  System.out.println("The browser is opened");
		  Assert.assertTrue(false);
	  }

	  @Test (priority = 2,dependsOnMethods = { "SignIn" })
	  public void LogOut() {
		  System.out.println("The user logged out successfully");
	  }

}
