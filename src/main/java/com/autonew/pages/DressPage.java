package com.autonew.pages;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;



public class DressPage extends Dress_BasePage{
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement Dresses;
	@FindBy(xpath ="//*[@id=\"ul_layered_id_attribute_group_1\"]/li[1]/label/a/span")
	private WebElement smallsize;
	@FindBy(xpath ="//*[@id=\"ul_layered_id_attribute_group_1\"]/li[2]/label/a/span")
	private WebElement mediumsize;
	@FindBy(xpath ="//*[@id=\"ul_layered_id_attribute_group_1\"]/li[3]/label/a/span")
	private WebElement largesize;
	@FindBys(@FindBy(xpath = "//*[@id=\"layered_form\"]/div/div[2]/div/span"))
	private List<WebElement> sizelist;

	
	public DressPage() {
		PageFactory.initElements(driver, this);
	}
	
public WebElement getDresses() {
	return Dresses;
}
public WebElement getsmallsize() {
	return smallsize;
}
	
	public WebElement getmediumsize() {
		return mediumsize;
	}
		
		public WebElement getlargesize() {
			return largesize;
			}
		public WebElement getsizelist()
		{
			WebElement val = (WebElement)sizelist.subList(0, 2);
		   return val;
	
		}
}


