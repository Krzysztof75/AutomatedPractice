package PageObjects;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Utility.emailGenerator;
import Utility.Camera;

import com.google.common.base.Predicate;

public class test {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.automationpractice.com");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		
		HomePage page1 = new HomePage(driver);
		LogInPage page2 = new LogInPage(driver);
		
		 System.out.println(HomePage.ContainerTop.validatePopular());
		 
		  HomePage.ContainerTop.tabBestSellers().click();
//		  Utility.ExplicitWait.setInSeconds(driver, 5).until(ExpectedConditions.elementToBeSelected(HomePage.ContainerTop.tabBestSellers()));
//		  Utility.Camera.takePicture(driver);
		  System.out.println(HomePage.ContainerTop.validateBestSeller());
	  
		
// Fluent wait with custom predicate to conform the correct working of a slider
		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
//		wait.withTimeout(10, TimeUnit.SECONDS);
//		wait.pollingEvery(300, TimeUnit.MILLISECONDS);
//		wait.ignoring(NoSuchElementException.class);
//		wait.ignoring(StaleElementReferenceException.class);
//		
//
//		Predicate<WebDriver> s = new Predicate<WebDriver>(){
//
//			boolean t1;
//			boolean t2;
//			boolean t3;
//
//			public boolean apply(WebDriver driver) {
//				
//				if(driver.findElement(By.xpath("//*[@id='homeslider']/li[2]/a")).isDisplayed()){
//					t1 = true;
//					System.out.println(driver.findElement(By.xpath("//*[@id='homeslider']/li[2]/a")).getAttribute("title"));
//					
//				}
//				if(driver.findElement(By.xpath("//*[@id='homeslider']/li[3]/a")).isDisplayed()){
//					t2 = true;
//					System.out.println(driver.findElement(By.xpath("//*[@id='homeslider']/li[3]/a")).getAttribute("title"));
//					
//				}
//				if(driver.findElement(By.xpath("//*[@id='homeslider']/li[4]/a")).isDisplayed()){
//					t3 = true;
//					System.out.println(driver.findElement(By.xpath("//*[@id='homeslider']/li[4]/a")).getAttribute("title"));
//					
//				}
//
//				if(t1 && t2 && t3){
//					return true;
//				}else
//				System.out.println("t1 " + t1 + " t2 " + t2 + " t3 " + t3);
//					return false;
//				
//
//			}
//	};
//	
//	wait.until(s);
		
		// Check Manual working of the slider

//		WebElement element1 = driver.findElement(By.xpath("//*[@id='homeslider']/li[2]/a"));
//		wait.until(ExpectedConditions.visibilityOf(element1));
//		System.out.println("First image on the slider displayed");
//		HomePage.ContainerTop.sliderNext().click();
//		Thread.sleep(500);
//		WebElement element2 = driver.findElement(By.xpath("//*[@id='homeslider']/li[3]/a"));
//		wait.until(ExpectedConditions.visibilityOf(element2));
//		if(driver.findElement(By.xpath("//*[@id='homeslider']/li[3]/a")).isDisplayed()){
//		System.out.println("Slider-next: Second image on the slider displayed");
//		}
//		HomePage.ContainerTop.sliderNext().click();
//		Thread.sleep(500);
//		WebElement element3 = driver.findElement(By.xpath("//*[@id='homeslider']/li[4]/a"));
//		wait.until(ExpectedConditions.visibilityOf(element3));
//		if(driver.findElement(By.xpath("//*[@id='homeslider']/li[4]/a")).isDisplayed()){
//		System.out.println("Slider-next: Third image on the slider displayed");
//		}
//		HomePage.ContainerTop.sliderPrev().click();
//		Thread.sleep(500);
//		wait.until(ExpectedConditions.visibilityOf(element2));
//		if(driver.findElement(By.xpath("//*[@id='homeslider']/li[3]/a")).isDisplayed()){
//		System.out.println("Slider-prev: Second image on the slider displayed");
//		}
//		HomePage.ContainerTop.sliderPrev().click();
//		Thread.sleep(500);
//		wait.until(ExpectedConditions.visibilityOf(element1));
//		if(driver.findElement(By.xpath("//*[@id='homeslider']/li[2]/a")).isDisplayed()){
//		System.out.println("Slider-prev: First image on the slider displayed");
//		}
//		System.out.println("Manual slider control working correctly");

