package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Basepage {
	static WebDriver driver;
	
	public static void launch()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.cyclos.org/ui/login");
		driver.manage().window().maximize();
		
		
		
	}

}
