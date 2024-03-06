package sprint_3_Positive;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import genericUtility.FMS_BaseClass;
import genericUtility.JavaUtility;
import objectRepository.DashboardPage;
import objectRepository.EcommercePage;
import objectRepository.Ecommerce_Product_DescriptionPage;
import objectRepository.Ecommerce_ProductsListPage;
import objectRepository.Ecommerce_Products_AddProductSizesPage;
import objectRepository.Ecommerce_Products_AddProductStonePage;
import objectRepository.Ecommerce_Products_AddProductsPage;
import objectRepository.Ecommerce_Products_ProductSizesPage;
import objectRepository.Ecommerce_Products_ProductStonePage;
import objectRepository.Ecommerce_UpdateProductDetailsPage;
import objectRepository.Ecommerce_UpdateProductSizesPage;
import objectRepository.Ecommerce_UpdateProductStone_But_UpdateProductSizePage;

@Listeners(genericUtility.ListnersImplementationClass.class)
public class C_ECommerce_Product_All_Actions extends FMS_BaseClass {
	
    JavaUtility jUtil = new JavaUtility();
	String Bangles = "Bangles"+jUtil.getRandomNum();
	String ProductName = "Ring";
	String VaPercent = "10";
	String Price = "35000";
	String Size = "8";
	String Weight = "6";
	String Description = "Good Product";
	String AddSize = "9";
	String AddWeight = "4";
	String EditSize = "5";
	String EditWeight = "3";
	
	String StoneName = "Black Pearl", StoneColour = "Black", StonePrice = "2000", NoOfStones = "2";
	String EditStoneName = "White Pearl", EditStoneColour = "White", EditPrice = "4000", EditNoOfStones = "3";
	String PEditProductName = "Bangles", PEditVaPercent = "12", PEditPrice = "36000", PEditSize = "10", PEditWeight = "10", PEditDescription = "Excellent Product";
	
	@Test (groups = "sprint-3", priority = 1)
	 public void eCommerceProductInfo() throws Exception
	{
		Thread.sleep(5000);
		DashboardPage dPage = new DashboardPage(driver);
		dPage.getEcommerceDrpDwn().click();
		
		Thread.sleep(2000);
        EcommercePage ePage = new EcommercePage(driver);
        ePage.getProductsLnk().click();
        
        Thread.sleep(2000);
        Ecommerce_ProductsListPage epPage = new Ecommerce_ProductsListPage(driver);
        epPage.getAddProductBtn().click();
        
        Thread.sleep(2000);
        Ecommerce_Products_AddProductsPage epapPage = new Ecommerce_Products_AddProductsPage(driver);
        epapPage.AddingProduct(driver, ProductName, VaPercent, Price, Size, Weight, Description);
        
        Thread.sleep(2000);
        epPage.clickOnParticularProductWeightInfoBtn(driver, ProductName);
        
        Thread.sleep(2000);
        Ecommerce_Products_ProductSizesPage eppsPage = new Ecommerce_Products_ProductSizesPage(driver);
        eppsPage.getAddProductSizesBtn().click();
        
        Thread.sleep(2000);
        Ecommerce_Products_AddProductSizesPage epapsPage = new Ecommerce_Products_AddProductSizesPage(driver);
        epapsPage.addProductSize(AddSize, AddWeight);
        
        eppsPage.clickOnParticularProductEditBtn(driver, ProductName, AddSize, AddWeight);
        
        Thread.sleep(2000);
        Ecommerce_UpdateProductSizesPage eupsPage = new Ecommerce_UpdateProductSizesPage(driver);
        eupsPage.editProductSize(EditSize, EditWeight);
        
        Thread.sleep(2000);
        eppsPage.clickOnParticularProductBootstrapBtn(driver, ProductName, EditSize, EditWeight);
        
        Thread.sleep(2000);
        eppsPage.clickOnParticularProductDeleteBtn(driver, ProductName, EditSize, EditWeight);
        
        Thread.sleep(2000);
        ePage.getProductsLnk().click();
        
        Thread.sleep(2000);
        epPage.clickOnParticularProductStonesViewBtn(driver, ProductName);
        
        Thread.sleep(2000);
        Ecommerce_Products_ProductStonePage eppstPage = new Ecommerce_Products_ProductStonePage(driver);
        eppstPage.getAddProductStoneBtn().click();
        
        Thread.sleep(2000);
        Ecommerce_Products_AddProductStonePage epapstPage = new Ecommerce_Products_AddProductStonePage(driver);
        epapstPage.addingProductStone(StoneName, StoneColour, StonePrice, NoOfStones);
        
        Thread.sleep(2000);
        eppstPage.clickOnParticularStonetEditButton(driver, StoneName);
        
        Thread.sleep(2000);
        Ecommerce_UpdateProductStone_But_UpdateProductSizePage eupstPage = new Ecommerce_UpdateProductStone_But_UpdateProductSizePage(driver);
        eupstPage.editProductStone(EditStoneName, EditStoneColour, EditPrice, EditNoOfStones);
        
        Thread.sleep(2000);
        eppstPage.clickOnParticularStoneBootstrapButton(driver, EditStoneName);
        
        Thread.sleep(2000);
        eppstPage.clickOnParticularStoneDeleteButton(driver, EditStoneName);
        
        Thread.sleep(2000);
        ePage.getProductsLnk().click();
        
        Thread.sleep(2000);
        epPage.clickOnParticularProductDescriptionViewBtn(driver, ProductName);
        
        Thread.sleep(2000);
        Ecommerce_Product_DescriptionPage epdPage = new Ecommerce_Product_DescriptionPage(driver);
        epdPage.getUnderstandBtn().click();
        
        Thread.sleep(2000);
        epPage.clickOnParticularProductActionEdtBtn(driver, ProductName);
        
        Thread.sleep(2000);
        Ecommerce_UpdateProductDetailsPage eupdPage = new Ecommerce_UpdateProductDetailsPage(driver);
        eupdPage.editProductDetails(driver, PEditProductName, PEditVaPercent, PEditPrice, PEditSize, PEditWeight, PEditDescription);
        
        Thread.sleep(2000);
        epPage.clickOnParticularProductBootStrapBtn(driver, PEditProductName);
        
        Thread.sleep(2000);
        epPage.clickOnParticularProductDeleteBtn(driver, PEditProductName);
             
	}
	

}
