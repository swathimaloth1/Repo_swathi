package seleniumutilities;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import page.Basepage;

public class Explicitwait extends Basepage{
	static  By by_username=By.xpath("//input[@autocomplete='username']");
	static WebDriverWait wait;
	public static void Explicitwait()
	{
	 wait = new WebDriverWait(driver,Duration.ofSeconds(50));	
	 wait.until(ExpectedConditions.visibilityOfElementLocated(by_username));
	}

}
