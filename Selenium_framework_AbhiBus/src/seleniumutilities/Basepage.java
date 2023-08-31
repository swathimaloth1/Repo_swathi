package seleniumutilities;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basepage {
    protected static WebDriver driver;
	public static void launch()
	{
		driver = new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
	}
	public static String WindoweHandling() throws InterruptedException
	{
		   String parenthandle = driver.getWindowHandle();
		   System.out.println("parent window: "+parenthandle);
     
		   Set <String> handles = driver.getWindowHandles();
		   System.out.println(handles);
		   for(String handle : handles)
		   {
			  System.out.println(handle);
			   if(!handle.equals(parenthandle))
			   {
				  driver.switchTo().window(handle) ;
				 
				  
				  	Thread.sleep(2000);
				  	 driver.close();
				  	
			   }
			   
		   }
		   return parenthandle;
	}

}
