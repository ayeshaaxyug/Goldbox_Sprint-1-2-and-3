package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Coupons_CouponsListPage {

	// Rule-1 :-Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//input[@placeholder='Search...']")private WebElement SearchEdt;
    
    @FindBy(xpath="//button[.='Add Coupon']")private WebElement AddEcomBannersBtn;
    
    @FindBy(xpath="//td[.='LHUBYlZI']/following-sibling::td/button[.='View']")private WebElement CouponDescriptionViewBtn;
	
    @FindBy(xpath="//td[.='LHUBYlZI']/following-sibling::td/button[.='View']/../following-sibling::td/button[.='Used Users']")private WebElement ActionsUsedUsersBtn;
    
    @FindBy(xpath="//td[.='LHUBYlZI']/following-sibling::td/button[.='View']/../following-sibling::td/button[.='Edit']")private WebElement ActionsEditBtn;
    
    @FindBy(xpath="//td[.='LHUBYlZI']/following-sibling::td/button[.='View']/../following-sibling::td/button[.='Edit']/..//div[@class='mdc-switch__ripple']")private WebElement ActionsEnableDisableBootstrapBtn;
    
    @FindBy(xpath="//a[text()=' Next ']")private WebElement NextPageLnk;
    
    @FindBy(xpath="//span[text()=' Prev ']")private WebElement PreviousPageLnk;
    
    
	//Rule-2:Create a constructor to initilise these elements
    
	public Coupons_CouponsListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	//Rule-3:Provide getters to access these variables
	
	public WebElement getSearchEdt() {
		return SearchEdt;
	}


	public WebElement getAddEcomBannersBtn() {
		return AddEcomBannersBtn;
	}


	public WebElement getCouponDescriptionViewBtn() {
		return CouponDescriptionViewBtn;
	}


	public WebElement getActionsUsedUsersBtn() {
		return ActionsUsedUsersBtn;
	}


	public WebElement getActionsEditBtn() {
		return ActionsEditBtn;
	}


	public WebElement getActionsEnableDisableBootstrapBtn() {
		return ActionsEnableDisableBootstrapBtn;
	}
	
	
	public WebElement getNextPageLnk() {
		return NextPageLnk;
	}


	public WebElement getPreviousPageLnk() {
		return PreviousPageLnk;
	}
	
	
	// Rule-4 :- Create Business Library
	
	
}
