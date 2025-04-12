package week6.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase1 extends StaticParemterizationBaseClass {
	@Test(dataProvider = "sendData")
	public void runtestCase1(String name) throws InterruptedException {

		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		String legalName = driver.findElement(By.xpath("//slot[@name='outputField']/lightning-formatted-text")).getText();
		System.out.println(legalName);
		if(name.equals(legalName)) {
			System.out.println("Legal name is verified and it was correct");
		} else {
			System.out.println("Legal name is verified and it was Incorrect");
		}
	}

}
