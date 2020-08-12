package com.qa.Maven.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDemo {
	static WebDriver driver;

	public static void main(String[] args) throws Exception{

		
		/* set system properity for chrome browser  */
		System.setProperty("webdriver.chrome.driver","E:\\Eclipse-Mars\\New-Workspace\\com.qa.Maven.Demo\\config\\chromedriver.exe");
		driver=new ChromeDriver();           // launch Chrome browser
		System.out.println("Chrome browser launched..");
		driver.get("https://qa-tekarch.firebaseapp.com");    // pass url
		System.out.println("App URL passed..");
		driver.manage().window().maximize();  // to maximize the chrome browser
		System.out.println("Browser get maximizded..");
		Thread.sleep(5000);                   // wait (pause in execution) for 5 sec
//		driver.manage().deleteAllCookies();
/*		driver.findElement(By.id("email_field")).sendKeys("Akshay");
		driver.findElement(By.id("")).sendKeys("Kumar");*/
		
		WebElement email=driver.findElement(By.id("email_field"));
		email.sendKeys("admin123@gmail.com");  // action 1
		Thread.sleep(3000);
		/*email.clear();             // action 2
		Thread.sleep(3000);
		email.sendKeys("Kumar");   // action 3
*/		
		WebElement password=driver.findElement(By.xpath("//input[@id='password_field']"));
		password.sendKeys("admin123");
		
		WebElement loginButton=driver.findElement(By.xpath("//button[contains(text(),'Login to Account')]"));
		System.out.println("Login button= "+loginButton.isEnabled());
		loginButton.click();
		
		Thread.sleep(5000);
		
		WebElement Name = driver.findElement(By.id("name"));
		Name.sendKeys("Akshay");
		
		WebElement Sex_male = driver.findElement(By.xpath("//span[1]//input[1]"));
		System.out.println("Male= "+Sex_male.isSelected());   // true (default value of Sex (Radio button))
		
		WebElement Sex_Female = driver.findElement(By.xpath("//span[2]//input[1]"));
		System.out.println("Female= "+Sex_Female.isSelected());  // false
		Thread.sleep(3000);
		Sex_Female.click();
		
		WebElement City=driver.findElement(By.xpath("//select[@id='city']"));
		
		Select dropDown1=new Select(City);
	//	dropDown1.selectByIndex(4);
	//	dropDown1.selectByValue("newdelhi");
		dropDown1.selectByVisibleText("GOA");
		
	//	driver.quit();                        // disconnect all connection and close the browser
	}
}
