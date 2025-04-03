package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMarathon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		// maximize the screen
		driver.manage().window().maximize();
		//adding Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//loading URL
		driver.get("https://www.amazon.in/");
		//Search for bags for boys in search bar 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags for boys", Keys.ENTER);
		//printing total results found
		String text = driver.findElement(By.className("sg-col-inner")).getText();
		System.out.println(text);
		//Selecting Brand from checkbox
		driver.findElement(By.xpath("(//li[@class = 'a-spacing-micro'])[2]//a")).click();
		driver.findElement(By.xpath("(//li[@class = 'a-spacing-micro'])[3]//a")).click();
		//Sorting the new arraival from sort by
		driver.findElement(By.xpath("//span[@class = 'a-button-text a-declarative']/span")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		//printing the Brandname and price
		String brandName = driver.findElement(By.xpath("(//h2[@class='a-size-mini s-line-clamp-1']/span)[1]")).getText();
		String productName = driver.findElement(By.xpath("(//h2[@class = 'a-size-base-plus a-spacing-none a-color-base a-text-normal']/span)[1]")).getText();
		String price = driver.findElement(By.xpath("//span[@class = 'a-price-whole']")).getText();
		System.out.println("The First bag in the list is: " + brandName + ", " + productName + " and the Discounted price is Rs." + price);
		System.out.println("The Title of the page is: " + driver.getTitle());
		driver.close();

	}

}
