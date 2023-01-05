package com.sauceDemo.TestPackage;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMPackage.POMClass_HomePage;



public class TC03_VerifyBagProductAddToCartFunctionality extends TestBaseClass1
{
	
	@Test
	public void method7()
	{

		//homePage
		log.info("went on homePage");
		
		
		POMClass_HomePage hp = new POMClass_HomePage(driver);
		
		//bagPrdtClick
		hp.clickBagProduct();
		log.info("Clicked on bagProduct");
		
		log.info("Apply the validation");
		String expectedProductSelection = "1";
		String actualProductSelected = hp.getTextFromAddToCartBtn();  //1
		

		
		Assert.assertEquals(expectedProductSelection, actualProductSelected);
	
		}


}
