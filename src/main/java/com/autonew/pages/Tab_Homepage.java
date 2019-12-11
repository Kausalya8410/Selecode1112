package com.autonew.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tab_Homepage extends Tab_BasePage {
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	private WebElement Women;
	
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement Dresses;
	
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	private WebElement Tshirts;
	
	
	
	public Tab_Homepage() {
		PageFactory.initElements(driver, this);
	}
		
		//Get the tab details in home page//
		
	  public WebElement getWomen() {
		  return Women;
		  }
			public WebElement getDresses() {
				return Dresses;
	}
			public WebElement getTshirts() {
				return Tshirts;
	}
			

}
