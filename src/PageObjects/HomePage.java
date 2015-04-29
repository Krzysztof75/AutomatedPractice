package PageObjects;


import java.util.List;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Document;

import Utility.MyLog;

public class HomePage extends BaseClass {
	
	static Logger log = LogManager.getLogger(HomePage.class.getName());

    private static WebElement element;

	public HomePage(WebDriver driver){
		super(driver);

//		DOMConfigurator.configure("log4j.xml");
	}

	/*
	 * inner class representing elements in the header part of the Website
	 */
	public static class Header{

		// return Contact us
		public static WebElement contactUs(){
			try{
				 element = driver.findElement(By.linkText(prop.getProperty("ContactUs_linkText")));
			} catch (NoSuchElementException e){
				log.error("Could not find contactUs element");
				throw e;
			}
			log.info("Returned ContactUs");
//			wait.until(ExpectedConditions.elementToBeClickable(element));
			return element;
		}

		// return SignIn
		public static WebElement LogIn(){

			try{
				element = driver.findElement(By.linkText(prop.getProperty("LogIn_linkText")));
			} catch (NoSuchElementException e){
				log.error("Could not find element Sign in");
				throw e;
			}
			log.info("Returned LogIn");
//			wait.until(ExpectedConditions.elementToBeClickable(element));
			return element;
		}

		public static WebElement searchBox(){

			try{
				element = driver.findElement(By.id(prop.getProperty("searchBox_id")));
			} catch(NoSuchElementException e){
				log.error("Could not find element search box");
				throw e;
			}
			log.info("Returned Search box");
//			wait.until(ExpectedConditions.elementToBeClickable(element));
			return element;
		}

		// return search button
		public static WebElement search(){

			try{
				element = driver.findElement(By.name(prop.getProperty("search_btn_name")));
			} catch(NoSuchElementException e){
				log.error("Could not find element search");
				throw e;
			}
			log.info("Returned Search");
//			wait.until(ExpectedConditions.elementToBeClickable(element));
			return element;
		}

		public static WebElement cart(){
			try{
				element = driver.findElement(By.xpath(prop.getProperty("cart_xpath")));
			} catch(NoSuchElementException e){
				log.error("Could not find element cart");
				throw e;
			}
			log.info("Returned cart");
//			wait.until(ExpectedConditions.elementToBeClickable(element));
			return element;
		}

		//return Women element from block_top_menu
		public static WebElement women (){

			try{
				element = driver.findElement(By.xpath(prop.getProperty("women_xpath")));
			} catch(NoSuchElementException e){
				log.error("Could not find element Women in the main menu");
				throw e;
			}
			log.info("Returned Women");
//			wait.until(ExpectedConditions.elementToBeClickable(element));
			return element;
		}

		// return elements from Women drop down menu 
		public static WebElement women(String option){

			Actions action = new Actions(driver);

			Action hover = action.moveToElement(women()).build();
			hover.perform();

			String opt = option.toLowerCase();

			switch(opt){

			case "tops":

				try{
					element = driver.findElement(By.xpath(prop.getProperty("women_tops_xpath")));
				} catch(NoSuchElementException e){
					log.error("Could not find element top under Women menu");
					throw e;
				}
				log.info("Returned Women - Tops");
				break;

			case "t-shirts":

				try{
					Utility.ExplicitWait.setInSeconds(driver, 3);
					element = driver.findElement(By.linkText(prop.getProperty("women_t-shirts_linkText")));
				} catch(NoSuchElementException e){
					log.error("Could not find element t-shirts under Women menu");
					throw e;
				}
				log.info("Returned Women - Tshirts");
				break;

			case "blouses":

				try{
					element = driver.findElement(By.xpath(prop.getProperty("women_blouses_xpath")));
				} catch(NoSuchElementException e){
					log.error("Could not find element blouses under Women menu");
					throw e;
				}
				log.info("Returned Women - Blouses");
				break;

			case "dresses":

				try{
					element = driver.findElement(By.xpath(prop.getProperty("women_dresses_xpath")));
				} catch(NoSuchElementException e){
					log.error("Could not find element dresses under Women menu");
				}
				log.info("Returned Women - Dresses");
				break;

			case "casual dresses":

				try{
					element = driver.findElement(By.linkText(prop.getProperty("women_casual_dresses_linkText")));
				} catch(NoSuchElementException e){
					log.error("Could not find element Casual dresses under Women menu");
					Utility.Camera.takePicture(driver);
					throw e;
				}
				log.info("Returned Women - Casual dresses");
				break;

			case "evening dresses":

				try{
					element = driver.findElement(By.linkText(prop.getProperty("women_evening_dresses_linkText")));
				} catch(NoSuchElementException e){
					log.error("Could not find element Evening dresses under Women menu");
					throw e;
				}
				log.info("Returned Women - Evening Dresses");
				break;

			case "summer dresses":

				try{
					element = driver.findElement(By.linkText(prop.getProperty("women_summer_dresses_linkText")));
				} catch(NoSuchElementException e){
					log.error("Could not find element Summer dresses under Women menu");
					throw e;
				}
				log.info("Returned Women - Summer Dresses");
				break;

			default:
				log.warn("wrong argument passed to Women(String option");
				element = null;
			}
			Utility.ExplicitWait.setInSeconds(driver, 3).until(ExpectedConditions.elementToBeClickable(element));
			return element;
		}

