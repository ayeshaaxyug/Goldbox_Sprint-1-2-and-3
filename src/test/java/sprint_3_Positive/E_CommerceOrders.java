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

import genericUtility.JavaUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class E_CommerceOrders {
	
	@Test
	
	public void eCommerceOrders()throws Exception
	
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
        Thread.sleep(9000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Ecommerce Orders']")).click();
        Thread.sleep(2000);
        
        /*
        for (int i = 1; i <= 1; i++)
        {
        	 Thread.sleep(2000);
        	 driver.findElement(By.xpath("//a[text()=' Next ']")).click();
        	 Thread.sleep(2000);
		}
		*/
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[.='Feb 23, 2024']/following-sibling::td[.='585']/following-sibling::td[.='Ayesha Shaik']/following-sibling::td//button[text()=' View ']")).click();
        Thread.sleep(2000);
        
        WebElement WeightEle = driver.findElement(By.xpath("//th[.='Weight']"));
        Thread.sleep(2000);
        
        Actions act = new Actions(driver);
        act.moveByOffset(200, 0).perform();
 //       act.moveToElement(WeightEle).perform();
        Thread.sleep(2000);
        
        Robot s = new Robot();
        
        s.keyPress(KeyEvent.VK_PAGE_DOWN);
        s.keyRelease(KeyEvent.VK_PAGE_DOWN);
        
		Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Ordered Products ']/..//button[@class='btn-close']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[.='Feb 23, 2024']/following-sibling::td[.='585']/following-sibling::td[.='Ayesha Shaik']/following-sibling::td//button[text()=' View ']/../following-sibling::td//button[.=' Status ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Order status of Ayesha Shaik']/..//button[@aria-label='Close']")).click();
        Thread.sleep(2000);
        
        //driver.findElement(By.xpath("//td[.='Feb 20, 2024']/following-sibling::td[.='509']/following-sibling::td[.='pooja akiri']/following-sibling::td//button[text()=' View ']/../following-sibling::td//button[.=' Status ']/../following-sibling::td//button[.='View']")).click();
        //Thread.sleep(2000);
        //driver.findElement(By.xpath("//span[.='Dashboard']")).click();
        //Thread.sleep(2000);
        
        Robot r = new Robot();
        
        r.keyPress(KeyEvent.VK_PAGE_UP);
        r.keyRelease(KeyEvent.VK_PAGE_UP);
        
        Thread.sleep(2000);
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
        driver.findElement(By.xpath("//input[@placeholder='Mobile number']")).sendKeys("918500298784");
        Thread.sleep(2000);
        
        //driver.findElement(By.xpath("//button[@class='btn btn-filters ms-auto bg-gold']")).click();
        //Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[@class='btn btn-filters ms-auto']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='btn btn-filter setclose']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("Ayesha Shaik",Keys.ENTER);
        Thread.sleep(2000);
        driver.quit();
       
	}
}