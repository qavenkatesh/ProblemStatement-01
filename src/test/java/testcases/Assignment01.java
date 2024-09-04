package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import base.BaseTest;

public class Assignment01 extends BaseTest {
	
	@Test
	public static void fullname() {
		//wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body//h1")));
		WebElement greeting = driver.findElement(By.xpath("//body//h1"));
		String ExpectedResult = "Hello from the Backend!";
		String ActualResult = greeting.getText();
		if(ExpectedResult.equals(ActualResult))
			System.out.println("Test case Pass !");
		else
			System.out.println("Test case Fail !");
	}

}
