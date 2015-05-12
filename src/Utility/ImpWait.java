package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class ImpWait {
	
	private static int time;
	private static WebDriver driver;
	
	public ImpWait(WebDriver driver, int time){
		ImpWait.driver = driver;
		ImpWait.time = time;
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
