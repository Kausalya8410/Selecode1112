package com.autonewtest.pages;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.autonew.pages.*;
import com.autonewtest.pages.*;

public class subscription_Test {
	subscription subpage;
	Tab_BasePage  basetab;
	
	@Test
	public subscription_Test()
	{
		subpage = new subscription();
		basetab = new Tab_BasePage();
		
	}
	@Test
	public void home() {
		subpage.gethome().click();
		}
	@Test
	public void subscription() {
		subpage.getsubscription().sendKeys("uhssa@gmail.com");
	}
	@Test

	public void button(){
		subpage.getbutton().click();
			}
	@Test
	public void newsletter() {
		Assert.assertTrue(subpage.getnewsletter().contains("You have successfully subscribed to this newsletter."));
	}
	}
	

