package com.testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.generic.BaseLogin2;

public class PracticeTestReportWithTestNG {
	ExtentReports extent;
	ExtentTest test;
	@BeforeTest
	public void getMoney() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("target/Batch30.html");
		reporter.config().setDocumentTitle("Testng Automation");
		reporter.config().setReportName("Smoke test");
		reporter.config().setTheme(Theme.DARK);
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Company ", "SMART TECH");
		extent.setSystemInfo("Testing environment ", "QA");
		extent.setSystemInfo("Team ", "QA");
		extent.setSystemInfo("Tester Name: ", System.getProperty("user.name"));

	}
	@Test
	public void getLogin() {
		BaseLogin2  obj = new BaseLogin2();
		obj.getLogin();
		
		test = extent.createTest("Login test");
		
		
		}
	@AfterTest
	public void getReport() {
		extent.flush();
	}



}
