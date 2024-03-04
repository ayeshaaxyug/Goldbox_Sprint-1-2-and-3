package sprint_3_Positive;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtility.FMS_BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.DashboardPage;
import objectRepository.EcommercePage;
import objectRepository.Ecommerce_EcomTransactionsPage;

public class F_ECommerce_Transactions_All_Actions extends FMS_BaseClass {
	
	@Test
	public void a_ECommerceTransactionsTest() throws Exception
	{
        Thread.sleep(5000);
        DashboardPage dbPage = new DashboardPage(driver);
        dbPage.getEcommerceDrpDwn().click();
        
        Thread.sleep(2000);
        EcommercePage ePage = new EcommercePage(driver);
        ePage.getEcomTransactionsLnk().click();
        
        Thread.sleep(2000);
        Ecommerce_EcomTransactionsPage eePage = new Ecommerce_EcomTransactionsPage(driver);
        eePage.s
        
		
	}

}
