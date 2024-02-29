package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {

	//Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//a[.='User KYC']")private WebElement UserKycLnk;
    
    @FindBy(xpath="//a[.='Users List']")private WebElement UserListLnk;
    	
  
	//Rule-3:Create a constructor to initilise these elements
    
	public UsersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    

	//Rule-4:Provide getters to access these variables

	public WebElement getUserKycLnk() {
		return UserKycLnk;
	}


	public WebElement getUserListLnk() {
		return UserListLnk;
	}
	
	//Business Libraries
	
	public void clickOnUserKycLnk()
	{
		UserKycLnk.click();
	}
	
	public void clickOnUserListLnk()
	{
		UserListLnk.click();
	}
	
}
