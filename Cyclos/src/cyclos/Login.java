package cyclos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends Base {
	 By by_username=By.xpath("//input[@autocomplete='username']");
	 By by_password=By.xpath("//input[@autocomplete='password']");
     By by_loginbtn=By.xpath("//span[text()='Submit']"); 
	
	  WebElement by_uname = driver.findElement(by_username);
	  WebElement by_pw = driver.findElement(by_password);
	  WebElement bt_login = driver.findElement(by_loginbtn);
	
	public  void username()
	{
		by_uname.sendKeys("demo");
	}
	
	public  void password()
	{
		by_pw.sendKeys("1234");
	}
	public  void loginbutton()
	{
		bt_login.click();
	}
	

}
