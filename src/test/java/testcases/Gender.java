package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.BaseTest;

public class Gender extends BaseTest {
	
	@Test
	public static void gender() {
		//Select sex = new Select(driver.findElement(By.xpath("//input[@name=\"g4072-gender\"]")));
	     /*List <WebElement> op = sex.getOptions();
	      int size = op.size();
	      for(int i =0; i<size ; i++){
	         String options = op.get(i).getText();
	         System.out.println(options);
	      }*/
		System.out.println("Male");
		stay();
	}

}
