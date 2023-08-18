package Cyclos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends Base {
	static  By by_username=By.xpath("//input[@autocomplete='username']");
	 static By by_password=By.xpath("//input[@autocomplete='password']");
    static  By by_loginbtn=By.xpath("//span[text()='Submit']"); 
	
	 
	 
	  
	
	public static WebElement uname() throws InterruptedException 
    {
		Thread.sleep(2000);
	    WebElement by_uname = driver.findElement(by_username);
		return by_uname;
	}
	public  static void username() throws InterruptedException {
		uname().sendKeys("demo");
		}
	
	
	
	public static WebElement pasword() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement by_passwor = driver.findElement(by_password);
		return  by_passwor;
		
	}
	public static void password() throws InterruptedException
	{
		 
		pasword().sendKeys("1234");
		
	}
	public static WebElement login() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement login = driver.findElement(by_loginbtn);
		return login;
	}
	
	public static void loginbutton() throws InterruptedException
	{
		
		login().click();
		Thread.sleep(2000);
	}
	

}
