package testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import base.BaseTest;

public class TestCase01 extends BaseTest {
	
	@Test
	public static void fullname() throws IOException {	
		//WebElement gender = driver.findElement(By.xpath("//select[@id='g4072-gender']"));
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='g4072-gender']")));
		List <WebElement> e = dropdown.getOptions();
		System.out.println(e.size());
		for(int i=0; i<e.size();i++) {
			System.out.println(e.get(i).getText());
		}
		dropdown.selectByValue("Female");
		//stay();
	}

}
