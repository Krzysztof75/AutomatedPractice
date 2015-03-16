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

public class HomePage extends BaseClass {


	static Logger log = LogManager.getLogger(HomePage.class.getName());
	Properties prop = new Properties();



	public HomePage(WebDriver driver){
		super(driver);

		DOMConfigurator.configure("log4j.xml");
	}

	public String getTitle(){
		return driver.getTitle();

	}

	/*
	 * inner class representing elements in the header part of the Website
	 */
	public static class Header{

		private static WebElement headerElement;

		// return Contact us
		public static WebElement contactUs(){
			try{
				headerElement = driver.findElement(By.linkText("Contact us"));
			} catch (NoSuchElementException e){
				log.error("Could not find contactUs element");
				throw e;
			}
			log.info("Returned ContactUs");
			wait.until(ExpectedConditions.elementToBeClickable(headerElement));
			return headerElement;
		}

		// return SignIn
		public static WebElement LogIn(){

			try{
				headerElement = driver.findElement(By.linkText("Sign in"));
			} catch (NoSuchElementException e){
				log.error("Could not find element Sign in");
				throw e;
			}
			log.info("Returned LogIn");
			wait.until(ExpectedConditions.elementToBeClickable(headerElement));
			return headerElement;
		}

		public static WebElement searchBox(){

			try{
				headerElement = driver.findElement(By.id("search_query_top"));
			} catch(NoSuchElementException e){
				log.error("Could not find element search box");
				throw e;
			}
			log.info("Returned Search box");
			wait.until(ExpectedConditions.elementToBeClickable(headerElement));
			return headerElement;
		}

		// return search button
		public static WebElement search(){

			try{
				headerElement = driver.findElement(By.name("submit_search"));
			} catch(NoSuchElementException e){
				log.error("Could not find element search");
				throw e;
			}
			log.info("Returned Search");
			wait.until(ExpectedConditions.elementToBeClickable(headerElement));
			return headerElement;
		}

		public static WebElement cart(){
			try{
				headerElement = driver.findElement(By.xpath(".//*[@id='header']/div[3]/div/div/div[3]/div/a"));
			} catch(NoSuchElementException e){
				log.error("Could not find element cart");
				throw e;
			}
			log.info("Returned cart");
			wait.until(ExpectedConditions.elementToBeClickable(headerElement));
			return headerElement;
		}

		//return Women element from block_top_menu
		public static WebElement women (){

			try{
				headerElement = driver.findElement(By.xpath(".//a[@title='Women']"));
			} catch(NoSuchElementException e){
				log.error("Could not find element Women in the main menu");
				throw e;
			}
			log.info("Returned Women");
			wait.until(ExpectedConditions.elementToBeClickable(headerElement));
			return headerElement;
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
					headerElement = driver.findElement(By.xpath(".//a[@title='Tops']"));
				} catch(NoSuchElementException e){
					log.error("Could not find element top under Women menu");
					throw e;
				}
				log.info("Returned Women - Tops");
				break;

			case "t-shirts":

				try{
					headerElement = driver.findElement(By.linkText("T-shirts"));
				} catch(NoSuchElementException e){
					log.error("Could not find element t-shirts under Women menu");
					throw e;
				}
				log.info("Returned Women - Tshirts");
				break;

			case "blouses":

				try{
					headerElement = driver.findElement(By.linkText("Blouses"));
				} catch(NoSuchElementException e){
					log.error("Could not find element blouses under Women menu");
					throw e;
				}
				log.info("Returned Women - Blouses");
				break;

			case "dresses":

				try{
					headerElement = driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[1]/ul/li[2]/a"));
				} catch(NoSuchElementException e){
					log.error("Could not find element dresses under Women menu");
				}
				log.info("Returned Women - Dresses");
				break;

			case "casual dresses":

				try{
					headerElement = driver.findElement(By.linkText("Casual Dresses"));
				} catch(NoSuchElementException e){
					log.error("Could not find element Casual dresses under Women menu");
					throw e;
				}
				log.info("Returned Women - Casual dresses");
				break;

			case "evening dresses":

				try{
					headerElement = driver.findElement(By.linkText("Evening Dresses"));
				} catch(NoSuchElementException e){
					log.error("Could not find element Evening dresses under Women menu");
					throw e;
				}
				log.info("Returned Women - Evening Dresses");
				break;

			case "summer dresses":

				try{
					headerElement = driver.findElement(By.linkText("Summer Dresses"));
				} catch(NoSuchElementException e){
					log.error("Could not find element Summer dresses under Women menu");
					throw e;
				}
				log.info("Returned Women - Summer Dresses");
				break;

