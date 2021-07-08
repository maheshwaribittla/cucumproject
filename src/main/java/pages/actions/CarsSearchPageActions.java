package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarsSearchPageLocators;
import utils.SeleniumDriver;

public class CarsSearchPageActions {

	CarsSearchPageLocators carsSearchPageLocators = null;

	public CarsSearchPageActions() {

		this.carsSearchPageLocators = new CarsSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsSearchPageLocators);
	}

	public void selectCarMake(String Brand) {

		Select selectAnyMake = new Select(carsSearchPageLocators.anyMake);

		selectAnyMake.selectByVisibleText(Brand);

	}

	public void selectCarModel(String Model) {

		Select selectAnyModel = new Select(carsSearchPageLocators.anyModel);

		selectAnyModel.selectByVisibleText(Model);

	}

	public void selectCarLocation(String Location) {

		Select selectAnyLocation = new Select(carsSearchPageLocators.anyLocation);

		selectAnyLocation.selectByVisibleText(Location);

	}

	public void selectCarPrice(String Price) {

		Select selectCarPrice = new Select(carsSearchPageLocators.carPrice);

		selectCarPrice.selectByVisibleText(Price);

	}

	public void clickonFindMyNextCarbutton() {

		carsSearchPageLocators.findmynextcar.click();
	}

}
