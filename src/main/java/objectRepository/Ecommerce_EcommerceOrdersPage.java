package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.WebDriverUtility;

public class Ecommerce_EcommerceOrdersPage {

	WebDriverUtility wUtil = new WebDriverUtility();
	
    //Rule-1 :- Find Web-Elements using FindBy Annotations
    
	@FindBy(xpath="//a[@class='btn btn-filter']")private WebElement FilterBtn;
	
    @FindBy(xpath="//input[@placeholder='Search...']")private WebElement SearchEdt;
    
    @FindBy(xpath="//td[.='585']/following-sibling::td/button[text()=' View ']")private WebElement ProductsViewBtn;
    
    @FindBy(xpath="//td[.='585']/following-sibling::td/button[.=' Status ']")private WebElement ActionStatusBtn;
    
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


	public WebElement getFilterBtn() {
		return FilterBtn;
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
	
	public void searchCustomer(String CustomerName)
	{
		SearchEdt.sendKeys(CustomerName);
	}
	
	public void clickOnParticularProductViewBtn(WebDriver driver, int OrderId)
	{
		driver.findElement(By.xpath("//td[.='"+OrderId+"']/following-sibling::td/button[text()=' View ']")).click();
	}
	
	
	public void clickOnParticularProductStatusBtn(int orderId, WebDriver driver) 
	{
		driver.findElement(By.xpath("//td[.='"+orderId+"']/following-sibling::td/button[.=' Status ']")).click();	
	}
	
	
	
}
