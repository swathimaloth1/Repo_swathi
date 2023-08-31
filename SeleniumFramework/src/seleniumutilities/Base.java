package seleniumutilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	protected static WebDriver driver;
	public static WebDriverWait wait;
	public static void launch()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.cyclos.org/ui/login");
		driver.manage().window().maximize();
		
		
		
	}
	 public static void Explicity()
	{
	  wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
	}

}