		// return element Dresses from block_top_menu
		public static WebElement dresses(){

			try{
				element = driver.findElement(By.xpath(prop.getProperty("dresses-xpath")));
			} catch(NoSuchElementException e){
				log.error("Could not find element Dresses in the main menu");
			}
			log.info("Returned Dresses");
//			wait.until(ExpectedConditions.elementToBeClickable(element));
			return element;
		}

		// return element from Dresses drop down menu
		public static WebElement dresses(String option){

			Actions action = new Actions(driver);

			action.moveToElement(dresses()).build().perform();

			String opt = option.toLowerCase();

			switch(opt){

			case "casual dresses":

				try{
					element = driver.findElement(By.xpath(prop.getProperty("dresses_casual_dresses-xpath")));
				} catch(NoSuchElementException e){
					log.error("Could not find element Casual Dresses under Dresses menu");
					throw e;
				}
				log.info("Returned Dresses - Casual Dresses");
				break;

			case "evening dresses":

				try{
					element = driver.findElement(By.xpath(prop.getProperty("dresses_evening_dresses_xpath")));
				} catch(NoSuchElementException e){
					log.error("Could not find element Evening Dresses under Dresses menu");
					throw e;
				}
				log.info("Returned Dresses - Evening Dresses");
				break;

			case "summer dresses":

				try{
					element = driver.findElement(By.xpath(prop.getProperty("dresses_summer_dresses_xpath")));
				} catch(NoSuchElementException e){
					log.error("Could not find element Summer Dresses under Dresses menu");
					throw e;
				}
				log.info("Returned Dresses - Summer Dresses");
				break;

			default: 
				log.warn("wrong argument passed to Dresses(String option)");
				element = null; 
			}   
//			wait.until(ExpectedConditions.elementToBeClickable(element));
			return element;
		}
		public static WebElement tShirts(){
			try{
				element = driver.findElement(By.xpath(prop.getProperty("tShirts-xpath")));
			} catch(NoSuchElementException e){
				log.error("Could not find element T-shirts in the main menu");
				throw e;
			}
//			wait.until(ExpectedConditions.elementToBeClickable(element));
			return element;
		}

	}

	public static class ContainerTop{

		public static boolean validatePopular(){
			boolean result;
			List<WebElement>products = driver.findElements(By.className(prop.getProperty("products_className")));
			result = true;
			for(int i = 0; i < (products.size()-6); i++){
				if(!products.get(i).isDisplayed()){
					result = false; 
				}
			}   
			return result;

		}

		public static boolean validateBestSeller(){
			boolean result;
			List<WebElement>products = driver.findElements(By.className(prop.getProperty("products_className")));
			result = true;
			for(int i = 7; i < products.size(); i++){
				if(!products.get(i).isDisplayed()){
					result = false;
				}
			}   
			return result;

		}


		public static WebElement slider(){
			try{
				element = driver.findElement(By.xpath(prop.getProperty("slider_xpath")));
			} catch(NoSuchElementException e){
				log.error("Could not find element Slider");
				throw e;
			}
			Utility.ExplicitWait.setInSeconds(driver, 5).until(ExpectedConditions.elementToBeClickable(element));
			return element;
		}

		public static WebElement sliderNext(){
			try{										
				element = driver.findElement(By.xpath(prop.getProperty("slider_next_xpath")));
			} catch(NoSuchElementException e){
				log.error("Could not find element Slider Next");
				throw e;
			}
//			wait.until(ExpectedConditions.elementToBeClickable(element));
			log.info("Returned element slider next");
			return element;
		}

