package com.autonew.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class subscription extends Tab_BasePage {
	
	@FindBy(xpath="//*[@id=\"header_logo\"]/a/img")
	private WebElement home;

	@FindBy(xpath="//*[@id=\"newsletter-input\"]")
	private WebElement subscription;

	@FindBy(xpath="//*[@id=\"newsletter_block_left\"]/div/form/div/button")
	private WebElement button;
	
	@FindBy(xpath="//*[@id=\"columns\"]/p")
	private String newsletter;
	
	public subscription() {
		PageFactory.initElements(driver, this);
	}
		
		  public WebElement gethome() {
			  return home;
			  }
		  public WebElement getsubscription() {
			  return subscription;
		  }
		  public WebElement getbutton() {
			  return button;
		  }
			  
			public String getnewsletter() {
				return newsletter;
			}
			  
			 
			 }