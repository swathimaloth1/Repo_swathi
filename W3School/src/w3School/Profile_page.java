package w3School;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Profile_page extends Base{
	 static By by_profile=By.xpath("//a[text()='Profile']");
	 static By by_frame=By.xpath("//a[@id='profile-link']");
	 
	 public static WebElement frame() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 
		 WebElement ele = driver.findElement(by_frame);
		 driver.switchTo().frame(ele);
		return ele;
		 
	 }
	 
	 public static WebElement profile() throws InterruptedException
		{
		 
			Thread.sleep(2000);
			WebElement pro = driver.findElement(by_profile);
			return pro;
			
		}
	 public static void profile_page() throws InterruptedException
		{
			profile().click();
		}


}
