package sprint_3_Negative;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class E_Commerce_Categories {
   
	WebDriverUtility w = new WebDriverUtility();
	
	 //3TC
	 
	 @Test(groups = "Sprint-3", priority = 1)
     public void a_clickOnECommercelink_ECommerceDrpDwnShouldNotDropOptionsErrorTest()throws Exception
     {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    Thread.sleep(2000);
	    driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
	    Thread.sleep(8000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        WebElement Category = driver.findElement(By.xpath("//a[.='Category']"));
        Thread.sleep(2000);
        try 
        {
        	if (Category.isDisplayed()) 
            {
    			w.takeScreenShot(driver, "a_clickOnECommercelink_ECommerceDrpDwnShouldNotDropOptionsErrorTest");
    			Thread.sleep(2000);
            }
        	else 
            {
                System.out.println("Ecommerce is not Dropping Elements");
    		}
		} 
        finally 
        {
        	driver.quit();
        }
        
    }
	
	//4TC
	
	@Test(groups = "Sprint-3", priority = 2)
	public void b_clickOnCategoriesLinkCategoryListPageShouldNotDisplayErrorTest()throws Exception
	{
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    Thread.sleep(2000);
	    driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
	    Thread.sleep(8000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Category']")).click();
        Thread.sleep(2000);
        WebElement CategoryListPage = driver.findElement(By.xpath("//h4[.='Category List']"));
        Thread.sleep(2000);
        
        try 
        {
        	if (CategoryListPage.isDisplayed()) 
            {
    			 w.takeScreenShot(driver,"b_clickOnCategoriesLinkCategoryListPageShouldNotDisplayErrorTest" );
    			 Thread.sleep(2000);
    		} 
            else 
            {
                 System.out.println("Categories are Displayed");
    		}
		} 
        finally 
        {
        	driver.quit();
		}
       
	}
	
	//5TC
	
	@Test(groups = "Sprint-3", priority = 3)
	public void c_searchForAcategoryWhichIsNotAvailableInCategoryListPageErrorTest()throws Exception
	{
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    Thread.sleep(2000);
	    driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
	    Thread.sleep(8000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Category']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("StoneJewllery");
		
        WebElement NoRecordsFindError = driver.findElement(By.xpath("//h5[.='No records found']"));
        try 
        {
			if (NoRecordsFindError.isDisplayed()) 
			{
				Thread.sleep(2000);
		        w.takeScreenShot(driver, "c_searchForAcategoryWhichIsNotAvailableInCategoryListPageErrorTest");
			} 
			else 
			{
                System.out.println();
			}
		} 
        finally 
        {
        	driver.quit();
		}
        
		
	}
	
	//6Th
	@Test(groups = "Sprint-3", priority = 4)
	public void d_clickOnCategoryButtonCategoryListPageShouldNotDisplayErrorTest()throws Exception
	{
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    Thread.sleep(2000);
	    driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
	    Thread.sleep(8000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Category']")).click();
        Thread.sleep(2000);
        WebElement CategoryListPage = driver.findElement(By.xpath("//h4[.='Category List']"));
        Thread.sleep(2000);
        
        try 
        {
        	if (CategoryListPage.isDisplayed()) 
            {
            	w.takeScreenShot(driver,"f_clickOnCategoryButtonCategoryListPageShouldNotDisplayErrorTest" );
            	Thread.sleep(2000);
    		} 
            else
            {
                System.out.println("Category Page is Displayed");
    		}
		}
        finally 
        {
        	driver.quit();
		}
		
		
	}
	
	//7Th
	@Test(groups = "Sprint-3", priority = 5)
	public void g_addingCategoryByGivingNullValuesErrorTest()throws Exception
	{
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    Thread.sleep(2000);
	    driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
	    Thread.sleep(8000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Category']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Category']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add']")).click();
        Thread.sleep(2000);
        WebElement AddCategoryPage = driver.findElement(By.xpath("(//div[.=' All fields are required '])[2]"));
        
        try
        {
        	if (AddCategoryPage.isDisplayed()) 
            {
            	w.takeScreenShot(driver,"g_addingCategoryByGivingNullValuesErrorTest" );
            	Thread.sleep(7000);
            	Assert.fail();
    		} 
            else
            {
                System.out.println("Category Page is Displayed");
    		}
		} 
        finally 
        {
        	driver.quit();
		}
		
	}
	
	//8Th
	@Test(groups = "Sprint-3", priority = 6)
	public void h_addingCategoryByGivingOnlyNameErrorTest()throws Exception
	{
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    Thread.sleep(2000);
	    driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
	    Thread.sleep(8000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Category']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Category']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[@class='modal-title fs-5']/../following-sibling::div//input[@placeholder='Enter Category Name']")).sendKeys("Bangles");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add']")).click();
        Thread.sleep(2000);
        WebElement Error = driver.findElement(By.xpath("(//div[.=' All fields are required '])[2]"));
        
        try 
        {
        	if (Error.isDisplayed())
            {
    			w.takeScreenShot(driver, "h_addingCategoryByGivingOnlyNameErrorTest");
    			Thread.sleep(2000);
    		} 
            else 
            {
            	System.out.println("Category Added Successfully");
    		}
		} 
        finally 
        {
			driver.quit();
		}
        
	}
	
	//9TC
	
	@Test(groups = "Sprint-3", priority = 7)
	public void i_addingCategoryByGivingOnlyImageErrorTest()throws Exception
	{
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    Thread.sleep(2000);
	    driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
	    Thread.sleep(8000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Category']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Category']")).click();
        Thread.sleep(2000);
        
        Robot r = new Robot();
        
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
	    WebElement ChooseFileBtn = driver.findElement(By.xpath("(//h1[@class='modal-title fs-5']/../following-sibling::div//input[@placeholder='No File Chosen'])[1]"));
		
	    WebDriverUtility wUtil = new WebDriverUtility();
        wUtil.clickOnChooseFileOption(driver, ChooseFileBtn);
        
        r.keyPress(KeyEvent.VK_CONTROL);
        r.delay(2000);
        StringSelection ss = new StringSelection("C:\\Users\\vikra\\OneDrive\\Desktop\\One Drive Folder\\OneDrive\\Pictures\\Saved Pictures\\download.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
        r.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add']")).click();
        Thread.sleep(2000);
        WebElement Error = driver.findElement(By.xpath("(//div[.=' All fields are required '])[2]"));
        
        try 
        {
        	if (Error.isDisplayed())
            {
    			w.takeScreenShot(driver, "i_addingCategoryByGivingOnlyImageErrorTest");
    			Thread.sleep(2000);
    			driver.quit();
    		} 
            else 
            {
            	System.out.println("Category Added Successfully");
    		}
		} 
        finally 
        {
			driver.quit();
		}
	}
	
	//10TC
	
	@Test(groups = "Sprint-3", priority = 8)
	public void j_clickOnCloseBtnCategoryPageShouldNotClose()throws Exception
	{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        Thread.sleep(2000);
        driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
        Thread.sleep(8000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Category']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Category']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[@aria-label='Close'])[1]")).click();
        Thread.sleep(2000);
        WebElement CloseBtn = driver.findElement(By.xpath("(//button[@aria-label='Close'])[1]"));
        
        try 
        {
        	if (CloseBtn.isDisplayed())
            {
    			System.out.println("Add Category Page Is Not Closed");
    		} 
            else 
            {
            	w.takeScreenShot(driver, "j_clickOnCloseBtnCategoryPageShouldNotClose");
    			Thread.sleep(2000);
    		}
		} 
        finally 
        {
        	driver.quit();
		}
        
	}
	
	//11TC
	
	@Test(groups = "Sprint-3", priority = 9)
	public void k_clickOnParticularCategoryEditButtonUpdatePageErrorTest()throws Exception
	{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        Thread.sleep(2000);
        driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
        Thread.sleep(8000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Category']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[.='Gold Chains']/..//td[@class='my-td']/following-sibling::td//button[.=' Edit ']")).click();
        Thread.sleep(2000);
        WebElement UpdateCategoryPage = driver.findElement(By.xpath("//h1[.='Update Category']"));
        
		try 
		{
			if (UpdateCategoryPage.isDisplayed()) 
			{
				w.takeScreenShot(driver, "k_clickOnParticularCategoryEditButtonUpdatePageErrorTest");
				Thread.sleep(2000);	
			} 
			else 
			{
	            System.out.println("Category Update Page is Opened");
			}
		} 
		finally 
		{
			driver.quit();
		}
		
	}
	
	//12TC
	
	@Test(groups = "Sprint-3", priority = 10)
	public void l_updatingCategoryByGivingOnlyImagePassErrorTest()throws Exception
	{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
        Thread.sleep(8000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Category']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[.='Gold Chains']/..//td[@class='my-td']/following-sibling::td//button[.=' Edit ']")).click();
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Category']/../following-sibling::div//input[@placeholder='Enter Category Name']")).clear();
        
        Thread.sleep(2000);
        Robot r = new Robot();
        
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
		
        WebElement ChooseFileBtn = driver.findElement(By.xpath("(//h1[@class='modal-title fs-5']/../following-sibling::div//input[@placeholder='No File Chosen'])[2]"));
		
	    WebDriverUtility wUtil = new WebDriverUtility();
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
		
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[.='Update']")).click();
        
        
        try 
        {
//            WebElement Error = driver.findElement(By.xpath("(//div[.=' Please Enter Category Name '])[2]"));
            WebElement SuccessMsg = driver.findElement(By.xpath("(//div[.=' Category Updated Successfully '])[2]"));
            
        	if (SuccessMsg.isDisplayed())
            {
        		Thread.sleep(1000);
        		w.takeScreenShot(driver, "l_updatingCategoryByGivingOnlyImagePassErrorTest");
    		} 
            else 
            {
            	Thread.sleep(1000);
            	w.takeScreenShot(driver, "l_updatingCategoryByGivingOnlyImagePassErrorTest");
			}
		}
        finally 
        {
			driver.quit();
		}
        
	}
        
        //13TC
        
         @Test(groups = "Sprint-3", priority = 11)
         public void m_clickOnCloseBtnUpdateCategoryPageNotCloseErrorTest()throws Exception
         {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
            Thread.sleep(2000);
            driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
            Thread.sleep(8000);
            driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[.='Category']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//td[.='Gold Chains']/..//td[@class='my-td']/following-sibling::td//button[.=' Edit ']")).click();
            Thread.sleep(2000);
            WebElement CloseBtn = driver.findElement(By.xpath("(//h1[@class='modal-title fs-5']/..//button[@aria-label='Close'])[2]"));
            CloseBtn.click();
            try 
            {
            	if (CloseBtn.isDisplayed()) 
                {
    				w.takeScreenShot(driver, "m_clickOnCloseBtnUpdateCategoryPageNotCloseErrorTest");
    				Thread.sleep(2000);
    				Assert.fail();
    			} 
                else 
                {
                	w.takeScreenShot(driver, "m_clickOnCloseBtnUpdateCategoryPageNotCloseErrorTest");
                    System.out.println("Updated Successfully and Update Category Page Closed");
    			}
			} 
            finally 
            {
            	driver.quit();
			}
            
	}
        
        //14TC
        
        @Test(groups = "Sprint-3", priority = 12)
        public void n_clickOnCategoriesBootStrapButtonStatusShouldNotUpdateErrorTest()throws Exception
        {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
            Thread.sleep(2000);
            driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
            Thread.sleep(8000);
            driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[.='Category']")).click();
            Thread.sleep(2000);
            WebElement BootStrapBtn = driver.findElement(By.xpath("//td[.='Gold Chains']/..//td[@class='my-td']/following-sibling::td//button[.=' Edit ']/..//div//div[@class='mdc-switch__icons']"));
            Thread.sleep(2000);
            BootStrapBtn.click();
        	
            try 
            {
            	if (BootStrapBtn.isDisplayed()) 
                {
    				w.takeScreenShot(driver, "n_clickOnCategoriesBootStrapButtonStatusShouldNotUpdateErrorTest");
    				Thread.sleep(2000);
    			} 
                else 
                {
                    System.out.println("Updated Successfylly");
    			}
			} 
            finally 
            {
				driver.close();
			}
        	
        	
        }
        
        //15TC
        
        @Test(groups = "Sprint-3", priority = 13)
        public void o_clickOnParticularCategoryDeleteButtonCategoryShouldNotDeleteErrorTest()throws Exception
        {
        	WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
            Thread.sleep(2000);
            driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
            Thread.sleep(8000);
            driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[.='Category']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//td[.='Gold Chains']/..//td[@class='my-td']/following-sibling::td//button[.=' Edit ']/..//button[@class='btn-sm btn-edit bg-danger']")).click();
            Thread.sleep(2000);
            WebElement CategoryName = driver.findElement(By.xpath("//th[.='Category Name']/../../following-sibling::tbody//td[.='Gold Chains']"));
            
            try 
            {
            	if(CategoryName.isDisplayed()) 
                {
    				w.takeScreenShot(driver, "o_clickOnParticularCategoryDeleteButtonCategoryShouldNotDeleteErrorTest");
    				Thread.sleep(2000);
    			} 
                else
                {
                    System.out.println("Deleted Successfully");
    			}
			} 
            catch (Exception e) 
            {
				driver.quit();
			}
        	
        }
  
        
}
