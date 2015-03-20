package PageObjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BaseClass {
	
	static WebDriver driver;
	public static WebDriverWait wait;
	static Properties prop = new Properties();
	static Logger log;

	public BaseClass(WebDriver driver){
		BaseClass.driver = driver;
		wait = new WebDriverWait(driver,15);
		log = Logger.getLogger(BaseClass.class.getName());
		try {
			prop.load(new FileInputStream(new File("prop.properties")));
		} catch (FileNotFoundException e) {
			log.error("Could not find properties file");
			e.printStackTrace();
		} catch (IOException e) {
			log.error("Some problem with properties file");
			e.printStackTrace();
		}
		
	}
	
	public static String getTitle(){
		return BaseClass.driver.getTitle();
	}
    
	public static void getWebsite(String url){
		BaseClass.driver.get(url);
	}
	
	public static void quit(){
		BaseClass.driver.quit();
	}
}
	