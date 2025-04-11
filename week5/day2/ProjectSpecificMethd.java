package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethd {
	
	public static ChromeDriver driver;
	public static Actions action;
	@BeforeMethod
	public void preCondn() throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		//invoking the browser
		driver = new ChromeDriver(opt);
		//Maximize the screen
		driver.manage().window().maximize();
		//loading the URL
		driver.get("https://login.salesforce.com/");
		//adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Test@2025");
		driver.findElement(By.id("Login")).click();
		WebElement wafleEle = driver.findElement(By.xpath("//div[@class = 'slds-icon-waffle']"));
		action = new Actions(driver);
		action.moveToElement(wafleEle);
		action.build().perform();
		wafleEle.click();
		driver.findElement(By.xpath("//button[@aria-label = 'View All Applications']")).click();
		WebElement legalEle = driver.findElement(By.xpath("//p[text() = 'Legal Entities']"));
		action.scrollToElement(legalEle);
		action.build().perform();
		legalEle.click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath(
				"//span[contains(text(),'Legal Entities')]/following::lightning-icon")));
		Thread.sleep(3000);
		
		js.executeScript("arguments[0].click();",
							driver.findElement(By.xpath("//span[text() = 'New Legal Entity']")));
		Thread.sleep(2000);
		

	}

	@AfterMethod
	public void PostCondn() {
		driver.close();
	}

}
