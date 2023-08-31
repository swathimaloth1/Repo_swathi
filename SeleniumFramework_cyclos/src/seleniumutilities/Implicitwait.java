package seleniumutilities;

import java.time.Duration;

import page.Basepage;

public class Implicitwait extends Basepage{
	public static void implicitwait()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3));
	}

}