		public static WebElement sliderPrev(){
			try{
				element = driver.findElement(By.xpath(prop.getProperty("slider_prev_xpath")));
			} catch(NoSuchElementException e){
				log.error("Could not find element Slider Next");
				throw e;
			}
//			wait.until(ExpectedConditions.elementToBeClickable(element));
			log.info("Returned element slider next");
			return element;
		}
		
		public static WebElement shopNow(){
			try{
				element = driver.findElement(By.xpath(prop.getProperty("shopNow_xpath")));
			} catch(NoSuchElementException e){
				log.error("Could not find element shop-now");
				throw e;
			}
//			wait.until(ExpectedConditions.elementToBeClickable(element));
			log.info("Returned element shop-now");
			return element;
		}

		public static WebElement contentTop(){
			try{
				element = driver.findElement(By.xpath(prop.getProperty("content_Top_xpath")));
			} catch(NoSuchElementException e){
				log.error("Could not find element Content top");
				throw e;
			}
//			wait.until(ExpectedConditions.elementToBeClickable(element));
			log.info("Returned content Top");
			return element;
		}

		public static WebElement contentButton(){
			try{
				element = driver.findElement(By.xpath(prop.getProperty("content_Button_xpath")));
			} catch(NoSuchElementException e){
				log.error("Could not find element Content button");
				throw e;
			}
//			wait.until(ExpectedConditions.elementToBeClickable(element));
			log.info("Returned content Button");
			return element;
		}

		public static WebElement tabPopular(){
			try{
				element = driver.findElement(By.xpath(prop.getProperty("tabPopular_xpath")));
			} catch(NoSuchElementException e){
				log.error("Could not find element tabPopular button");
				throw e;
			}
			log.info("Returned tabPopular element");
			return element;

		}

		public static WebElement tabBestSellers(){
			try{
				element = driver.findElement(By.xpath(prop.getProperty("tabBestSellers_xpath")));
			} catch(NoSuchElementException e){
				log.error("Could not find element tabBestSellers button");
				throw e;
			}
			log.info("Returned tabBestSellers element");
			return element;
		}
	}

	public static class Product{

		static Actions action = new Actions(driver);

		// method checking whether tab Popular or Bestsellers is active so that we know the correct xpath to the product
		public static String active(){
			WebElement popularActive = ContainerTop.tabPopular();
			WebElement bestSellersActive = ContainerTop.tabBestSellers();
			String active = "default";
			if(popularActive.getAttribute("class").equalsIgnoreCase("active")){
				active = "homefeatured";	
			} else if(bestSellersActive.getAttribute("class").equalsIgnoreCase("active")){
				active = "blockbestsellers";
			}
			return active;
		}
		
		private static String generateXpath(String xpath){
			
			String path = xpath.substring(0, xpath.lastIndexOf("'")) + active() + xpath.substring(xpath.lastIndexOf("'"));
			return path;
			
		}

		public static class Blouse{

			// action hover will help us make elements "Add-To-Cart" and "More" visible
			private static WebElement blouse = driver.findElement(By.xpath(prop.getProperty("Blouse-xpath")));
			static Action hover = Product.action.moveToElement(blouse).build();

			public static String title(){
				String title = "DEFAULT";
				try{
					title = blouse.getAttribute("title");	
				}catch(NoSuchElementException e){
					log.error("Could not find Blouse - title");
					throw e;
				}
				log.info("Returned Blouse - title");
				return title;		
			}

			public static String price(){
						
				try{
					element = driver.findElement(By.xpath(generateXpath(prop.get("Blouse_price_xpath").toString())));	
				}catch(NoSuchElementException e){
					log.error("Could not find Blouse - price");
					throw e;
				}	
				log.info("Returned Blouse - price");
				return element.getAttribute("innerHTML").trim();		
			}

			public static WebElement image(){
				try{
					element = driver.findElement(By.xpath(generateXpath(prop.get("Blouse_image_xpath").toString())));
				}catch(NoSuchElementException e){
					log.error("Could not find Blouse Image");
					throw e;
				}	
				log.info("Returned Blouse - image");
				return element;		
			}

