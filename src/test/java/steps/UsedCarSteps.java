package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.CarsSearchPageActions;
import pages.actions.UsedCarSearchPageActions;
import utils.SeleniumDriver;

public class UsedCarSteps {
	UsedCarSearchPageActions usedcarsearchpageactions=new UsedCarSearchPageActions();
	CarsSearchPageActions carsSearchPageActions = new CarsSearchPageActions();
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();

	
	@When("^select carbrand as \"([^\"]*)\" from AnyMake Dropdown$")
	public void select_carbrand_as_from_AnyMake_Dropdown(String arg1) throws Throwable {
		//carsSearchPageActions.selectCarMake(arg1);
		usedcarsearchpageactions.selectCarMake(arg1);
	}

	@When("^select carmodel as \"([^\"]*)\" from AnyModel Dropdown$")
	public void select_carmodel_as_from_AnyModel_Dropdown(String arg1) throws Throwable {
		usedcarsearchpageactions.selectCarModel(arg1);
	}

	@When("^select carlocation as \"([^\"]*)\" from AnyLocation Dropdown$")
	public void select_carlocation_as_from_AnyLocation_Dropdown(String arg1) throws Throwable {
		//carsSearchPageLocators.selectCarLocation(arg1);
		usedcarsearchpageactions.selectCarLocation(arg1);
	}

	@When("^select carprice as \"([^\"]*)\" from Price Dropdown$")
	public void select_carprice_as_from_Price_Dropdown(String arg1) throws Throwable {
		//usedcarsearchpageactions.selectCarPrice(arg1);
		usedcarsearchpageactions.selectCarPrice(arg1);
	   
	}

	@Then("^i should see list of searched cars$")
	public void i_should_see_list_of_searched_cars() throws Throwable {
		System.out.println("hi");
	}
	@Given("^I am on the Home page \"([^\"]*)\" of carsGuide website$")
	public void i_am_on_the_Home_page_of_carsGuide_website(String url) throws Throwable {
		
		SeleniumDriver.openPage(url);
	}

	@When("^click on \"([^\"]*)\" cars from used cars page$")
	public void click_on_cars_from_used_cars_page(String arg1) throws Throwable {
		carsGuideHomePageActions.clickonUsedCarsSubMenu();

	}



	

}
