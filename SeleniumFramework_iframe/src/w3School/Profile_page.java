package w3School;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Profile_page extends Base{
	static By framel=By.xpath("//iframe[@id='classic-menu']");
	 static By by_profile=By.xpath("//a[@id='profile-link']");
	// static By by_frame=By.xpath("//a[@id='profile-link']");
	 
	 public static WebElement iframe()
		{
			WebElement fra=driver.findElement(framel);
			driver.switchTo().frame(fra);
			return fra;	
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