			default:
				log.warn("wrong argument passed to Women(String option");
				headerElement = null;
			}
			wait.until(ExpectedConditions.elementToBeClickable(headerElement));
			return headerElement;
		}

		// return element Dresses from block_top_menu
		public static WebElement dresses(){

			try{
				headerElement = driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[2]/a"));
			} catch(NoSuchElementException e){
				log.error("Could not find element Dresses in the main menu");
			}
			log.info("Returned Dresses");
			wait.until(ExpectedConditions.elementToBeClickable(headerElement));
			return headerElement;
		}

		// return element from Dresses drop down menu
		public static WebElement dresses(String option){

			Actions action = new Actions(driver);

			action.moveToElement(dresses()).build().perform();

			String opt = option.toLowerCase();

			switch(opt){

			case "casual dresses":

				try{
					headerElement = driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[2]/ul/li[1]/a"));
				} catch(NoSuchElementException e){
					log.error("Could not find element Casual Dresses under Dresses menu");
					throw e;
				}
				log.info("Returned Dresses - Casual Dresses");
				break;

			case "evening dresses":

				try{
					headerElement = driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[2]/ul/li[2]/a"));
				} catch(NoSuchElementException e){
					log.error("Could not find element Evening Dresses under Dresses menu");
					throw e;
				}
				log.info("Returned Dresses - Evening Dresses");
				break;

			case "summer dresses":

				try{
					headerElement = driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[2]/ul/li[3]/a"));
				} catch(NoSuchElementException e){
					log.error("Could not find element Summer Dresses under Dresses menu");
					throw e;
				}
				log.info("Returned Dresses - Summer Dresses");
				break;

			default: 
				log.warn("wrong argument passed to Dresses(String option");
				headerElement = null; 
			}   
			wait.until(ExpectedConditions.elementToBeClickable(headerElement));
			return headerElement;
		}
		public static WebElement tShirts(){
			try{
				headerElement = driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[3]/a"));
			} catch(NoSuchElementException e){
				log.error("Could not find element T-shirts in the main menu");
				throw e;
			}
			wait.until(ExpectedConditions.elementToBeClickable(headerElement));
			return headerElement;
		}

	}

	public static class ContainerTop{

		private static WebElement containerElement;

		public static boolean validatePopular(){
			List<WebElement>products = driver.findElements(By.className("product-container"));
			boolean result = true;
			for(int i = 0; i < (products.size()-6); i++){
				if(!products.get(i).isDisplayed()){
					return result = false; 
				}
			}   
			return result;

		}

		public static boolean validateBestSeller(){
			List<WebElement>products = driver.findElements(By.className("product-container"));
			boolean result = true;
			for(int i = 7; i < products.size(); i++){
				if(!products.get(i).isDisplayed()){
					return result = false;
				}
			}   
			return result;

		}


		public static WebElement slider(){
			try{

				containerElement = driver.findElement(By.id("homeslider"));
			} catch(NoSuchElementException e){
				log.error("Could not find element Slider");
				throw e;
			}
			wait.until(ExpectedConditions.elementToBeClickable(containerElement));
			return containerElement;
		}

		public static WebElement sliderNext(){
			try{										
				containerElement = driver.findElement(By.xpath(".//*[@id='homepage-slider']/div/div[2]/div/a[2]"));
			} catch(NoSuchElementException e){
				log.error("Could not find element Slider Next");
				throw e;
			}
			wait.until(ExpectedConditions.elementToBeClickable(containerElement));
			log.info("Returned element slider next");
			return containerElement;
		}

		public static WebElement sliderPrev(){
			try{
				containerElement = driver.findElement(By.xpath(".//*[@id='homepage-slider']/div/div[2]/div/a[1]"));
			} catch(NoSuchElementException e){
				log.error("Could not find element Slider Next");
				throw e;
			}
			wait.until(ExpectedConditions.elementToBeClickable(containerElement));
			log.info("Returned element slider next");
			return containerElement;
		}
		
		public static WebElement shopNow(){
			try{
				containerElement = driver.findElement(By.xpath("//*[@id='homeslider']/li[2]/div/p[2]/button"));
			} catch(NoSuchElementException e){
				log.error("Could not find element shop-now");
				throw e;
			}
			wait.until(ExpectedConditions.elementToBeClickable(containerElement));
			log.info("Returned element shop-now");
			return containerElement;
		}

		public static WebElement contentTop(){
			try{
				containerElement = driver.findElement(By.xpath(".//*[@id='htmlcontent_top']/ul/li[1]/a"));
			} catch(NoSuchElementException e){
				log.error("Could not find element Content top");
				throw e;
			}
			wait.until(ExpectedConditions.elementToBeClickable(containerElement));
			log.info("Returned content Top");
			return containerElement;
		}

		public static WebElement contentButton(){
			try{
				containerElement = driver.findElement(By.xpath(".//*[@id='htmlcontent_top']/ul/li[2]/a"));
			} catch(NoSuchElementException e){
				log.error("Could not find element Content button");
				throw e;
			}
			wait.until(ExpectedConditions.elementToBeClickable(containerElement));
			log.info("Returned content Button");
			return containerElement;
		}

		public static WebElement tabPopular(){
			try{
				containerElement = driver.findElement(By.xpath(".//*[@id='home-page-tabs']/li[1]/a"));
			} catch(NoSuchElementException e){
				log.error("Could not find element tabPopular button");
				throw e;
			}
			wait.until(ExpectedConditions.elementToBeClickable(containerElement));
			log.info("Returned tabPopular element");
			return containerElement;

		}

		public static WebElement tabBestSellers(){
			try{
				containerElement = driver.findElement(By.xpath(".//*[@id='home-page-tabs']/li[2]/a"));
			} catch(NoSuchElementException e){
				log.error("Could not find element tabBestSellers button");
				throw e;
			}
			wait.until(ExpectedConditions.elementToBeClickable(containerElement));
			log.info("Returned tabBestSellers element");
			return containerElement;
		}
	}

	public static class Product{

		private static WebElement product;

		static Actions action = new Actions(driver);

		// method checking whether tab Popular or Bestsellers is active so that we know the correct xpath to the product
		public static String active(){
			WebElement popularActive = driver.findElement(By.xpath("//*[@id='home-page-tabs']/li[1]"));
			WebElement bestSellersActive = driver.findElement(By.xpath("//*[@id='home-page-tabs']/li[1]"));
			String active = "default";
			if(popularActive.getAttribute("class").equalsIgnoreCase("active")){
				active = "homefeatured";	
			} else if(bestSellersActive.getAttribute("class").equalsIgnoreCase("active")){
				active = "blockbestsellers";
			}
			return active;
		}

		public static class Blouse{

			// action hover will help us make elements Add-To-Cart and More visible
			private static WebElement blouse = driver.findElement(By.xpath(".//a[@title='Blouse']"));
			static Action hover = Product.action.moveToElement(blouse).build();

			public static String title(){
				String title = "DEFAULT";
				try{
					title = driver.findElement(By.xpath(".//a[@title='Blouse']")).getAttribute("title");	
				}catch(NoSuchElementException e){
					log.error("Could not find Blouse - title");
					throw e;
				}
				log.info("Returned Blouse - title");
				return title;		
			}

			public static String price(){

				try{
					product = driver.findElement(By.xpath("//*[@id='" + active() + "']/li[1]/div/div[1]/div/div[2]/span"));	
				}catch(NoSuchElementException e){
					log.error("Could not find Blouse - price");
					throw e;
				}	
				log.info("Returned Blouse - price");
				return product.getAttribute("innerHTML").trim();		
			}

			public static WebElement image(){
				try{
					product = driver.findElement(By.xpath("//*[@id='" + active() + "']/li[2]/div/div[1]/div/a[1]"));
				}catch(NoSuchElementException e){
					log.error("Could not find Blouse Image");
					throw e;
				}	
				log.info("Returned Blouse - image");
				return product;		
			}

			public static WebElement addToCart(){
				hover.perform();
				try{
					product = driver.findElement(By.xpath("//*[@id='" + active() + "']/li[2]/div/div[2]/div[2]/a[1]"));
				}catch(NoSuchElementException e){
					log.error("Could not find Blouse - addCart");
					throw e;
				}	
				log.info("Returned Blouse - addCart");
				return product;		
			}
			public static WebElement more(){
				hover.perform();
				try{
					product = driver.findElement(By.xpath("//*[@id='" + active() + "']/li[2]/div/div[2]/div[2]/a[2]"));
				}catch(NoSuchElementException e){
					log.error("Could not find Blouse - more");
					throw e;
				}	
				log.info("Returned Blouse - more");
				return product;		
			}
		}
		public static class FadedShortSleeveTshirts{

			private static WebElement FadedShortSleeve = driver.findElement(By.xpath(".//a[@title='Faded Short Sleeve T-shirts']"));
			static Action hover = Product.action.moveToElement(FadedShortSleeve).build();

			public static String title(){
				String title = "DEFAULT";
				try{
					title = driver.findElement(By.xpath(".//a[@title='Faded Short Sleeve T-shirts']")).getAttribute("title");	
				}catch(NoSuchElementException e){
					log.error("Could not find Faded Short Sleeve T-shirts - title");
					throw e;
				}
				log.info("Returned Faded Short Sleeve T-shirts - title");
				return title;		
			}

			public static String price(){
				try{
					product = driver.findElement(By.xpath("//*[@id='" + active() + "']/li[2]/div/div[1]/div/div[2]/span"));	
				}catch(NoSuchElementException e){
					log.error("Could not find Faded Short Sleeve T-shirts - price");
					throw e;
				}	
				log.info("Returned Faded Short Sleeve T-shirts price");
				return product.getAttribute("innerHTML").trim();		
			}

			public static WebElement image(){
				try{
					product = driver.findElement(By.xpath("//*[@id='" + active() + "']/li[1]/div/div[1]/div/a[1]/img"));
				}catch(NoSuchElementException e){
					log.error("Could not find Faded Short Sleeve T-shirts - image");
					throw e;
				}	
				log.info("Returned Faded Short Sleeve T-shirts - image");
				return product;		
			}

			public static WebElement addToCart(){
				hover.perform();
				try{
					product = driver.findElement(By.xpath("//*[@id='" + active() + "']/li[1]/div/div[2]/div[2]/a[1]"));
				}catch(NoSuchElementException e){
					log.error("Could not find Faded Short Sleeve T-shirts - addCart");
					throw e;
				}	
				log.info("Returned Faded Short Sleeve T-shirts - addCart");
				return product;		
			}
			public static WebElement more(){
				hover.perform();
				try{
					product = driver.findElement(By.xpath("//*[@id='" + active() + "']/li[1]/div/div[2]/div[2]/a[2]"));
				}catch(NoSuchElementException e){
					log.error("Could not find Faded Short Sleeve T-shirts - more");
					throw e;
				}	
				log.info("Returned Faded Short Sleeve T-shirts - more");
				return product;		
			}
		}

		public static class PrintedChiffonDress{

			private static WebElement PrintedChiffonDress = driver.findElement(By.xpath(".//a[@title='Printed Chiffon Dress']"));
			static Action hover = Product.action.moveToElement(PrintedChiffonDress).build();


			public static String title(){
				String title = "DEFAULT";
				try{
					title = driver.findElement(By.xpath(".//a[@title='Printed Chiffon Dress']")).getAttribute("title");	
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Chiffon Dress - title");
					throw e;
				}
				log.info("Returned Printed Chiffon Dress - title");
				return title;		
			}

			public static String price(){
				try{
					product = driver.findElement(By.xpath("//*[@id='" + active() + "']/li[5]/div/div[1]/div/div[2]/span[1]"));	
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Chiffon Dress - Price");
					throw e;
				}	
				log.info("Returned Printed Chiffon Dress - price");
				return product.getAttribute("innerHTML").trim();		
			}

			public static WebElement image(){
				try{
					product = driver.findElement(By.xpath("//*[@id='" + active() + "']/li[1]/div/div[1]/div/a[1]/img"));
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Chiffon Dress Image");
					throw e;
				}	
				log.info("Returned Printed Chiffon Dress - Image");
				return product;		
			}

			public static WebElement addToCart(){
				hover.perform();
				try{
					product = driver.findElement(By.xpath("//*[@id='" + active() + "']/li[7]/div/div[2]/div[2]/a[1]"));
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Chiffon Dress addCart");
					throw e;
				}	
				log.info("Returned Printed Chiffon Dress - addCart");
				return product;		
			}
			public static WebElement more(){
				hover.perform();
				try{
					product = driver.findElement(By.xpath("//*[@id='" + active() + "']/li[7]/div/div[2]/div[2]/a[2]"));
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Chiffon Dress - more");
					throw e;
				}	
				log.info("Returned Printed Chiffon Dress - more");
				return product;		
			}
		}

		public static class PrintedDressShort{

			private static WebElement PrintedDressShort = driver.findElement(By.xpath(".//*[@id='" + active() + "']/li[3]/div/div[1]/div/a[1]"));
			static Action hover = Product.action.moveToElement(PrintedDressShort).build();	

			public static String title(){
				String title = "DEFAULT";
				try{
					title = driver.findElement(By.xpath(".//*[@id='" + active() + "']/li[3]/div/div[1]/div/a[1]")).getAttribute("title");	
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Dress-Short - title");
					throw e;
				}
				log.info("Returned Printed Dress-Short - title");
				return title;		
			}

			public static String price(){
				try{
					product = driver.findElement(By.xpath(".//*[@id='" + active() + "']/li[3]/div/div[1]/div/div[2]/span"));	
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Dress-Short - Price");
					throw e;
				}	
				log.info("Returned Printed Dress-Short - price");
				return product.getAttribute("innerHTML").trim();		
			}

			public static WebElement image(){
				try{
					product = driver.findElement(By.xpath(".//*[@id='" + active() + "']/li[3]/div/div[1]/div/a[1]/img"));
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Dress-Short Image");
					throw e;
				}	
				log.info("Returned Printed Dress-Short - Image");
				return product;		
			}

			public static WebElement addToCart(){
				hover.perform();
				try{
					product = driver.findElement(By.xpath(".//*[@id='" + active() + "']/li[3]/div/div[2]/div[2]/a[1]"));
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Dress-Short addCart");
					throw e;
				}	
				log.info("Returned Printed Dress-Short - addCart");
				return product;		
			}
			public static WebElement more(){
				hover.perform();
				try{
					product = driver.findElement(By.xpath(".//*[@id='" + active() + "']/li[3]/div/div[2]/div[2]/a[2]"));
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Dress-Short - more");
					throw e;
				}	
				log.info("Returned Printed Dress-Short - more");
				return product;		
			}
		}

		public static class PrintedDressLong{

			private static WebElement PrintedDressLong = driver.findElement(By.xpath("//*[@id='" + active() + "']/li[4]/div/div[1]/div/a[1]/img"));
			static Action hover = Product.action.moveToElement(PrintedDressLong).build();	

			public static String title(){
				String title = "DEFAULT";
				try{
					title = driver.findElement(By.xpath("//*[@id='" + active() + "']/li[4]/div/div[1]/div/a[1]/img")).getAttribute("title");	
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Dress-Long - title");
					throw e;
				}
				log.info("Returned Printed Dress-Long - title");
				return title;		
			}

			public static String price(){
				try{
					product = driver.findElement(By.xpath("//*[@id='" + active() + "']/li[4]/div/div[1]/div/div[2]/span"));	
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Dress-Long - Price");
					throw e;
				}	
				log.info("Returned Printed Dress-Long - price");
				return product.getAttribute("innerHTML").trim();		
			}

			public static WebElement image(){
				try{
					product = driver.findElement(By.xpath("//*[@id='" + active() + "']/li[4]/div/div[1]/div/a[1]/img"));
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Dress-Long Image");
					throw e;
				}	
				log.info("Returned Printed Dress-Long - Image");
				return product;		
			}

			public static WebElement addToCart(){
				hover.perform();
				try{
					product = driver.findElement(By.xpath("//*[@id='" + active() + "']/li[4]/div/div[2]/div[2]/a[1]"));
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Dress-Long addCart");
					throw e;
				}	
				log.info("Returned Printed Dress-Long - addCart");
				return product;		
			}
			public static WebElement more(){
				hover.perform();
				try{
					product = driver.findElement(By.xpath("//*[@id='" + active() + "']/li[4]/div/div[2]/div[2]/a[2]"));
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Dress-Long - more");
					throw e;
				}	
				log.info("Returned Printed Dress-Long - more");
				return product;		
			}
		}

		public static class PrintedSummerDressShort{

			private static WebElement PrintedSummerDressShort = driver.findElement(By.xpath("//*[@id='" + active() + "']/li[6]/div/div[1]/div/a[1]/img"));
			static Action hover = Product.action.moveToElement(PrintedSummerDressShort).build();	

			public static String title(){
				String title = "DEFAULT";
				try{
					title = driver.findElement(By.xpath("//*[@id='" + active() + "']/li[6]/div/div[1]/div/a[1]/img")).getAttribute("title");	
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Summer Dress-short - title");
					throw e;
				}
				log.info("Returned Printed Summer Dress-short - title");
				return title;		
			}

			public static String price(){
				try{
					product = driver.findElement(By.xpath("//*[@id='" + active() + "']/li[6]/div/div[1]/div/div[2]/span"));	
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Summer Dress-short - Price");
					throw e;
				}	
				log.info("Returned Printed Summer Dress-short - price");
				return product.getAttribute("innerHTML").trim();		
			}

			public static WebElement image(){
				try{
					product = driver.findElement(By.xpath("//*[@id='" + active() + "']/li[6]/div/div[1]/div/a[1]/img"));
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Summer Dress-short Image");
					throw e;
				}	
				log.info("Returned Printed Summer Dress-short - Image");
				return product;		
			}

			public static WebElement addToCart(){
				hover.perform();
				try{
					product = driver.findElement(By.xpath("//*[@id='" + active() + "']/li[6]/div/div[2]/div[2]/a[1]"));
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Summer Dress-short addCart");
					throw e;
				}	
				log.info("Returned Printed Summer Dress-short - addCart");
				return product;		
			}
			public static WebElement more(){
				hover.perform();
				try{
					product = driver.findElement(By.xpath("//*[@id='" + active() + "']/li[6]/div/div[2]/div[2]/a[2]"));
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Summer Dress-short - more");
					throw e;
				}	
				log.info("Returned Printed Summer Dress-short - more");
				return product;		
			}
		}

		public static class PrintedSummerDressLong{

			private static WebElement PrintedSummerDressLong = driver.findElement(By.xpath("//*[@id='" + active() + "']/li[5]/div/div[1]/div/a[1]/img"));
			static Action hover = Product.action.moveToElement(PrintedSummerDressLong).build();	

			public static String title(){
				String title = "DEFAULT";
				try{
					title = driver.findElement(By.xpath("//*[@id='" + active() + "']/li[5]/div/div[1]/div/a[1]/img")).getAttribute("title");	
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Summer Dress-Long - title");
					throw e;
				}
				log.info("Returned Printed Summer Dress-Long - title");
				return title;		
			}

			public static String price(){
				try{
					product = driver.findElement(By.xpath("//*[@id='" + active() + "']/li[5]/div/div[1]/div/div[2]/span[1]"));	
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Summer Dress-Long - Price");
					throw e;
				}	
				log.info("Returned Printed Summer Dress-Long - price");
				return product.getAttribute("innerHTML").trim();		
			}

			public static WebElement image(){
				try{
					product = driver.findElement(By.xpath("//*[@id='" + active() + "']/li[5]/div/div[1]/div/a[1]/img"));
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Summer Dress-Long Image");
					throw e;
				}	
				log.info("Returned Printed Summer Dress-Long - Image");
				return product;		
			}

			public static WebElement addToCart(){
				hover.perform();
				try{
					product = driver.findElement(By.xpath("//*[@id='" + active() + "']/li[5]/div/div[2]/div[2]/a[1]"));
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Summer Dress-Long addCart");
					throw e;
				}	
				log.info("Returned Printed Summer Dress-Long - addCart");
				return product;		
			}
			public static WebElement more(){
				hover.perform();
				try{
					product = driver.findElement(By.xpath("//*[@id='" + active() + "']/li[5]/div/div[2]/div[2]/a[2]"));
				}catch(NoSuchElementException e){
					log.error("Could not find Printed Summer Dress-Long - more");
					throw e;
				}	
				log.info("Returned Printed Summer Dress-Long - more");
				return product;		
			}
		}
	}
	public static class ContainerButton{

		public static WebElement contButton;

		public static WebElement Cont1(){
			try{
				contButton = driver.findElement(By.xpath("//*[@id='htmlcontent_home']/ul/li[1]/a/img"));
			} catch(NoSuchElementException e){
				log.error("Could not find element cont1");
				throw e;
			}
			wait.until(ExpectedConditions.elementToBeClickable(contButton));
			log.info("Returned cont1");
			return contButton;
		}

		public static WebElement Cont2(){
			try{

				contButton = driver.findElement(By.xpath("//*[@id='htmlcontent_home']/ul/li[2]/a/img"));
			} catch(NoSuchElementException e){
				log.error("Could not find element Cont2");
				throw e;
			}
			wait.until(ExpectedConditions.elementToBeClickable(contButton));
			log.info("Returned cont2");
			return contButton;
		}

		public static WebElement Cont3(){
			try{
				contButton = driver.findElement(By.xpath("//*[@id='htmlcontent_home']/ul/li[3]/a/img"));
			} catch(NoSuchElementException e){
				log.error("Could not find element cont3");
				throw e;
			}
			wait.until(ExpectedConditions.elementToBeClickable(contButton));
			log.info("Returned cont3");
			return contButton;
		}

		public static WebElement Cont4(){
			try{
				contButton = driver.findElement(By.xpath("//*[@id='htmlcontent_home']/ul/li[4]/a/img"));
			} catch(NoSuchElementException e){
				log.error("Could not find element cont4");
				throw e;
			}
			wait.until(ExpectedConditions.elementToBeClickable(contButton));
			log.info("Returned cont4");
			return contButton;
		}

		public static WebElement Cont5(){
			try{
				contButton = driver.findElement(By.xpath("//*[@id='htmlcontent_home']/ul/li[5]/a/img"));
			} catch(NoSuchElementException e){
				log.error("Could not find element cont5");
				throw e;
			}
			wait.until(ExpectedConditions.elementToBeClickable(contButton));
			log.info("Returned cont5");
			return contButton;
		}

	}

	public static class Footer{

		private static WebElement fotterElement;

		public static class Newsletter{

			public static WebElement inputBox(){
				try{
					fotterElement = driver.findElement(By.id("newsletter-input"));
				} catch(NoSuchElementException e){
					log.error("Could not find element newsletter");
					throw e;
				}
				wait.until(ExpectedConditions.elementToBeClickable(fotterElement));
				log.info("returned newsletter");
				return fotterElement;
			}

			public static WebElement submit_btn(){
				try{
					fotterElement = driver.findElement(By.xpath("//*[@id='newsletter_block_left']/div/form/div/button"));
				} catch(NoSuchElementException e){
					log.error("Could not find element newsletter submit button");
					throw e;
				}
				wait.until(ExpectedConditions.elementToBeClickable(fotterElement));
				log.info("returned newsletter submit button");
				return fotterElement;

			}
		}

		public static WebElement facebook(){
			try{
				fotterElement = driver.findElement(By.xpath("//*[@id='social_block']/ul/li[1]/a"));
			} catch(NoSuchElementException e){
				log.error("Could not find element facebook");
				throw e;
			}
			wait.until(ExpectedConditions.elementToBeClickable(fotterElement));
			log.info("returned facebook");
			return fotterElement;

		}

		public static WebElement twitter(){
			try{							
				fotterElement = driver.findElement(By.xpath("//*[@id='social_block']/ul/li[2]/a"));
			} catch(NoSuchElementException e){
				log.error("Could not find element twitter");
				throw e;
			}
			wait.until(ExpectedConditions.elementToBeClickable(fotterElement));
			log.info("returned twitter");
			return fotterElement;

		}

		public static WebElement youTube(){
			try{					
				fotterElement = driver.findElement(By.xpath("//*[@id='social_block']/ul/li[3]/a"));
			} catch(NoSuchElementException e){
				log.error("Could not find element youtube");
				throw e;
			}
			wait.until(ExpectedConditions.elementToBeClickable(fotterElement));
			log.info("returned youtube");
			return fotterElement;
		}

		public static WebElement google(){
			try{
				fotterElement = driver.findElement(By.xpath("//*[@id='social_block']/ul/li[4]/a"));
			} catch(NoSuchElementException e){
				log.error("Could not find element google");
				throw e;
			}
			wait.until(ExpectedConditions.elementToBeClickable(fotterElement));
			log.info("returned google");
			return fotterElement;

		}

		public static WebElement women(){

			try{
				fotterElement = driver.findElement(By.xpath("//*[@id='footer']/div/section[2]/div/div/ul/li/a"));
			} catch(NoSuchElementException e){
				log.error("Could not find element footer - women");
				throw e;
			}
			wait.until(ExpectedConditions.elementToBeClickable(fotterElement));
			log.info("returned footer - women");
			return fotterElement;

		}

		public static WebElement specials(){

			try{
				fotterElement = driver.findElement(By.linkText("Specials"));
			} catch(NoSuchElementException e){
				log.error("Could not find element footer - specials");
				throw e;
			}
			wait.until(ExpectedConditions.elementToBeClickable(fotterElement));
			log.info("returned footer - specials");
			return fotterElement;

		}

		public static WebElement newProducts(){

			try{
				fotterElement = driver.findElement(By.linkText("New products"));
			} catch(NoSuchElementException e){
				log.error("Could not find element footer - new products");
				throw e;
			}
			wait.until(ExpectedConditions.elementToBeClickable(fotterElement));
			log.info("returned footer - new products");
			return fotterElement;

		}

		public static WebElement bestSellers(){

			try{
				fotterElement = driver.findElement(By.xpath("//*[@id='block_various_links_footer']/ul/li[3]/a"));
			} catch(NoSuchElementException e){
				log.error("Could not find element footer - best sellers");
				throw e;
			}
			wait.until(ExpectedConditions.elementToBeClickable(fotterElement));
			log.info("returned footer - best sellers");
			return fotterElement;

		}
		
		public static WebElement ourStores(){

			try{
				fotterElement = driver.findElement(By.linkText("Our stores"));
			} catch(NoSuchElementException e){
				log.error("Could not find element footer - new products");
				throw e;
			}
			wait.until(ExpectedConditions.elementToBeClickable(fotterElement));
			log.info("returned footer - new products");
			return fotterElement;

	}
		
		public static WebElement contactUs(){

			try{
				fotterElement = driver.findElement(By.linkText("Contact us"));
			} catch(NoSuchElementException e){
				log.error("Could not find element footer - Contact us");
				throw e;
			}
			wait.until(ExpectedConditions.elementToBeClickable(fotterElement));
			log.info("returned footer - Contact us");
			return fotterElement;

	}
		
		public static WebElement termsCond(){

			try{
				fotterElement = driver.findElement(By.linkText("Terms and conditions of use"));
			} catch(NoSuchElementException e){
				log.error("Could not find element footer - Terms and conditions of use");
				throw e;
			}
			wait.until(ExpectedConditions.elementToBeClickable(fotterElement));
			log.info("returned footer - Terms and conditions of use");
			return fotterElement;

	}
		
		public static WebElement about(){

			try{
				fotterElement = driver.findElement(By.linkText("About us"));
			} catch(NoSuchElementException e){
				log.error("Could not find element footer - About us");
				throw e;
			}
			wait.until(ExpectedConditions.elementToBeClickable(fotterElement));
			log.info("returned footer - About us");
			return fotterElement;

	}
		
		public static WebElement sitemap(){

			try{
				fotterElement = driver.findElement(By.linkText("Sitemap"));
			} catch(NoSuchElementException e){
				log.error("Could not find element footer - Sitemap");
				throw e;
			}
			wait.until(ExpectedConditions.elementToBeClickable(fotterElement));
			log.info("returned footer - Sitemap");
			return fotterElement;

	}
		
		public static WebElement myAccount(){

			try{
				fotterElement = driver.findElement(By.linkText("My account"));
			} catch(NoSuchElementException e){
				log.error("Could not find element footer - My account");
				throw e;
			}
			wait.until(ExpectedConditions.elementToBeClickable(fotterElement));
			log.info("returned footer - My account");
			return fotterElement;

	}
		
		public static WebElement myOrders(){

			try{
				fotterElement = driver.findElement(By.linkText("My orders"));
			} catch(NoSuchElementException e){
				log.error("Could not find element footer - My orders");
				throw e;
			}
			wait.until(ExpectedConditions.elementToBeClickable(fotterElement));
			log.info("returned footer - My orders");
			return fotterElement;

	}
		
		public static WebElement myCreditSlips(){

			try{
				fotterElement = driver.findElement(By.linkText("My credit slips"));
			} catch(NoSuchElementException e){
				log.error("Could not find element footer - My credit slips");
				throw e;
			}
			wait.until(ExpectedConditions.elementToBeClickable(fotterElement));
			log.info("returned footer - My credit slips");
			return fotterElement;

	}

		public static WebElement myAdresses(){

			try{
				fotterElement = driver.findElement(By.linkText("My addresses"));
			} catch(NoSuchElementException e){
				log.error("Could not find element footer - My addresses");
				throw e;
			}
			wait.until(ExpectedConditions.elementToBeClickable(fotterElement));
			log.info("returned footer - My addresses");
			return fotterElement;

	}
		
		public static WebElement myPersonalInfo(){

			try{
				fotterElement = driver.findElement(By.linkText("My personal info"));
			} catch(NoSuchElementException e){
				log.error("Could not find element footer - My personal info");
				throw e;
			}
			wait.until(ExpectedConditions.elementToBeClickable(fotterElement));
			log.info("returned footer - My personal info");
			return fotterElement;

	}
		
		public static WebElement skype(){

			try{
				fotterElement = driver.findElement(By.xpath("//*[@id='block_contact_infos']/div/ul/li[2]/span"));
			} catch(NoSuchElementException e){
				log.error("Could not find element footer - skype");
				throw e;
			}
			wait.until(ExpectedConditions.elementToBeClickable(fotterElement));
			log.info("returned footer - skype");
			return fotterElement;

	}
		
		public static WebElement email(){

			try{
				fotterElement = driver.findElement(By.xpath("//*[@id='block_contact_infos']/div/ul/li[3]/span/a"));
			} catch(NoSuchElementException e){
				log.error("Could not find element footer - email");
				throw e;
			}
			wait.until(ExpectedConditions.elementToBeClickable(fotterElement));
			log.info("returned footer - email");
			return fotterElement;

	}
}
}











