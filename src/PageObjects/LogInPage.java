package PageObjects;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LogInPage extends BaseClass {
	
	
	static Logger log = LogManager.getLogger(LogInPage.class.getName());
	static WebElement element;

	public LogInPage(WebDriver driver) {
		super(driver);
	}

	
	public static WebElement emailCreateBox(){
		try{
			element = driver.findElement(By.id("email_create"));
		}catch(NoSuchElementException e){
			log.error("Could not find element emailCreate ");
			throw e;
		}
		return element;
	}
	
	public static WebElement create_btn(){
		try{
			element = driver.findElement(By.id("SubmitCreate"));
		}catch(NoSuchElementException e){
			log.error("Could not find element SubmitCreate");
			throw e;
		}
		return element;
	}
	
	public static WebElement emailSignInBox(){
		try{
			element = driver.findElement(By.id("email"));
		}catch(NoSuchElementException e){
			log.error("Could not find element email");
			throw e;
		}
		return element;
	}
	
	public static WebElement password(){
		try{
			element = driver.findElement(By.id("passwd"));
		}catch(NoSuchElementException e){
			log.error("Could not find element email");
			throw e;
		}
		return element;
	}
	
	public static WebElement SignIn_btn(){
		try{
			element = driver.findElement(By.id("SubmitLogin"));
		}catch(NoSuchElementException e){
			log.error("Could not find element email");
			throw e;
		}
		return element;
	}

	
	public static WebElement title(String title){
		
		try{
			if(title.equalsIgnoreCase("mr")){
			element = driver.findElement(By.xpath("//*[@id='id_gender1']"));
			} else if(title.equalsIgnoreCase("mrs")){
			element = driver.findElement(By.id("id_gender2"));	
			}
			
		}catch(NoSuchElementException e){
			log.error("Could not find element title");
			throw e;
		}
		wait.until(ExpectedConditions.elementToBeClickable(element));
		return element;
		
	}
	
	public static WebElement firstNameCust(){
		try{
			element = driver.findElement(By.id("customer_firstname"));
		}catch(NoSuchElementException e){
			log.error("Could not find element firstNameCust");
			throw e;
		}
		return element;
	}
	
	public static WebElement lastNameCust(){
		try{
			element = driver.findElement(By.id("customer_lastname"));
		}catch(NoSuchElementException e){
			log.error("Could not find element lastNameCust");
			throw e;
		}
		return element;
	}
	
	public static WebElement days(){
		try{
			element = driver.findElement(By.id("days"));
		}catch(NoSuchElementException e){
			log.error("Could not find element days");
			throw e;
		}
		return element;
	}
	
	public static WebElement months(){
		try{
			element = driver.findElement(By.id("months"));
		}catch(NoSuchElementException e){
			log.error("Could not find element months");
			throw e;
		}
		return element;
	}
	
	public static WebElement years(){
		try{
			element = driver.findElement(By.id("years"));
		}catch(NoSuchElementException e){
			log.error("Could not find element years");
			throw e;
		}
		return element;
	}
	
	public static WebElement firstName(){
		try{
			element = driver.findElement(By.id("firstname"));
		}catch(NoSuchElementException e){
			log.error("Could not find element firstName");
			throw e;
		}
		return element;
	}
	
	public static WebElement lastName(){
		try{
			element = driver.findElement(By.id("lastname"));
		}catch(NoSuchElementException e){
			log.error("Could not find element lastName");
			throw e;
		}
		return element;
	}
	
	public static WebElement company(){
		try{
			element = driver.findElement(By.id("company"));
		}catch(NoSuchElementException e){
			log.error("Could not find element company");
			throw e;
		}
		return element;
	}
	
	public static WebElement address1(){
		try{
			element = driver.findElement(By.id("address1"));
		}catch(NoSuchElementException e){
			log.error("Could not find element address1");
			throw e;
		}
		return element;
	}
	
	public static WebElement address2(){
		try{
			element = driver.findElement(By.id("address2"));
		}catch(NoSuchElementException e){
			log.error("Could not find element address2");
			throw e;
		}
		return element;
	}
	
	public static WebElement city(){
		try{
			element = driver.findElement(By.id("city"));
		}catch(NoSuchElementException e){
			log.error("Could not find element city");
			throw e;
		}
		return element;
	}
	
	public static WebElement state(){
		try{
			element = driver.findElement(By.id("id_state"));
		}catch(NoSuchElementException e){
			log.error("Could not find element state");
			throw e;
		}
		return element;
	}
	
	public static WebElement postcode(){
		try{
			element = driver.findElement(By.id("postcode"));
		}catch(NoSuchElementException e){
			log.error("Could not find element postcode");
			throw e;
		}
		return element;
	}
	
	public static WebElement country(){
		try{
			element = driver.findElement(By.id("id_country"));
		}catch(NoSuchElementException e){
			log.error("Could not find element country");
			throw e;
		}
		return element;
	}
	
	public static WebElement addInfo(){
		try{
			element = driver.findElement(By.id("other"));
		}catch(NoSuchElementException e){
			log.error("Could not find element addInfo");
			throw e;
		}
		return element;
	}
	
	public static WebElement phone(){
		try{
			element = driver.findElement(By.id("phone"));
		}catch(NoSuchElementException e){
			log.error("Could not find element phone");
			throw e;
		}
		return element;
	}
	
	public static WebElement phoneMobile(){
		try{
			element = driver.findElement(By.id("phone_mobile"));
		}catch(NoSuchElementException e){
			log.error("Could not find element phoneMobile");
			throw e;
		}
		return element;
	}
	
	public static WebElement alias(){
		try{
			element = driver.findElement(By.id("alias"));
		}catch(NoSuchElementException e){
			log.error("Could not find element alias");
			throw e;
		}
		return element;
	}
	
	public static WebElement submitAccount(){
		try{
			element = driver.findElement(By.id("submitAccount"));
		}catch(NoSuchElementException e){
			log.error("Could not find element submitAccount");
			throw e;
		}
		return element;
	}
	}
	
	


