package PageObjects;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class LogInPage extends BaseClass {
	
	
	static Logger log = LogManager.getLogger(LogInPage.class.getName());
	static WebElement element;

	public LogInPage(WebDriver driver) {
		super(driver);
	}

	
	public static WebElement emailCreateBox(){
		try{
			element = driver.findElement(By.id(prop.getProperty("emailCreateBox_id")));
		}catch(NoSuchElementException e){
			log.error("Could not find element emailCreate ");
			throw e;
		}
		wait.until(ExpectedConditions.visibilityOf(element));
		log.info("Returned element " + element.getAttribute("id"));
		return element;
	}
	
	public static WebElement create_btn(){
		try{
			element = driver.findElement(By.id("SubmitCreate"));
		}catch(NoSuchElementException e){
			log.error("Could not find element SubmitCreate");
			throw e;
		}
		wait.until(ExpectedConditions.elementToBeClickable(element));
		log.info("Returned element " + element.getAttribute("id"));
		return element;
	}
	
	public static WebElement emailSignInBox(){
		try{
			element = driver.findElement(By.id("email"));
		}catch(NoSuchElementException e){
			log.error("Could not find element email");
			throw e;
		}
		wait.until(ExpectedConditions.visibilityOf(element));
		log.info("Returned element " + element.getAttribute("id"));
		return element;
	}
	
	public static WebElement password_SignIn(){
		try{
			element = driver.findElement(By.id("passwd"));
		}catch(NoSuchElementException e){
			log.error("Could not find element email");
			throw e;
		}
		wait.until(ExpectedConditions.visibilityOf(element));
		log.info("Returned element " + element.getAttribute("id"));
		return element;
	}
	
	public static WebElement signIn_btn(){
		try{
			element = driver.findElement(By.id("SubmitLogin"));
		}catch(NoSuchElementException e){
			log.error("Could not find element email");
			throw e;
		}
		wait.until(ExpectedConditions.elementToBeClickable(element));
		log.info("Returned element " + element.getAttribute("id"));
		return element;
	}

	
	public static WebElement title(String title){
		
		try{
			if(title.equalsIgnoreCase("mr")){
			element = driver.findElement(By.xpath("//*[@id='id_gender1']"));
			} else if(title.equalsIgnoreCase("mrs")){
			element = driver.findElement(By.xpath("//*[@id='id_gender2']"));	
			}
			
		}catch(NoSuchElementException e){
			log.error("Could not find element title");
			throw e;
		}
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='id_gender2']")));
		log.info("Returned element " + element.getAttribute("id"));
		return element;
		
	}
	
	public static WebElement firstName1(){
		try{
			element = driver.findElement(By.id("customer_firstname"));
		}catch(NoSuchElementException e){
			log.error("Could not find element firstNameCust");
			throw e;
		}
		wait.until(ExpectedConditions.visibilityOf(element));
		log.info("Returned element " + element.getAttribute("id"));
		return element;
		
	}
	
	public static WebElement lastName1(){
		try{
			element = driver.findElement(By.id("customer_lastname"));
		}catch(NoSuchElementException e){
			log.error("Could not find element lastNameCust");
			throw e;
		}
		wait.until(ExpectedConditions.visibilityOf(element));
		log.info("Returned element " + element.getAttribute("id"));
		return element;
	}
	
	public static WebElement email(){
		try{
			element = driver.findElement(By.id("email"));
		}catch(NoSuchElementException e){
			log.error("Could not find element email");
			throw e;
		}
		wait.until(ExpectedConditions.elementToBeClickable(element));
		log.info("Returned element " + element.getAttribute("id"));
		return element;
	}
	
	public static WebElement password(){
		try{
			element = driver.findElement(By.id("passwd"));
		}catch(NoSuchElementException e){
			log.error("Could not find element email");
			throw e;
		}
		wait.until(ExpectedConditions.elementToBeClickable(element));
		log.info("Returned element " + element.getAttribute("id"));
		return element;
	}
	
	public static WebElement days(String day){
		
		try{
			element = driver.findElement(By.id("uniform-days"));
			Select days = new Select(driver.findElement(By.id("days")));
			if(!day.equals("")){
			if(Integer.parseInt(day) <= 31 && Integer.parseInt(day) > 0){
				days.selectByValue(day);
			} 
			}
			
		}catch(NoSuchElementException e){
			log.error("Could not find element days");
			throw e;
		}
		wait.until(ExpectedConditions.elementToBeClickable(element));
		log.info("Returned element " + element.getAttribute("id"));
		return element;
	}
	
	public static WebElement months(String month){
		try{										
			element = driver.findElement(By.id("uniform-months"));
			Select months = new Select(driver.findElement(By.id("months")));
			if(!month.equals("")){
			if(Integer.parseInt(month) <= 12 && Integer.parseInt(month) > 0){
				months.selectByValue(month);
			} 
			}
		}catch(NoSuchElementException e){
			log.error("Could not find element months");
			throw e;
		}
		wait.until(ExpectedConditions.elementToBeClickable(element));
		log.info("Returned element " + element.getAttribute("id"));
		return element;
	}
	
	public static WebElement years(String year){
		try{
			element = driver.findElement(By.id("uniform-years"));
			Select years = new Select(driver.findElement(By.id("years")));
			if(!year.equals("")){
			if(Integer.parseInt(year) <= 2015 && Integer.parseInt(year) > 1900){
				years.selectByValue(year);
			}
			}
		}catch(NoSuchElementException e){
			log.error("Could not find element years");
			throw e;
		}
		wait.until(ExpectedConditions.elementToBeClickable(element));
		log.info("Returned element " + element.getAttribute("id"));
		return element;
	}
	
	public static WebElement firstName2(){
		try{
			element = driver.findElement(By.id("firstname"));
		}catch(NoSuchElementException e){
			log.error("Could not find element firstName");
			throw e;
		}
		wait.until(ExpectedConditions.visibilityOf(element));
		log.info("Returned element " + element.getAttribute("id"));
		return element;
	}
	
	public static WebElement lastName2(){
		try{
			element = driver.findElement(By.id("lastname"));
		}catch(NoSuchElementException e){
			log.error("Could not find element lastName");
			throw e;
		}
		wait.until(ExpectedConditions.visibilityOf(element));
		log.info("Returned element " + element.getAttribute("id"));
		return element;
	}
	
	public static WebElement company(){
		try{
			element = driver.findElement(By.id("company"));
		}catch(NoSuchElementException e){
			log.error("Could not find element company");
			throw e;
		}
		wait.until(ExpectedConditions.visibilityOf(element));
		log.info("Returned element " + element.getAttribute("id"));
		return element;
	}
	
	public static WebElement address1(){
		try{
			element = driver.findElement(By.id("address1"));
		}catch(NoSuchElementException e){
			log.error("Could not find element address1");
			throw e;
		}
		wait.until(ExpectedConditions.visibilityOf(element));
		log.info("Returned element " + element.getAttribute("id"));
		return element;
	}
	
	public static WebElement address2(){
		try{
			element = driver.findElement(By.id("address2"));
		}catch(NoSuchElementException e){
			log.error("Could not find element address2");
			throw e;
		}
		wait.until(ExpectedConditions.visibilityOf(element));
		log.info("Returned element " + element.getAttribute("id"));
		return element;
	}
	
	public static WebElement city(){
		try{
			element = driver.findElement(By.id("city"));
		}catch(NoSuchElementException e){
			log.error("Could not find element city");
			throw e;
		}
		wait.until(ExpectedConditions.visibilityOf(element));
		return element;
	}
	
	public static WebElement state(String index){
		try{
			element = driver.findElement(By.id("uniform-id_state"));
			if(Integer.parseInt(index) > 0 && Integer.parseInt(index) <=50){
			Select states = new Select(driver.findElement(By.id("id_state")));
				states.selectByValue(index);
			}
		}catch(NoSuchElementException e){
			log.error("Could not find element state");
			throw e;
		}
		wait.until(ExpectedConditions.elementToBeClickable(element));
		log.info("Returned element " + element.getAttribute("id"));
		return element;
	}
	
	public static WebElement postcode(){
		try{
			element = driver.findElement(By.id("postcode"));
		}catch(NoSuchElementException e){
			log.error("Could not find element postcode");
			throw e;
		}
		wait.until(ExpectedConditions.visibilityOf(element));
		log.info("Returned element " + element.getAttribute("id"));
		return element;
	}
	
	// drop box country has only one option at the moment so I'm making sure this option is selected
	// in the future it may be changed
	public static WebElement country(String country){
		try{
			element = driver.findElement(By.id("uniform-id_country"));
			element.click();
			Select countries = new Select(driver.findElement(By.id("id_country")));
			if(!country.equals("")){
			if(Integer.parseInt(country) != 21){
				countries.selectByValue("21");
			}else{
			countries.selectByValue(country);
			}
			}
		}catch(NoSuchElementException e){
			log.error("Could not find element country");
			throw e;
		}
		wait.until(ExpectedConditions.elementToBeClickable(element));
		log.info("Returned element " + element.getAttribute("id"));
		return element;
	}
	
	public static WebElement addInfo(){
		try{
			element = driver.findElement(By.id("other"));
		}catch(NoSuchElementException e){
			log.error("Could not find element addInfo");
			throw e;
		}
		wait.until(ExpectedConditions.visibilityOf(element));
		log.info("Returned element " + element.getAttribute("id"));
		return element;
	}
	
	public static WebElement phone(){
		try{
			element = driver.findElement(By.id("phone"));
		}catch(NoSuchElementException e){
			log.error("Could not find element phone");
			throw e;
		}
		wait.until(ExpectedConditions.visibilityOf(element));
		log.info("Returned element " + element.getAttribute("id"));
		return element;
	}
	
	public static WebElement phoneMobile(){
		try{
			element = driver.findElement(By.id("phone_mobile"));
		}catch(NoSuchElementException e){
			log.error("Could not find element phoneMobile");
			throw e;
		}
		wait.until(ExpectedConditions.visibilityOf(element));
		log.info("Returned element " + element.getAttribute("id"));
		return element;
	}
	
	public static WebElement alias(){
		try{
			element = driver.findElement(By.id("alias"));
		}catch(NoSuchElementException e){
			log.error("Could not find element alias");
			throw e;
		}
		wait.until(ExpectedConditions.visibilityOf(element));
		log.info("Returned element " + element.getAttribute("id"));
		return element;
	}
	
	public static WebElement submitAccount(){
		try{
			element = driver.findElement(By.id("submitAccount"));
		}catch(NoSuchElementException e){
			log.error("Could not find element submitAccount");
			throw e;
		}
		wait.until(ExpectedConditions.elementToBeClickable(element));
		log.info("Returned element " + element.getAttribute("id"));
		return element;
	}
	}
	
	


