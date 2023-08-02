package selenium1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_HRM {
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	By by_login = By.xpath("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']");
	WebElement ele=driver.findElement(by_login);
	ele.click();
	Thread.sleep(2000);
	
	By by_username = By.xpath("//input[@name='username']"); 
	WebElement ele1=driver.findElement(by_username);
	ele1.sendKeys("Admin");
	Thread.sleep(2000);
	
	By by_password = By.xpath("//input[@name='password']");
	WebElement ele2=driver.findElement(by_password);
	ele2.sendKeys("admin123");
	Thread.sleep(2000);
	
	By by_submit = By.xpath("//button[@type='submit']");
	WebElement ele3=driver.findElement(by_submit);
	ele3.click();
	Thread.sleep(3000);
	
	By by_myinfo = By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and  text()='My Info']");
	WebElement ele4=driver.findElement(by_myinfo);
	ele4.click();
	Thread.sleep(3000);
	
	
//	By by_pronamee = By.name("firstName");
//	WebElement ele5=driver.findElement(by_pronamee);
//	ele5.clear();
//	Thread.sleep(3000);
	
	
	By by_proname = By.name("firstName");
	WebElement elee5=driver.findElement(by_proname);
	elee5.sendKeys("SWATHI");
	Thread.sleep(2000);
	
	By by_promidname = By.name("middleName");
	WebElement ele_mid=driver.findElement(by_promidname);
	ele_mid.sendKeys("SWA");
	Thread.sleep(2000);
	
	
	By by_prolastname = By.name("lastName");
	WebElement ele_last=driver.findElement(by_prolastname);
	ele_last.sendKeys("malothu");
	Thread.sleep(2000);
	
	By by_pronickname = By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]");
	WebElement ele_nick=driver.findElement(by_pronickname);
	ele_nick.sendKeys("s");
	Thread.sleep(2000);
	
	
	
	
	
}
}