		// Confirm elements in the Header are located
		
//					System.out.println(HomePage.Header.contactUs().getText());
//					System.out.println(HomePage.Header.cart().getText());
//					System.out.println(HomePage.Header.LogIn().getText());
//					System.out.println(HomePage.Header.searchBox().getAttribute("name"));
//					System.out.println(HomePage.Header.search().getAttribute("name"));
//					System.out.println(HomePage.Header.tShirts().getAttribute("title"));
//					System.out.println(HomePage.Header.women().getText());
//					System.out.println(HomePage.Header.women("Tops").getText());
//					System.out.println(HomePage.Header.women("T-SHIRTS").getText());
//					System.out.println(HomePage.Header.women("Blouses").getText());
//					System.out.println(HomePage.Header.women("Dresses").getText());
//					System.out.println(HomePage.Header.women("Casual dresses").getText());
//					System.out.println(HomePage.Header.women("Evening dresses").getText());
//					System.out.println(HomePage.Header.women("Summer dresses").getText());
//					System.out.println(HomePage.Header.dresses().getAttribute("title"));
//					System.out.println(HomePage.Header.dresses("casual dresses").getText());
//					System.out.println(HomePage.Header.dresses("evening dresses").getText());
//					System.out.println(HomePage.Header.dresses("summer dresses").getText());
		
		// confirm ContainerTop elements located
		
//					System.out.println(HomePage.ContainerTop.slider().getAttribute("title"));
//					System.out.println(HomePage.ContainerTop.shopNow().getText());
//					System.out.println(HomePage.ContainerTop.sliderNext().getText());
//					System.out.println(HomePage.ContainerTop.sliderPrev().getText());
//					System.out.println(HomePage.ContainerTop.contentTop().getAttribute("class"));
//					System.out.println(HomePage.ContainerTop.contentButton().getAttribute("class"));
//					HomePage.ContainerTop.tabBestSellers().click();
//					Thread.sleep(2000);
//					HomePage.ContainerTop.tabPopular().click();
//					Thread.sleep(2000);
		
			// confirm Products elements are located
		
//		System.out.println(HomePage.prop.get("Blouse_price_xpath"));
		
//				    System.out.println("title " + HomePage.Product.Blouse.title());
//				    System.out.println("price " + HomePage.Product.Blouse.price());
//				    System.out.println("image title " + HomePage.Product.Blouse.image().getAttribute("title")); 
					// getting the alt attribute from the image element 
//					JavascriptExecutor js = (JavascriptExecutor)driver;
//				    final String scriptGetChecked = "return arguments[0].getAttribute('alt')";
//				    WebElement image1 = HomePage.Product.Blouse.image();
//				    String alt1 = (String) js.executeScript(scriptGetChecked, image1);
//				    System.out.println("Image Alt " + alt1);
//				    System.out.println(HomePage.Product.Blouse.addToCart().getAttribute("title"));
//				    System.out.println(HomePage.Product.Blouse.more().getAttribute("title") + "\n");  
//				    System.out.println("title " + HomePage.Product.FadedShortSleeveTshirts.title());
//				    System.out.println("price " + HomePage.Product.FadedShortSleeveTshirts.price());
//				    System.out.println("image title " + HomePage.Product.FadedShortSleeveTshirts.image().getAttribute("title"));
//				    WebElement image2 = HomePage.Product.FadedShortSleeveTshirts.image();
//				    String alt2 = (String) js.executeScript(scriptGetChecked, image2);
//				    System.out.println("Image Alt" + alt2);
//				    System.out.println(HomePage.Product.FadedShortSleeveTshirts.addToCart().getAttribute("title"));
//				    System.out.println(HomePage.Product.FadedShortSleeveTshirts.more().getAttribute("title") + "\n");  
//				    System.out.println("title " + HomePage.Product.PrintedChiffonDress.title());
//				    System.out.println("price " + HomePage.Product.PrintedChiffonDress.price());
//				    System.out.println("image title " + HomePage.Product.PrintedChiffonDress.image().getAttribute("title"));
//				    WebElement image3 = HomePage.Product.PrintedChiffonDress.image();
//				    String alt3 = (String) js.executeScript(scriptGetChecked, image3);
//				    System.out.println("Image Alt " + alt3);
//				    System.out.println(HomePage.Product.PrintedChiffonDress.addToCart().getAttribute("title"));
					
//				    System.out.println(HomePage.Product.PrintedChiffonDress.more().getAttribute("title") + "\n");   
//				    System.out.println("title " + HomePage.Product.PrintedDressShort.title());
//				    System.out.println("price " + HomePage.Product.PrintedDressShort.price());
//				    System.out.println("image title " + HomePage.Product.PrintedDressShort.image().getAttribute("title"));
//				    WebElement image4 = HomePage.Product.PrintedDressShort.image();
//				    String alt4 = (String) js.executeScript(scriptGetChecked, image4);
//				    System.out.println("Image Alt " + alt4);
//				    System.out.println(HomePage.Product.PrintedDressShort.addToCart().getAttribute("title"));
//				    System.out.println(HomePage.Product.PrintedDressShort.more().getAttribute("title") + "\n");
				    
//				    System.out.println("title " + HomePage.Product.PrintedDressLong.title());
//				    System.out.println("price " + HomePage.Product.PrintedDressLong.price());
//				    System.out.println("image title " + HomePage.Product.PrintedDressLong.image().getAttribute("title"));
//				    WebElement image5 = HomePage.Product.PrintedDressLong.image();
//				    String alt5 = (String) js.executeScript(scriptGetChecked, image5);
//				    System.out.println("Image Alt " + alt5);
//				    System.out.println(HomePage.Product.PrintedDressLong.addToCart().getAttribute("title"));
//				    System.out.println(HomePage.Product.PrintedDressLong.more().getAttribute("title") + "\n");
				    
//				    System.out.println("title " + HomePage.Product.PrintedSummerDressShort.title());
//				    System.out.println("price " + HomePage.Product.PrintedSummerDressShort.price());
//				    System.out.println("image title " + HomePage.Product.PrintedSummerDressShort.image().getAttribute("title"));
//				    WebElement image6 = HomePage.Product.PrintedSummerDressShort.image();
//				    String alt6 = (String) js.executeScript(scriptGetChecked, image6);
//				    System.out.println("Image Alt " + alt6);
//				    System.out.println(HomePage.Product.PrintedSummerDressShort.addToCart().getAttribute("title"));
//				    System.out.println(HomePage.Product.PrintedSummerDressShort.more().getAttribute("title") + "\n");
//				    
//				    System.out.println("title " + HomePage.Product.PrintedSummerDressLong.title());
//				    System.out.println("price " + HomePage.Product.PrintedSummerDressLong.price());
//				    System.out.println("image title " + HomePage.Product.PrintedSummerDressLong.image().getAttribute("title"));
//				    WebElement image7 = HomePage.Product.PrintedSummerDressLong.image();
//				    String alt7 = (String) js.executeScript(scriptGetChecked, image7);
//				    System.out.println("Image Alt " + alt7);
//				    System.out.println(HomePage.Product.PrintedSummerDressLong.addToCart().getAttribute("title"));
//				    System.out.println(HomePage.Product.PrintedSummerDressLong.more().getAttribute("title") + "\n");

