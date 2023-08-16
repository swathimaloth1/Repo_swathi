package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Homepage extends Base {
	By mobile_page=By.xpath("//a[text()='Mobiles']");
	
    WebElement bn_page=driver.findElement(mobile_page);
    
    public void mobile() throws InterruptedException
    {
    	bn_page.click();
    	Thread.sleep(3000);
    }
}
