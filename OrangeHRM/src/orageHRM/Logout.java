package orageHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Logout extends Base{
	
	
	 static By logut_btn = By.xpath("//img[@src=\"/web/index.php/pim/viewPhoto/empNumber/7\"]");
	  static By logout =By.xpath("(//a[@role=\"menuitem\"])[4]");
	
	
	
	
	 public static WebElement lbtn() throws InterruptedException
	 {
		 WebElement lg_b= driver.findElement(logut_btn);
		 Thread.sleep(3000);
		 return lg_b;
	 }
	 public static WebElement l_out() throws InterruptedException
	 {
		 WebElement lg = driver.findElement(logout);
		 Thread.sleep(3000);
		 return lg;
	 }
	public static void logoutbtn() throws InterruptedException
	{
		lbtn().click();
	}
	public static void logout() throws InterruptedException
	{
		l_out().click();
	}
	

}
