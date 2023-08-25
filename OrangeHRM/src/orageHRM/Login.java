package orageHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends Base{
	 static By by_username=By.xpath("//input[@name='username']");
	static  By by_password=By.xpath("//input[@name='password']");
	static  By by_loginbtn=By.xpath("//button[@type='submit']"); 
	
	 
	 
	  
	public static WebElement uname()
	{
		 WebElement by_uname = driver.findElement(by_username);
		return  by_uname;
		
	}
	
	public static WebElement pass()
	{
		 WebElement by_pw = driver.findElement(by_password);
		return by_pw;
		
	}
	
	public static WebElement l()
	{
		WebElement bt_login = driver.findElement(by_loginbtn);
		return bt_login;
	}
	public static  void username() throws InterruptedException
	{
		uname().sendKeys("Admin");
		Thread.sleep(2000);
	}
	
	public static void password() throws InterruptedException
	{
		pass().sendKeys("admin123");
		Thread.sleep(2000);
	}
	public static void loginbutton() throws InterruptedException
	{
		l().click();
		Thread.sleep(2000);
	}
	

}
