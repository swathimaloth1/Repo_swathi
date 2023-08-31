package abhibus;

import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage extends Base {
	public static void main(String[] args) throws InterruptedException {
		
	        driver = new ChromeDriver();
			driver.get("https://www.abhibus.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
		
           String parenthandle = driver.getWindowHandle();
		   System.out.println("parent window: "+parenthandle);
       
		
	 	 By by_bus=By.id("source");
	 	 Thread.sleep(2000);
	 	 WebElement ele = driver.findElement(by_bus);
	 	 
	 	 ele.sendKeys("Hyderabad");
	 	 
	 By by_busoffers = By.xpath("//img[@title='Save Rs.300 on APSRTC bookings']");
	 Thread.sleep(2000);
	 WebElement ele1 = driver.findElement(by_busoffers);
	  ele1.click();
		
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
		   By by_buss=By.id("destination");
		 	 Thread.sleep(2000);
		 	 WebElement ele11 = driver.findElement(by_buss);
		 	 
		 	 ele11.sendKeys("vizag");
		  	 
		   
	   }
	   }
	
}
	

