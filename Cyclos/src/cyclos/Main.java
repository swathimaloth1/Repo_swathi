package Cyclos;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Main extends Base {
	public static void main(String[] args) throws InterruptedException
	{
	 driver = new ChromeDriver();
	driver.get("https://demo.cyclos.org/ui/login");
	driver.manage().window().maximize();
	
	Login.username();
	Login.password();
	Login.loginbutton();
	Logout.logout();
	
	
	}

}