			public static WebElement addToCart(){
				hover.perform();
				try{
					element = driver.findElement(By.xpath(generateXpath(prop.get("Blouse_addToCart_xpath").toString())));
				}catch(NoSuchElementException e){
					log.error("Could not find Blouse - addCart");
					throw e;
				}	
				log.info("Returned Blouse - addCart");
				return element;		
			}
			public static WebElement more(){
				hover.perform();
				try{
					element = driver.findElement(By.xpath(generateXpath(prop.get("Blouse_more_xpath").toString())));
				}catch(NoSuchElementException e){
					log.error("Could not find Blouse - more");
					throw e;
				}	
				log.info("Returned Blouse - more");
				return element;		
			}
		}
		public static class FadedShortSleeveTshirts{

			private static WebElement FadedShortSleeve = driver.findElement(By.xpath(prop.getProperty("FadedShortSleeve_xpath")));
			static Action hover = Product.action.moveToElement(FadedShortSleeve).build();

			public static String title(){
				String title = "DEFAULT";
				try{
					title = FadedShortSleeve.getAttribute("title");	
				}catch(NoSuchElementException e){
					log.error("Could not find Faded Short Sleeve T-shirts - title");
					throw e;
				}
				log.info("Returned Faded Short Sleeve T-shirts - title");
				return title;		
			}

			public static String price(){
				try{
					element = driver.findElement(By.xpath(generateXpath(prop.get("FadedShortSleeve_price_xpath").toString())));	
				}catch(NoSuchElementException e){
					log.error("Could not find Faded Short Sleeve T-shirts - price");
					throw e;
				}	
				log.info("Returned Faded Short Sleeve T-shirts price");
				return element.getAttribute("innerHTML").trim();		
			}

			public static WebElement image(){
				try{
					element = driver.findElement(By.xpath(generateXpath(prop.get("FadedShortSleeve_image_xpath").toString())));	
				}catch(NoSuchElementException e){
					log.error("Could not find Faded Short Sleeve T-shirts - image");
					throw e;
				}	
				log.info("Returned Faded Short Sleeve T-shirts - image");
				return element;		
			}

			public static WebElement addToCart(){
				hover.perform();
				try{
					element = driver.findElement(By.xpath(generateXpath(prop.get("FadedShortSleeve_addToCart_xpath").toString())));	
				}catch(NoSuchElementException e){
					log.error("Could not find Faded Short Sleeve T-shirts - addCart");
					throw e;
				}	
				log.info("Returned Faded Short Sleeve T-shirts - addCart");
				return element;		
			}
			public static WebElement more(){
				hover.perform();
				try{
					element = driver.findElement(By.xpath(generateXpath(prop.get("FadedShortSleeve_more_xpath").toString())));
				}catch(NoSuchElementException e){
					log.error("Could not find Faded Short Sleeve T-shirts - more");
					throw e;
				}	
				log.info("Returned Faded Short Sleeve T-shirts - more");
				return element;		
			}
		}

		public static class PrintedChiffonDress{

			private static WebElement PrintedChiffonDress = driver.findElement(By.xpath(".//a[@title='Printed Chiffon Dress']"));
			static Action hover = Product.action.moveToElement(PrintedChiffonDress).build();


			public static String title(){
				String title = "DEFAULT";
				try{
					title = PrintedChiffonDress.getAttribute("title");	
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Chiffon Dress - title");
					throw e;
				}
				log.info("Returned Printed Chiffon Dress - title");
				return title;		
			}

			public static String price(){
				try{
					element = driver.findElement(By.xpath(generateXpath(prop.get("PrintedChiffonDress_price_xpath").toString())));	
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Chiffon Dress - Price");
					throw e;
				}	
				log.info("Returned Printed Chiffon Dress - price");
				return element.getAttribute("innerHTML").trim();		
			}

			public static WebElement image(){
				try{
					element = driver.findElement(By.xpath(generateXpath(prop.get("PrintedChiffonDress_image_xpath").toString())));
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Chiffon Dress Image");
					throw e;
				}	
				log.info("Returned Printed Chiffon Dress - Image");
				return element;		
			}

			public static WebElement addToCart(){
				hover.perform();
				try{
					element = driver.findElement(By.xpath(generateXpath(prop.get("PrintedChiffonDress_addToCart_xpath").toString())));
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Chiffon Dress addCart");
					throw e;
				}	
				log.info("Returned Printed Chiffon Dress - addCart");
				return element;		
			}
			public static WebElement more(){
				hover.perform();
				try{
					element = driver.findElement(By.xpath(generateXpath(prop.get("PrintedChiffonDress_more_xpath").toString())));
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Chiffon Dress - more");
					throw e;
				}	
				log.info("Returned Printed Chiffon Dress - more");
				return element;		
			}
		}

