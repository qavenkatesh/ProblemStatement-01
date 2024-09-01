package utilities;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtils {
	public static WebDriver driver;
	public static WebDriverWait wait;

	@SuppressWarnings("deprecation")
	public static void stay(){
		//wait = new WebDriverWait(driver,Duration.ofSeconds(50));
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	public static void maximize() {
		driver.manage().window().maximize();
	}
	
	public void ReadData(String excelsheetname) {

	}

}
