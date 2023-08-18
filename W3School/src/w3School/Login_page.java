package w3School;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login_page extends Base{
	static By by_username = By.name("email");
	static By by_password=By.name("current-password");
	static By by_loginbtn = By.xpath("//button[@class=\"Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu\"]");
	
	
	
	public static WebElement uname() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele = driver.findElement(by_username);
		return ele;
		
	}

	public static WebElement pass_word() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(by_password);
		return ele1;
		
		
	}
	
	public static WebElement submit() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele2 = driver.findElement(by_loginbtn);
		return ele2;
		
	}
	
	
	
	public static void username() throws InterruptedException
	{
		uname().sendKeys("swathimaloth404@gmail.com");
		
	}
	
	public static void password() throws InterruptedException
	{
		pass_word().sendKeys("Swathi@11220");
	}
	
	public static void login() throws InterruptedException
	{
		submit().click();
	}
	

}
