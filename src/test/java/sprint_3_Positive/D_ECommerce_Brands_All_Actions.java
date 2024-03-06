package sprint_3_Positive;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import genericUtility.FMS_BaseClass;
import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;
import objectRepository.DashboardPage;
import objectRepository.EcommercePage;
import objectRepository.Ecommerce_BrandsPage;
import objectRepository.Ecommerce_Brands_AddBrandPage;
import objectRepository.Ecommerce_Brands_UpdateBrandPage;

@Listeners(genericUtility.ListnersImplementationClass.class)
public class D_ECommerce_Brands_All_Actions extends FMS_BaseClass {
	
	JavaUtility jUtil = new JavaUtility();
	WebDriverUtility wUtil = new WebDriverUtility();
	
	String BrandName = "BrandName"+jUtil.getRandomNum();
	
	@Test(groups = "sprint-3", priority = 1)
	public void a_addingBrandTest()throws Exception
	{
		Thread.sleep(5000);
		
        DashboardPage dbPage = new DashboardPage(driver);
        dbPage.getEcommerceDrpDwn().click();
        
        Thread.sleep(2000);
        
        EcommercePage ePage = new EcommercePage(driver);
        ePage.getBrandsLnk().click();
        
        Thread.sleep(2000);
        
        Ecommerce_BrandsPage ebPage = new Ecommerce_BrandsPage(driver);
        ebPage.getAddBrandBtn().click();
        
        Thread.sleep(2000);
        
        Ecommerce_Brands_AddBrandPage eabPage = new Ecommerce_Brands_AddBrandPage(driver);
        eabPage.addingBrand(driver, BrandName);
        
        Thread.sleep(2000);
        
        
	}
	
	   
	@Test(groups = "sprint-3", priority = 2)
	public void b_updateBrandTest() throws Exception
	{
        Thread.sleep(5000);
		
        DashboardPage dbPage = new DashboardPage(driver);
        dbPage.getEcommerceDrpDwn().click();
        
        Thread.sleep(2000);
        
        EcommercePage ePage = new EcommercePage(driver);
        ePage.getBrandsLnk().click();
        
        Thread.sleep(2000);
        
        Ecommerce_BrandsPage ebPage = new Ecommerce_BrandsPage(driver);
        ebPage.getAddBrandBtn().click();
        
        Thread.sleep(2000);
        
        Ecommerce_Brands_AddBrandPage eabPage = new Ecommerce_Brands_AddBrandPage(driver);
        eabPage.addingBrand(driver, BrandName);
        
        Thread.sleep(2000);
        
        ebPage.clickOnParticularBrandEditBtn(driver, BrandName);
        
        Thread.sleep(2000);
        
        Ecommerce_Brands_UpdateBrandPage ecesPage = new Ecommerce_Brands_UpdateBrandPage(driver);
        ecesPage.updatingBrand(driver, BrandName);
        		
		
	}
	
	
	@Test(groups = "sprint-3", priority = 3)
	public void c_ClickOnParticularBrandEnableDisableBootStrapButton()throws Exception
	{
		Thread.sleep(5000);
        
		DashboardPage dbPage = new DashboardPage(driver);
        dbPage.getEcommerceDrpDwn().click();
        
        Thread.sleep(2000);
        
        EcommercePage ePage = new EcommercePage(driver);
        ePage.getBrandsLnk().click();
        
        Thread.sleep(2000);
        
        Ecommerce_BrandsPage ebPage = new Ecommerce_BrandsPage(driver);
        ebPage.getAddBrandBtn().click();
        
        Thread.sleep(2000);
        
        Ecommerce_Brands_AddBrandPage eabPage = new Ecommerce_Brands_AddBrandPage(driver);
        eabPage.addingBrand(driver, BrandName);
        
        Thread.sleep(2000);
       
        ebPage.clickOnParticularBrandBootStrapBtn(driver, BrandName);
       
        
	
	}
	
	
	@Test(groups = "sprint-3", priority = 3)
	public void d_deletingParticularBrandTest() throws Exception
	{
        Thread.sleep(5000);
        
        DashboardPage dbPage = new DashboardPage(driver);
        dbPage.getEcommerceDrpDwn().click();
        
        Thread.sleep(2000);
        
        EcommercePage ePage = new EcommercePage(driver);
        ePage.getBrandsLnk().click();
        
        Thread.sleep(2000);
        
        Ecommerce_BrandsPage ebPage = new Ecommerce_BrandsPage(driver);
        ebPage.getAddBrandBtn().click();
        
        Thread.sleep(2000);
        
        Ecommerce_Brands_AddBrandPage eabPage = new Ecommerce_Brands_AddBrandPage(driver);
        eabPage.addingBrand(driver, BrandName);
        
        Thread.sleep(2000);
        
        ebPage.clickOnParticularBrandDeleteBtn(driver, BrandName);
        
		
	}
	
 }
