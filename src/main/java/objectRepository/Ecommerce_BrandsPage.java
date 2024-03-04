package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ecommerce_BrandsPage {

    //Rule-1 :- Find Web-Elements using FindBy Annotations
	
    @FindBy(xpath="//input[@placeholder='Search...']")private WebElement SearchEdt;
    
    @FindBy(xpath="//button[@data-bs-target='#addbrand']")private WebElement AddBrandBtn;
    
    @FindBy(xpath="//td[.='Gold Boxx']/following-sibling::td/img[@class='table-img']/../following-sibling::td/button[.=' Edit ']")private WebElement ActionEditBtn;
    
    @FindBy(xpath="//td[.='BrandName1803414']/..//td//img[@class='table-img']/../following-sibling::td//button[.=' Edit ']/..//div[@class='mdc-switch__icons']")private WebElement ActionEnableDisableBootStrapBtn;
    
    @FindBy(xpath="//td[.='BrandName1803414']/..//td//img[@class='table-img']/../following-sibling::td//button[.=' Edit ']/..//button[@class='btn-sm btn-edit bg-danger']")private WebElement DeleteBtn;
    
    @FindBy(xpath="//a[text()=' Next ']")private WebElement NextPageLnk;
    
    @FindBy(xpath="//span[text()=' Prev ']")private WebElement PreviousPageLnk;
	
	//Rule-3:Create a constructor to initilise these elements
    
	public Ecommerce_BrandsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Rule-4 :- Provide getters to access these variables

	public WebElement getSearchEdt() {
		return SearchEdt;
	}

	public WebElement getAddBrandBtn() {
		return AddBrandBtn;
	}

	public WebElement getActionEditBtn() {
		return ActionEditBtn;
	}

	public WebElement getActionEnableDisableBootStrapBtn() {
		return ActionEnableDisableBootStrapBtn;
	}
	
	public WebElement getDeleteBtn() {
		return DeleteBtn;
	}
	
	public WebElement getNextPageLnk() {
		return NextPageLnk;
	}

	public WebElement getPreviousPageLnk() {
		return PreviousPageLnk;
	}

	
	// Create Business Library
	
	public void clickOnParticularBrandEditBtn(WebDriver driver, String BrandName) throws Exception
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[.='"+BrandName+"']/following-sibling::td/img[@class='table-img']/../following-sibling::td/button[.=' Edit ']")).click();
	}
	
	public void clickOnParticularBrandBootStrapBtn(WebDriver driver, String BrandName) throws Exception
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[.='"+BrandName+"']/..//td//img[@class='table-img']/../following-sibling::td//button[.=' Edit ']/..//div[@class='mdc-switch__icons']"));
	}
	
	public void clickOnParticularBrandDeleteBtn(WebDriver driver, String BrandName) throws Exception
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[.='"+BrandName+"']/..//td//img[@class='table-img']/../following-sibling::td//button[.=' Edit ']/..//button[@class='btn-sm btn-edit bg-danger']")).click();
	}
	
	
	
}
