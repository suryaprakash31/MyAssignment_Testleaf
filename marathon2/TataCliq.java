package marathon2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TataCliq {

	public static void main(String[] args) throws InterruptedException {
		//Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//adding Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//load the URL
		driver.get("https://www.tatacliq.com/");
		//dismissed the notification
		driver.findElement(By.id("wzrk-cancel")).click();
		//search watch for MEN search bar and click ENTER
		driver.findElement(By.id("search-text-input")).sendKeys("Watch for men", Keys.ENTER);
		//printing the total result found
		String totalResult = driver.findElement(By.xpath("//div[@class='Plp__totalProducts']")).getText();
		System.out.println("Total results found: " + totalResult);
		//Selecting the new Arraival from sort dropdown
		WebElement sortDrop = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
		Select sortdropopt = new Select(sortDrop);
		sortdropopt.selectByValue("isProductNew");
		Thread.sleep(5000);
		//getting the proce of all watches in a list
		List<WebElement> priceList = driver.findElements(By.xpath("//div[@class='ProductDescription__discount ProductDescription__priceHolder']"));
		//instantiate empty list to load all the values
		List<String> discountedPriceList = new ArrayList<String>();
		
		//Iterating the priceList list and adding the values in new list
		for (WebElement each : priceList) {
			String text1 = each.getText();
			discountedPriceList.add(text1);
			
		}
		System.out.println(discountedPriceList);
		//printing the current title of the webpage
		String title = driver.getTitle();
		System.out.println("The Current Page title is: " + title);
		Thread.sleep(5000);
		driver.close();
		
	}

}
