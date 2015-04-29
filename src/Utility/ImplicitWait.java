package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class ImplicitWait {
	
	private static int time;
	private static WebDriver driver;
	
	public ImplicitWait(WebDriver driver, int time){
		ImplicitWait.driver = driver;
		ImplicitWait.time = time;
	}
	
	public static void setInSeconds(int time){
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	public static void switchOff(){
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	}
	
	public static void switchON(){
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
}
