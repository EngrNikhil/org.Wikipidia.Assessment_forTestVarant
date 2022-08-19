package org.wiki.testcase;

import static org.testng.Assert.fail;

import org.Wikipedia.WebPagePOM.wikiWebPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class TC_PushpaWiki_001 extends SeleniumUtility {

	wikiWebPage wiki;

	@BeforeTest
	public void searchPushpaMovie() {
		setUp("chrome", "https://en.wikipedia.org/wiki/Main_Page");
		wiki = new wikiWebPage(driver);
		wiki.seachPushpa("Pushpa: The Rise");

	}

	@Test
	public void getRelease_Date() {
		wiki.pageDown();
		String releaseDate = wiki.getGetReleaseDate().getText();
		System.out.println("Pushpa's release date is :> " + releaseDate);

	}

	@Test
	public void getCountryName() {
		String countryName = wiki.getGetCountryName().getText();
		System.out.println("Pushpa's release on which country :> " + countryName);
	}

	@AfterClass
	public void closeUp() {
		cleanUp();
	}
}
