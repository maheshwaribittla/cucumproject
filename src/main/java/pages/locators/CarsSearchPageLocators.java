package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsSearchPageLocators {
	
	
	@FindBy(how=How.XPATH, using="//*[@id='makes']")
	public WebElement anyMake;
	
	@FindBy(how=How.XPATH, using="//*[@id='models']")
	public WebElement anyModel;
	
	
	@FindBy(how=How.XPATH, using="//*[@id='locations']")
	public WebElement anyLocation;

	@FindBy(how=How.XPATH,using="//*[@id='priceTo']")
	public WebElement carPrice;
	
	@FindBy(how=How.XPATH,using="//*[@id='search-submit']")
	public WebElement findmynextcar;




}
