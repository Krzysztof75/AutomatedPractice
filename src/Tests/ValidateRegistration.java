package Tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import PageObjects.HomePage;
import PageObjects.LogInPage;
import Utility.emailGenerator;

public class ValidateRegistration {

	static WebDriver driver;
	static Logger log;
	HomePage hpage;
	LogInPage lpage;
    FileOutputStream fos;
    FileInputStream fis;
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    int k =1;
    


	@Test(dataProvider = "regData")
	public void testRegistration(Map<String, String> map) {
		
	for(Entry<String, String> s : map.entrySet()){
		System.out.print(s + " ");
	}
		// executor will help execute document object
	JavascriptExecutor js = (JavascriptExecutor)driver;
	// check that desired page is open to make sure all the elements are visible	
	Assert.assertTrue(LogInPage.firstName1().isDisplayed());
	// scroll first element into view
	js.executeScript("document.getElementById('id_gender1').scrollIntoView(true);");
	if(!map.get("title").equals("")){
	LogInPage.title(map.get("title")).click();
	log.info("entered title " + map.get("title"));
	}
	LogInPage.firstName1().sendKeys(map.get("firstName1"));
	log.info("entered first name");
	LogInPage.lastName1().sendKeys(map.get("lastName1"));
	log.info("entered last name");
	if(!map.get("email").equals("")){
	LogInPage.email().clear();
	LogInPage.email().sendKeys(map.get("email"));
	log.info("entered new email adress");
	}
	js.executeScript("document.getElementById('passwd').scrollIntoView(true);");
	LogInPage.password().sendKeys(map.get("password"));
	log.info("entered new password " + map.get("password"));
	LogInPage.days(map.get("DOBday"));
	log.info("entered day " + map.get("DOBday"));
	LogInPage.months(map.get("DOBmonth"));
	log.info("entered month " + map.get("DOBmonth"));
	LogInPage.years(map.get("DOByear"));
	log.info("entered year " + map.get("DOByear"));
	LogInPage.firstName2().sendKeys(map.get("firstName2"));
	log.info("entered firstName2 " + map.get("firstName2"));
	LogInPage.lastName2().sendKeys(map.get("lastName2"));
	log.info("entered lastName2 " + map.get("lastName2"));
	LogInPage.company().sendKeys(map.get("company"));
	log.info("entered company " + map.get("company"));
	js.executeScript("document.getElementById('address1').scrollIntoView(true);");
	LogInPage.address1().sendKeys(map.get("adress1"));
	log.info("entered adress1 " + map.get("adress1"));
	LogInPage.address2().sendKeys(map.get("adress2"));
	log.info("entered adress2 " + map.get("adress2"));
	LogInPage.city().sendKeys(map.get("city"));
	log.info("entered city " + map.get("city"));
	LogInPage.state(map.get("state"));
	log.info("entered state " + map.get("state"));
	LogInPage.postcode().sendKeys(map.get("postcode"));
	log.info("entered postcode " + map.get("postcode"));
	js.executeScript("document.getElementById('id_country').scrollIntoView(true);");
	LogInPage.country("").sendKeys(map.get("country"));
	log.info("entered country " + map.get("country"));
	LogInPage.addInfo().sendKeys(map.get("add info"));
	log.info("entered addinfo " + map.get("add info"));
	LogInPage.phone().sendKeys(map.get("homePh"));
	log.info("entered phone " + map.get("homePh"));
	LogInPage.phoneMobile().sendKeys(map.get("mobilePh"));
	log.info("entered mobile " + map.get("mobilePh"));
	LogInPage.alias().sendKeys(map.get("alias"));
	log.info("entered alias " + map.get("alias"));
	
	LogInPage.submitAccount().click();
	
	try {
		fos = new FileOutputStream("src//Data//Registration.xlsx");
	} catch (FileNotFoundException e) {
		log.info("Registration.xlsx not found");
		e.printStackTrace();
	}
	
	if(driver.getTitle().equalsIgnoreCase("Login - My Store")){
	WebElement error = driver.findElement(By.cssSelector("#center_column > div"));
	String error1 = error.findElement(By.tagName("p")).getText();
	String error2 ="";
	
	List<WebElement> err = error.findElements(By.tagName("li"));
	for(WebElement e : err){
		error2 += e.getText() + " ";
	}
	sheet.getRow(k).getCell(22).setCellValue(error1 + " " + error2);
	}
	k++;

	}
	@BeforeMethod
	public void beforeMethod() {
		HomePage.Header.LogIn().click();
		LogInPage.emailCreateBox().sendKeys(emailGenerator.generateEmail());
		LogInPage.create_btn().click();
		log.info("email adress entered and create button clicked");
	}

	@AfterMethod
	public void afterMethod() {
	if(driver.getTitle().equalsIgnoreCase("My account - My Store")){
		driver.findElement(By.className("logout")).click();
	}
	
	}


	@DataProvider
	public Object[][] regData() throws IOException {

		fis = new FileInputStream("src//Data//Registration.xlsx");
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet("Register");

		Object[][]data = new Object[sheet.getPhysicalNumberOfRows()-1][1];
		Row headerRow = sheet.getRow(0);

		for(int i = 1; i < sheet.getPhysicalNumberOfRows(); i++){
			
			System.out.println("current number of Rows " + sheet.getPhysicalNumberOfRows());
			
			Row currentRow = sheet.getRow(i);
			HashMap<String, String> map = new HashMap<String, String>();
			
			for(int j = 0; j < currentRow.getPhysicalNumberOfCells(); j++){
				
				System.out.println("current Row number of Cells " + currentRow.getPhysicalNumberOfCells());
				
				Cell currentCell = currentRow.getCell(j);
//				log.info(currentCell + " row " + currentCell.getRowIndex() + " column " + currentCell.getColumnIndex());
				String cellContent ="";
				
				switch(currentCell.getCellType()){
				
				case Cell.CELL_TYPE_STRING:
					cellContent = currentCell.getStringCellValue();  
					break;
				case Cell.CELL_TYPE_NUMERIC:
					cellContent = String.valueOf(currentCell.getNumericCellValue());
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

		log = Logger.getLogger(ValidateRegistration.class.getName());
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

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		hpage = new HomePage(driver);
		lpage = new LogInPage(driver);
		HomePage.getWebsite("http://www.automationpractice.com/");
		log.info("Getting website");
		

	}

	@AfterTest
	public void afterTest() throws IOException {
		driver.quit();
		workbook.write(fos);
		fos.flush();
		fos.close();
	}

}
