package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_reg {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.cyclos.org/ui/home");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(3000);

		

	        By by_reg = By.id("register-link");
			WebElement ele=driver.findElement(by_reg);
			ele.click();
			Thread.sleep(3000);
			
	        By by_name = By.id("id_1");
	        WebElement ele1=driver.findElement(by_name);
	        ele1.sendKeys("swathi");
	        Thread.sleep(3000);
	        
	        By by_loginname = By.xpath("//input[@id='id_2']");
	        WebElement ele2=driver.findElement(by_loginname);
	        ele2.sendKeys("malothuswathi");
	        Thread.sleep(2000);
			
	        By by_email = By.id("id_3");
	        WebElement ele3=driver.findElement(by_email);
	        ele3.sendKeys("swathi9989@gmail.com");
	        Thread.sleep(2000);
	        
	        By by_website = By.id("website");
	        WebElement ele_website=driver.findElement(by_website);
	        ele_website.sendKeys("www.facebook.com");
	        Thread.sleep(2000);
			
			
	        

	        By by_radiobtn = By.xpath("//label[text()=' Female ']");
			WebElement ele4=driver.findElement(by_radiobtn);
			ele4.click();
			Thread.sleep(2000);
			
			 By by_mobileph = By.id("id_4");
		        WebElement ele5=driver.findElement(by_mobileph);
		        ele5.sendKeys("9542590199");
		        Thread.sleep(2000);
		        
		        By by_adress = By.xpath("(//label[@class='custom-control-label'])[3]");
				WebElement ele6=driver.findElement(by_adress);
				ele6.click();
				Thread.sleep(2000);
				
				 By by_adressline = By.id("addressLine1");
			        WebElement ele_ad=driver.findElement(by_adressline);
			        ele_ad.sendKeys("Hyderabad");
			        Thread.sleep(2000);
			        
			        By by_zipcode = By.id("zip");
			        WebElement ele_zip=driver.findElement(by_zipcode);
			        ele_zip.sendKeys("100058");
			        Thread.sleep(2000);
			        
			        By by_city = By.id("city");
			        WebElement ele_city=driver.findElement(by_city);
			        ele_city.sendKeys("mehadipatnam");
			        Thread.sleep(2000);
			        
			        By by_region = By.id("region");
			        WebElement ele_region=driver.findElement(by_region);
			        ele_region.sendKeys("Telangana");
			        Thread.sleep(2000);
			        
			      
			        
			        By by_nextbtn = By.xpath("//button[@type=\"button\" and @class=\"btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary\"]");
					WebElement ele_nextbtn=driver.findElement(by_nextbtn);
					ele_nextbtn.click();
					Thread.sleep(2000);
	}
}
