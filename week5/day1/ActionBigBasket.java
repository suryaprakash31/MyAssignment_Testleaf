package week5.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionBigBasket {
	public static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		//invoking the browser
		driver = new ChromeDriver(opt);
		//Maximize the screen
		driver.manage().window().maximize();
		//loading the URL
		driver.get("https://www.bigbasket.com/");
		//adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//select shop by category
		driver.findElement(By.xpath("(//span[text() = 'Shop by'])[2]")).click();
		//mouseHover to food grains oil and masala
		WebElement foodEle = driver.findElement(By.xpath("(//a[text() = 'Foodgrains, Oil & Masala'])[2]"));
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(foodEle);
		action.build().perform();
		//mouse hover to rice and rice product
		WebElement riceEle = driver.findElement(By.xpath("//a[text() = 'Rice & Rice Products']"));
		action.moveToElement(riceEle);
		action.build().perform();
		//select boiled and steam rice
		driver.findElement(By.xpath("//a[text() = 'Boiled & Steam Rice']")).click();
		//apply filter to select BB royal by scrolling down
		WebElement bbEle = driver.findElement(By.xpath("//input[@id='i-BBRoyal']"));
		action.scrollToElement(bbEle);
		action.build().perform();
		bbEle.click();
		//Selecting tamilPonni from the result
		WebElement tamilponniEle = driver.findElement(By.xpath("//h3[text() = 'Tamil Ponni Boiled Rice - 12 - 17 Months Old']"));
		action.scrollToElement(tamilponniEle);
		action.build().perform();
		//getting address and title of current page
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		tamilponniEle.click();
		//switching to child window using windowHandles method
		Set<String> cWindow1 = driver.getWindowHandles();
		List<String> tamilponniWindow = new ArrayList<String>(cWindow1);
		driver.switchTo().window(tamilponniWindow.get(1));
		//getting title and address of childWindow
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		//Select5kg bag
		WebElement ele5kg = driver.findElement(By.xpath("//span[text()='5 kg']/parent::div"));
		action.scrollToElement(ele5kg);
		action.build().perform();
		ele5kg.click();
		//getting price of the selected quantity
		String price = driver.findElement(By.xpath("//table/tr/td")).getText();
		System.out.println("5KG Rice bag Price is: " + price);
		//adding product to the cart
		driver.findElement(By.xpath("//button[text()='Add to basket']")).click();
		Thread.sleep(2000);
		//taking a screenshot
		TakesScreenshot ts = (TakesScreenshot)driver;
		File firstsrc = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/bigbasketRice.png");
		FileUtils.copyFile(firstsrc, dest);
		
		//quit the browser
		driver.quit();

	}

}
