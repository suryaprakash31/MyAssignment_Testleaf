package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVRCinemas {

	public static void main(String[] args) throws InterruptedException {
		// Launch Browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the screen
		driver.manage().window().maximize();
		//Adding Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// open the website
		driver.get("https://www.pvrcinemas.com/");
		//Choose Your location as "Chennai"
		driver.findElement(By.xpath("//span[contains(@class,'p-dropdown-label')]/span")).click();
		driver.findElement(By.xpath("//h6[text()='Chennai']")).click();
		//Click on Cinema under Quick Book
		driver.findElement(By.className("cinemas-inactive")).click();
		//Select Your Cinema
		driver.findElement(By.xpath("//div[@id='cinema']/span")).click();
		//Selecting theatre
		driver.findElement(By.xpath("//span[text()='INOX The Marina Mall, OMR, Chennai']")).click();
		//Selecting date
		driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
		//Selecting movie
		driver.findElement(By.xpath("//span[text()='VEERA DHEERA SOORAN - PART 2']")).click();
		Thread.sleep(5000);
		//Selecting time
		driver.findElement(By.xpath("//div[@class='p-dropdown-items-wrapper']//li[8]")).click();
		//Book now
		driver.findElement(By.xpath("//button[@type='submit']/span")).click();
		//accepting t&c
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		//Selecting the seat
		driver.findElement(By.xpath("//span[contains(@id,'CL.CLUB|M')][text()='23']")).click();
		//click on proceed
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		//Getting Seat info and ticket details
		String ticketVal = driver.findElement(By.xpath("//h6[text()='Seat Info']/following::p[1]")).getText();
		//System.out.println(ticketVal);
		String seatNum = driver.findElement(By.xpath("//div[@class='seat-number']/p")).getText();
		String grandTotal = driver.findElement(By.xpath("//div[@class= 'grand-tota col-md-3']//following::span")).getText();
		System.out.println("The Booking Summary: " + "\n" + "The Seat you Selected is: " + ticketVal + " " + seatNum
				+ "\n" + "The Total booking cost is: " + grandTotal);
		//Click on proceed
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		//Closing the alert
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		//Getting the URL of the current page
		System.out.println("The Current page URL is: "+driver.getTitle());
		driver.close();

	}

}
