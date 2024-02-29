package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
	//Finding WebElements Using @FindBy Annotations
	
    @FindBy(xpath="//span[@class='user-name']")private WebElement UserNameDrpDwn;
    
    @FindBy(xpath="//a[@id='toggle_btn']")private WebElement CloseAllElementsBtn;
    
    @FindBy(xpath="//a[@id='toggle_btn']")private WebElement OpenAllElementsBtn;
	
    @FindBy(xpath="//span[@class='user-name']")private WebElement MyProfileLnk;
    
    @FindBy(xpath="//span[.='Users']")private WebElement UsersDrpDwn;
    
    @FindBy(xpath="//span[.='Schemes']")private WebElement SchemesDrpDwn;
    
    @FindBy(xpath="//span[.='Ecommerce']")private WebElement EcommerceDrpDwn;
    
    @FindBy(xpath="//span[.='Banners']")private WebElement BannersDrpDwn;
    
    @FindBy(xpath="//span[.='Transactions']")private WebElement TransactionsLnk;
    
    @FindBy(xpath="//span[.='Coupons']")private WebElement CouponsDrpDwn;
    
    @FindBy(xpath="//span[.='Gift Cards']")private WebElement GiftCardsDrpDwn;
    
    @FindBy(xpath="//span[.='Settings']")private WebElement SettingsDrpDwn;
  
    
	//Rule-3:Create a constructor to initilise these elements
    
	public DashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Rule-4:Provide getters to access these variables

	public WebElement getUserNameDrpDwn() {
		return UserNameDrpDwn;
	}

	public WebElement getCloseAllElementsBtn() {
		return CloseAllElementsBtn;
	}

	public WebElement getOpenAllElementsBtn() {
		return OpenAllElementsBtn;
	}

	public WebElement getMyProfileLnk() {
		return MyProfileLnk;
	}

	public WebElement getTransactionsLnk() {
		return TransactionsLnk;
	}

	public WebElement getUsersDrpDwn() {
		return UsersDrpDwn;
	}

	public WebElement getSchemesDrpDwn() {
		return SchemesDrpDwn;
	}

	public WebElement getEcommerceDrpDwn() {
		return EcommerceDrpDwn;
	}

	public WebElement getBannersDrpDwn() {
		return BannersDrpDwn;
	}

	public WebElement getCouponsDrpDwn() {
		return CouponsDrpDwn;
	}

	public WebElement getGiftCardsDrpDwn() {
		return GiftCardsDrpDwn;
	}

	public WebElement getSettingsDrpDwn() {
		return SettingsDrpDwn;
	}
	
	//Business Libraries
	
	public void clickOnMyProfileLink() throws Exception
	{
		Thread.sleep(3000);
		MyProfileLnk.click();
	}
	

	
	
}
