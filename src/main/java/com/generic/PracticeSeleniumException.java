package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.pagefactory.MasterPageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeSeleniumException {
public void getException() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.costco.com/");
	MasterPageFactory mpf = new MasterPageFactory(driver);
	Actions ac = new Actions(driver);
	ac.moveToElement(mpf.getServices()).perform();
	
}
public static void main(String[] args) {
	PracticeSeleniumException obj = new PracticeSeleniumException();
	obj.getException();
} 
}