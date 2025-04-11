package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		System.out.println(driver.getWindowHandle());
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		Thread.sleep(5000);
		Set<String> cWindow1 = driver.getWindowHandles();
		List<String> listWindow1 = new ArrayList<String>(cWindow1);
		driver.switchTo().window(listWindow1.get(1));
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		driver.findElement(By.xpath("//table/tbody/tr/td/div/a")).click();
		driver.switchTo().window(listWindow1.get(0));
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Thread.sleep(5000);
		Set<String> cWindow2 = driver.getWindowHandles();
		List<String> listWindow2 = new ArrayList<String>(cWindow2);
		driver.switchTo().window(listWindow2.get(1));
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table'])[2]/tbody/tr/td/div/a")).click();
		driver.switchTo().window(listWindow1.get(0));
		System.out.println(driver.getWindowHandle());
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		System.out.println(driver.getTitle());
		
		

	}


}
