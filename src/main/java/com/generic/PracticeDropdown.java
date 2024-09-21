package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.pagefactory.MasterPageFactory;


import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeDropdown {
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
	public static void main(String[] args) {
		PracticeDropdown obj = new PracticeDropdown();
		obj.getDropdown();
}
}