		public static class PrintedDressShort{				

			private static WebElement PrintedDressShort = driver.findElement(By.xpath(generateXpath(prop.get("PrintedDressShort_xpath").toString())));
			static Action hover = Product.action.moveToElement(PrintedDressShort).build();	

			public static String title(){
				String title = "DEFAULT";
				try{
					title = PrintedDressShort.getAttribute("title");	
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Dress-Short - title");
					throw e;
				}
				log.info("Returned Printed Dress-Short - title");
				return title;		
			}

			public static String price(){
				try{
					element = driver.findElement(By.xpath(generateXpath(prop.get("PrintedDressShort_price_xpath").toString())));	
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Dress-Short - Price");
					throw e;
				}	
				log.info("Returned Printed Dress-Short - price");
				return element.getAttribute("innerHTML").trim();		
			}

			public static WebElement image(){
				try{
					element = driver.findElement(By.xpath(generateXpath(prop.get("PrintedDressShort_image_xpath").toString())));
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Dress-Short Image");
					throw e;
				}	
				log.info("Returned Printed Dress-Short - Image");
				return element;		
			}

			public static WebElement addToCart(){
				hover.perform();
				try{
					element = driver.findElement(By.xpath(generateXpath(prop.get("PrintedDressShort_addToCart_xpath").toString())));
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Dress-Short addCart");
					throw e;
				}	
				log.info("Returned Printed Dress-Short - addCart");
				return element;		
			}
			public static WebElement more(){
				hover.perform();
				try{
					element = driver.findElement(By.xpath(generateXpath(prop.get("PrintedDressShort_more_xpath").toString())));
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Dress-Short - more");
					throw e;
				}	
				log.info("Returned Printed Dress-Short - more");
				return element;		
			}
		}

		public static class PrintedDressLong{

			private static WebElement PrintedDressLong = driver.findElement(By.xpath(generateXpath(prop.get("PrintedDressLong_xpath").toString())));
			static Action hover = Product.action.moveToElement(PrintedDressLong).build();	

			public static String title(){
				String title = "DEFAULT";
				try{
					title = PrintedDressLong.getAttribute("title");	
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Dress-Long - title");
					throw e;
				}
				log.info("Returned Printed Dress-Long - title");
				return title;		
			}

			public static String price(){
				try{
					element = driver.findElement(By.xpath(generateXpath(prop.get("PrintedDressLong_price_xpath").toString())));	
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Dress-Long - Price");
					throw e;
				}	
				log.info("Returned Printed Dress-Long - price");
				return element.getAttribute("innerHTML").trim();		
			}

			public static WebElement image(){
				try{
					element = driver.findElement(By.xpath(generateXpath(prop.get("PrintedDressLong_image_xpath").toString())));	
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Dress-Long Image");
					throw e;
				}	
				log.info("Returned Printed Dress-Long - Image");
				return element;		
			}

			public static WebElement addToCart(){
				hover.perform();
				try{
					element = driver.findElement(By.xpath(generateXpath(prop.get("PrintedDressLong_addToCart_xpath").toString())));
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Dress-Long addCart");
					throw e;
				}	
				log.info("Returned Printed Dress-Long - addCart");
				return element;		
			}
			public static WebElement more(){
				hover.perform();						
				try{
					element = driver.findElement(By.xpath(generateXpath(prop.get("PrintedDressLong_more_xpath").toString())));
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Dress-Long - more");
					throw e;
				}	
				log.info("Returned Printed Dress-Long - more");
				return element;		
			}
		}

		public static class PrintedSummerDressShort{

			private static WebElement PrintedSummerDressShort = driver.findElement(By.xpath(generateXpath(prop.get("PrintedSummerDressShort_xpath").toString())));
			static Action hover = Product.action.moveToElement(PrintedSummerDressShort).build();	

			public static String title(){
				String title = "DEFAULT";
				try{
					title = PrintedSummerDressShort.getAttribute("title");	
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Summer Dress-short - title");
					throw e;
				}
				log.info("Returned Printed Summer Dress-short - title");
				return title;		
			}

