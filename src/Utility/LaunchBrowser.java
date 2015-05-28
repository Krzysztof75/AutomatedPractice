package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class LaunchBrowser {
	
	private static WebDriver driver;
	
	public static WebDriver getBrowser(String browser){
		
		switch(browser){
		
		case "FF":
			ProfilesIni profile = new ProfilesIni();
			FirefoxProfile ffp = profile.getProfile("tester");
			driver = new FirefoxDriver(ffp);
			break;
			
		case "CH":
			driver = new ChromeDriver();
			break;
			
		case "IE":
			driver = new InternetExplorerDriver();
			break;
			
		case "HUD":
			// driver = new HtmlUnitDriver(BrowserVersion. after dot it will display list of available versions)
			driver = new HtmlUnitDriver();
		    break;
		    
		case "HUD_FF24":
			driver = new HtmlUnitDriver(BrowserVersion.FIREFOX_24);
			break;
			
		case "HUD_IE11":
			driver = new HtmlUnitDriver(BrowserVersion.INTERNET_EXPLORER_11);
			break;
		
			// Find out why depreciated, are there other libraries I can get to with other browser versions
		case "HUD_FF17":
			driver = new HtmlUnitDriver(BrowserVersion.FIREFOX_17);
			break;
			
		case "HUD_IE8":
			driver = new HtmlUnitDriver(BrowserVersion.INTERNET_EXPLORER_8);
			break;
			
		case "HUD_9":
			driver = new HtmlUnitDriver(BrowserVersion.INTERNET_EXPLORER_9);
			break;
		
		}
		if(!browser.equals("HUB"))
		driver.manage().window().maximize();
		return driver;
		
	}

}
