package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Banners_EcomBanners {

	// Rule-1 :-Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//input[@placeholder='Search...']")private WebElement SearchEdt;
    
    @FindBy(xpath="//button[.='Add Ecom Banners']")private WebElement AddEcomBannersBtn;
    
    @FindBy(xpath="//td[contains(.,'Dec 12')]/following-sibling::td[contains(.,'Dec 16')]/..//button[.='View']")private WebElement BannerImgViewBtn;
	
    @FindBy(xpath="//td[contains(.,'Dec 12')]/following-sibling::td[contains(.,'Dec 16')]/..//button[.=' Edit ']")private WebElement StatusEditBtn;
    
    @FindBy(xpath="//td[contains(.,'Dec 12')]/following-sibling::td[contains(.,'Dec 16')]/..//button[.=' Edit ']/..//div[@class='mdc-switch__ripple']")private WebElement StatusEnableDisableBootstrapBtn;
    
    @FindBy(xpath="//a[text()=' Next ']")private WebElement NextPageLnk;
    
    @FindBy(xpath="//span[text()=' Prev ']")private WebElement PreviousPageLnk;

  
	//Rule-2:Create a constructor to initilise these elements
    
	public Banners_EcomBanners(WebDriver driver)
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


	public WebElement getBannerImgViewBtn() {
		return BannerImgViewBtn;
	}


	public WebElement getStatusEditBtn() {
		return StatusEditBtn;
	}


	public WebElement getStatusEnableDisableBootstrapBtn() {
		return StatusEnableDisableBootstrapBtn;
	}


	public WebElement getNextPageLnk() {
		return NextPageLnk;
	}


	public WebElement getPreviousPageLnk() {
		return PreviousPageLnk;
	}
	
	
	//Rule-4 :- Create Business Library
	
	
	
}
