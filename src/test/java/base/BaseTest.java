package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utilities.CommonUtils;


public class BaseTest extends CommonUtils {

	public static Properties prop = new Properties();;
	public static FileReader fr;
	

	@BeforeTest
	public static void setup() throws IOException {

			fr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\Config file\\config.properties");
			prop.load(fr);
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver\\chromedriver.exe");
			options = new ChromeOptions();
			driver = new ChromeDriver(options);
			driver.get(prop.getProperty("url"));
			maximize();		
	}
	
	@AfterTest
	public static void teardown() {
		driver.quit();
	}

}