			public static String price(){
				try{
					element = driver.findElement(By.xpath(generateXpath(prop.get("PrintedSummerDressShort_price_xpath").toString())));	
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Summer Dress-short - Price");
					throw e;
				}	
				log.info("Returned Printed Summer Dress-short - price");
				return element.getAttribute("innerHTML").trim();		
			}

			public static WebElement image(){
				try{
					element = driver.findElement(By.xpath(generateXpath(prop.get("PrintedSummerDressShort_image_xpath").toString())));
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Summer Dress-short Image");
					throw e;
				}	
				log.info("Returned Printed Summer Dress-short - Image");
				return element;		
			}

			public static WebElement addToCart(){
				hover.perform();
				try{
					element = driver.findElement(By.xpath(generateXpath(prop.get("PrintedSummerDressShort_addToCart_xpath").toString())));
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Summer Dress-short addCart");
					throw e;
				}	
				log.info("Returned Printed Summer Dress-short - addCart");
				return element;		
			}
			public static WebElement more(){
				hover.perform();
				try{
					element = driver.findElement(By.xpath(generateXpath(prop.get("PrintedSummerDressShort_more_xpath").toString())));
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Summer Dress-short - more");
					throw e;
				}	
				log.info("Returned Printed Summer Dress-short - more");
				return element;		
			}
		}

		public static class PrintedSummerDressLong{

			private static WebElement PrintedSummerDressLong = driver.findElement(By.xpath(generateXpath(prop.get("PrintedSummerDressLong_xpath").toString())));
			static Action hover = Product.action.moveToElement(PrintedSummerDressLong).build();	

			public static String title(){
				String title = "DEFAULT";
				try{
					title = PrintedSummerDressLong.getAttribute("title");	
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Summer Dress-Long - title");
					throw e;
				}
				log.info("Returned Printed Summer Dress-Long - title");
				return title;		
			}

			public static String price(){
				try{
					element = driver.findElement(By.xpath(generateXpath(prop.get("PrintedSummerDressLong_price_xpath").toString())));
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Summer Dress-Long - Price");
					throw e;
				}	
				log.info("Returned Printed Summer Dress-Long - price");
				return element.getAttribute("innerHTML").trim();		
			}

			public static WebElement image(){
				try{
					element = driver.findElement(By.xpath(generateXpath(prop.get("PrintedSummerDressLong_image_xpath").toString())));
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Summer Dress-Long Image");
					throw e;
				}	
				log.info("Returned Printed Summer Dress-Long - Image");
				return element;		
			}

			public static WebElement addToCart(){
				hover.perform();
				try{
					element = driver.findElement(By.xpath(generateXpath(prop.get("PrintedSummerDressLong_addToCart_xpath").toString())));
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Summer Dress-Long addCart");
					throw e;
				}	
				log.info("Returned Printed Summer Dress-Long - addCart");
				return element;		
			}
			public static WebElement more(){
				hover.perform();
				try{
					element = driver.findElement(By.xpath(generateXpath(prop.get("PrintedSummerDressLong_more_xpath").toString())));
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Summer Dress-Long - more");
					throw e;
				}	
				log.info("Returned Printed Summer Dress-Long - more");
				return element;		
			}
		}
	}
	public static class ContainerButton{

		public static WebElement Cont1(){
			try{
				element = driver.findElement(By.xpath(prop.getProperty("Cont1_xpath")));
			} catch(NoSuchElementException e){
				log.error("Could not find element cont1");
				throw e;
			}
//			wait.until(ExpectedConditions.elementToBeClickable(element));
			log.info("Returned cont1");
			return element;
		}

		public static WebElement Cont2(){
			try{

				element = driver.findElement(By.xpath(prop.getProperty("Cont2_xpath")));
			} catch(NoSuchElementException e){
				log.error("Could not find element Cont2");
				throw e;
			}
//			wait.until(ExpectedConditions.elementToBeClickable(element));
			log.info("Returned cont2");
			return element;
		}

		public static WebElement Cont3(){
			try{
				element = driver.findElement(By.xpath(prop.getProperty("Cont3_xpath")));
			} catch(NoSuchElementException e){
				log.error("Could not find element cont3");
				throw e;
			}
//			wait.until(ExpectedConditions.elementToBeClickable(element));
			log.info("Returned cont3");
			return element;
		}

