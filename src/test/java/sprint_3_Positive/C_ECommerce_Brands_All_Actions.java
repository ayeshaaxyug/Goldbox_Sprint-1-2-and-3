package sprint_3_Positive;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import genericUtility.FMS_BaseClass;
import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.DashboardPage;
import objectRepository.EcommercePage;
import objectRepository.Ecommerce_BrandsPage;
import objectRepository.Ecommerce_Brands_AddBrandPage;
import objectRepository.Ecommerce_Brands_UpdateBrandPage;

public class C_ECommerce_Brands_All_Actions extends FMS_BaseClass {
	
	JavaUtility jUtil = new JavaUtility();
	WebDriverUtility wUtil = new WebDriverUtility();
	
	String BrandName = "BrandName"+jUtil.getRandomNum();
	
	@Test
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
	
	   
	@Test  
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
	
	
	@Test
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
	
	
	@Test
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
