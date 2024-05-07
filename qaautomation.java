package QAAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class qaautomation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(
				"https://docs.google.com/forms/d/e/1FAIpQLSep9LTMntH5YqIXa5nkiPKSs283kdwitBBhXWyZdAS-e4CxBQ/viewform");
		driver.findElement(By.xpath("(//input[@jsname='YPqjbf'])[1]")).sendKeys("Abhishek");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@class='KHxj8b tL9Q4c']"))
				.sendKeys("Because its easy and  Manuel convert it in automation");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(5000);
		driver.findElement(By.id("i13")).click();
		js.executeScript("window.scrollBy(0,200)");
		driver.findElement(By.id("i30")).click();
		driver.findElement(By.id("i33")).click();
		driver.findElement(By.id("i39")).click();
		js.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.xpath("(//span[@class='vRMGwf oJeWuf'])[1]")).click();
		driver.findElement(By.xpath("(//span [@class='vRMGwf oJeWuf'])[8]")).click();
		js.executeScript("window.scrollBy(0,300)");
		
		driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[2]")).sendKeys("01-05-2024");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("42");
		driver.findElement(By.xpath("(//span[@class='NPEfkd RveJvd snByac'])[1]")).click();

	}

}
