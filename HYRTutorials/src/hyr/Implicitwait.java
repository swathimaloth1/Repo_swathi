package hyr;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		By by_textbox1=By.xpath("//button[@id='btn1']");
		WebElement b1 = driver.findElement(by_textbox1);
	    b1.click();
         
	    By by_textbox11=By.xpath("(//input[@id='txt1'])[1]");
		 //Thread.sleep(6000);
		WebElement box1 = driver.findElement(by_textbox11);
	    box1.sendKeys("ztoh");
	    
	    By by_textbox2=By.xpath("//button[@id='btn2']");
		WebElement b2 = driver.findElement(by_textbox2);
	    b2.click();
         
	    By by_textbox22=By.xpath("(//input[@id																									='txt2'])[1]");
		 //Thread.sleep(6000);
		WebElement box2 = driver.findElement(by_textbox22);
	    box2.sendKeys("ztoh ites india pvt ltd");
	   

		
	}

}
