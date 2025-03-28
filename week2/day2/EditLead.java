package week2.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Wipro-6");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Suryaprakash");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Selvam");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("SP");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Informational technology");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation tester");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc123@gmail.com");
		WebElement statedrop = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd5 = new Select(statedrop);
		dd5.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("description")).sendKeys("Description Updated Successfully");
		driver.findElement(By.xpath("//input[@type='submit'][@value='Update']")).click();
		System.out.println("The title of the Current Webpage is " + driver.getTitle());
		//driver.quit();
		
		

	}

}
