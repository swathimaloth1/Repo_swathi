package page;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
public class Loginpage extends Basepage {
	
	static  By by_username=By.xpath("//input[@autocomplete='username']");
	static By by_password=By.xpath("//input[@autocomplete='password']");
   static  By by_loginbtn=By.xpath("//span[text()='Submit']"); 
	
	 
	 public static WebElement uname() 
   {
	
		WebElement by_uname = driver.findElement(by_username);
		
		return by_uname;
	}
	 
	 public static WebElement pasword() 
		{
		WebElement by_passwor = driver.findElement(by_password);
			return  by_passwor;
			
		}
	 public static WebElement login() 
		{
			
			WebElement login = driver.findElement(by_loginbtn);
			return login;
		}
		
	 
	public  static void username_action(String username) throws InterruptedException {
		uname().sendKeys(username);
		}
	
	
	public static void password_action(String password) 
	{
		
		pasword().sendKeys(password);
		
	}
	
	public static void loginbutton_action() 
	{
	login().click();
	}
	

}
