package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends Base{
	By by_username=By.id("email");
	 By by_password=By.id("pass");
	 By by_loginbtn=By.xpath("//button[@name='login']"); 
	
	  WebElement by_uname = driver.findElement(by_username);
	  WebElement by_pw = driver.findElement(by_password);
	  WebElement bt_login = driver.findElement(by_loginbtn);
	
	public  void username()
	{
		by_uname.sendKeys("malothuswathi");
	}
	
	public  void password()
	{
		by_pw.sendKeys("swathi11220");
	}
	public  void loginbutton()
	{
		bt_login.click();
	}
	

}
