package Java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Printing {

	@Test
	public void names() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		Actions act = new Actions(driver);
		Actions actt = new Actions(driver);
		Actions acttt = new Actions(driver);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com");
		
		WebElement f = driver.findElement(By.xpath("(//span[.='Fashion'])[2]"));
		
		act.moveToElement(f).perform();
		
		WebElement ele = driver.findElement(By.xpath("//div[@class='_1UgUYI _2eN8ye']"));
		System.out.println(ele.getText());
		
		Thread.sleep(2000);
		
        WebElement e = driver.findElement(By.xpath("(//span[.='Electronics'])[2]"));
		
		actt.moveToElement(e).perform();
		
		WebElement elee = driver.findElement(By.xpath("//div[@class='_1UgUYI _2eN8ye']"));
		System.out.println(elee.getText());
		
		Thread.sleep(2000);
		
        WebElement h = driver.findElement(By.xpath("(//span[.='Home & Furniture'])[1]"));
		
		acttt.moveToElement(h).perform();
		
		WebElement eleee = driver.findElement(By.xpath("//div[@class='_1UgUYI _2eN8ye']"));
		System.out.println(eleee.getText());
		
		
		
		
	}
	
}
