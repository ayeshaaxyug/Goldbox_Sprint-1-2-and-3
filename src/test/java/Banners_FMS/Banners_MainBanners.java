package Banners_FMS;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Banners_MainBanners {
	
	@Test
	
	public void bannersMainBanners() throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023",Keys.ENTER);
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[text()='Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Main Banners']")).click();
        Thread.sleep(2000);
        driver.quit();
        
		
	}
	
	
	@Test
	
	public void addMainBanner()throws Exception
	
	{
		WebDriverUtility wUtil = new WebDriverUtility();
        Robot r = new Robot();
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023",Keys.ENTER);
        Thread.sleep(8000);
        driver.findElement(By.xpath("//span[.='Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Main Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.=' Add Main Banners ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Main Banners']/../following-sibling::div//input[@placeholder='Enter From Date']")).sendKeys("22-02-2024");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Main Banners']/../following-sibling::div//input[@placeholder='Enter TO Date']")).sendKeys("24-02-2024");
        Thread.sleep(2000);
        
        WebElement ChooseFileBtn = driver.findElement(By.xpath("//h1[.='Add Main Banners']/../following-sibling::div//label[.='From Date']/../following-sibling::div//label[.='To Date']/../following-sibling::div//label[.='Upload Banner Image']/following-sibling::input[@formcontrolname='image_uri']"));
        Thread.sleep(2000); 	
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
        driver.findElement(By.xpath("//h1[.='Add Main Banners']/../following-sibling::div//input[@placeholder='Enter Sequence']")).sendKeys("1");
        Thread.sleep(2000); 
        driver.findElement(By.xpath("//h1[.='Add Main Banners']/../following-sibling::div//button[.='Add']")).click();
        Thread.sleep(2000); 
        driver.quit();
        
	}
	
	@Test
	
	public void view() throws Exception
    {
        
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023",Keys.ENTER);
        Thread.sleep(8000);
        driver.findElement(By.xpath("//span[.='Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Main Banners']")).click();
        Thread.sleep(2000);
		driver.findElement(By.xpath("//td[.='Feb 22, 2024']/..//td[.='Feb 24, 2024']/..//td//button[.='View']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Main Banner Image']/..//button[@aria-label='Close']")).click();
		Thread.sleep(2000);
		driver.quit();
	
		
    }
	
	
	@Test
	
	public void edit()throws Exception
	{
		
		WebDriverUtility wUtil = new WebDriverUtility();
        Robot r = new Robot();
		
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023",Keys.ENTER);
        Thread.sleep(8000);
        driver.findElement(By.xpath("//span[.='Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Main Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[.='Feb 22, 2024']/..//td[.='Feb 24, 2024']/..//td//button[.='View']/../../following-sibling::td//button[.=' Edit ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Banner']/../following-sibling::div//input[@placeholder='Enter From Date']")).sendKeys("26-02-2024");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Banner']/../following-sibling::div//input[@placeholder='Enter To Date']")).sendKeys("29-02-2024");
        Thread.sleep(2000);
        WebElement ChooseFileBtn = driver.findElement(By.xpath("//h1[.='Update Banner']/../following-sibling::div//input[@placeholder='Enter From Date']/../following-sibling::div//input[@placeholder='Enter To Date']/../following-sibling::div//input[@formcontrolname='image_uri']"));
        Thread.sleep(2000);
       
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
        driver.findElement(By.xpath("//h1[.='Update Banner']/../following-sibling::div//input[@placeholder='Enter Sequence']")).sendKeys("2");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update Banner']/../following-sibling::div//button[.='Update']")).click();
        Thread.sleep(2000);
        driver.quit();
        
       
	}
	
	@Test
	
	public void bootStrapButton()throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023",Keys.ENTER);
        Thread.sleep(8000);
        driver.findElement(By.xpath("//span[.='Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Main Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[.='Feb 22, 2024']/..//td[.='Feb 24, 2024']/..//td//button[.='View']/../../following-sibling::td//button[.=' Edit ']/..//div[@class='mdc-form-field']")).click();
        Thread.sleep(2000);
		driver.quit();
	
		
	}
	
 }