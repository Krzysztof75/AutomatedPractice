package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	
private static WebDriverWait wait;

	public static WebDriverWait setInSeconds(WebDriver driver, int time){
		WebDriverWait wait = new WebDriverWait(driver,time);
		return wait;
	}
	
	public static void switchOff(WebDriver driver){
		wait = null;
	}
}


