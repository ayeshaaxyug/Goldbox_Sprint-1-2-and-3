package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ecommerce_EcommerceOrdersPage {

    //Rule-1 :- Find Web-Elements using FindBy Annotations
	
    @FindBy(xpath="//input[@placeholder='Search...']")private WebElement SearchEdt;
    
    @FindBy(xpath="//td[.='Jan 8, 2024']/following-sibling::td[.='207']/..//button[text()=' View ']")private WebElement ProductsViewBtn;
    
    @FindBy(xpath="//td[.='Jan 8, 2024']/following-sibling::td[.='207']/..//button[text()=' Status ']")private WebElement ActionStatusBtn;
  
    
    @FindBy(xpath="//a[text()=' Next ']")private WebElement NextPageLnk;
    
    @FindBy(xpath="//span[text()=' Prev ']")private WebElement PreviousPageLnk;
	
  
	//Rule-2:Create a constructor to initilise these elements
    
	public Ecommerce_EcommerceOrdersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Rule-3 :- Provide getters to access these variables

	public WebElement getSearchEdt() {
		return SearchEdt;
	}


	public WebElement getNextPageLnk() {
		return NextPageLnk;
	}


	public WebElement getPreviousPageLnk() {
		return PreviousPageLnk;
	}


	public WebElement getProductsViewBtn() {
		return ProductsViewBtn;
	}


	public WebElement getActionStatusBtn() {
		return ActionStatusBtn;
	}

	
	
	
	//Rule-4 :- Create Business Library
	
	
	
	
}
