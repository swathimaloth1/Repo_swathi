package seleniumutilities;



import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;

import page.Basepage;

public class Explicitwait extends Basepage{
	static WebDriverWait wait;
	public static void Explicitwait()
	{
	 wait = new WebDriverWait(driver,Duration.ofSeconds(20));	
	}

}
