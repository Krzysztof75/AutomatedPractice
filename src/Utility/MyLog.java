package Utility;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import PageObjects.HomePage;

public class MyLog extends Logger {

	private static Logger log;
	
	public MyLog(String name){
		super(name);
		DOMConfigurator.configure("log4j.xml");
	}
	
	public void info(String message){
		this.info(message);
	}
	
	public void warn(String message){
		this.warn(message);
	}
	
	public void error(String message){
		this.error(message);
	}
}
