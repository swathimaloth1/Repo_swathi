package page;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import seleniumutilities.Basepage;

public class Homepage extends Basepage {
	
	
	static By by_from=By.id("source");
	static By by_to = By.id("destination");
	 public static WebElement from() 
	   {
			WebElement from = driver.findElement(by_from);
			return from;
		}
	 
	 public static WebElement to() 
	   {
			WebElement to = driver.findElement(by_to);
			return to;
		}
	 
	  public static void from_action()
	 {
		 from().sendKeys("Hyderabad");
	 }
	 public static void to_action()
	 {
		 to().sendKeys("vizag");
	 }

}
