package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import seleniumutilities.Iframes;

public class Profile_page extends Basepage {
	
	
	 static By by_profile=By.xpath("//a[@id='profile-link']");
	
	 
	
	 public static WebElement profile() throws InterruptedException
		{
		 Iframes.iframe();
		 
			Thread.sleep(4000);
			WebElement pro = driver.findElement(by_profile);
			return pro;
			
		}
	 public static void profile_page_action() throws InterruptedException
		{
			profile().click();
		}



}
