package com.autonewtest.pages;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.autonew.pages.*;
import com.autonewtest.*;


public class Dress_Testpage {
	Dress_BasePage DBP;
	DressPage DPO;
	
	public Dress_Testpage()
	{
		DBP = new Dress_BasePage();
		DPO=new DressPage();
	}

	    @Test 
	    public void verifydresspagenavigation() {
	    	DPO.getDresses().click();
	    	
	    }
	
	    @Test
	    public void verifysize()
	    {
	    	DPO.getsmallsize().isDisplayed();
	        DPO.getmediumsize().isDisplayed();
	    	DPO.getlargesize().isDisplayed();
	    }
	    
	 
	    
}

	


