package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountWithSelectclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("CAT Academy7");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation tester");
		WebElement industryDrop = driver
				.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div/form/table/tbody/tr[4]/td[2]/select"));
		Select dd1 = new Select(industryDrop);
		dd1.selectByIndex(3);
		WebElement ownershipdrop = driver
				.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div/form/table/tbody/tr[5]/td[2]/select"));
		Select dd2 = new Select(ownershipdrop);
		dd2.selectByVisibleText("S-Corporation");
		WebElement sourcedrop = driver.findElement(By.id("dataSourceId"));
		Select dd3 = new Select(sourcedrop);
		dd3.selectByValue("LEAD_EMPLOYEE");
		WebElement marketingdrop = driver.findElement(By.id("marketingCampaignId"));
		Select dd4 = new Select(marketingdrop);
		dd4.selectByIndex(6);
		driver.findElement(By.id("primaryPhoneNumber")).sendKeys("9876543210");
		WebElement statedrop = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select dd5 = new Select(statedrop);
		dd5.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		WebElement accname = driver.findElement(
				By.xpath("/html/body/div[6]/div/div[2]/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/span"));
		System.out.println("The Account name is " + accname.getText());
		driver.close();

	}

}
