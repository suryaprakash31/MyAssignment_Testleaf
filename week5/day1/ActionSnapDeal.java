package week5.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionSnapDeal {
	public static ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		// Disabling the notifications
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		//invoking the browser
		driver = new ChromeDriver(opt);
		//Maximize the screen
		driver.manage().window().maximize();
		//adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//loading the URL
		driver.get("https://www.snapdeal.com/");
		
		//mosueHover to Mens Fashion
		WebElement mensFas = driver.findElement(By.xpath("(//span[contains(text() ,'Fashion')])[1]"));
		Actions action = new Actions(driver);
		action.moveToElement(mensFas).perform();
		//Click on sportShoes
		driver.findElement(By.xpath("//span[text() = 'Sports Shoes']")).click();
		//printing the result showing no of shoes found
		String shoeCount = driver.findElement(By.xpath("//span[@class = 'category-name category-count']")).getText();
		System.out.println(shoeCount);
		//selecting training show from menu
		driver.findElement(By.xpath("//div[text() = 'Training Shoes']")).click();
		//sorting the products by the price: Low to High
		driver.findElement(By.xpath("//span[text() = 'Sort by:']")).click();
		driver.findElement(By.xpath("(//ul[@class='sort-value']/li)[2]")).click();
		Thread.sleep(5000);
		//Verifying the products are sorted in ascending order based on Price
		List<WebElement> priceList = driver.findElements(By.xpath("//span[@class = 'lfloat product-price']"));
		verifyPrice(priceList);//calling the verifyPrice object and passing the priceList arg
		
		//filtering from price value 500 to 700
		WebElement fromElement = driver.findElement(By.xpath("//input[@name='fromVal']"));
		fromElement.clear();
		fromElement.sendKeys("500");
		WebElement toElement = driver.findElement(By.xpath("//input[@name = 'toVal']"));
		toElement.clear();
		toElement.sendKeys("700", Keys.ENTER);
		Thread.sleep(5000);
		
		//Selecting the color 
		WebElement colorSel = driver.findElement(By.xpath("//a[contains(text(),'White & Blue')]//parent::label"));
		action.scrollToElement(colorSel).build().perform();
		colorSel.click();
		//Verifying the filters were applied successfully by calling the verifyFilter object
		verifyFilter();
		
		//mouseHovering the shown product and click on quick view
		WebElement quick = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
		action.moveToElement(quick);
		action.build().perform();
		driver.findElement(By.xpath("//div[@class='center quick-view-bar  btn btn-theme-secondary  ']")).click();
		String priceText = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		//getting the price and discounted percent
		System.out.println("The Price is: " + priceText);
		String discountPercent = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("Discounted Percentage is: " + discountPercent);
		Thread.sleep(3000);
		//taking a screenshot
		TakesScreenshot ts = (TakesScreenshot)driver;
		File firstsrc = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/shoesnapdeal.png");
		FileUtils.copyFile(firstsrc, dest);
		
		//closing the browser
		driver.quit();
		

	}
	//method to verify the products were arranges in ascending order by comparing the actual list and sorted list
	public static void verifyPrice(List<WebElement> priceList) {
		List<Integer> listPrice = new ArrayList<Integer>();
		for (WebElement each : priceList) {
			String cost = each.getText();
			cost = cost.replace("Rs.", "");
			cost = cost.replace(" ", "");
			cost = cost.replace(",", "");
			listPrice.add(Integer.parseInt(cost));
		}
		System.out.println("Actual List Price: " + 	listPrice);
		List<Integer> sortedListPrice = new ArrayList<Integer>(listPrice);
		Collections.sort(sortedListPrice);
		System.out.println("Sorted List: " + sortedListPrice);
		
		if (listPrice.equals(sortedListPrice)) {
			System.out.println("The sort has been applied correctly. Product has been categorized by Price of Low to High");
		} else {
			System.out.println("Sort has'nt applied correctly");
		}	
		
	}
	
	//Verifying the Filter were applied successfully 
	public static void verifyFilter() {
		String text = driver.findElement(By.xpath("//a[@data-key='Price|Price']")).getText();
		if((text.contains("500")) && (text.contains("700"))) {
			System.out.println("Price range Filter applied Succefully");
		} else {
			System.out.println("Price range filter not applied successfully");
		}
		String text2 = driver.findElement(By.xpath("//a[@data-key='Color_s|Color']")).getText();
		if(text2.contains("White & Blue")){
			System.out.println("Color Filter applied Successfully");
		} else {
			System.out.println("Color Filter not applied Successfully");
		}
	}
	

}
