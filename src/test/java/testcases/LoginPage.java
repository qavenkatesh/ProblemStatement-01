package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;

public class LoginPage extends BaseTest {
	
	@Test (priority=0)
	public static void fullname() {
		System.out.println("Valid User loggedin");
		WebElement fullname = driver.findElement(By.xpath("//input[@name=\"g4072-fullname\"]"));
		fullname.sendKeys("Venkatesh Sekar");
		wait(10);
	}
	
	@Test (priority=1)
	public static void email() {
		WebElement fullname = driver.findElement(By.xpath("//input[@name=\"g4072-email\"]"));
		fullname.sendKeys("Venkatesh.Sekar@gmail.com");
		wait(20);
	}
	
	@Test (priority=2)
	public static void phone() {
		WebElement fullname = driver.findElement(By.xpath("//input[@name=\"g4072-phonenumber\"]"));
		fullname.sendKeys("9842363523");
		wait(20);
	}

}
