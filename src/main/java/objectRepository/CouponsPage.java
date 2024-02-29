package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CouponsPage {

	//Rule-1 :- Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//a[.='Coupons List']")private WebElement CouponListLnk;
    
  
	//Rule-2:- Create a constructor to initilise these elements
    
	public CouponsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Rule-3:- Provide getters to access these variables
	
	public WebElement getCouponListLnk() {
		return CouponListLnk;
	}
	
	
	// Rule-4 :- Create Business Library
	    
	
}
