package Tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import PageObjects.HomePage;
import PageObjects.LogInPage;

public class ValidateRegistration {

	static WebDriver driver;
	static Logger log;
	HomePage hpage;
	LogInPage lpage;



	@Test(dataProvider = "regData")
	public void testRegistration(Map<String, String> map) {
		
		




	}
	@BeforeMethod
	public void beforeMethod() {
		HomePage.Header.LogIn().click();
		LogInPage.emailCreateBox().sendKeys();
	}

	@AfterMethod
	public void afterMethod() {
	}


	@DataProvider
	public Object[][] regData() throws IOException {

		FileInputStream fis = new FileInputStream("Data.Registration.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Registration");

		Object[][]data = new Object[sheet.getPhysicalNumberOfRows()-1][1];
		Row headerRow = sheet.getRow(0);

		for(int i = 1; i < sheet.getPhysicalNumberOfRows() - 1; i++){
			Row currentRow = sheet.getRow(i);
			HashMap<String, String> map = new HashMap<String, String>();
			for(int j = 0; j < currentRow.getPhysicalNumberOfCells(); j++){
				Cell currentCell = currentRow.getCell(j);
				String cellContent ="";
				switch(currentCell.getCellType()){
				case Cell.CELL_TYPE_STRING:
					cellContent = currentCell.getStringCellValue();  
					break;  
				}
				map.put(headerRow.getCell(j).getStringCellValue(), cellContent);
			}
			data[i-1][0] = map;
		}
		fis.close();
		return data;
	}
	@BeforeTest
	@Parameters({"browserName"})
	public void beforeTest(String browserName) {

		log = Logger.getLogger(ValidateLogIn.class.getName());
		ProfilesIni profile = new ProfilesIni();
		DOMConfigurator.configure("log4j.xml");

		switch(browserName){
		case "FF":
			FirefoxProfile ffprofile = profile.getProfile("tester");
			driver = new FirefoxDriver(ffprofile);
			break;
		case "CH":
			driver = new ChromeDriver();
			break;
		case "IE":
			driver = new InternetExplorerDriver();
			break;
		}

		HomePage.getWebsite("http://www.automationpractice.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		log.info("Getting website");
		hpage = new HomePage(driver);
		lpage = new LogInPage(driver);

	}

	@AfterTest
	public void afterTest() {
		HomePage.quit();
	}

}
