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
		Basepage.quit();
		
		
	}
	public static void invalid_credentials() throws InterruptedException
	{
		Basepage.launch();
		Thread.sleep(2000);
		Loginpage.username_action("demgjuo");
		Thread.sleep(2000);
		Loginpage.password_action("1253734");
		Thread.sleep(2000);
		Loginpage.loginbutton_action();
		Basepage.quit();
		
	}
	public static void invalidusername_validpassword()throws InterruptedException
	{
		Basepage.launch();
		Thread.sleep(2000);
		Loginpage.username_action("demoghjtge");
		Thread.sleep(2000);
		Loginpage.password_action("1234");
		Thread.sleep(2000);
		Loginpage.loginbutton_action();
		Basepage.quit();
		
		
	}
	public static void validuasename_invalidpassword() throws InterruptedException
	{
		Basepage.launch();
		Thread.sleep(2000);
		Loginpage.username_action("demo");
		Thread.sleep(2000);
		Loginpage.password_action("1234587542");
		Thread.sleep(4000);
		Loginpage.loginbutton_action();
		Basepage.quit();
		
	}
	
	
	
	public static void validuasername_blankpassword() throws InterruptedException
	{
		Basepage.launch();
		Thread.sleep(2000);
		Loginpage.username_action("demo");
		Thread.sleep(2000);
		Loginpage.password_action("");
		Thread.sleep(4000);
		Loginpage.loginbutton_action();
		Thread.sleep(4000);
		Basepage.quit();
	}
	
	public static void blankuasername_validpassword() throws InterruptedException
	{
		Basepage.launch();
		Thread.sleep(2000);
		Loginpage.username_action("");
		Thread.sleep(2000);
		Loginpage.password_action("1234");
		Thread.sleep(2000);
		Loginpage.loginbutton_action();
		Thread.sleep(4000);
		Basepage.quit();
		
	}
	
	public static void blankuasername_blankpassword() throws InterruptedException
	{
		Basepage.launch();
		Thread.sleep(2000);
		Loginpage.username_action("");
		Thread.sleep(2000);
		Loginpage.password_action("");
		Thread.sleep(2000);
		Loginpage.loginbutton_action();
		Basepage.quit();
		
	}
	
		
	}
	
	
	


