package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseLogin {
	public void getLogin() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.automationexercise.com/");
		driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();
		driver.findElement(By.xpath("(//*[@name='email'])[1]")).sendKeys("rezwanislam857@gmail.com");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Boston2023");
		driver.findElement(By.xpath("(//*[@class='btn btn-default'])[1]")).click();
	}

}
