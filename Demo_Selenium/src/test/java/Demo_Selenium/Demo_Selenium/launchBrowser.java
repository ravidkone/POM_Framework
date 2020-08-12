package Demo_Selenium.Demo_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launchBrowser {

	public static void main(String[] args) throws Exception {
		// 1.We have to launch browser
		// a. Downloading the driver exe file for the desired browser --> chrome browser
		// b. <artifactId>selenium-server</artifactId> <version>3.141.5</version> --> added to maven file
		WebDriver driver = null;
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hanuma\\Downloads\\chromedriver_win32_2020\\chromedriver.exe");
		driver = new ChromeDriver(); //--> This should launch my chrome browser. Make sure chrome browser should be there in your machine
		//2.you have to navigate to some url --> www.google.com
		driver.get("https://www.google.com");
		
		//3. maximize your window
		driver.manage().window().maximize();
		// Tekarch portal, google , gmail application, www.gmail.com, dev-gmail.com, qa02-gmail.com, qa01-gmail.com 
		driver.get("https://qa-tekarch.firebaseapp.com/"); 
		//it is first taking to some page and then redirecting back to login screen
		// learn more of our selenium concepts
		//how to take elements and then adding it to locators
		//chropath --> tool
		// chromdev tool --> you guys get to know how to select an element using chromedev tool
		// from there you know how to inspect also
		//seeing the implementation of that page
		// id is unique and preferable --> 
		
		//element="value"  locator = id
		//xapth
		
		//Send values to the box
		//you have to write xpath --> proper locators are not available. order -->
		//use that direction to reach you
		//1. starting from his resturant to till your house --> one way.
		//2. Best known place near to your home and you can ask him to navigate from there
		//xpath should match only one element
		
		//implicit wait will be applicable for all the driver object. We ahave used global wait condetions
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// wait 30 seconds, 300 mille seconds
		
		//Thread.sleep(5000); //--> early stage answer waits till topics to cover
		//EmailID: admin123@gmail.com
		//Password: admin123
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email_field"))));
		
		driver.findElement(By.id("email_field")).sendKeys("admin123@gmail.com");
		//driver.findElement(By.xpath("//input[@placeholder='Email...']")).click();
		//driver.findElement(By.xpath("//input[@placeholder='Email...']")).sendKeys("Srinidhi");
		//how to send keys
		driver.findElement(By.xpath("//input[@placeholder='Password...']")).sendKeys("admin123");
		//how to get the text in website
		String sText=driver.findElement(By.xpath("//div[@id='login_div']/h3")).getText();
				System.out.println(sText);
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Web login')]")).getText());
		
		//how to write an xpath on your own
		/*
		 // --> root element
		 //<tagName>
		 //<tagName>[]
		 //<tagName>[@<AttributeName>='<AttributeValue>']/tr[1]
		 */
		//how to click on button or elements --> 
		driver.findElement(By.xpath("//button[contains(text(),'Login to Account')]")).click();
		//Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"))));
		driver.findElement(By.xpath("//button[contains(text(),'Switch To')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Alert")).click();
		Thread.sleep(10000);
		//4. Close the browser
		//driver.close(); //--> it will close the current window
		driver.quit();  //-->quit the browser also instance of the browser
		
		/*
		 Launch browser --> 2 methods
		 Different Browsers --> 
		 how to use chropath 
		 how to find/write xpath
		 how to take ID or any values in the DOM e
		 Click, send keys, select , close and quit
		 radio buttons --> isSelected, select
		 Drop down --> slect an element
		 button visibality
		 
		 you guys got recordings of selenium.. in that important one is xpath
		 
		  Waits
		  
		  Thread.sleep --> Hard wait --> it completely waits for the given seconds without any interaction with browser
		  3 types of waits
		  1. Imlicit wait --> you are telling the selenium to wait for certain amount of time till the element get identified
		  2. Explicit wait --> is for perticular set of elements --> advantage
		  3. Fluent wait --> you can set your own pooling period, you can say how much the end time of wait, explicit wait can be used as normal webdriver element
		  
		Locators:
		8 types of locators
		2 ID , Xpath, linkedText, PartialLinkedText, Csslector,classpath
		
		Which one is faster Xpath or ID?
		
		everything is millisecond --> ID is faster
		  		  
		  other actions in browsers
		 
alertIsPresent()
elementSelectionStateToBe()
elementToBeClickable()
elementToBeSelected()
frameToBeAvaliableAndSwitchToIt()
invisibilityOfTheElementLocated()
invisibilityOfElementWithText()
presenceOfAllElementsLocatedBy()
presenceOfElementLocated()
textToBePresentInElement()
textToBePresentInElementLocated()
textToBePresentInElementValue()
titleIs()
titleContains()
visibilityOf()
visibilityOfAllElements()
visibilityOfAllElementsLocatedBy()
visibilityOfElementLocated()
		 
	amazon.com  --> orders name - status of it --> customercare
	admin --> www.amazon.com --> custoemr care will have an access to your account	
		
	A ==== z --> he should get only normal user screen
	B ==== Y --> he should get only admin screen  --> False positive condetion
	{that is success. . you will do some action after this}
		 
		 1. --> your amazon welcome user screen  --> this is displayed  --> A===Z --> this is correct
		 																--> B===Y --> 30 seconds --> then thows exception
		 																fluent wait for 10 seconds
		 * */
	}

}