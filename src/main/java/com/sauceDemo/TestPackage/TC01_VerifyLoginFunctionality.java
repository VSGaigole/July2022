package com.sauceDemo.TestPackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;



public class TC01_VerifyLoginFunctionality extends TestBaseClass1
{
  
	@Test
	   public void verifylogin()throws IOException, InterruptedException
	   {
		   log.info("Apply the Validation");
			
			String givenTitle = "Swag Labs";   //PO/BA/dev		
			//String actualTitle = driver.getCurrentUrl();
			String 	actualTitle = driver.getTitle();
			
			Assert.assertEquals(actualTitle, givenTitle);
	   }

}

