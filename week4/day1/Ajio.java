package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("Bags");
		driver.findElement(By.xpath("//span[@class = 'ic-search']")).click();
		driver.findElement(By.xpath("(//div[@class='facet-linkhead'])[2]/label")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[contains(@class,'Fashion Bags')]")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//div[@class = 'filter']/div/strong")).getText());
		List<WebElement> brandName = driver.findElements(By.xpath("//div[@class = 'brand']/strong"));
		List<String> brandList = new ArrayList<String>();
		
		for (WebElement each : brandName) {
			String list1 = each.getText();
			brandList.add(list1);
			
		}
		System.out.println(brandList);
		
 	}

}
