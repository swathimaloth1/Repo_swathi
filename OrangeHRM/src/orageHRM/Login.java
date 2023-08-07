package orageHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends Base{
	 By by_username=By.xpath("//input[@name='username']");
	 By by_password=By.xpath("//input[@name='password']");
	 By by_loginbtn=By.xpath("//button[@type='submit']"); 
	
	  WebElement by_uname = driver.findElement(by_username);
	  WebElement by_pw = driver.findElement(by_password);
	  WebElement bt_login = driver.findElement(by_loginbtn);
	
	public  void username() throws InterruptedException
	{
		by_uname.sendKeys("Admin");
		Thread.sleep(2000);
	}
	
	public  void password() throws InterruptedException
	{
		by_pw.sendKeys("admin123");
		Thread.sleep(2000);
	}
	public  void loginbutton() throws InterruptedException
	{
		bt_login.click();
		Thread.sleep(2000);
	}
	

}
