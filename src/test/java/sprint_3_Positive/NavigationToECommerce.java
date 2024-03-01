package sprint_3_Positive;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationToECommerce {
	
	@Test
	
	public void navigationToE_Commerce() throws Exception
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
        driver.quit();
	}

}
