package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ecommerce_SubCategory_EditSubcategoryPage {

    @FindBy(xpath="//h1[.='Update SubCategory']/following-sibling::button[@aria-label='Close']")private WebElement CloseBtn;
    
    @FindBy(xpath="//h1[.='Update SubCategory']/../following-sibling::div//select[@formcontrolname='cid']")private WebElement CategoryNameDrpDwn;
    
    @FindBy(xpath="//h1[.='Update SubCategory']/../following-sibling::div//div//input[@placeholder='Enter SubCategory Name']")private WebElement SubCategoryNameEdt;
    
    @FindBy(xpath="//h1[.='Update SubCategory']/../following-sibling::div//select[@formcontrolname='type']")private WebElement SelectTypeDrpDwn;
    
    @FindBy(xpath="//h1[.='Update SubCategory']/../following-sibling::div//div//input[@formcontrolname='image']")private WebElement ChooseFileBtn;
    
    @FindBy(xpath="//h1[.='Update SubCategory']/../following-sibling::div/following-sibling::div/button[.='Update']")private WebElement UpdateBtn;
	
    @FindBy(xpath="(//div[.=' Sub Category Updated Successfully '])[2]")private WebElement SuccessEle;
    
	//Rule-3:Create a constructor to initilise these elements
    
	public Ecommerce_SubCategory_EditSubcategoryPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Rule-4:Provide getters to access these variables
	
	public WebElement getCloseBtn() {
		return CloseBtn;
	}

	public WebElement getCategoryNameDrpDwn() {
		return CategoryNameDrpDwn;
	}

	public WebElement getSubCategoryNameEdt() {
		return SubCategoryNameEdt;
	}

	public WebElement getSelectTypeDrpDwn() {
		return SelectTypeDrpDwn;
	}

	public WebElement getChooseFileBtn() {
		return ChooseFileBtn;
	}

	public WebElement getUpdateBtn() {
		return UpdateBtn;
	}
	
	public WebElement getSuccessEle() {
		return SuccessEle;
	}
	
	
	//Create Business Library
	
	public void editSubCategory() throws Exception
	{
		Thread.sleep(2000);
		
	}
	
}
