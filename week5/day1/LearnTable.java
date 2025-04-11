package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
		fromStation.clear();
		fromStation.sendKeys("MAS" , Keys.ENTER);
		WebElement toStation = driver.findElement(By.id("txtStationTo"));
		toStation.clear();
		toStation.sendKeys("MDU" , Keys.ENTER);
		driver.findElement(By.xpath("//table[@id='tableTopMenu']/tbody/tr/td[6]/input")).click();
		List<WebElement> trainName = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/td[2]"));
		List<String> newList = new ArrayList<String>();
		for (WebElement each : trainName) {
			String text = each.getText();
			newList.add(text);		
			}
		System.out.println(newList);
	}

}
