package abhibus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	protected static WebDriver driver;
	public static void launch()
	{
		driver = new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
	}

}