		public static WebElement Cont4(){
			try{
				element = driver.findElement(By.xpath(prop.getProperty("Cont4_xpath")));
			} catch(NoSuchElementException e){
				log.error("Could not find element cont4");
				throw e;
			}
//			wait.until(ExpectedConditions.elementToBeClickable(element));
			log.info("Returned cont4");
			return element;
		}

		public static WebElement Cont5(){
			try{
				element = driver.findElement(By.xpath(prop.getProperty("Cont5_xpath")));
			} catch(NoSuchElementException e){
				log.error("Could not find element cont5");
				throw e;
			}
//			wait.until(ExpectedConditions.elementToBeClickable(element));
			log.info("Returned cont5");
			return element;
		}

	}

	public static class Footer{

		public static class Newsletter{

			public static WebElement inputBox(){
				try{
					element = driver.findElement(By.id(prop.getProperty("inputBox_id")));
				} catch(NoSuchElementException e){
					log.error("Could not find element newsletter");
					throw e;
				}
//				wait.until(ExpectedConditions.elementToBeClickable(element));
				log.info("returned newsletter");
				return element;
			}

			public static WebElement submit_btn(){
				try{
					element = driver.findElement(By.xpath(prop.getProperty("submit_btn_xpath")));
				} catch(NoSuchElementException e){
					log.error("Could not find element newsletter submit button");
					throw e;
				}
//				wait.until(ExpectedConditions.elementToBeClickable(element));
				log.info("returned newsletter submit button");
				return element;

			}
		}

		public static WebElement facebook(){
			try{
				element = driver.findElement(By.xpath(prop.getProperty("facebook_xpath")));
			} catch(NoSuchElementException e){
				log.error("Could not find element facebook");
				throw e;
			}
//			wait.until(ExpectedConditions.elementToBeClickable(element));
			log.info("returned facebook");
			return element;

		}

		public static WebElement twitter(){
			try{							
				element = driver.findElement(By.xpath(prop.getProperty("twitter_xpath")));
			} catch(NoSuchElementException e){
				log.error("Could not find element twitter");
				throw e;
			}
//			wait.until(ExpectedConditions.elementToBeClickable(element));
			log.info("returned twitter");
			return element;

		}

		public static WebElement youTube(){
			try{					
				element = driver.findElement(By.xpath(prop.getProperty("youTube_xpath")));
			} catch(NoSuchElementException e){
				log.error("Could not find element youtube");
				throw e;
			}
//			wait.until(ExpectedConditions.elementToBeClickable(element));
			log.info("returned youtube");
			return element;
		}

		public static WebElement google(){
			try{
				element = driver.findElement(By.xpath(prop.getProperty("google_xpath")));
			} catch(NoSuchElementException e){
				log.error("Could not find element google");
				throw e;
			}
//			wait.until(ExpectedConditions.elementToBeClickable(element));
			log.info("returned google");
			return element;

		}

		public static WebElement women(){

			try{
				element = driver.findElement(By.xpath(prop.getProperty("Footer_women_xpath")));
			} catch(NoSuchElementException e){
				log.error("Could not find element footer - women");
				throw e;
			}
//			wait.until(ExpectedConditions.elementToBeClickable(element));
			log.info("returned footer - women");
			return element;

		}

		public static WebElement specials(){

			try{
				element = driver.findElement(By.linkText(prop.getProperty("specials_linkText")));
			} catch(NoSuchElementException e){
				log.error("Could not find element footer - specials");
				throw e;
			}
//			wait.until(ExpectedConditions.elementToBeClickable(element));
			log.info("returned footer - specials");
			return element;

		}

		public static WebElement newProducts(){

			try{
				element = driver.findElement(By.linkText(prop.getProperty("newProducts_linkText")));
			} catch(NoSuchElementException e){
				log.error("Could not find element footer - new products");
				throw e;
			}
//			wait.until(ExpectedConditions.elementToBeClickable(element));
			log.info("returned footer - new products");
			return element;

		}

		public static WebElement bestSellers(){

			try{
				element = driver.findElement(By.xpath(prop.getProperty("bestSellers_xpath")));
			} catch(NoSuchElementException e){
				log.error("Could not find element footer - best sellers");
				throw e;
			}
//			wait.until(ExpectedConditions.elementToBeClickable(element));
			log.info("returned footer - best sellers");
			return element;

		}
		
