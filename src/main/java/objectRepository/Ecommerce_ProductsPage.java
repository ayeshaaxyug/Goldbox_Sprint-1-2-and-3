package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ecommerce_ProductsPage {
    
	//Rule-1 :- Find Web-Elements using FindBy Annotations
	
    @FindBy(xpath="//input[@placeholder='Search...']")private WebElement SearchEdt;
    
    @FindBy(xpath="//button[@data-bs-target='#addproduct']")private WebElement AddProductBtn;
    
    @FindBy(xpath="(//td[.='ear rings']/following-sibling::td/button[.=' Info '])[1]")private WebElement WeightSizeInfoBtn;
    
    @FindBy(xpath="((//td[.='ear rings']/following-sibling::td/button[.=' Info '])[1]/../following-sibling::td/button[.=' View '])[1]")private WebElement StonesViewBtn;
    
    @FindBy(xpath="((//td[.='ear rings']/following-sibling::td/button[.=' Info '])[1]/../following-sibling::td/button[.=' View '])[1]/../following-sibling::td/button[.=' View ']")private WebElement DescriptionViewBtn;
    
    @FindBy(xpath="((//td[.='ear rings']/following-sibling::td/button[.=' Info '])[1]/../following-sibling::td/button[.=' View '])[1]/../following-sibling::td/button[.=' View ']/../following-sibling::td/button")private WebElement ActionEditBtn;
    
    @FindBy(xpath="((//td[.='ear rings']/following-sibling::td/button[.=' Info '])[1]/../following-sibling::td/button[.=' View '])[1]/../following-sibling::td/button[.=' View ']/../following-sibling::td/button/..//div[@class='mdc-switch__ripple']")private WebElement ActionEnableDisableBootStrapBtn;
    
    @FindBy(xpath="//a[text()=' Next ']")private WebElement NextPageLnk;
    
    @FindBy(xpath="//span[text()=' Prev ']")private WebElement PreviousPageLnk;
	
  
	//Rule-3:Create a constructor to initilise these elements
    
	public Ecommerce_ProductsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	//Rule-4 :- Provide getters to access these variables

	public WebElement getSearchEdt() {
		return SearchEdt;
	}


	public WebElement getAddProductBtn() {
		return AddProductBtn;
	}


	public WebElement getWeightSizeInfoBtn() {
		return WeightSizeInfoBtn;
	}


	public WebElement getStonesViewBtn() {
		return StonesViewBtn;
	}


	public WebElement getDescriptionViewBtn() {
		return DescriptionViewBtn;
	}


	public WebElement getActionEditBtn() {
		return ActionEditBtn;
	}


	public WebElement getActionEnableDisableBootStrapBtn() {
		return ActionEnableDisableBootStrapBtn;
	}


	public WebElement getNextPageLnk() {
		return NextPageLnk;
	}


	public WebElement getPreviousPageLnk() {
		return PreviousPageLnk;
	}
	
	
	//Create Business Library
	
	
	
	
}
