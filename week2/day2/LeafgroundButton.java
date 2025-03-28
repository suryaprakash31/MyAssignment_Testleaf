package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LeafgroundButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String title = driver.getTitle();
		System.out.println("The Title of the page is: "+title);
		driver.navigate().back();
		
		boolean enabled = driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
		System.out.println(enabled);
		
		WebElement location = driver.findElement(By.xpath("(//span[text()='Submit'])[1]"));
		System.out.println(location.getLocation());
		
		WebElement bgcolor = driver.findElement(By.xpath("//span[text()='Save']"));
		System.out.println(bgcolor.getCssValue("background-Color"));
		
		

	}

}
