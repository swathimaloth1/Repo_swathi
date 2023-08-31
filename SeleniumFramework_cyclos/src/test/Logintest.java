package test;

import page.Basepage;
import page.Loginpage;


public class Logintest 
{
	
	public static void valid_credentials() throws InterruptedException
	{
		Basepage.launch();
		Thread.sleep(2000);
		Loginpage.username_action("demo");
		Thread.sleep(2000);
		Loginpage.password_action("1234");
		Thread.sleep(2000);
		Loginpage.loginbutton_action();
		
		
		
		
	}
	public static void validpassword_invalidusername()
	{
		
	}
	public static void invalidpassword_validusername()
	{
		
	}
		
	}
	
	
	


