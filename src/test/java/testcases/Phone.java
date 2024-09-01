package testcases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class Phone extends BaseTest {
	
	@Test
	public void phone() {
		WebElement phone = driver.findElement(By.xpath("//input[@name=\"g4072-phonenumber\"]"));
		phone.sendKeys("9842363523");
		stay();
		Assert.assertTrue(true);
	}

}
