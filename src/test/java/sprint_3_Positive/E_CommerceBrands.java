package sprint_3_Positive;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class E_CommerceBrands {
		
	@Test
	
	public void eCommerceBrands()throws Exception
	
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023",Keys.ENTER);
        Thread.sleep(9000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[.='Brands']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("GOLDCOIN",Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[.='Add Brand']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//h1[.='Add Brand']/../following-sibling::div//input[@placeholder='Enter Brand Name']")).sendKeys("GOLDCOINSS");
        Thread.sleep(3000);
        
        Robot r = new Robot();
        
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
		
		WebElement ChooseFileBtn = driver.findElement(By.xpath("//h1[.='Add Brand']/../following-sibling::div//input[@formcontrolname='image']"));
		Thread.sleep(3000);
		
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
        
        Thread.sleep(3000);
        driver.findElement(By.xpath("//h1[.='Add Brand']/../following-sibling::div//button[.='Add']")).click();
        Thread.sleep(3000);
        driver.quit();
		
	}
	
	   
	@Test  
	 
	public void edit() throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023",Keys.ENTER);
        Thread.sleep(9000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[.='Brands']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//td[.='GOLDCOINSS']/..//td//img[@class='table-img']/../following-sibling::td//button[.=' Edit ']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//h1[.='Update Brand']/../following-sibling::div//input[@placeholder='Enter Brand Name']")).sendKeys("GOLDMETALSS");
        Thread.sleep(3000);
        
        Robot r = new Robot();
        
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        
        WebElement ChooseFileBtn = driver.findElement(By.xpath("//h1[.='Update Brand']/../following-sibling::div//input[@formcontrolname='image']"));
        Thread.sleep(3000);
		
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
        
        Thread.sleep(3000);
        driver.findElement(By.xpath("//h1[.='Update Brand']/../following-sibling::div//button[.='Update']")).click();
        Thread.sleep(3000);
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
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023",Keys.ENTER);
        Thread.sleep(9000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[.='Brands']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//td[.='GOLDCOINSGOLDMETALS']/..//td//img[@class='table-img']/../following-sibling::td//button[.=' Edit ']/..//div[@class='mdc-switch__icons']")).click();
        Thread.sleep(3000);
        driver.quit();
        
	
	}
	
	
	@Test
	
	public void delete() throws Exception
	
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023",Keys.ENTER);
        Thread.sleep(9000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[.='Brands']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//td[.='GOLDCOINS']/..//td//img[@class='table-img']/../following-sibling::td//button[.=' Edit ']/..//button[@class='btn-sm btn-edit bg-danger']")).click();
        Thread.sleep(3000);
        driver.quit();
		
	}
	
 }
