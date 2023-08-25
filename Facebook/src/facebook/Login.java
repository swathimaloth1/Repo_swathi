package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends Base{
	static By by_username=By.id("email");
	static  By by_password=By.id("pass");
	 static By by_loginbtn=By.xpath("//button[@name='login']"); 
	
	  
	 
	  
	  
	  public static WebElement uname()
	  {
		  WebElement by_uname = driver.findElement(by_username);
		return by_uname ;
		  
	  }
	  public static WebElement pass()
	  {
		  WebElement by_pw = driver.findElement(by_password);
		return by_pw;
		  
	  }
	  
	  public static WebElement login()
	  {
		  WebElement bt_login = driver.findElement(by_loginbtn);
		return bt_login;
		  
	  }
	  
	
	public static void username()
	{
		uname().sendKeys("malothuswathi");
		
	}
	public  static void password()
	{
		pass().sendKeys("swathi11220");
	}
	public static  void loginbutton()
	{
		login().click();
	}
	

}