		// confirm ContainerButton elements located
		
//					System.out.println(HomePage.ContainerButton.Cont1().getAttribute("outerHTML"));
//					System.out.println(HomePage.ContainerButton.Cont2().getAttribute("outerHTML"));
//					System.out.println(HomePage.ContainerButton.Cont3().getAttribute("outerHTML"));
//					System.out.println(HomePage.ContainerButton.Cont4().getAttribute("outerHTML"));
//					System.out.println(HomePage.ContainerButton.Cont5().getAttribute("outerHTML"));

		// confirm Footer elements located
		
//					System.out.println(HomePage.Footer.Newsletter.inputBox().getAttribute("id"));
//					System.out.println(HomePage.Footer.Newsletter.submit_btn().getAttribute("name"));
//					System.out.println(HomePage.Footer.women().getAttribute("title"));
//					System.out.println(HomePage.Footer.specials().getAttribute("title"));
//					System.out.println(HomePage.Footer.newProducts().getAttribute("title"));
//					System.out.println(HomePage.Footer.bestSellers().getAttribute("title"));
//					System.out.println(HomePage.Footer.ourStores().getAttribute("title"));
//					System.out.println(HomePage.Footer.contactUs().getAttribute("title"));
//					System.out.println(HomePage.Footer.termsCond().getAttribute("title"));
//					System.out.println(HomePage.Footer.about().getAttribute("title"));
//					System.out.println(HomePage.Footer.sitemap().getAttribute("title"));
//					System.out.println(HomePage.Footer.myAccount().getAttribute("title"));
//					System.out.println(HomePage.Footer.myOrders().getAttribute("title"));
//					System.out.println(HomePage.Footer.myCreditSlips().getAttribute("title"));
//					System.out.println(HomePage.Footer.myAdresses().getAttribute("title"));
//					System.out.println(HomePage.Footer.myPersonalInfo().getAttribute("title"));
//					System.out.println(HomePage.Footer.skype().getAttribute("innerHTML"));
//					System.out.println(HomePage.Footer.email().getAttribute("innerHTML"));





				// confirm tabs popular, bestseller work

//					HomePage.ContainerTop.tabPopular().click();
//					System.out.println("Popular validated " + HomePage.ContainerTop.validatePopular());
//					
//					HomePage.ContainerTop.tabBestSellers().click();
//					
//					System.out.println("BestSelers validated " + HomePage.ContainerTop.validateBestSeller());
		
