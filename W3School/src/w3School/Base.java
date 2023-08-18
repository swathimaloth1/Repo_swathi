package w3School;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	static WebDriver driver;
	public static void launch()
	{
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/default.asp");
	}

}
