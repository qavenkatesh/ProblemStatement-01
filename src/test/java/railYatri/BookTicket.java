package railYatri;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BookTicket {

	@Test
	public void LaunchUrl() {	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\svenk\\eclipse-workspace\\AutomePage\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.railyatri.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.close();
	}
	
	@Test (dependsOnMethods = {"LaunchUrl"})
	public void BookAny() {
		System.out.println("SecondTestcase");
	}

	
}