		// confirm LogInPage elements work
		
//		HomePage.Header.LogIn().click();
//		
//        System.out.println(LogInPage.emailCreateBox().getAttribute("name"));
//        System.out.println(LogInPage.emailSignInBox().getAttribute("name"));
//        System.out.println(LogInPage.password().getAttribute("name"));
//        System.out.println(LogInPage.create_btn().getText());
//        
//        LogInPage.emailCreateBox().sendKeys("22@hotmail.com");
//		LogInPage.create_btn().click();
        
		// these elements will become visible only if email entered and create_btn clicked
		
//        System.out.println(LogInPage.title("mr").getAttribute("name"));
//        System.out.println(LogInPage.addInfo().getAttribute("name"));
//        System.out.println(LogInPage.address1().getAttribute("name"));
//        System.out.println(LogInPage.address2().getAttribute("name"));
//        System.out.println(LogInPage.alias().getAttribute("name"));
//        System.out.println(LogInPage.city().getAttribute("name"));
//        System.out.println(LogInPage.company().getAttribute("name"));
//        js.executeScript("document.getElementById('passwd').scrollIntoView(true);");
//        System.out.println(LogInPage.country("").getAttribute("name"));
//        System.out.println(LogInPage.days("0").getAttribute("id"));
//        System.out.println(LogInPage.months("0").getAttribute("id"));
//        System.out.println(LogInPage.years("0").getAttribute("id"));
//        System.out.println(LogInPage.firstName1().getAttribute("name"));
//        System.out.println(LogInPage.firstName2().getAttribute("name"));
//        System.out.println(LogInPage.lastName1().getAttribute("name"));
//        System.out.println(LogInPage.lastName2().getAttribute("name"));
//        System.out.println(LogInPage.phone().getAttribute("name"));
//        System.out.println(LogInPage.phoneMobile().getAttribute("name"));
//        System.out.println(LogInPage.postcode().getAttribute("name"));
//        System.out.println(LogInPage.state("").getAttribute("id"));
        
//        LogInPage.days("-1");
//        LogInPage.months("1");
//        LogInPage.years("1900");
//        Thread.sleep(2000);
//        LogInPage.days("20");
//        LogInPage.months("13");
//        LogInPage.years("2015");
//        Thread.sleep(2000);
//        LogInPage.days("32");
//        LogInPage.months("12");
//        LogInPage.years("1990");
//        Thread.sleep(2000);
//        LogInPage.days("1");
//        LogInPage.months("-10");
//        LogInPage.years("-2000");
//        Thread.sleep(2000);
//        LogInPage.days("31");
//        LogInPage.months("0");
//        LogInPage.years("0");
//        Thread.sleep(2000);
        
//        LogInPage.title("mr").click();
//        LogInPage.title("mrs").click();
//        LogInPage.firstName1().sendKeys("kris");
//        LogInPage.lastName1().sendKeys("gil");
//        LogInPage.email().clear();
//        LogInPage.email().sendKeys("email@lala.com");
//        LogInPage.password().sendKeys("password");
//        LogInPage.days("15");
//        LogInPage.months("5");
//        LogInPage.years("2005");
//        LogInPage.firstName2().sendKeys("firstName2");
//        LogInPage.lastName2().sendKeys("lastName2");
//        LogInPage.company().sendKeys("company");
//        LogInPage.address1().sendKeys("adress");
//        LogInPage.address2().sendKeys("adress2");
//        LogInPage.city().sendKeys("city");
//        LogInPage.state("1.0");
//        Thread.sleep(2000);
//        LogInPage.state("5.0");
//        Thread.sleep(2000);
//        LogInPage.state("10.0");
//        Thread.sleep(2000);
//        LogInPage.state("3");
//        Thread.sleep(2000);
//        LogInPage.state("50");
//        Thread.sleep(2000);
//        LogInPage.state("0");
//        LogInPage.postcode().sendKeys("00000");
//        LogInPage.country("21");
//        LogInPage.addInfo().sendKeys("additional info");
//        LogInPage.phone().sendKeys("018416274");
//        LogInPage.phoneMobile().sendKeys("0871633678");
//        LogInPage.alias().clear();
//        LogInPage.alias().sendKeys("alias");
		
//		System.out.println(emailGenerator.generateEmail());
//		System.out.println(emailGenerator.generateEmail());
//		System.out.println(emailGenerator.generateEmail());
//		System.out.println(emailGenerator.generateEmail());
//		System.out.println(emailGenerator.generateEmail());
//        Thread.sleep(6000);
       
        

			driver.quit();




		}
	}
