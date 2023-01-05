package com.sauceDemo.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass_LoginPage 
{
    
    	//webelement find
    		//action webelement
    		
    		//1.WebDriver declared
    		private WebDriver driver;
    		
    		 
    		 //2.Find WebElement-username 
    		 //do not use findElement method
//    		 WebElement username = driver.findElement(By.xpath("ABC"));
    		 
    		//annotation -> @ -> @FindBy -> its like a method only
    		 
    		 @FindBy(xpath="//input[@id='user-name']")
    		private WebElement username;
    		 
    		 @FindBy(xpath="//input[@id='password']")
    		private WebElement password;
    		 
    		 @FindBy(xpath="//input[@id='login-button']")
    		private WebElement loginBtn;
    		 
    		 //3.Ele --> action perform
    		 //maitain them in method
    		 
    		 public void sendUsername()
    		 {
    			 username.sendKeys("standard_user");
    		 }
    		 
    		 public void sendPassword()
    		 {
    			 password.sendKeys("secret_sauce");
    		 }
    		 
    		 public void clickLoginButton()
    		 {
    			 loginBtn.click();
    		 }
    		 
    		 //4.constructor declare
    		 
    		 public POMClass_LoginPage(WebDriver driver)
    		 {
    			 this.driver= driver;
    			 PageFactory.initElements(driver, this);
    		 }
    		 
    		 
    		//1.WebDriver declared
    	    //2.Find WebElement
    		//3.Ele --> action perform
    		//4.constructor declare

	}

