package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.NewCarsSearchPageLocators;
import pages.locators.UsedcarSearchPageLocators;
import utils.SeleniumDriver;

public class NewCarsSearchPageActions {

	NewCarsSearchPageLocators newcarsearchlocators=null;
	NewCarsSearchPageActions(){
		this.newcarsearchlocators = new NewCarsSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(),newcarsearchlocators);
	}
	public void selectCarMake(String Brand) {

		Select selectAnyMake = new Select(newcarsearchlocators.anyMake);

		selectAnyMake.selectByVisibleText(Brand);

	}

	public void selectCarModel(String Model) {

		Select selectAnyModel = new Select(newcarsearchlocators.anyModel);

		selectAnyModel.selectByVisibleText(Model);

	}

	public void selectCarLocation(String Location) {

		Select selectAnyLocation = new Select(newcarsearchlocators.anyLocation);

		selectAnyLocation.selectByVisibleText(Location);

	}

	public void selectCarPrice(String Price) {

		Select selectCarPrice = new Select(newcarsearchlocators.carPrice);

		selectCarPrice.selectByVisibleText(Price);

	}

	public void clickonFindMyNextCarbutton() {

		newcarsearchlocators.findmynextcar.click();
	}

}




