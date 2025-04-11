package week5.day2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestOneSalesForce extends ProjectSpecificMethd {

	@Test
	public void testCase1() throws InterruptedException {

		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Surya S");
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		String legalName = driver.findElement(By.xpath("//slot[@name='outputField']/lightning-formatted-text")).getText();
		System.out.println(legalName);
	}

}
