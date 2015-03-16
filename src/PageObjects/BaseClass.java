package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BaseClass {
	
	static WebDriver driver;
	public static WebDriverWait wait; 

	public BaseClass(WebDriver driver){
		BaseClass.driver = driver;
		wait = new WebDriverWait(driver,10);
	}
	
	public String getTitle(){
		return BaseClass.driver.getTitle();
	}
    
	public void getWebsite(String url){
		BaseClass.driver.get(url);
	}
	
	public void quit(){
		BaseClass.driver.quit();
	}
}
	