package steps;

import java.util.List;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.CarsSearchPageActions;
import utils.SeleniumDriver;

public class SearchCarsSteps {
	
	

	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();

	CarsSearchPageActions carsSearchPageActions = new CarsSearchPageActions();

	@Given("^Iam on the Home page \"([^\"]*)\" of carsguide website$")
	public void iam_on_the_Home_page_of_carsguide_website(String websiteURL) throws Throwable {
		
	
		SeleniumDriver.openPage(websiteURL);
	}

	@When("^I move to menu$")
	public void i_move_to_menu(List<String> list) throws Throwable {
		String menu = list.get(1);
		System.out.println(menu);
		
		carsGuideHomePageActions.moveToBuySellMenu();

	}

	@When("^click on \"([^\"]*)\"link$")
	public void click_on_link(String searchCars) throws Throwable {
		carsGuideHomePageActions.clickonSearchCarsSubMenu();

	}

	@When("^select carbrand as\"([^\"]*)\" from AnyMake Dropdown$")
	public void select_carbrand_as_from_AnyMake_Dropdown(String carMake) throws Throwable {

		carsSearchPageActions.selectCarMake(carMake);

	}

	@When("^select carmodel as\"([^\"]*)\" from AnyModel Dropdown$")
	public void select_carmodel_as_from_AnyModel_Dropdown(String carModel) throws Throwable {
		carsSearchPageActions.selectCarModel(carModel);
	}

	@When("^select carlocation as\"([^\"]*)\" from AnyLocation Dropdown$")
	public void select_carlocation_as_from_AnyLocation_Dropdown(String carLocation) throws Throwable {
		carsSearchPageActions.selectCarLocation(carLocation);
	}

	@When("^select carprice as\"([^\"]*)\" from Price Dropdown$")
	public void select_carprice_as_from_Price_Dropdown(String carPrice) throws Throwable {
		carsSearchPageActions.selectCarPrice(carPrice);
	}

	@Then("^I will click on Find_My_Next_Car button$")
	public void i_will_click_on_Find_My_Next_Car_button() throws Throwable {
		carsSearchPageActions.clickonFindMyNextCarbutton();
	}
	@Then("^page title should be \"([^\"]*)\"$")
	public void page_title_should_be(String exptitle) throws Throwable {
		String actualTitle=SeleniumDriver.getDriver().getTitle();
		Assert.assertEquals(actualTitle, exptitle);
	}

	
	@Then("^I should see list of searched cars$")
	public void i_should_see_list_of_searched_cars() throws Throwable {
		System.out.println("car list found");
	 }
	
	
	
}
