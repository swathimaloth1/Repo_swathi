package Cyclos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class Fluentwait {
	static WebDriver driver;
	public static void browser_launch() {
		driver = new ChromeDriver();
		driver.get("https://demo.cyclos.org/ui/login");
		driver.manage().window().maximize();
	}
	
	public static void fleuntWait() throws InterruptedException
	{
		By by_username = By.xpath("//input[@type='text']");
		WebElement uname = driver.findElement(by_username);
		FluentWait<WebDriver> wait= new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(30));
		wait.pollingEvery(Duration.ofSeconds(5));
		//Thread.sleep(3000);
		
		uname.sendKeys("demo");
	}
	/*	//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));


	By by_username = By.xpath("//input[@autocomplete='username']");

		//wait .until(ExpectedConditions.visibilityOfElementLocated(by_username));
		//Thread.sleep(3000);
		WebElement uname = driver.findElement(by_username);
		FluentWait<WebDriver> wait= new FluentWait<WebDriver>(driver);
		

		wait .withTimeout(Duration.ofSeconds(30));
		wait.pollingEvery(Duration.ofSeconds(5));


		uname.sendKeys("demo");

		By by_password = By.xpath("//input[@autocomplete='password']");
		WebElement pass = driver.findElement(by_password);
		pass.sendKeys("1234");

		By by_login = By.xpath("//span[text()='Submit']");
		WebElement loginbtn = driver.findElement(by_login);
		loginbtn.click();*/



public static void main(String[] args) throws InterruptedException {
	Fluentwait.browser_launch();
	Fluentwait.fleuntWait();
}

}
