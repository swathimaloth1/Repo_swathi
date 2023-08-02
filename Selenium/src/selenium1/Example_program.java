package selenium1;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Example_program {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");//div[@class="SDkEP"]
		
		 By by_popup = By.xpath("//button[@aria-label='Stay signed out']");
			WebElement ele=driver.findElement(by_popup);
			ele.click();
			Thread.sleep(2000);
		
		By by_search=By.xpath("//div[@class='SDkEP']");
		WebElement search=driver.findElement(by_search);
		search.sendKeys("ZtoH INDIA ITES PVT LTD");
		Thread.sleep(2000);
		
		
		
	}

}
