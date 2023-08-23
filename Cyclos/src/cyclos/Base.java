package Cyclos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  class Base {
	 static WebDriver driver;
	 public static void lanch()
	 {
		 driver = new ChromeDriver();
			driver.get("https://demo.cyclos.org/ui/login");
			driver.manage().window().maximize();
	 }

}
