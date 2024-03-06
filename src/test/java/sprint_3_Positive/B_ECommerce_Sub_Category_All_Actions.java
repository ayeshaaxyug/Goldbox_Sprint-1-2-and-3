package sprint_3_Positive;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import genericUtility.FMS_BaseClass;
import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;
import objectRepository.DashboardPage;
import objectRepository.EcommercePage;
import objectRepository.Ecommerce_SubCategoryPage;
import objectRepository.Ecommerce_SubCategory_AddSubcategoryPage;
import objectRepository.Ecommerce_SubCategory_EditSubcategoryPage;

@Listeners(genericUtility.ListnersImplementationClass.class)
public class B_ECommerce_Sub_Category_All_Actions extends FMS_BaseClass {
	
	JavaUtility jUtil = new JavaUtility();
	
	WebDriverUtility wUtil = new WebDriverUtility();
	
	String Rings = "Rings"+jUtil.getRandomNum();
	
	@Test(groups = "sprint-3", priority = 1)
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
	
	@Test(groups = "sprint-3", priority = 2)
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
	
    @Test(groups = "sprint-3", priority = 3)
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
	
	 @Test(groups = "sprint-3", priority = 4)
	 public void a4_clickOnParticularBootStrapButtonToEnablingOrDisablingCategoryTest()throws Exception
	 {
		 String CategoryName = "Bangles";
		 String SubCategoryName = "Chains"+jUtil.getRandomNum();
		 
		 Thread.sleep(5000);
		 
		 DashboardPage dbPage = new DashboardPage(driver);
		 dbPage.getEcommerceDrpDwn().click();
	
	     Thread.sleep(2000);
	     
	     EcommercePage ecPage = new EcommercePage(driver);
	     ecPage.getSubCategoryLnk().click();
	     
	     Thread.sleep(2000);
	     
	     Ecommerce_SubCategoryPage esPage = new Ecommerce_SubCategoryPage(driver);
	     esPage.getAddSubCategoryBtn().click();
	     
	     Thread.sleep(2000);
	     
	     Ecommerce_SubCategory_AddSubcategoryPage ecscascPage = new Ecommerce_SubCategory_AddSubcategoryPage(driver);
	     ecscascPage.addSubCategory(driver, CategoryName, SubCategoryName);
	     
	     Thread.sleep(2000);
	     
	     Ecommerce_SubCategoryPage escPage = new Ecommerce_SubCategoryPage(driver);
	     escPage.clickOnParticularCategoryBootstrapBtn(driver, CategoryName, SubCategoryName);
	     
		 Thread.sleep(2000);
		 
		 escPage.clickOnParticularSubCategoryDeleteBtn(driver, CategoryName, SubCategoryName);
		 
	 }
	

}
