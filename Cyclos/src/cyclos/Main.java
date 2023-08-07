package Cyclos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	public static void main(String[] args)
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.cyclos.org/ui/login");
	driver.manage().window().maximize();
	
	Login l = new Login();
	l.username();
	l.password();
	l.loginbutton();
	}

}
