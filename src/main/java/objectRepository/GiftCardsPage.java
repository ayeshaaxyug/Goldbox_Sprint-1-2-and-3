package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCardsPage {

	//Rule-1 :- Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//a[text()='All Gift cards']")private WebElement AllGiftCardsLnk;
    
    
	//Rule-2:- Create a constructor to initilise these elements
    
	public GiftCardsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Rule-3:- Provide getters to access these variables
    
	public WebElement getAllGiftCardsLnk() {
		return AllGiftCardsLnk;
	}

	
	// Rule-4 :- Create Business Library
	
}
