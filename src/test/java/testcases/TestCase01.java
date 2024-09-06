package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import base.BaseTest;

public class TestCase01 extends BaseTest {
	
	@Test
	public static void fullname() throws IOException {
		
		readExcel();
		System.out.println("Working");
	}

}
