package seleniumutilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import page.Basepage;

public class Iframes extends Basepage{
	static By framel=By.xpath("//iframe[@id='classic-menu']");
	
	 public static void iframe()
		{
			WebElement fra=driver.findElement(framel);
			driver.switchTo().frame(fra);
				
		}
	 

}
