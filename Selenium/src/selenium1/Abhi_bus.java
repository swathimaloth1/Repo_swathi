package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abhi_bus {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.abhibus.com/operator/919/APSRTC");
     Thread.sleep(2000);
     
     By by_from=By.id("source");
     WebElement from = driver.findElement(by_from);
     from.sendKeys("Hyderabad");
     Thread.sleep(2000);
     
     By by_to=By.id("destination");
     WebElement to = driver.findElement(by_to);
     to.sendKeys("Chennai");
     Thread.sleep(2000);
     
     
     By by_date=By.id("datepicker1");
     WebElement date = driver.findElement(by_date);
     date.click();
     Thread.sleep(2000);
     
     
     
     By by_datebtn=By.xpath("(//a[text()='1'])[1]");
     WebElement datebtn = driver.findElement(by_datebtn);
     datebtn.click();
     Thread.sleep(2000);
     
     By by_searchbtn=By.xpath("//a[@id='seo_search_btn']");
     WebElement search = driver.findElement(by_searchbtn);
     search.click();
     Thread.sleep(2000);
     
 
//     By by_date=By.xpath("//a[@class=\"ui-state-default ui-state-active ui-state-hover\"]");
//     WebElement date = driver.findElement(by_date);
//     date.click();
//     Thread.sleep(2000);
     
//     By by_search=By.id("seo_search_btn");
//     WebElement search = driver.findElement(by_search);
//     search.click();
//     Thread.sleep(2000);
     
     
//     By by_Train=By.xpath("//a[text()='Trains']");
//     WebElement Trainbtn = driver.findElement(by_Train);
//     Trainbtn.click();
//     Thread.sleep(2000);
//     
//     
//     By by_Tfrom=By.xpath("//span[text()='NDLS  - New Delhi']");
//     WebElement Tfrom = driver.findElement(by_Tfrom);
//     Tfrom.sendKeys("LKO-Lucknow");
//     Thread.sleep(2000);
//     
//     By by_Tto=By.xpath("//span[text()='MMCT  - Mumbai Central']");
//     WebElement Tto = driver.findElement(by_Tto);
//     Tto.sendKeys("Secundrabad");
//     Thread.sleep(2000);
//     
//     By by_Tdatebtn=By.xpath("(//div[@class='label-container'])[3]");
//     WebElement Tdatebtn = driver.findElement(by_Tdatebtn);
//     Tdatebtn.click();
//     Thread.sleep(2000);
//     
//   
     
//   By by_date=By.xpath("//a[@class=\"ui-state-default ui-state-active ui-state-hover\"]");
//   WebElement date = driver.findElement(by_date);
//   date.click();
//   Thread.sleep(2000);
   
//   By by_search=By.id("seo_search_btn");
//   WebElement search = driver.findElement(by_search);
//   search.click();
//   Thread.sleep(2000);
   
     
	}

}
