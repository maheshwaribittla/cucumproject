package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CarsGuideHomePageLocators;
import utils.SeleniumDriver;

public class CarsGuideHomePageActions {
	

	CarsGuideHomePageLocators carsguideHomePageLocators = null;

	public CarsGuideHomePageActions() {

		this.carsguideHomePageLocators = new CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsguideHomePageLocators);
	}

	public void moveToBuySellMenu() {

		Actions actions = new Actions(SeleniumDriver.getDriver());
		actions.moveToElement(carsguideHomePageLocators.BuySellLink).perform();
	}

	public void clickonSearchCarsSubMenu() {

		carsguideHomePageLocators.SearchCarsLink.click();
	}

	public void clickonUsedCarsSubMenu() {

		carsguideHomePageLocators.UsedLink.click();
	}

	public void moveToReviews() {

		Actions actions = new Actions(SeleniumDriver.getDriver());
		actions.moveToElement(carsguideHomePageLocators.UsedLink).perform();
	}
	
	public void clickonNewCarsSubMenu() {

		carsguideHomePageLocators.NewLink.click();
	}

}