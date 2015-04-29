package Tests;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.Assert;
import org.testng.Reporter;

import com.google.common.base.Predicate;

import PageObjects.BaseClass;
import PageObjects.HomePage;
import Utility.MyLog;

public class ValidateMainPageLinks {
	
	static WebDriver driver;
	static Logger log;
	HomePage page;
	WebDriverWait wait;
	
  @Test
  // check the right title of the page this test may be redundant can combine with other test  
  public void test1M() {
	  
	  String expectedTitle = "My Store";
	  Assert.assertEquals(HomePage.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("Opened page "+ driver.getTitle() + "|");
  }
  
  @Test
  public void test2M(){
	  HomePage.Header.contactUs().click();
	  String expectedTitle = "Contact us - My Store";
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("Contact us link ok |");
  }
  
  @Test
  public void test3M(){
	  HomePage.Header.LogIn().click();
	  String expectedTitle = "Login - My Store";
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("Login link ok |");
  }
  
  @Test
  public void test4M(){
	  driver.findElement(By.id("header_logo")).click();
	  String expectedTitle = "My Store";
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("logo link ok |");
  }
  
  @Test
  public void test5M(){
	  HomePage.Header.cart().click();
	  String expectedTitle ="Order - My Store";
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("cart link ok |");
  }
  
  @Test
  public void test6M(){
	  HomePage.Header.search().click();
	  String expectedTitle ="Search - My Store";
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("search link ok |");
  }
  
  @Test
  public void test7M(){
	  HomePage.Header.women().click();
	  String expectedTitle ="Women - My Store";
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("header-Women link ok |");
  }
  
  @Test
  public void test8M(){
	  HomePage.Header.women("tops").click();
	  String expectedTitle ="Tops - My Store";
//	  wait.until(ExpectedConditions.titleIs(expectedTitle));
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("header-tops link ok |");
  }
  
  @Test
  public void test9M(){
	  HomePage.Header.women("T-shirts").click();
	  String expectedTitle ="T-shirts - My Store";
//	  wait.until(ExpectedConditions.titleIs(expectedTitle));
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("header-t-shirts link ok |");
  }
  
  @Test
  public void test10M(){
	  wait.until(ExpectedConditions.elementToBeClickable(HomePage.Header.women("Blouses")));
	  Utility.Camera.takePicture(driver);
	  HomePage.Header.women("Blouses").click();
	  String expectedTitle ="Blouses - My Store";
//	  wait.until(ExpectedConditions.titleIs(expectedTitle));
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("header-Blouses link ok |");
  }
  
  @Test
  public void test11M(){
	  Utility.ImplicitWait.switchOff();
	  wait.until(ExpectedConditions.elementToBeClickable(HomePage.Header.women("Dresses")));
	  HomePage.Header.women("Dresses").click();
	  String expectedTitle ="Dresses - My Store";
//	  wait.until(ExpectedConditions.titleIs(expectedTitle));
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("header-Dresses link ok |");
	  Utility.ImplicitWait.switchON();
  }
  
  @Test
  public void test12M(){
	  HomePage.Header.women("Casual Dresses").click();
	  String expectedTitle ="Casual Dresses - My Store";
//	  wait.until(ExpectedConditions.titleIs(expectedTitle));
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("header-Casual Dresses link ok |");
  }
  
  @Test
  public void test13M(){
	  wait.until(ExpectedConditions.elementToBeClickable(HomePage.Header.women("Evening Dresses")));
	  HomePage.Header.women("Evening Dresses").click();
	  String expectedTitle ="Evening Dresses - My Store";
//	  wait.until(ExpectedConditions.titleIs(expectedTitle));
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("header-Evening Dresses link ok |");
  }
  
  @Test
  public void test14M(){
	  
	  HomePage.Header.women("Summer Dresses").click();
	  String expectedTitle ="Summer Dresses - My Store";
//	  wait.until(ExpectedConditions.titleIs(expectedTitle));
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("header-Summer Dresses link ok |");
  }
  
  @Test
  public void test15M(){
	  HomePage.Header.dresses().click();
	  String expectedTitle ="Dresses - My Store";
//	  wait.until(ExpectedConditions.titleIs(expectedTitle));
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("header-Dresses link ok |");
  }
  
  @Test
  public void test16M(){
	  wait.until(ExpectedConditions.elementToBeClickable(HomePage.Header.dresses("casual dresses")));
	  HomePage.Header.dresses("casual dresses").click();
	  String expectedTitle ="Casual Dresses - My Store";
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("header-Dresses-casual dresses link ok |");
  }
  
  @Test
  public void test17M(){
	  wait.until(ExpectedConditions.elementToBeClickable(HomePage.Header.dresses("evening dresses")));
	  HomePage.Header.dresses("evening dresses").click();
	  String expectedTitle ="Evening Dresses - My Store";
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("header-Dresses-evening dresses link ok |");
  }
  
  @Test
  public void test18M(){
	  wait.until(ExpectedConditions.elementToBeClickable(HomePage.Header.dresses("summer dresses")));
	  HomePage.Header.dresses("summer dresses").click();
	  String expectedTitle ="Summer Dresses - My Store";
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("header-Dresses-summer dresses link ok |");
  }
  
  @Test
  public void test19M(){
	  HomePage.Header.tShirts().click();
	  String expectedTitle ="T-shirts - My Store";
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("header-T-shirts dresses link ok |");
  }
  
  @Test
  public void test20M(){
	  HomePage.ContainerTop.slider().click();
	  String expectedTitle ="PrestaShop - Free ecommerce software";
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("Slider link ok |");
  }
  
  @Test
  public void test21M(){
	  HomePage.ContainerTop.contentTop().click();
	  String expectedTitle ="PrestaShop - Free ecommerce software";
//    wait.until(ExpectedConditions.titleIs(expectedTitle));
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("ContainerTop-contentTop link ok |");
  }
  
  @Test
  public void test22M(){
	  HomePage.ContainerTop.contentButton().click();
	  String expectedTitle ="PrestaShop - Free ecommerce software";
//	  wait.until(ExpectedConditions.titleIs(expectedTitle));
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("ContainerTop-contentButton link ok |");
  }
  
  @Test
  // check whether correct products are displayed in popular category
  public void test23M(){
	  Assert.assertTrue(HomePage.ContainerTop.validatePopular());
	  log.info("tab Popular the right products are displayed"); 
	  Reporter.log("tab popular ok |");
  }
  
  @Test
//check whether correct products are displayed in bestsellers category
  public void test24M(){
	  HomePage.ContainerTop.tabBestSellers().click();
	  Assert.assertTrue(HomePage.ContainerTop.validateBestSeller());
	  log.info("tab BestSellers the right products are displayed");
	  Reporter.log("tab bestsellers ok |");
  }
  
  @Test
  public void test25M(){
	  HomePage.ContainerButton.Cont1().click();
	  String expectedTitle ="PrestaShop - Free ecommerce software";
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("Cont1 link ok |");
  }
  
  @Test
  public void test26M(){
	  HomePage.ContainerButton.Cont2().click();
	  String expectedTitle ="PrestaShop - Free ecommerce software";
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("Cont2 link ok |");
  }
  
  @Test
  public void test27M(){
	  HomePage.ContainerButton.Cont3().click();
	  String expectedTitle ="PrestaShop - Free ecommerce software";
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("Cont3 link ok |");
  }
  
  @Test
  public void test28M(){
	  HomePage.ContainerButton.Cont4().click();
	  String expectedTitle ="PrestaShop - Free ecommerce software";
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("Cont4 link ok |");
  }
  
  @Test
  public void test29M(){
	  HomePage.ContainerButton.Cont5().click();
	  String expectedTitle ="PrestaShop - Free ecommerce software";
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("Cont5 link ok |");
  }
  
  @Test
  public void test30M(){
	  String mainHandle = driver.getWindowHandle();
	  WebElement facebook = HomePage.Footer.facebook();
	  facebook.click();
	  Set<String> handles = driver.getWindowHandles();
	  for(String handle : handles){
		  if(!handle.equals(mainHandle)){
			  driver.switchTo().window(handle);
		  }
	  }

	  String expectedTitle ="Log into Facebook | Facebook";
	  String actualTitle = driver.getTitle();
	  driver.close();
	  driver.switchTo().window(mainHandle);
	  Assert.assertEquals(actualTitle, expectedTitle);
	  log.info("facebook link ok");
	  Reporter.log("Facebook link ok |");
  }
  
  @Test
  public void test31M(){
	  WebElement twitter = HomePage.Footer.twitter();
	  twitter.click();
	  String mainHandle = driver.getWindowHandle();
	  Set<String> handles = driver.getWindowHandles();
	  for(String handle : handles){
		  if(!handle.equals(mainHandle)){
			  driver.switchTo().window(handle);
		  }
	  }
	  String expectedTitle ="Selenium Framework (@seleniumfrmwrk) | Twitter";
	  String actualTitle = driver.getTitle();
	  driver.close();
	  driver.switchTo().window(mainHandle);
	  Assert.assertEquals(actualTitle, expectedTitle);
	  log.info("twitter link ok");
	  Reporter.log("Twitter link ok |");
  }
  
  @Test
  public void test32M(){
	  WebElement youTube = HomePage.Footer.youTube();
	  youTube.click();
	  String mainHandle = driver.getWindowHandle();
	  Set<String> handles = driver.getWindowHandles();
	  for(String handle : handles){
		  if(!handle.equals(mainHandle)){
			  driver.switchTo().window(handle);
		  }
	  }
	  String expectedTitle =("Selenium Framework - YouTube");
	  String actualTitle = driver.getTitle();
	  driver.close();
	  driver.switchTo().window(mainHandle);
	  Assert.assertEquals(actualTitle, expectedTitle);
	  log.info("youtube link ok");
	  Reporter.log("Youtube link ok |");
  }
  
  @Test
  public void test33M(){
	  WebElement google = HomePage.Footer.google();
	  google.click();
	  String mainHandle = driver.getWindowHandle();
	  Set<String> handles = driver.getWindowHandles();
	  for(String handle : handles){
		  if(!handle.equals(mainHandle)){
			  driver.switchTo().window(handle);
		  }
	  }
	  String expectedTitle =("Selenium Framework - Google+");
	  String actualTitle = driver.getTitle();
	  driver.close();
	  driver.switchTo().window(mainHandle);
	  Assert.assertEquals(actualTitle, expectedTitle);
	  log.info("google link ok");
	  Reporter.log("Google link ok |");
  }
  
  @Test
  public void test34M(){
	  HomePage.Footer.women().click();
	  String expectedTitle ="Women - My Store";
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("Footer-women link ok |");
  }
  
  @Test
  public void test35M(){
	  HomePage.Footer.specials().click();
	  String expectedTitle ="Prices drop - My Store";
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("Footer-specials link ok |");
  }
  
  @Test
  public void test36M(){
	  HomePage.Footer.newProducts().click();
	  String expectedTitle ="New products - My Store";
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("Footer-New Products link ok |");
  }
  
  @Test
  public void test37M(){
	  HomePage.Footer.bestSellers().click();
	  String expectedTitle ="Best sales - My Store";
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("Footer-Best sales link ok |");
  }
  @Test
  public void test38M(){
	  HomePage.Footer.ourStores().click();
	  String expectedTitle ="Stores - My Store";
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("Footer - our stores link ok |");
  }
  @Test
  public void test39M(){
	  HomePage.Footer.contactUs().click();
	  String expectedTitle ="Contact us - My Store";
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("Footer-contact us link ok |");
  }
  @Test
  public void test40M(){
	  HomePage.Footer.termsCond().click();
	  String expectedTitle ="Terms and conditions of use - My Store";
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("Footer-terms and conditions link ok |");
  }
  @Test
  public void test41M(){
	  HomePage.Footer.about().click();
	  String expectedTitle ="About us - My Store";
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("Footer-about link ok |");
  }
  @Test
  public void test42M(){
	  HomePage.Footer.sitemap().click();
	  String expectedTitle ="Sitemap - My Store";
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("Footer-site map link ok |");
  }
  @Test
  public void test43M(){
	  HomePage.Footer.myAccount().click();
	  String expectedTitle ="Login - My Store";
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("Footer-myAccount map link ok |");
  }
  
  public void test44M(){
	  HomePage.Footer.myOrders().click();
	  String expectedTitle ="Login - My Store";
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("Footer-my orders link ok |");
  }
  @Test
  public void test45M(){
	  HomePage.Footer.myCreditSlips().click();
	  String expectedTitle ="Login - My Store";
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("Footer-my credit slips link ok |");
  }
  @Test
  public void test46M(){
	  HomePage.Footer.myAdresses().click();
	  String expectedTitle ="Login - My Store";
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("Footer-my adresses link ok |");
  }
  @Test
  public void test47M(){
	  HomePage.Footer.myPersonalInfo().click();
	  String expectedTitle ="Login - My Store";
	  Assert.assertEquals(driver.getTitle(), expectedTitle);
	  log.info("correct page title: " + driver.getTitle());
	  Reporter.log("Footer-my personal info link ok |");
  }
  
  @Test
  public void test1S(){
	  
	    FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(10, TimeUnit.SECONDS);
		wait.pollingEvery(1500, TimeUnit.MILLISECONDS);
		wait.ignoring(NoSuchElementException.class);
		wait.ignoring(StaleElementReferenceException.class);

		Predicate<WebDriver> s = new Predicate<WebDriver>(){

			boolean t1;
			boolean t2;
			boolean t3;

			public boolean apply(WebDriver driver) {
				
				if(driver.findElement(By.xpath("//*[@id='homeslider']/li[2]/a/img")).isDisplayed()){
					t1 = true;
					
				}
				if(driver.findElement(By.xpath("//*[@id='homeslider']/li[3]/a/img")).isDisplayed()){
					t2 = true;
					
				}
				if(driver.findElement(By.xpath("//*[@id='homeslider']/li[4]/a/img")).isDisplayed()){
					t3 = true;
					
				}

				if(t1 && t2 && t3){
					
					return true;
					
				}else{
				
					return false;
				}
			}
	};
	
	wait.until(s);
	log.info("All the picures are displayed on the slider");
	Reporter.log("Slider displays all the expected pictures |");
  }
  
  @Test
  public void test2S(){
	  
//	  FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
//		wait.withTimeout(8, TimeUnit.SECONDS);
//		wait.pollingEvery(300, TimeUnit.MILLISECONDS);
//		wait.ignoring(NoSuchElementException.class);
//		wait.ignoring(StaleElementReferenceException.class);

//		Predicate<WebDriver> s = new Predicate<WebDriver>(){
//
//			public boolean apply(WebDriver driver) {
//				
//				if(driver.findElement(By.xpath("//*[@id='homeslider']/li[2]/a/img")).isDisplayed()){
//					
//					return true;
//					
//				}else{
//				
//					return false;
//				}
//			}
//	};
//	
//	wait.until(s);
	
	Utility.ImplicitWait.switchOff();
	Utility.ExplicitWait.setInSeconds(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='homeslider']/li[2]/a")));
	Assert.assertTrue(driver.findElement(By.xpath("//*[@id='homeslider']/li[2]/a")).isDisplayed());
	log.info("First image on the slider displayed");
	HomePage.ContainerTop.sliderNext().click();
	
	Utility.ExplicitWait.setInSeconds(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='homeslider']/li[3]/a")));
	Assert.assertTrue(driver.findElement(By.xpath("//*[@id='homeslider']/li[3]/a")).isDisplayed());
	log.info("Slider-next: Second image on the slider displayed");
	HomePage.ContainerTop.sliderNext().click();
	
	Utility.ExplicitWait.setInSeconds(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='homeslider']/li[4]/a")));
	Assert.assertTrue(driver.findElement(By.xpath("//*[@id='homeslider']/li[4]/a")).isDisplayed());
	log.info("Slider-next: Third image on the slider displayed");
	HomePage.ContainerTop.sliderPrev().click();
	
	Utility.ExplicitWait.setInSeconds(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='homeslider']/li[3]/a")));
	Assert.assertTrue(driver.findElement(By.xpath("//*[@id='homeslider']/li[3]/a")).isDisplayed());
	log.info("Slider-prev: Second image on the slider displayed");
	HomePage.ContainerTop.sliderPrev().click();
	
	Utility.ExplicitWait.setInSeconds(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='homeslider']/li[2]/a")));
	Assert.assertTrue(driver.findElement(By.xpath("//*[@id='homeslider']/li[2]/a")).isDisplayed());
	log.info("Slider-prev: First image on the slider displayed");
	Reporter.log("Slider manual function correct | ");
	Utility.ImplicitWait.switchON();
}
	  
  
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
	  if(!driver.getTitle().equalsIgnoreCase("My Store"));
	  driver.navigate().back();
//	  Utility.ExplicitWait.setInSeconds(driver, 5).until(ExpectedConditions.titleIs("My Store"));
  }

  @BeforeTest
  @Parameters ({"browserName"})
  public void beforeTest(String browserName) {
	  
	  log = LogManager.getLogger(ValidateMainPageLinks.class.getName());
	  DOMConfigurator.configure("log4j.xml");
	  ProfilesIni profile = new ProfilesIni();
	  
	  switch(browserName)
		{
		case "IE":
			driver = new InternetExplorerDriver();
			log.info("Instantiated Internet Explorere driver");
			break;
		case "FF":		
			FirefoxProfile ffprofile = profile.getProfile("SeleniumTest");
			driver = new FirefoxDriver(ffprofile);
			log.info("Instantiated Firefox driver");
			break;
		case "CH":
			driver = new ChromeDriver();
			log.info("Instantiated Chrome driver");
			break;
		}
	  driver.manage().window().maximize();
	  new Utility.ImplicitWait(driver, 15);
	  wait = Utility.ExplicitWait.setInSeconds(driver, 10);
	  driver.get("http://www.automationpractice.com/");	
	  
	  page = new HomePage(driver);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  log.info("Closing driver");
  }

}
