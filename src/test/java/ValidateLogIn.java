package test.java;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import PageObjects.HomePage;
import PageObjects.LogInPage;

/*
 * To validate that user can not log in with invalid credentials
 */
public class ValidateLogIn {

	static WebDriver driver;
	static Logger log;
	HomePage hpage;
	LogInPage lpage;
//	FileInputStream fis;
//	XSSFWorkbook workbook;
//	XSSFSheet sheet;

	@Test(dataProvider = "verification")
	public void testLogIn(HashMap<String, String> map) throws IOException {

		WebElement error = null;
		String message = "Default";

		// if column create-email is empty proceed testing login
		
		if(map.get("create-email").isEmpty()){

	
			LogInPage.emailSignInBox().sendKeys((String)map.get("signIn-email"));
			LogInPage.password().sendKeys((String)map.get("password"));
			LogInPage.signIn_btn().click();

			// if driver stays on the same page means login unsuccessful get error message
			if(driver.getTitle().equalsIgnoreCase("Login - My Store")){
				error = driver.findElement(By.cssSelector("#center_column > div.alert.alert-danger > ol > li"));
				message = error.getText();
				Assert.assertEquals(message, map.get("expected"));
			}
			// if Login - My Store page change to My account- My Store check if successful login was intended
			if(driver.getTitle().equalsIgnoreCase("My account - My Store")){
				Assert.assertEquals("log-in succesfull", map.get("expected"));
			}

			// if column create-email contains value proceed with testing correct email format for creating account  
		} else {
			LogInPage.emailCreateBox().sendKeys((String)map.get("create-email"));
			LogInPage.create_btn().click();
			
			// if email was accepted check that it was expected
			
			if(!LogInPage.create_btn().isDisplayed()){
				Assert.assertEquals("email ok", (String)map.get("expected"));
			}
			// if email was not accepted check error message
			else {										
				error = driver.findElement(By.cssSelector("#create_account_error > ol > li"));
				Assert.assertEquals(error.getText(), (String)map.get("expected"));
			}
		}

		log.info("Test " + map.get("test ID") + " passed");
		Reporter.log("Test " + map.get("test ID") + " passed");

	}
	@BeforeMethod
	public void beforeMethod() {
		HomePage.Header.LogIn().click();
	}

	@AfterMethod
	public void afterMethod(){
		if(driver.getTitle().equalsIgnoreCase("My account - My Store")){
			driver.findElement(By.linkText("Sign out")).click();
		}

     driver.navigate().back();
	}


	@DataProvider(name = "verification")
	public Object[][] data () throws IOException {
		
//		fis = new FileInputStream(Utility.Constants.DataPath + Utility.Constants.LogInData);
//		workbook = new XSSFWorkbook(fis);
//		sheet = workbook.getSheet("LogIn");
//		Row headerRow = sheet.getRow(0);
//
//		Object[][]data = new Object [sheet.getPhysicalNumberOfRows()-1][1];
//
//
//		for(int i = 1; i < sheet.getPhysicalNumberOfRows(); i++){
//
//			Row currentRow = sheet.getRow(i);
//			HashMap<String, String> currentHashMap = new HashMap<String, String>();
//
//			for(int j=0 ; j < currentRow.getPhysicalNumberOfCells(); j++){
//				Cell currentCell = currentRow.getCell(j);
//
//				switch(currentCell.getCellType()){
//
//				case Cell.CELL_TYPE_STRING:
//					currentCell.getStringCellValue();
//					break;
//				}
//				currentHashMap.put(headerRow.getCell(j).getStringCellValue(), currentCell.getStringCellValue());
//			}
//			data[i-1][0] = currentHashMap;
//		}
//		fis.close();
//		return data;
//	}
	
		// good method if only String values present in the spreadsheet otherwise needs work
		
	Utility.Excel.setExcellFile(System.getProperty("user.dir") + Utility.Constants.LogInDataPath, "LogIn");
	
	Object[][]data = new Object [Utility.Excel.getNumberOfRows()-1][1];
	
	for(int i = 1; i < Utility.Excel.getNumberOfRows(); i++){
		
		HashMap<String, String> currentHashMap = new HashMap<String, String>();

		for(int j=0 ; j < Utility.Excel.getNumberOfCellsInTheRow(i); j++){
			
			String currentCellValue = Utility.Excel.getCellValue(i, j);

			currentHashMap.put(Utility.Excel.getHeaderRow().getCell(j).getStringCellValue(), currentCellValue);
		}
		data[i-1][0] = currentHashMap;
	}
	Utility.Excel.close();
	return data;
}
	
	@BeforeTest
	@Parameters ({"browserName"})
	public void beforeTest(String browserName) throws IOException {

		log = Logger.getLogger(ValidateLogIn.class.getName());
//		ProfilesIni profile = new ProfilesIni();
		DOMConfigurator.configure("log4j.xml");
		
		driver = Utility.LaunchBrowser.getBrowser(browserName);

//		switch(browserName){
//		case "FF":
//			FirefoxProfile ffprofile = profile.getProfile("tester");
//			driver = new FirefoxDriver(ffprofile);
//			break;
//		case "CH":
//			driver = new ChromeDriver();
//			break;
//		case "IE":
//			driver = new InternetExplorerDriver();
//			break;
//		}

		driver.get(Utility.Constants.URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
		log.info("Getting website");
		hpage = new HomePage(driver);
		lpage = new LogInPage(driver);


	}

	@AfterTest
	public void afterTest() throws IOException {
		driver.close();
		log.info("driver closing");



	}

}
