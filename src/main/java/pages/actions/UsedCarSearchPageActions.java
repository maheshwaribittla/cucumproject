package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarsSearchPageLocators;
import pages.locators.UsedcarSearchPageLocators;
import utils.SeleniumDriver;

public class UsedCarSearchPageActions {
	
	
	UsedcarSearchPageLocators usedcarSearchPageLocators=null;
	
	public UsedCarSearchPageActions(){
	

		this.usedcarSearchPageLocators = new UsedcarSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(),usedcarSearchPageLocators);
	}
	public void selectCarMake(String Brand) {

		Select selectAnyMake = new Select(usedcarSearchPageLocators.anyMake);

		selectAnyMake.selectByVisibleText(Brand);

	}

	public void selectCarModel(String Model) {

		Select selectAnyModel = new Select(usedcarSearchPageLocators.anyModel);

		selectAnyModel.selectByVisibleText(Model);

	}

	public void selectCarLocation(String Location) {

		Select selectAnyLocation = new Select(usedcarSearchPageLocators.anyLocation);

		selectAnyLocation.selectByVisibleText(Location);

	}

	public void selectCarPrice(String Price) {

		Select selectCarPrice = new Select(usedcarSearchPageLocators.carPrice);

		selectCarPrice.selectByVisibleText(Price);

	}

	public void clickonFindMyNextCarbutton() {

		usedcarSearchPageLocators.findmynextcar.click();
	}

}


