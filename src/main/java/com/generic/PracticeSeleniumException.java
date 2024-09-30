package com.generic;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pagefactory.MasterPageFactory;

import groovyjarjarantlr4.v4.parse.ANTLRParser.actionScopeName_return;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeSeleniumException {
public void getException() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.amazon.com/");
	MasterPageFactory mpf = new MasterPageFactory(driver);
	Actions ac = new Actions(driver);

	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(mpf.getGroceries_amazon()));
		
	ac.moveToElement(mpf.getGroceries_amazon()).perform();
	wait.until(ExpectedConditions.elementToBeClickable(mpf.getGroceries_freshbtn()));
	mpf.getGroceries_freshbtn().click();
}
public static void main(String[] args) {
	PracticeSeleniumException obj = new PracticeSeleniumException();
	obj.getException();
} 
}
