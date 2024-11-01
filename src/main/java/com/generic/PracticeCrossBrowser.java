package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pagefactory.MasterPageFactory;
import com.util.BaseConfig;
import com.util.Highlighter;
import com.util.Screenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeCrossBrowser {
	WebDriver driver;
	MasterPageFactory mpf;
	public void getMoney(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("browser opend="+browser);   
		}else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			System.out.println("browser opend="+browser); 
		}else {
			System.out.println("Not found");  
		}
		driver.manage().window().maximize();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(BaseConfig.getConfigValue("PROD_URL"));
		mpf = new MasterPageFactory(driver);
		Highlighter.addColor(driver,mpf.getSignin_homepage() );
		mpf.getSignin_homepage().click();
		Highlighter.addColor(driver,mpf.getEmail() );
		mpf.getEmail().sendKeys(BaseConfig.getConfigValue("EMAIL"));
		Highlighter.addColor(driver,mpf.getPassword() );
		mpf.getPassword().sendKeys(BaseConfig.getConfigValue("PASSWORD"));
		Highlighter.addColor(driver,mpf.getLogin() );
		mpf.getLogin().click();
		
		
		if(mpf.getLogout().isDisplayed())
		System.out.println("Login successful!"); 
		
		else {
			System.out.println("failed");  
		} 
		Screenshot.getScreenShot(driver, "homepage_afterLogin");
		
	driver.quit();
	}
	public static void main(String[] args) {
		 PracticeCrossBrowser obj = new  PracticeCrossBrowser();
		 obj.getMoney("chrome");
		 obj.getMoney("firefox");
	} 
	
		}
		
	


