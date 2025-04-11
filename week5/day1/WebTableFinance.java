package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTableFinance {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://finance.yahoo.com/");
		WebElement element = driver.findElement(By.xpath("//span[text()='More']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.build().perform();
		driver.findElement(By.xpath("//a[@aria-label = 'Finance: Crypto']")).click();
		List<WebElement> cName = driver.findElements(By.xpath("//table[@class='markets-table freeze-col yf-hhhli1 fixedLayout']/tbody/tr/td[2]/span/div"));
		List<String> cryptoName = new ArrayList<String>();
		
		for (WebElement each : cName) {
			String text1 = each.getText();
			cryptoName.add(text1);
		}
		System.out.println(cryptoName);
		driver.close();

	}

}
