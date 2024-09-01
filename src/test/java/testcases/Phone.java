package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;

public class Phone extends BaseTest {
	
	@Test
	public static void phone() {
		WebElement fullname = driver.findElement(By.xpath("//input[@name=\"g4072-phonenumber\"]"));
		fullname.sendKeys("9842363523");
		stay();
	}

}
