package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;

public class Email extends BaseTest {
	
	@Test
	public static void email() {
		WebElement fullname = driver.findElement(By.xpath("//input[@name=\"g4072-email\"]"));
		fullname.sendKeys("Venkatesh.Sekar@gmail.com");
		stay();
	}
}
