package sprint_3_Negative;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class E_Commerce_Orders {
	
	WebDriverUtility w = new WebDriverUtility();
	
	//66TC
	
	@Test(groups = "Sprint-3", priority = 1)
	public void a_ordersToAndFromDateTest()throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//a[.='Ecommerce Orders']")).click();
        Thread.sleep(7000);
        
        WebElement SearchDateEdt = driver.findElement(By.xpath("//input[@placeholder='Search...']"));
        SearchDateEdt.sendKeys("3/5/2024 - 3/22/2024");
        
        try 
        {
        	if (SearchDateEdt.isDisplayed()) 
            {
    			w.takeScreenShot(driver, "a_ordersToAndFromDateTest");
    			Thread.sleep(2000);	
    		}
        	else 
        	{
        		System.out.println("Orders Are Available");
			}
		} 
        finally 
        {
			driver.quit();
		}
        
        	
	}
	
	//67TC
	
	@Test(groups = "Sprint-3", priority = 2)
	public void b_ordersEnteringInvalidMobileNumberTest()throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//a[.='Ecommerce Orders']")).click();
        Thread.sleep(7000);
		
        WebElement SearchDateEdt = driver.findElement(By.xpath("//input[@placeholder='Search...']"));
        SearchDateEdt.sendKeys("'9666441040");
        
        try 
        {
        	if (SearchDateEdt.isDisplayed()) 
            {
    			w.takeScreenShot(driver, "b_ordersEnteringInvalidMobileNumberTest");
    			Thread.sleep(2000);
    		}
            else 
            {
                System.out.println("Orders Are Available");
    		}
		} finally 
        {
			driver.quit();
		}
	    
	}
	
	//68TC
	
	@Test(groups = "Sprint-3", priority = 3)
	public void c_ordersEnteringInFilterOptionTest()throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//a[.='Ecommerce Orders']")).click();
        Thread.sleep(7000);
        driver.findElement(By.xpath("//a[@class='btn btn-filter']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Start date']")).sendKeys("22/02/2024");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='End date']")).sendKeys("25/02/2024");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='mat-mdc-form-field-infix ng-tns-c12-3']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[.='Order Accepted']")).click();
        Thread.sleep(2000);
        
        WebElement MobileNumberEdt = driver.findElement(By.xpath("//input[@placeholder='Mobile number']"));
        MobileNumberEdt.sendKeys("9666441040");
        
        try 
        {
        	if(MobileNumberEdt.isDisplayed()) 
            {
    			w.takeScreenShot(driver, "c_ordersEnteringInFilterOptionTest");
    			Thread.sleep(7000);
    			driver.quit();
    		}
            else 
            {
                System.out.println("Orders Are Available");
    		}
		} 
        finally 
        {
        	driver.quit();
		}
		
        
		
		
	}
		
	//69
	
	@Test(groups = "Sprint-3", priority = 4)
	public void d_ordersViewButtonErrorTest() throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//a[.='Ecommerce Orders']")).click();
        Thread.sleep(7000);
        
        Actions act = new Actions(driver);
        act.moveByOffset(200, 0).perform();
        
        //act.moveToElement(WeightEle).perform();
        Thread.sleep(2000);
        
        Robot s = new Robot();
        
        s.keyPress(KeyEvent.VK_PAGE_DOWN);
        s.keyRelease(KeyEvent.VK_PAGE_DOWN);
        
        WebElement ViewBtn = driver.findElement(By.xpath("//td[.='Mar 4, 2024']/..//td[.='862']/..//td[.='DASARI JAGADEESH']/..//td[.='916304917977']/..//td//button[@class='btn-sm btn-danger btn-view mr-2 position-relative']"));
        Thread.sleep(2000);
        
        try 
        {
        	if(ViewBtn.isDisplayed())
            {
    			w.takeScreenShot(driver, "d_ordersViewButtonErrorTest");
    			Thread.sleep(2000);
    			Assert.fail();
    			Thread.sleep(2000);
    		} 
            else 
            {
                 System.out.println("View is Not Displaying");
    		}
		} 
        finally 
        {
        	driver.quit();
		} 
		
		
	}
	
	//70TC
	
	@Test(groups = "Sprint-3", priority = 5)
	public void e_ordersStatusButtonTest()throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//a[.='Ecommerce Orders']")).click();
        Thread.sleep(7000);
        
        Actions act = new Actions(driver);
        act.moveByOffset(200, 0).perform();
        
        //act.moveToElement(WeightEle).perform();
        Thread.sleep(2000);
        
        Robot s = new Robot();
        
        s.keyPress(KeyEvent.VK_PAGE_DOWN);
        s.keyRelease(KeyEvent.VK_PAGE_DOWN);
        
        WebElement ViewBtn = driver.findElement(By.xpath("//td[.='Mar 4, 2024']/..//td[.='862']/..//td[.='DASARI JAGADEESH']/..//td[.='916304917977']/..//td//button[@class='btn-sm btn-edit mr-2']"));
        Thread.sleep(2000);
        
        try 
        {
        	if(ViewBtn.isDisplayed())
            {
    			w.takeScreenShot(driver, "e_ordersStatusButtonTest");
    			Thread.sleep(2000);
    			Assert.fail();
    			Thread.sleep(2000);
    		} 
            else 
            {
                 System.out.println("View is Not Displaying");
    		}
		} 
        finally 
        {
        	driver.quit();
		}
		
	}
}


