package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	
	WebDriver driver;
	
	//locating element
	
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginbutton;
	
	@FindBy(xpath="//button[contains(text(),'Epic sadface')]")
	WebElement errormsg;
	
	void LoginPage(WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver,this);
	}
	
	void enterUsername(String username)
	{
		
	}
	
	void enterPassword(String password)
	{
		
	}
	
	void clickLoginButton()
	{
		
	}
	
	WebElement getErrorMessage()
	{
		return errormsg;
	}

}
