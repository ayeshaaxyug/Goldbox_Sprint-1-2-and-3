package sprint_3_Positive;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import genericUtility.FMS_BaseClass;
import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.DashboardPage;
import objectRepository.EcommercePage;
import objectRepository.Ecommerce_EcommerceOrdersPage;
import objectRepository.Ecommerce_EcommerceOrders_FilterPage;
import objectRepository.Ecommerce_EcommerceOrders_OrderedProductsPage;
import objectRepository.Ecommerce_EcommerceOrders_StatusPage;

public class E_ECommerce_Orders_All_Actions extends FMS_BaseClass {
	
	WebDriverUtility wUtil = new WebDriverUtility();
	
	String CustomerName = "Ayesha Shaik";
	int OrderId = 585;
	String StartDate = "22/02/2024";
	String EndDate = "25/02/2024";
	String MobileNumber = "918500298784";
	
	@Test
	public void eCommerceOrders()throws Exception
	{
        Thread.sleep(5000);
        
        DashboardPage dbPage = new DashboardPage(driver);
        dbPage.getEcommerceDrpDwn().click();
        
        Thread.sleep(2000);
        
        EcommercePage ePage = new EcommercePage(driver);
        ePage.getEcommerceOrdersLnk().click();
        
        Thread.sleep(5000);
        
        Ecommerce_EcommerceOrdersPage eeoPage = new Ecommerce_EcommerceOrdersPage(driver);
        eeoPage.searchCustomer(CustomerName);
        
        Thread.sleep(2000);
        
        eeoPage.clickOnParticularProductViewBtn(driver, OrderId);
        
        Ecommerce_EcommerceOrders_OrderedProductsPage eeopPage = new Ecommerce_EcommerceOrders_OrderedProductsPage(driver);
        eeopPage.clickOnCloseOrderedPageButton();
        
        Thread.sleep(2000);
        
        eeoPage.getActionStatusBtn().click();
        
        Thread.sleep(2000);
        
        Ecommerce_EcommerceOrders_StatusPage eesPage = new Ecommerce_EcommerceOrders_StatusPage(driver);
        eesPage.clickOnStatusPageCloseBtn();
        
        Thread.sleep(2000);
        
        eeoPage.clickOnParticularProductStatusBtn(OrderId, driver);
        
        Thread.sleep(2000);
        
        eesPage.clickOnStatusPageCloseBtn();
        
        Thread.sleep(2000);
        
        eeoPage.getFilterBtn().click();
        
        Thread.sleep(2000);
        
        Ecommerce_EcommerceOrders_FilterPage eefPage = new Ecommerce_EcommerceOrders_FilterPage(driver);
        eefPage.searchDateStatusMobileNumberWiseInFilter(driver, StartDate, EndDate, MobileNumber);
        
        
        
        
       
	}
}