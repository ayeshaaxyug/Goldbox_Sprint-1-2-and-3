package sprint_3_Negative;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class G_E_Commerce_Transactions {
	
	WebDriverUtility w = new WebDriverUtility();
	PropertyFileUtility pUtil = new PropertyFileUtility();
	
	//71TC
	
	@Test(groups = "Sprint-3", priority = 1)
	public void a_transactionsSearchFeildNameErrorTest()throws Exception
	{
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
			
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(8000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Ecom-Transactions']")).click();
        Thread.sleep(2000);
        
        WebElement SearchBtn = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        SearchBtn.sendKeys("karthik");
        
        try {
        	if(SearchBtn.isDisplayed())
            {
    			w.takeScreenShot(driver, "a_transactionsSearchFeildNameErrorTest");
    			Thread.sleep(2000);
    		} 
            else 
            {
                 System.out.println("Searched Successfully");
    		}
		} finally {
			driver.quit();
		}
        
        
	}
	
	//72TC
	
	@Test(groups = "Sprint-3", priority = 2)
	public void b_transactionsSearchFeildUnregisteredNumberErrorTest()throws Exception
	{
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
			
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	    driver.get(URL);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys(USERNAME, Keys.TAB, PASSWORD, Keys.ENTER);
        Thread.sleep(8000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(7000);
        driver.findElement(By.xpath("//a[.='Ecom-Transactions']")).click();
        Thread.sleep(2000);
        
        WebElement SearchBtn = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        SearchBtn.sendKeys("9666441040");
        
        try {
        	if(SearchBtn.isDisplayed())
            {
    			w.takeScreenShot(driver, "b_transactionsSearchFeildUnregisteredNumberErrorTest");
    			Thread.sleep(2000);
    		} 
            else 
            {
                 System.out.println("Searched Successfully");
    		}
		} finally {
			driver.quit();
		}
		
		
	}

}
