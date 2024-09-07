package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtils {
	public static WebDriver driver;
	public static ChromeOptions options;
	public static WebDriverWait wait;

	
	public static void maximize() {
		driver.manage().window().maximize();
	}
	
	public static void stay() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public static void readExcel() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\svenk\\eclipse-workspace\\AutomePage\\src\\test\\resources\\Test Data\\testdata.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		for (Row row : sheet1) {
			for(org.apache.poi.ss.usermodel.Cell cell : row) {
				System.out.println(cell.toString()+"\t");
			}
		}
		wb.close();
		fis.close();
		
	}

}
