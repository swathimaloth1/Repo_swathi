package w3School;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HTML_forms_page extends Base{
	static By by_f_name=By.id("fname");
	static By by_l_name=By.id("lname");
	static By by_submit=By.xpath("//input[@type='submit']");
	
	public static WebElement f_name() throws InterruptedException
	{
		driver.switchTo().frame("iframeResult");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(by_f_name);
		return ele;
		
	}
	public static void Firstname() throws InterruptedException
	{
		f_name().sendKeys("swathi");
	}
	
	
	public static WebElement l_name() throws InterruptedException
	{
		//driver.switchTo().frame("iframeResult");
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(by_l_name);
		return ele1;
		
	}
	public static void Lastname() throws InterruptedException
	{
		l_name().sendKeys("malothu");
	}
	
    
	public static WebElement submit() throws InterruptedException
	{
		//driver.switchTo().frame("iframeResult");
		Thread.sleep(2000);
		WebElement ele2 = driver.findElement( by_submit);
		return ele2;
		
	}
	public static void Submit() throws InterruptedException
	{
		submit().click();
	}
}
