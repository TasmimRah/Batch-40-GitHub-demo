package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.pagefactory.MasterPageFactory;
import com.util.BaseConfig;
import com.util.Highlighter;
import com.util.Screenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeAutomationLoginTesting {
	
	WebDriver driver;
	MasterPageFactory mpf;
	@Test
	
	public void getLogin() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
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
		Assert.assertTrue(mpf.getLogout().isDisplayed(), "Login successful!");
	
	}
	@AfterTest
	public void getTearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
}
