package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import seleniumutilities.Basepage;

public class BusOffers_page extends Basepage{
	
	static  By by_busoffers = By.xpath("//img[@title='Save Rs.300 on APSRTC bookings']");
	static By by_source = By.id("source");
	static By by_destination = By.id("destination");
	
	public static  WebElement busoffers()
	{
		 WebElement ele1 = driver.findElement(by_busoffers);
		 return ele1;
	}
	
	public static WebElement from()
	{
		WebElement by_from=driver.findElement(by_source);
		return by_from;
		
	}
	
	public static WebElement to()
	{
		WebElement by_to=driver.findElement(by_destination );
		return by_to;
		
	}
	
	
	public static void by_action_offers()
	{
		busoffers().click();
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
