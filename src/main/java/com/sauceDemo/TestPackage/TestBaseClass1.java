package com.sauceDemo.TestPackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.sauceDemo.POMPackage.POMClass_LoginPage;
import com.sauceDemo.UtilityPackage.UtililityClass;

public class TestBaseClass1 
{
    WebDriver driver;

    Logger log = Logger.getLogger("SauceDemoProject");
    
    @Parameters("browserName")
	@BeforeMethod
	public void setup(String browserName) throws IOException
	{    
    	if(browserName.equals("chrome"))
    	{
       // System.out.println("Verify whether user can login successfully or not");
		
		System.setProperty("webdriver.chrome.driver", 
				"./DriverFolder/chromedriver.exe");	
		
		driver = new ChromeDriver();
    	}
    	else
    	{
    		System.setProperty("webdriver.gecko.driver", 
    				"./DriverFolder/geckodriver.exe");	
    	    
    		driver = new FirefoxDriver();
    	}
		
    	PropertyConfigurator.configure("log4j.properties");
		
		log.info("Browser is opened");
				
		driver.manage().window().maximize();	
		log.info("Browser is maximized");
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.saucedemo.com/");
		log.info("url is opened");
		
		UtililityClass.screenShotMethod(driver, "LoginSHOT");
		log.info("screenshot is taken");
	
		POMClass_LoginPage lp = new POMClass_LoginPage(driver);
		lp.sendUsername();
		log.info("usernaeme is entered");
		
		lp.sendPassword();
		log.info("password eneterd");
		
		lp.clickLoginButton();
		log.info("clicked on login button");
		
		//--homePage--//
		log.info("Went on HomePage");
						
	   //screenshot
		UtililityClass.screenShotMethod(driver, "LoginSHOT");
		log.info("screenshot is taken");

		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
		log.info("browser is closed");
				
		log.info("End of Program");
	}

}