		public static WebElement ourStores(){

			try{
				element = driver.findElement(By.linkText(prop.getProperty("ourStores_linkText")));
			} catch(NoSuchElementException e){
				log.error("Could not find element footer - new products");
				throw e;
			}
//			wait.until(ExpectedConditions.elementToBeClickable(element));
			log.info("returned footer - new products");
			return element;

	}
		
		public static WebElement contactUs(){

			try{
				element = driver.findElement(By.linkText(prop.getProperty("contactUs-linkText")));
			} catch(NoSuchElementException e){
				log.error("Could not find element footer - Contact us");
				throw e;
			}
//			wait.until(ExpectedConditions.elementToBeClickable(element));
			log.info("returned footer - Contact us");
			return element;

	}
		
		public static WebElement termsCond(){

			try{
				element = driver.findElement(By.linkText(prop.getProperty("termsCond_linkText")));
			} catch(NoSuchElementException e){
				log.error("Could not find element footer - Terms and conditions of use");
				throw e;
			}
//			wait.until(ExpectedConditions.elementToBeClickable(element));
			log.info("returned footer - Terms and conditions of use");
			return element;

	}
		
		public static WebElement about(){

			try{
				element = driver.findElement(By.linkText(prop.getProperty("about_linkText")));
			} catch(NoSuchElementException e){
				log.error("Could not find element footer - About us");
				throw e;
			}
//			wait.until(ExpectedConditions.elementToBeClickable(element));
			log.info("returned footer - About us");
			return element;

	}
		
		public static WebElement sitemap(){

			try{
				element = driver.findElement(By.linkText(prop.getProperty("sitemap_linkText")));
			} catch(NoSuchElementException e){
				log.error("Could not find element footer - Sitemap");
				throw e;
			}
//			wait.until(ExpectedConditions.elementToBeClickable(element));
			log.info("returned footer - Sitemap");
			return element;

	}
		
		public static WebElement myAccount(){

			try{
				element = driver.findElement(By.linkText(prop.getProperty("myAccount-linkText")));
			} catch(NoSuchElementException e){
				log.error("Could not find element footer - My account");
				throw e;
			}
//			wait.until(ExpectedConditions.elementToBeClickable(element));
			log.info("returned footer - My account");
			return element;

	}
		
		public static WebElement myOrders(){

			try{
				element = driver.findElement(By.linkText(prop.getProperty("myOrders_linkText")));
			} catch(NoSuchElementException e){
				log.error("Could not find element footer - My orders");
				throw e;
			}
//			wait.until(ExpectedConditions.elementToBeClickable(element));
			log.info("returned footer - My orders");
			return element;

	}
		
		public static WebElement myCreditSlips(){

			try{
				element = driver.findElement(By.linkText(prop.getProperty("myCreditSlips_linkText")));
			} catch(NoSuchElementException e){
				log.error("Could not find element footer - My credit slips");
				throw e;
			}
//			wait.until(ExpectedConditions.elementToBeClickable(element));
			log.info("returned footer - My credit slips");
			return element;

	}

		public static WebElement myAdresses(){

			try{
				element = driver.findElement(By.linkText(prop.getProperty("myAdresses_linkText")));
			} catch(NoSuchElementException e){
				log.error("Could not find element footer - My addresses");
				throw e;
			}
//			wait.until(ExpectedConditions.elementToBeClickable(element));
			log.info("returned footer - My addresses");
			return element;

	}
		
		public static WebElement myPersonalInfo(){

			try{
				element = driver.findElement(By.linkText(prop.getProperty("myPersonalInfo_linkText")));
			} catch(NoSuchElementException e){
				log.error("Could not find element footer - My personal info");
				throw e;
			}
//			wait.until(ExpectedConditions.elementToBeClickable(element));
			log.info("returned footer - My personal info");
			return element;

	}
		
		public static WebElement skype(){

			try{
				element = driver.findElement(By.xpath(prop.getProperty("skype_xpath")));
			} catch(NoSuchElementException e){
				log.error("Could not find element footer - skype");
				throw e;
			}
//			wait.until(ExpectedConditions.elementToBeClickable(element));
			log.info("returned footer - skype");
			return element;

	}
		
		public static WebElement email(){

			try{
				element = driver.findElement(By.xpath(prop.getProperty("email_xpath")));
			} catch(NoSuchElementException e){
				log.error("Could not find element footer - email");
				throw e;
			}
//			wait.until(ExpectedConditions.elementToBeClickable(element));
			log.info("returned footer - email");
			return element;

	}
}
}











