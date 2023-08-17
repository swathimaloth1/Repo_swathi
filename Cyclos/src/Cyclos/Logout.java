package Cyclos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Logout extends Base {
	static By by_loginbtn = By.xpath("//a[@id='logout-trigger']");
	
	public static WebElement logoutbtn() throws InterruptedException
	{
		Thread.sleep(2000);
		 WebElement by_lbtn = driver.findElement(by_loginbtn);
		return by_lbtn;
		
	}
	public static void logout() throws InterruptedException
	{
		logoutbtn().click();
	}
	

}

