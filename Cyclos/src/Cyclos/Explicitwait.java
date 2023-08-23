package Cyclos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.cyclos.org/ui/login");
		driver.manage().window().maximize();
		
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		
		By by_username = By.xpath("//input[@autocomplete='username']");
		w.until(ExpectedConditions.visibilityOfElementLocated(by_username));
		
		WebElement uname = driver.findElement(by_username);
		uname.sendKeys("demo");
		
		By by_password = By.xpath("//input[@autocomplete='password']");
		WebElement pass = driver.findElement(by_password);
		pass.sendKeys("1234");
		
		By by_login = By.xpath("//span[text()='Submit']");
		WebElement loginbtn = driver.findElement(by_login);
		loginbtn.click();
		

	}

}
