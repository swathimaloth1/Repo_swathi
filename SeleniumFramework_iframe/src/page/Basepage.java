package page;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Basepage {
	
	protected static WebDriver driver;
	public static void launch() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://profile.w3schools.com");
      
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	
	
	


}
