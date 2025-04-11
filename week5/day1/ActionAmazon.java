package week5.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionAmazon {
	public static ChromeDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		//invoking the browser
		driver = new ChromeDriver(opt);
		//Maximize the screen
		driver.manage().window().maximize();
		//loading the URL
		driver.get("https://www.amazon.in/");
		//adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro", Keys.ENTER);
		String price1 = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("The 1st product price is: " + price1);
		String rating = driver.findElement(By.xpath("(//span[@class = 'a-size-base s-underline-text'])[1]")).getText();
		System.out.println("No of user gave rating for this 1st product: " + rating);
		//getting title and address of childWindow
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		driver.findElement(By.xpath("(//img[@class = 's-image'])[1]")).click();
		Set<String> cWindow1 = driver.getWindowHandles();
		List<String> oneplusWind = new ArrayList<String>(cWindow1);
		driver.switchTo().window(oneplusWind.get(1));
		Thread.sleep(5000);
		//getting title and address of childWindow
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		//taking a screenshot
		TakesScreenshot ts = (TakesScreenshot)driver;
		File firstsrc = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/amazonPhone.png");
		FileUtils.copyFile(firstsrc, dest);
		WebElement addCartEle = driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"));
		Actions action = new Actions(driver);
		action.scrollToElement(addCartEle);
		action.build().perform();
		Thread.sleep(2000);
		addCartEle.click();
		Thread.sleep(5000);
		String text1 = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		System.out.println("The Cart Subtotal is: " + text1);
		String substring = text1.substring(1).replace(".00", "");
		System.out.println(substring);
		if(price1.equals(substring)) {
			System.out.println("The Mobile price and Cart Price is same");
		} else {
			System.out.println("The Mobile Price and Cart Price is Different. Please have a check");
		}
		
		driver.quit();

	}

}
