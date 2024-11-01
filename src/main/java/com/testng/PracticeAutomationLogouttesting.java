package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.pagefactory.MasterPageFactory;
import com.util.BaseConfig;
import com.util.Highlighter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeAutomationLogouttesting {

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
		
	mpf.getLogout().click();
	Assert.assertTrue(mpf.getLogin().isDisplayed(), "Logout SuccessFul!");
	if(mpf.getLogin().isDisplayed()) {
		System.out.println("LogOut successFul");  
		
	}
	
	}
	@AfterTest
	public void getTearDown() {
		driver.quit();
	}
	
	
	
	
}
