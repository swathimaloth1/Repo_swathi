package orageHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Logout extends Base{
	
	
	 By logut_btn = By.xpath("//img[@src=\"/web/index.php/pim/viewPhoto/empNumber/7\"]");
	  By logout =By.xpath("(//a[@role=\"menuitem\"])[4]");
	
	 WebElement lg_b= driver.findElement(logut_btn);
	 WebElement lg = driver.findElement(logout);
	
	public  void logoutbtn()
	{
		lg_b.click();
	}
	public  void logout()
	{
		lg.click();
	}
	

}
