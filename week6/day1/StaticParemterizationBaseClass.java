package week6.day1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class StaticParemterizationBaseClass {
	public static RemoteWebDriver driver;
	public static Actions action;
	
	@Parameters({"URL", "userName", "passWord", "browser"})
	@BeforeMethod
	public void preCondn(String url, String user, String pwd, String browserType) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		//invoking the browser
		if(browserType.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver(opt);
		} else if(browserType.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if(browserType.equalsIgnoreCase("fireFox")) {
			driver = new FirefoxDriver();
		}
		//Maximize the screen
		driver.manage().window().maximize();
		//loading the URL
		driver.get(url);
		//adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pwd);
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
	
	
	 @DataProvider(name="sendData") 
	 public String[][] sendData() throws IOException 
	 { 
		String[][] data = new String[1][1];
		data[0][0] = "SalesForce Automation By Suryaprakash";
		
		return data; 
	 }

}
