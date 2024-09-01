package utilities;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtils {
	public static WebDriver driver;
	public static WebDriverWait wait;

	public static int wait(int duration) {
		wait = new WebDriverWait(driver,Duration.ofSeconds(duration));
		return duration;
	}
	
	public static void maximize() {
		driver.manage().window().maximize();
	}

}
