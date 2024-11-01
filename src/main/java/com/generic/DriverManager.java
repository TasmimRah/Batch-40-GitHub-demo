package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
      WebDriver driver;
public WebDriver getChromeDriver() {
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	  driver.manage().window().maximize();
	   
	
	
	return driver;
}



}
