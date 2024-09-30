package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory 

{
	public MasterPageFactory(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//*[@class='fa fa-lock']")
	private WebElement signin_homepage;
	@FindBy(xpath = "(//*[@name='email'])[1]")
     private WebElement email;
	@FindBy(xpath="//*[@name='password']")
	private WebElement password;
	@FindBy(xpath="(//*[@class='btn btn-default'])[1]")
	private WebElement login;
	
	public WebElement getGroceries_freshbtn() {
		return groceries_freshbtn;
	}
	@FindBy(xpath="(//*[@class='f3-cgi-flyout-store-img'])[1]")
	private WebElement groceries_freshbtn;
	@FindBy (xpath="//*[text()='Groceries']")
	private WebElement groceries_amazon;
	public WebElement getGroceries_amazon() {
		return groceries_amazon;
	}
	@FindBy(xpath ="//*[text()=' Logout']")
	private WebElement logout;
	
	public WebElement getLogout() {
		return logout;
	}
	public WebElement getDropdown() {
		return dropdown;
	}
	public WebElement getServices() {
		return services;
	}
	@FindBy(xpath="//*[@id='oldSelectMenu']")
private WebElement dropdown;
	

	;
	@FindBy(xpath="(//*[text()='Services'])[3]")
	private WebElement services;
	@FindBy(xpath="//*[@id='alertBox']")
	private WebElement alertbtn;
	public WebElement getAlertbtn() {
		return alertbtn;
	}
	public WebElement getSignin_homepage() {
		return signin_homepage;
	}
	public void setSignin_homepage(WebElement signin_homepage) {
		this.signin_homepage = signin_homepage;
	}
	public WebElement getEmail() {
		return email;
	}
	public void setEmail(WebElement email) {
		this.email = email;
	}
	public WebElement getPassword() {
		return password;
	}
	public void setPassword(WebElement password) {
		this.password = password;
	}
	public WebElement getLogin() {
		return login;
	}
	
	

}
