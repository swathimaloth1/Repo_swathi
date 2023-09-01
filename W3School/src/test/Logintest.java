package test;

import page.Loginpage;

public class Logintest {
	
	
	
	public static void valid_credentials() throws InterruptedException
	{
		Loginpage.username_action("swathimaloth404@gmail.com");
		Loginpage.password_action("Swathi@11220");
		Loginpage.login_action();
		Thread.sleep(5000);
		
	}

}
