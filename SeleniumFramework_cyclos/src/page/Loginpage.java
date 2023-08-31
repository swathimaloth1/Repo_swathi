package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import seleniumutilities.Base;

public class Loginpage extends Base {
	
	static  By by_username=By.xpath("//input[@autocomplete='username']");
	static By by_password=By.xpath("//input[@autocomplete='password']");
   static  By by_loginbtn=By.xpath("//span[text()='Submit']"); 
	
	 
	 
	  
	
	public static WebElement uname() 
   {
		WebElement by_uname = driver.findElement(by_username);
		return by_uname;
	}
	public  static void username_action() throws InterruptedException {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(by_username));
		uname().sendKeys("demo");
		}
	
	
	
	public static WebElement pasword() 
	{
	
		WebElement by_passwor = driver.findElement(by_password);
		return  by_passwor;
		
	}
	public static void password_action() 
	{
		
		pasword().sendKeys("1234");
		
	}
	public static WebElement login() 
	{
		
		WebElement login = driver.findElement(by_loginbtn);
		return login;
	}
	
	public static void loginbutton_action() 
	{
		
		login().click();
		
	}
	

}
