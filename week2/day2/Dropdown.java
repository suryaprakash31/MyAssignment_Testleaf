package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		ChromeDriver drop = new ChromeDriver();
		drop.manage().window().maximize();
		drop.get("http://leaftaps.com/opentaps/");
		drop.findElement(By.id("username")).sendKeys("democsr");
		WebElement pwrd = drop.findElement(By.id("password"));
		 pwrd.sendKeys("crmsfa");
		 drop.findElement(By.className("decorativeSubmit")).click();
		 drop.findElement(By.partialLinkText("CRM")).click();
		 drop.findElement(By.linkText("Leads")).click();
		 drop.findElement(By.partialLinkText("Create")).click();
		 drop.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
		 drop.findElement(By.id("createLeadForm_firstName")).sendKeys("Surya");
		 drop.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		 WebElement dd1 = drop.findElement(By.id("createLeadForm_dataSourceId"));
		 Select Dropdown1 = new Select(dd1);
		 Dropdown1.selectByIndex(3);
		 WebElement dd2 = drop.findElement(By.id("createLeadForm_marketingCampaignId"));
		 Select Dropdown2 = new Select(dd2);
		 Dropdown2.selectByVisibleText("Automobile");
		 WebElement dd3 = drop.findElement(By.id("createLeadForm_ownershipEnumId"));
		 Select Dropdown3 = new Select(dd3);
		 Dropdown3.selectByValue("OWN_CCORP");
		 drop.findElement(By.className("smallSubmit")).click();
		 String Webtitle1 = drop.getTitle();
		 System.out.println("The title of the Current page " + Webtitle1);
		 //drop.quit();
		 
		 
		 
		 
		

	}

}
