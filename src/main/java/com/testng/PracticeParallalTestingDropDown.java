package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.pagefactory.MasterPageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeParallalTestingDropDown {
	@Test 
	public void getDropdown() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/select-menu ");
		MasterPageFactory mpf = new MasterPageFactory(driver);
		Select sc = new Select(mpf.getDropdown()) ;
		sc.selectByVisibleText("White");
		sc.selectByIndex(3);
		
	}

}
