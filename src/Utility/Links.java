package Utility;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Links {
	
	public static List<WebElement>findAllLinks(WebDriver driver){
		
		List<WebElement> firstlist = new ArrayList();
		List<WebElement> links = new ArrayList();
		
		firstlist = driver.findElements(By.tagName("a"));
		firstlist.addAll(driver.findElements(By.tagName("img")));
		
		for (WebElement e : firstlist){
			
			if(e.getAttribute("href") != null){
				links.add(e);
			}
		}
			
		return links;
	}
	
	public static String isLinkBroken(URL url) throws Exception
	 
	{
 
		String response = "";
 
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
 
		try{
 
		    connection.connect();
 
		    response = connection.getResponseMessage();	        
 
		    connection.disconnect();
 
		    return response;
		    
		}catch(Exception exp){
 
			return exp.getMessage();
		}  				
	}
}


