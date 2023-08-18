package w3School;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Profile_page extends Base{
	 static By by_profile=By.xpath("//a[text()='Profile']");
	 
	 public static WebElement profile() throws InterruptedException
		{
		 driver.switchTo().frame("classic-menu");
			Thread.sleep(2000);
			WebElement pro = driver.findElement(by_profile);
			return pro;
			
		}
	 public static void profile_page() throws InterruptedException
		{
			profile().click();
		}


}
