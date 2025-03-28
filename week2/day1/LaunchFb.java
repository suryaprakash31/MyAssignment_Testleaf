package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver openfb = new ChromeDriver();
		openfb.manage().window().maximize();
		openfb.get("https://www.facebook.com/");
		openfb.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		openfb.findElement(By.id("pass")).sendKeys("Tuna@321");
		openfb.findElement(By.name("login")).click();
		openfb.findElement(By.linkText("Find your account and log in.")).click();
		String webtitle = openfb.getTitle();
		System.out.println("The Current page title is: "+webtitle);

	}

}
