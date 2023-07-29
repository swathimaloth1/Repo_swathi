package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_login {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.cyclos.org/ui/home");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		By by_login = By.xpath("//a[@id='login-link']");
		WebElement ele=driver.findElement(by_login);
		ele.click();
		Thread.sleep(2000);
		
		By by_username = By.xpath("//input[@autocomplete='username']");
		WebElement ele1=driver.findElement(by_username);
		ele1.sendKeys("demo");
		Thread.sleep(2000);
		
		By by_password = By.xpath("//input[@autocomplete='password']");
		WebElement ele2=driver.findElement(by_password);
		ele2.sendKeys("1234");
		Thread.sleep(2000);
		
		By by_submit = By.xpath("//span[text()='Submit']");
		WebElement ele3=driver.findElement(by_submit);
		ele3.click();
		Thread.sleep(3000);
		
		By by_payuser = By.xpath("//div[text()=' Pay user ']");
		WebElement ele4=driver.findElement(by_payuser);
		ele4.click();
		Thread.sleep(4000);
		
		By by_usercontact = By.xpath("//button[@type='button' and @class='btn btn-icon ml-2']");
		WebElement ele5=driver.findElement(by_usercontact);
		ele5.click();
		Thread.sleep(4000);
		
		By by_contactname = By.xpath("//a[text()=' Emma ']");
		WebElement ele6=driver.findElement(by_contactname);
		ele6.click();
		Thread.sleep(3000);
		
		By by_amount = By.xpath("//input[@id='id_3']");
		WebElement ele7=driver.findElement(by_amount);
		ele7.sendKeys("100");
		Thread.sleep(3000);
		
		By by_scheduling_dropdown = By.xpath("//button[@id='id_4']");
		WebElement ele8=driver.findElement(by_scheduling_dropdown);
		ele8.click();
		Thread.sleep(3000);
		
		By by_mothly_installements = By.xpath("//a[text()=' Monthly installments ']");
		WebElement ele9=driver.findElement(by_mothly_installements);
		ele9.click();
		Thread.sleep(3000);
		
		By by_noof_installements = By.xpath("//input[@id='id_6']");
		WebElement ele10=driver.findElement(by_noof_installements);
		ele10.sendKeys("4");
		Thread.sleep(3000);
		
		By by_future = By.xpath("//label[text()=' Future date ']");
		WebElement ele11=driver.findElement(by_future);
		ele11.click();
		Thread.sleep(3000);
		
	}

}
