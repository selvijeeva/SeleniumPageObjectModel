package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ReadExcelData;

public class BaseClass {
	
	public  ChromeDriver driver;
	
	public String excelFileName;
	
	@DataProvider(name = "fetchData/ indices =1")
	public String[][] sendData() throws IOException{
		return ReadExcelData.readData(excelFileName);
		
	}
	
	@BeforeMethod
	public void preCondition() {
		// code to open the browser 
		// load appplication url
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://leaftaps.com/opentaps/");
	}

	
	@AfterMethod
	public void postCondition() {
		// close the browser
		driver.close();
	}
}
