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

public class Banners_SplashBanners {

	@Test
	
	public void bannersSplashBanners()throws Exception
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
        driver.findElement(By.xpath("//a[.='Splash Banners']")).click();
        Thread.sleep(2000);
        driver.quit();
        
	
	}
	
	@Test
	
	public void addSplashBanner() throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[text()='Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Splash Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add Splash Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='Enter From Date']")).sendKeys("24-02-2024");
        Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='Enter TO Date']")).sendKeys("28-02-2024");
		Thread.sleep(2000);
		
		WebElement ChooseFileBtn = driver.findElement(By.xpath("//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='Enter From Date']/../following-sibling::div//input[@placeholder='Enter TO Date']/../following-sibling::div//input[@formcontrolname='screen_uri']"));
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
		driver.findElement(By.xpath("//h1[.='Add Splash Banners']/../following-sibling::div//input[@placeholder='Enter Sequence']")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Add Splash Banners']/../following-sibling::div//button[.='Add']")).click();
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[text()='Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Splash Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[.='Feb 24, 2024']/../td[.='Feb 28, 2024']/../td//button[.='View']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Splash Banner Image']/..//button[@aria-label='Close']")).click();
        Thread.sleep(2000);
        driver.quit();
        
	}
	
	@Test
	
	public void edit() throws Exception
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
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[text()='Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Splash Banners']")).click();
        Thread.sleep(2000);
	    driver.findElement(By.xpath("//td[.='Feb 24, 2024']/../td[.='Feb 28, 2024']/../td//button[.='View']/../../following-sibling::td//button[.=' Edit ']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//h1[.='Update Banner']/../following-sibling::div//input[@placeholder='Enter From Date']")).sendKeys("28-02-2024");
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[.='Update Banner']/../following-sibling::div//input[@placeholder='Enter To Date']")).sendKeys("02-03-2024");
		Thread.sleep(2000);
		
		WebElement ChooseFileBtn = driver.findElement(By.xpath("//h1[.='Update Banner']/../following-sibling::div//input[@placeholder='Enter From Date']/../following-sibling::div//input[@placeholder='Enter To Date']/../following-sibling::div//input[@formcontrolname='screen_uri']"));
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
	
	public void bootStrapButton() throws Exception
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
        driver.findElement(By.xpath("//a[.='Splash Banners']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[.='Feb 24, 2024']/../td[.='Feb 28, 2024']/../td//button[.='View']/../../following-sibling::td//button[.=' Edit ']/..//button[@class='mdc-switch mdc-switch--unselected']")).click();
        Thread.sleep(2000);
        driver.quit();
        
		
	}
	
}