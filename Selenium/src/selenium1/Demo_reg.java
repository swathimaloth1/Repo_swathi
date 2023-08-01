package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_reg {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.cyclos.org/ui/home");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		

	        By by_reg = By.id("register-link");
			WebElement ele=driver.findElement(by_reg);
			ele.click();
			Thread.sleep(2000);
			
	        By by_name = By.id("id_1");
	        WebElement ele1=driver.findElement(by_name);
	        ele1.sendKeys("swathi");
	        Thread.sleep(2000);
	        
	        By by_loginname = By.xpath("//input[@id='id_2']");
	        WebElement ele2=driver.findElement(by_loginname);
	        ele2.sendKeys("malothuswathi");
	        Thread.sleep(2000);
			
	        By by_email = By.id("id_3");
	        WebElement ele3=driver.findElement(by_email);
	        ele3.sendKeys("swathi9989@gmail.com");
	        Thread.sleep(2000);
			
	        

	        By by_radiobtn = By.xpath("//label[text()=' Female ']");
			WebElement ele4=driver.findElement(by_radiobtn);
			ele4.click();
			Thread.sleep(2000);
			
	}
}
