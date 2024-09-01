package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class FullName extends BaseTest {
	
	@Test
	public static void fullname() {
		WebElement fullname = driver.findElement(By.xpath("//input[@name=\"g4072-fullname\"]"));
		fullname.sendKeys("Venkatesh Sekar");
		stay();
		Assert.assertTrue(true);
	}
}
