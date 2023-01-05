package com.sauceDemo.TestPackage;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMPackage.POMClass_HomePage;

public class TC04_Verify_AllProducts_AddToCart_Functionality extends TestBaseClass1
{
	 
	@Test
	public void method9()
	{
		
		//homePage
		log.info("went on homePage");	
		POMClass_HomePage hp = new POMClass_HomePage(driver);
		
		//allPrdtClick
		hp.clickAllProduct();
		log.info("Clicked on all Product");
		
		log.info("Apply the validation");
		
		String expectedProductSelection = "6";
		String actualProductSelected = hp.getTextFromAddToCartBtn();  //1
		

		
		Assert.assertEquals(actualProductSelected, expectedProductSelection);
		

	}

}
