package utilities;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtils {
	public static WebDriver driver;
	public static WebDriverWait wait;

	public static void stay() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(50));
	}
	
	public static void maximize() {
		driver.manage().window().maximize();
	}

}
