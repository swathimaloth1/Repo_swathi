package abhibus;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage extends Base {
	
		
	
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		
		String parenthandle = driver.getWindowHandle();
		System.out.println("parent window: "+parenthandle);

		By by_bus=By.id("source");
		WebElement ele = driver.findElement(by_bus);
	    ele.sendKeys("Hyderabad");
	    
	    By by_train = By.id("pills-profile-tab");
		  WebElement ele1 = driver.findElement(by_train);
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
			  	//driver.quit();
		   }
		   
	   }
	}
}	

	


