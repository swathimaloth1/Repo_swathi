package w3School;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	static By framel=By.xpath("//iframe[@id='classic-menu']");
	static WebDriver driver;
	public static void launch() throws InterruptedException
	{
		driver=new ChromeDriver();
		//driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
       driver.get("https://profile.w3schools.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	

}
