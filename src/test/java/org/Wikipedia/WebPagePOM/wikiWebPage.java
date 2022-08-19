package org.Wikipedia.WebPagePOM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class wikiWebPage extends SeleniumUtility {
	
	WebDriver driver;
	
	public wikiWebPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@id='searchInput'])[1]")
	private WebElement SearchInputField;
	
	@FindBy(css="#searchButton")
	private WebElement clickOnSearchBtn;
	
	@FindBy(xpath="//body")
	private WebElement body;
	
	@FindBy(xpath="//table[@class='infobox vevent']/tbody/tr[12]/td/div/ul/li")
	private WebElement getReleaseDate;
	
	@FindBy(xpath="//th[contains(text(),'Country')]/../td")
	private WebElement getCountryName;

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public void setSearchInputField(WebElement searchInputField) {
		SearchInputField = searchInputField;
	}

	public void setClickOnSearchBtn(WebElement clickOnSearchBtn) {
		this.clickOnSearchBtn = clickOnSearchBtn;
	}

	public void setBody(WebElement body) {
		this.body = body;
	}

	public void setGetReleaseDate(WebElement getReleaseDate) {
		this.getReleaseDate = getReleaseDate;
	}

	public void setGetCountryName(WebElement getCountryName) {
		this.getCountryName = getCountryName;
	}

	public WebElement getSearchInputField() {
		return SearchInputField;
	}

	public WebElement getClickOnSearchBtn() {
		return clickOnSearchBtn;
	}

	public WebElement getBody() {
		return body;
	}

	public WebElement getGetReleaseDate() {
		return getReleaseDate;
	}

	public WebElement getGetCountryName() {
		return getCountryName;
	}
 
	public void seachPushpa(String moviesName) {
			SearchInputField.sendKeys(moviesName);
	
			 clickOnSearchBtn.click();
	}
	
	public void pageDown() {
		body.sendKeys(Keys.PAGE_DOWN);
	}

}
