package steps;

import cucumber.api.java.en.When;
import pages.actions.CarsGuideHomePageActions;

public class NewCarsSearchSteps {
	
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	@When("^click on \"([^\"]*)\" cars from submenu$")
	public void click_on_cars_from_submenu(String arg1) throws Throwable {
		carsGuideHomePageActions.clickonNewCarsSubMenu();
	}



}
