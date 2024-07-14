package testNG;

import org.testng.annotations.Test;

public class TestNGSimpleProject {
	@Test(priority=3)
	void logout()
	{
		System.out.println("Logout from application.....");
	}
	
	
	@Test(priority=0)
	void login()
	{
		System.out.println("Login to application.....");
	}

	@Test(priority=1)
	void openapp()
	{
		System.out.println("opening application...");
	}


}
