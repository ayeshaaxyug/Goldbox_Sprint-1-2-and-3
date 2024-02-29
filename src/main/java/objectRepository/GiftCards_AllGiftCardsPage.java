package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCards_AllGiftCardsPage {

	//Rule-1 :- Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//input[@placeholder='Search...']")private WebElement SearchEdt;
    
    @FindBy(xpath="//button[.='Add Gift Card']")private WebElement AddGiftCardBtn;
    
    @FindBy(xpath="//td[.='FA3A9HMFT5']/following-sibling::td/button[.='Buy Users']")private WebElement BuyUsersBtn;
    
    @FindBy(xpath="//td[.='FA3A9HMFT5']/following-sibling::td/button[.='Gift Card Used Users']")private WebElement GiftCardUsedUsersBtn;
  
	//Rule-2:- Create a constructor to initilise these elements
    
	public GiftCards_AllGiftCardsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	//Rule-3:- Provide getters to access these variables
    
	public WebElement getSearchEdt() {
		return SearchEdt;
	}

	public WebElement getAddGiftCardBtn() {
		return AddGiftCardBtn;
	}

	public WebElement getBuyUsersBtn() {
		return BuyUsersBtn;
	}

	public WebElement getGiftCardUsedUsersBtn() {
		return GiftCardUsedUsersBtn;
	}
	
	
	// Rule-4 :- Create Business Library
	
}
