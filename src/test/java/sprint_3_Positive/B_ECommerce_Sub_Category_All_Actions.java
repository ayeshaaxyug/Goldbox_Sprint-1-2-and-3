package sprint_3_Positive;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import genericUtility.FMS_BaseClass;
import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.DashboardPage;
import objectRepository.EcommercePage;
import objectRepository.Ecommerce_SubCategoryPage;
import objectRepository.Ecommerce_SubCategory_AddSubcategoryPage;
import objectRepository.Ecommerce_SubCategory_EditSubcategoryPage;

public class B_ECommerce_Sub_Category_All_Actions extends FMS_BaseClass {
	
	JavaUtility jUtil = new JavaUtility();
	WebDriverUtility wUtil = new WebDriverUtility();
	
	String Rings = "Rings"+jUtil.getRandomNum();
	
	@Test
	public void a1_searching1CategoryTest()throws Exception 
	{
		Thread.sleep(2000);
		
		DashboardPage dbPage = new DashboardPage(driver);
		dbPage.getEcommerceDrpDwn().click();
		
        Thread.sleep(2000);
        
        EcommercePage ecPage = new EcommercePage(driver);
        ecPage.getSubCategoryLnk().click();
        
        Thread.sleep(2000);
        
        Ecommerce_SubCategoryPage ecscPage = new Ecommerce_SubCategoryPage(driver);
        ecscPage.getSearchEdt().sendKeys("Necklace");
        
        
	}
	
	@Test
	public void a2_adding1SubCategoryTest() throws Exception
	{
		
		String CategoryName = "Necklace";;
		String SubCategoryName = "Chains"+jUtil.getSingleRandomnumber();;
		
        Thread.sleep(2000);
		
		DashboardPage dbPage = new DashboardPage(driver);
		dbPage.getEcommerceDrpDwn().click();
		
        Thread.sleep(2000);
        
        EcommercePage ecPage = new EcommercePage(driver);
        ecPage.getSubCategoryLnk().click();
        
        Thread.sleep(2000);
        
        Ecommerce_SubCategoryPage ecscPage = new Ecommerce_SubCategoryPage(driver);
        ecscPage.getAddSubCategoryBtn().click();
        
        Thread.sleep(2000);
        
        Ecommerce_SubCategory_AddSubcategoryPage ecscascPage = new Ecommerce_SubCategory_AddSubcategoryPage(driver);
        ecscascPage.addSubCategory(driver, CategoryName, SubCategoryName);
                  
	}
	
    @Test
	public void a3_editing1SubCategoryTest() throws Exception    //Pending
	{
    	String CategoryName = "Bangles";;
		String SubCategoryName = "Chains"+jUtil.getRandomNum();
		String EditCategoryName = "Gold Chains";;
		String EditSubCategoryName = "Chains"+jUtil.getRandomNum();
		
		
        Thread.sleep(2000);
		
		DashboardPage dbPage = new DashboardPage(driver);
		dbPage.getEcommerceDrpDwn().click();
		
        Thread.sleep(2000);
        
        EcommercePage ecPage = new EcommercePage(driver);
        ecPage.getSubCategoryLnk().click();
        
        Thread.sleep(2000);
        
        Ecommerce_SubCategoryPage ecscPage = new Ecommerce_SubCategoryPage(driver);
        ecscPage.getAddSubCategoryBtn().click();
        
        Thread.sleep(2000);
        
        Ecommerce_SubCategory_AddSubcategoryPage ecscascPage = new Ecommerce_SubCategory_AddSubcategoryPage(driver);
        ecscascPage.addSubCategory(driver, CategoryName, SubCategoryName);
        
        Thread.sleep(2000);
        
        ecscPage.clickOnParticularEditBtn(driver, CategoryName, SubCategoryName);
        
        Thread.sleep(2000);
        
        Ecommerce_SubCategory_EditSubcategoryPage esesPage = new Ecommerce_SubCategory_EditSubcategoryPage(driver);
        esesPage.editingSubCategory(driver, EditCategoryName, EditSubCategoryName);
        
        
	}
	
	 @Test
	 public void a4_bootStrapButtonEnablingOrDisablingTest()throws Exception
	 {
		 String CategoryName = "Necklace";;
		 String SubCategoryName = "Chains"+jUtil.getRandomNum();
		 
		 Thread.sleep(5000);
		 
		 DashboardPage dbPage = new DashboardPage(driver);
		 dbPage.getEcommerceDrpDwn().click();
	
	     Thread.sleep(2000);
	     
	     EcommercePage ecPage = new EcommercePage(driver);
	     ecPage.getSubCategoryLnk().click();
	     
	     Thread.sleep(2000);
	     
	     Ecommerce_SubCategory_AddSubcategoryPage ecscascPage = new Ecommerce_SubCategory_AddSubcategoryPage(driver);
	     ecscascPage.addSubCategory(driver, CategoryName, SubCategoryName);
	     
	     Thread.sleep(2000);
	     
	     Ecommerce_SubCategoryPage escPage = new Ecommerce_SubCategoryPage(driver);
	     escPage.clickOnParticularSchemeBootstrapBtn(driver, CategoryName, SubCategoryName);
	     
		 Thread.sleep(2000);
		 
	 }
	
	 @Test
	 
	 public void a5_deleting1ParticularSubCategory()throws Exception
	 {
		 Thread.sleep(5000);
	     driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//a[.='Sub Category']")).click();
	     Thread.sleep(2000); 
	     driver.findElement(By.xpath("DELETE OPTION"));
	 }

}
