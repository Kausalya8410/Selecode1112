package com.autonewtest.pages;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.autonew.pages.*;
import com.autonewtest.pages.*;

public class Tab_Testpage {
	Tab_Homepage tabpage;
	Tab_BasePage  basetab;
	
	@Test
	public Tab_Testpage()
	{
		tabpage = new Tab_Homepage();
		basetab = new Tab_BasePage();
	}
	@Test
	public void getWomen(){
		tabpage.getWomen().click();
		Assert.assertTrue(tabpage.getTitlte().contains("Women"));
		}
	@Test
	public void getDresses() {
    	   tabpage.getDresses().click();
    	  Assert.assertTrue(tabpage.getTitlte().contains("Dresses"));
    
  }
       @Test
	public void getTshirts() {
    	   tabpage.getTshirts().click();
    	  
    	   
    }
       
      
    	   
}





