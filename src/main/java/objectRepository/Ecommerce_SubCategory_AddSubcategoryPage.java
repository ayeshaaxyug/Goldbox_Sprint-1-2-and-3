package objectRepository;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import genericUtility.WebDriverUtility;

public class Ecommerce_SubCategory_AddSubcategoryPage {

    @FindBy(xpath="//h1[.='Add SubCategory']/following-sibling::button[@aria-label='Close']")private WebElement CloseBtn;
    
    @FindBy(xpath="//h1[.='Add SubCategory']/..//following-sibling::div//select[@placeholder='Select Category']")private WebElement CategoryNameDrpDwn;
    
    @FindBy(xpath="//h1[.='Add SubCategory']/..//following-sibling::div//input[@placeholder='Enter SubCategory Name']")private WebElement SubCategoryNameEdt;
    
    @FindBy(xpath="//h1[.='Add SubCategory']/..//following-sibling::div//select[@placeholder='Select Type']")private WebElement SelectTypeDrpDwn;
    
    @FindBy(xpath="//h1[.='Add SubCategory']/..//following-sibling::div//input[@formcontrolname='image_uri']")private WebElement ChooseFileBtn;
    
    @FindBy(xpath="//h1[.='Add SubCategory']/..//following-sibling::div//button[.='Add']")private WebElement AddBtn;
	
    @FindBy(xpath="(//div[.=' Subcategory Added Successfully '])[2]")private WebElement SuccessEle;
    
	//Rule-3:Create a constructor to initilise these elements
    
	public Ecommerce_SubCategory_AddSubcategoryPage(WebDriver driver)
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

	public WebElement getAddBtn() {
		return AddBtn;
	}
	
	public WebElement getSuccessEle() {
		return SuccessEle;
	}
	
	
	//Create Business Library

	public void addSubCategory(WebDriver driver, String CategoryName, String SubCategoryName) throws Exception
	{
		Robot r = new Robot();
		
		WebDriverUtility wUtil = new WebDriverUtility();
		
		Thread.sleep(2000);
		wUtil.handleDropdownByVisibleText(CategoryName, CategoryNameDrpDwn);
		Thread.sleep(2000);
		SubCategoryNameEdt.sendKeys(SubCategoryName);
		Thread.sleep(2000);
		wUtil.handleDropdownByIndex(SelectTypeDrpDwn, 1);
		Thread.sleep(2000);
		
		
        wUtil.clickOnChooseFileOption(driver, ChooseFileBtn);
		
        r.keyPress(KeyEvent.VK_CONTROL);
        r.delay(2000);
        StringSelection ss = new StringSelection("C:\\Users\\vikra\\OneDrive\\Desktop\\One Drive Folder\\OneDrive\\Pictures\\Saved Pictures\\Necklace.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
        r.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        AddBtn.click();
        Thread.sleep(2000);
        
        Thread.sleep(1000);
        if(SuccessEle.isDisplayed())
        {
        	System.out.println("SubCatogery Added Successfully");
        }
        else
        {
    		System.out.println("SubCategory Not Added");
    		Assert.fail();
    	}
		
	}
	
}
