package sprint_3_Positive;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.DashboardPage;
import objectRepository.EcommercePage;

public class DeletingCategories {

	  @Test
	  public void deleteCategories() throws Exception
	  {
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  Thread.sleep(2000);
		  driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
		  driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
		  driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2023");
		  driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
		  driver.manage().window().maximize();
		  
		  Thread.sleep(8000);
		  
	      DashboardPage dbPage = new DashboardPage(driver);
	      dbPage.getEcommerceDrpDwn().click();
	        
	      Thread.sleep(2000);
	        
	      EcommercePage ecPage = new EcommercePage(driver);
	      ecPage.getCategoryLnk().click();
	        
	      Thread.sleep(2000);
	      
	      for(;;)
	      {
	    	  Thread.sleep(1000);
	    	  WebElement DeleteBtn = driver.findElement(By.xpath("(//button[@class='btn-sm btn-edit bg-danger'])[1]"));
	    	  if(DeleteBtn.isDisplayed())
	    	  {
	    		  Thread.sleep(1000);
	    		  DeleteBtn.click();
	    	  }
	    	  else 
	    	  {
				  break;
			  }
	      }
	  }
	
}
