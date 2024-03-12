package sprint_3_Negative;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class E_Commerce_Brands {
	
	WebDriverUtility w = new WebDriverUtility();
	
	//59TC
	
	@Test(groups = "Sprint-3", priority = 1)
	public void a_addingBrandsByPassingNullValuesErrorTest()throws Exception
	{
		WebDriverManager.chromedriver().setup();
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
        driver.findElement(By.xpath("//a[.='Brands']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Brand']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Brand']/../following-sibling::div//button[.='Add']")).click();
        Thread.sleep(2000);
        
        WebElement Error = driver.findElement(By.xpath("(//div[.=' All fields are required '])[2]"));
        Thread.sleep(2000);
        
        try 
        {
        	if (Error.isDisplayed())
            {
    			w.takeScreenShot(driver, "a_addingBrandsByPassingNullValuesErrorTest");
    			Thread.sleep(2000);
    		}
		} 
        finally 
        {
        	driver.quit();
		}
		
	}
	
	//60TC
	
	@Test(groups = "Sprint-3", priority = 2)
	public void b_addingOnlyBrandNameTest()throws Exception
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
        driver.findElement(By.xpath("//a[.='Brands']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Brand']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Brand']/../following-sibling::div//input[@formcontrolname='name']")).sendKeys("abc");
        Thread.sleep(2000);
        
        WebElement AddBtn = driver.findElement(By.xpath("//h1[.='Add Brand']/../following-sibling::div//button[.='Add']"));
        Thread.sleep(2000);
        
        try 
        {
        	if (AddBtn.isDisplayed())
            {
    			w.takeScreenShot(driver, "b_addingOnlyBrandNameTest");
    			Thread.sleep(2000);
    		}
        	else
        	{
        		System.out.println("Brand Added Auccessfully");
			}
		}
        finally 
        {
        	driver.quit();
		}
		
	}
	
	//61TC
	
	@Test(groups = "Sprint-3", priority = 3)
	public void c_addingOnlyBrandImageTest()throws Exception
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
        driver.findElement(By.xpath("//a[.='Brands']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Brand']")).click();
        Thread.sleep(2000);
        
        Robot r = new Robot();
        
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        
        WebElement ChooseFileBtn = driver.findElement(By.xpath("//h1[.='Add Brand']/../following-sibling::div//input[@formcontrolname='image']"));
        Thread.sleep(2000);
        
        WebDriverUtility wUtil = new WebDriverUtility();
        wUtil.clickOnChooseFileOption(driver, ChooseFileBtn);
        
        r.keyPress(KeyEvent.VK_CONTROL);
        r.delay(2000);
        StringSelection ss = new StringSelection("C:\\Users\\admin\\Pictures\\Saved Pictures\\Bangles.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
        r.keyPress(KeyEvent.VK_ENTER);
		
        Thread.sleep(2000);
        WebElement AddBtn = driver.findElement(By.xpath("//h1[.='Add Brand']/../following-sibling::div//button[.='Add']"));
        Thread.sleep(2000);
        
        try 
        {
        	if(AddBtn.isDisplayed())
            {
    			w.takeScreenShot(driver, "c_addingOnlyBrandImageTest");
    			Thread.sleep(2000);
    			driver.quit();
    		}
        	else
        	{
        		System.out.println("Brand Added Auccessfully");
			}
		} 
        finally 
        {
        	driver.quit();
		}
        
	     
	}
	
	//62TC
	
	@Test(groups = "Sprint-3", priority = 4)
	public void d_brandsSearchFeildPassingValueTest()throws Exception
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
        driver.findElement(By.xpath("//a[.='Brands']")).click();
        Thread.sleep(2000);
        
        WebElement SearchEdt = driver.findElement(By.xpath("//input[@placeholder='Search...']"));
        SearchEdt.sendKeys("Matrika");
        
        try 
        {
        	if(SearchEdt.isDisplayed()) 
    		{
    			w.takeScreenShot(driver, "d_brandsSearchFeildPassingValueTest");
    			Thread.sleep(2000);
    		}
        	else 
        	{
        		System.out.println("Search Element Found");
			}
		}
        finally 
        {
        	driver.quit();
		}
		
		
	}
	
	//63TC
	
	@Test(groups = "Sprint-3", priority = 5)
	public void e_brandAddingAndEditingItByRemovingBrandNameTest()throws Exception
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
        driver.findElement(By.xpath("//a[.='Brands']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Brand']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Brand']/../following-sibling::div//input[@formcontrolname='name']")).sendKeys("abcd");
        Thread.sleep(2000);
        
        Robot r = new Robot();
        
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        
        WebElement ChooseFileBtn = driver.findElement(By.xpath("//h1[.='Add Brand']/../following-sibling::div//input[@formcontrolname='image']"));
        Thread.sleep(2000);
        
        WebDriverUtility wUtil = new WebDriverUtility();
        wUtil.clickOnChooseFileOption(driver, ChooseFileBtn);
        
        r.keyPress(KeyEvent.VK_CONTROL);
        r.delay(2000);
        StringSelection ss = new StringSelection("C:\\Users\\admin\\Pictures\\Saved Pictures\\Bangles.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
        r.keyPress(KeyEvent.VK_ENTER);
		
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Brand']/../following-sibling::div//button[.='Add']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[.='abc']/..//td//button[.=' Edit ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Brand']/../following-sibling::div//input[@formcontrolname='name']")).clear();
        Thread.sleep(2000);
        
        WebElement UpdateBtn = driver.findElement(By.xpath("//h1[.='Update Brand']/../following-sibling::div//button[.='Update']"));
        Thread.sleep(2000);
        
        try 
        {
        	if (UpdateBtn.isDisplayed())
            {
    			w.takeScreenShot(driver, "e_brandAddingAndEditingItByRemovingBrandNameTest");
    			Thread.sleep(2000);
    			driver.quit();
    		}
        	else 
        	{
        		System.out.println("Brand Added Auccessfully"); 
			}
		} 
        finally 
        {
        	driver.quit();
		}
        
	}
	
	//65TC
	
	@Test(groups = "Sprint-3", priority = 5)
	public void f_brandsBootStrapButtonTest()throws Exception
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
        driver.findElement(By.xpath("//a[.='Brands']")).click();
        Thread.sleep(2000);
		
		WebElement BootStrapbtn = driver.findElement(By.xpath("//td[.='abc']/..//td//button[.=' Edit ']/..//div[@class='mdc-switch__ripple']"));
		Thread.sleep(2000);
		
		try 
        {
			if (BootStrapbtn.isDisplayed())
			{
				w.takeScreenShot(driver, "f_brandsBootStrapButtonTest");
				Thread.sleep(2000);
			}
			else 
			{
				System.out.println("Brand Is Displaying");
			}
		} 
        finally 
        {
        	driver.quit();
		}
		
	}
}