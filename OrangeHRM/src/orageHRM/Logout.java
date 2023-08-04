package orageHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Logout extends Base{
	
	
	static By logut_btn = By.xpath("//img[@src=\"/web/index.php/pim/viewPhoto/empNumber/7\"]");
	 static By logout =By.xpath("(//a[@role=\"menuitem\"])[4]");
	
	static WebElement lg_b= driver.findElement(logut_btn);
	static WebElement lg = driver.findElement(logout);
	
	public static void logoutbtn()
	{
		lg_b.click();
	}
	public static void logout()
	{
		lg.click();
	}
	

}
