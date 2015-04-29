package Utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Camera {
	
	public static void takePicture(WebDriver driver){
		
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String name = driver.getTitle();
		name = name.replace(" ", "_");
		
		DateFormat format = new SimpleDateFormat("yy:mm:dd hh:mm:ss");
		Calendar cal = Calendar.getInstance();
		String currentDate = format.format(cal.getTime());
		String date = currentDate.replace(':', '.').replace(' ', '_');
				
		try {
			FileUtils.copyFile(scr, new File("screenshoots/" + name + date + ".jpg"));
		} catch (IOException e) {
			System.out.println("There was an error while taking picture " + e.getMessage());
		}
	}

}
