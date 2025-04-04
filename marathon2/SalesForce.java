package marathon2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException {
		//Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//adding Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//load the URL
		driver.get("https://dev186929.service-now.com/");
		//Login using Credentials
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("2AqjN!lC2!Vy");
		driver.findElement(By.id("sysverb_login")).click();
		//Instantiating Shadow Object to find element in shadowRoot
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(20);
		shadow.findElementByXPath("//div[text()='All']").click();
		shadow.findElementByXPath("//span[text()='Service Catalog']").click();
		WebElement elementByXPath = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		//Switch focus to frame
		driver.switchTo().frame(elementByXPath);
		//selecting Mobile
		driver.findElement(By.xpath("//a[@aria-label = 'Mobiles. Cell phones to meet your business needs.']")).click();
		//Selecting Mobile Model
		driver.findElement(By.xpath("//strong[text()='Apple iPhone 13 pro']")).click();
		//Select Radio btn
		driver.findElement(By.xpath("//label[text()='Yes']")).click();
		//enter mob number
		driver.findElement(By.xpath("//input[@class='cat_item_option sc-content-pad form-control']")).sendKeys("995");
		//select the option from dropDown
		WebElement drop1 = driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
		Select dataDrop = new Select(drop1);
		dataDrop.selectByValue("unlimited");
		//Select the radio Btn for color and storage variant
		driver.findElement(By.xpath("//label[text()='Sierra Blue']")).click();
		driver.findElement(By.xpath("//label[contains(text(),'512 GB')]")).click();
		//Click order now
		driver.findElement(By.id("oi_order_now_button")).click();
		//Getting the Req ID
		String reqID = driver.findElement(By.xpath("//a[@id='requesturl']/b")).getText();
		System.out.println("Your Order has been Placed Successfully, and your Request ID is: " + reqID);
		
		
		
		Thread.sleep(5000);
		driver.quit();

	}

}
