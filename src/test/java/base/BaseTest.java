package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utilities.CommonUtils;


public class BaseTest extends CommonUtils {
	
	public static Properties prop = new Properties();;
	public static FileReader fr;
	
	@BeforeTest
	public void setup() throws IOException {
		if(driver==null) {
			fr = new FileReader(System.getProperty("user.dir")+"\\configfile\\config.properties");
			prop.load(fr);
		}
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(prop.getProperty("url"));
			wait(10);
			maximize();
			System.out.println("Page launched");
		}
		if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver", "C:\\Users\\svenk\\eclipse-workspace\\AutomePage\\firefoxdriver\\firefoxdriver.exe");
			driver = new ChromeDriver();
			driver.get(prop.getProperty("url"));
			wait(10);
			maximize();
			System.out.println("Page launched");
			
		}			
	}
	
	@AfterTest
	public void teardown() {
		wait(20);
		driver.close();
		System.out.println("Browser closed");
	}

}
