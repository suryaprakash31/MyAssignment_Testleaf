package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Suryaprakash");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Selvam");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Selenium+RestAPI");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876543210");
		driver.findElement(By.className("smallSubmit")).click();
		String Webtitle1 = driver.getTitle();//Storing the Page title in the Variable
		System.out.println("The title of the Current page " + Webtitle1);
		//driver.quit(); //To Quit the Browser
		

	}

}
