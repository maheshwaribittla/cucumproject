package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsGuideHomePageLocators {
	
	@FindBy(how=How.LINK_TEXT, using="buy + sell")
    public WebElement BuySellLink;
	
	@FindBy(how=How.LINK_TEXT, using="reviews")
	public WebElement ReviewsLink;
	
	@FindBy(how=How.LINK_TEXT, using="news")
	public WebElement NewsLink;
	
	@FindBy(how=How.LINK_TEXT, using="advice")
	public WebElement AdviceLink;
	
	@FindBy(how=How.LINK_TEXT, using="Search Cars")
	public WebElement SearchCarsLink;
	
	@FindBy(how=How.LINK_TEXT, using="Used")
	public WebElement UsedLink;
	@FindBy(how=How.XPATH, using="//*[@id='u_H']/div/div[1]/ul/li[1]/div/div/div[1]/ul/li[3]/a")
	public WebElement NewLink;

}
