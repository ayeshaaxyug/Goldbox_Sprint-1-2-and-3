package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Users_UserListPage {

	//Finding WebElements Using @FindBy Annotations

	@FindBy(xpath="//input[@placeholder='Search...']")private WebElement SearchEdt;
	
    @FindBy(xpath="//td[.='2556']/following-sibling::td/button[.='Info']")private WebElement InfoBtn;
    
    //Based on user id it should perform action we have to make it dynamic by taking xpath
    @FindBy(xpath="//td[.='2556']/following-sibling::td/button[.='Info']/..//div[@class='mdc-switch__ripple']")private WebElement EnableDisableBootStrapBtn ;
    
    @FindBy(xpath="//a[text()=' Next ']")private WebElement NextPageBtn;
    
    @FindBy(xpath="//a[text()=' Prev ']")private WebElement PreviousPageBtn;
	
  
	//Rule-3:Create a constructor to initilise these elements
    
	public Users_UserListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Rule-4:Provide getters to access these variables

	public WebElement getSearchEdt() {
		return SearchEdt;
	}


	public WebElement getInfoBtn() {
		return InfoBtn;
	}


	public WebElement getEnableDisableBootStrapBtn() {
		return EnableDisableBootStrapBtn;
	}


	public WebElement getNextPageBtn() {
		return NextPageBtn;
	}


	public WebElement getPreviousPageBtn() {
		return PreviousPageBtn;
	}

	
	//Business Libraries
	
	
	
	//Based on user id it should perform action we have to make it dynamic by taking xpath
    //@FindBy(xpath="//td[.='2556']/following-sibling::td/button[.='Info']/..//div[@class='mdc-switch__ripple']")private WebElement EnableDisableBootStrapBtn ;
	
}
