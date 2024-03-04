package sprint_3_Positive;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class E_ECommerce_Product_All_Actions {
	
    JavaUtility jUtil = new JavaUtility();
	String Bangles = "Bangles"+jUtil.getRandomNum();
	
	@Test 
	public void eCommerceProductInfo() throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        driver.get("http://stg-fms-goldbox.goldsikka.com/signin");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("soumya@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("goldsikka@2024",Keys.ENTER);
        Thread.sleep(9000);
        driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[.='Products']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("chains",Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[.='Add Product']")).click();
        Thread.sleep(3000);
        
        WebElement CategorynameDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']"));

        // Create a Select object from the dropdown element
        Select CategoryNameDrpDwn = new Select(CategorynameDrpDwnElement);

        // Select an option by visible text
        CategoryNameDrpDwn.selectByVisibleText("Bangles");
        
        Thread.sleep(3000);
        
        WebElement SubCategorynameDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']/../following-sibling::div//select[@formcontrolname='subcategoryname']"));

        // Create a Select object from the dropdown element
        Select SubCategorynameDrpDwn = new Select(SubCategorynameDrpDwnElement);

        // Select an option by visible text
        SubCategorynameDrpDwn.selectByVisibleText("Gold Bangles");
        
        Thread.sleep(3000);
        
        WebElement BrandnameDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']/../following-sibling::div//select[@formcontrolname='subcategoryname']/../following-sibling::div//select[@formcontrolname='brandname']"));

        // Create a Select object from the dropdown element
        Select BrandnameDrpDwn = new Select(BrandnameDrpDwnElement);

        // Select an option by visible text
        BrandnameDrpDwn.selectByVisibleText("Gold Box");
        
        Thread.sleep(3000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']/../following-sibling::div//select[@formcontrolname='subcategoryname']/../following-sibling::div//select[@formcontrolname='brandname']/../following-sibling::div//input[@formcontrolname='productname']")).sendKeys("NeckPiece");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']/../following-sibling::div//select[@formcontrolname='subcategoryname']/../following-sibling::div//select[@formcontrolname='brandname']/../following-sibling::div//input[@formcontrolname='productname']/../following-sibling::div//input[@placeholder='Enter VA%']")).sendKeys("2");
        Thread.sleep(3000);
        
        WebElement SelectCaratDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']/../following-sibling::div//select[@formcontrolname='subcategoryname']/../following-sibling::div//select[@formcontrolname='brandname']/../following-sibling::div//input[@formcontrolname='productname']/../following-sibling::div//input[@placeholder='Enter VA%']/../following-sibling::div//select[@formcontrolname='carat']"));

        // Create a Select object from the dropdown element
        Select SelectCaratDrpDwn = new Select(SelectCaratDrpDwnElement);

        // Select an option by visible text
        SelectCaratDrpDwn.selectByVisibleText("22 carat");
        
        Thread.sleep(3000);
        
        WebElement SelectTypeDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']/../following-sibling::div//select[@formcontrolname='subcategoryname']/../following-sibling::div//select[@formcontrolname='brandname']/../following-sibling::div//input[@formcontrolname='productname']/../following-sibling::div//input[@placeholder='Enter VA%']/../following-sibling::div//select[@formcontrolname='carat']/../following-sibling::div//select[@formcontrolname='type']"));
        
        // Create a Select object from the dropdown element
        Select SelectTypeCaratDrpDwn = new Select(SelectTypeDrpDwnElement);

        // Select an option by visible text
        SelectTypeCaratDrpDwn.selectByVisibleText("Silver");
        
        Thread.sleep(3000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']/../following-sibling::div//select[@formcontrolname='subcategoryname']/../following-sibling::div//select[@formcontrolname='brandname']/../following-sibling::div//input[@formcontrolname='productname']/../following-sibling::div//input[@placeholder='Enter VA%']/../following-sibling::div//select[@formcontrolname='carat']/../following-sibling::div//input[@formcontrolname='price']")).sendKeys("100");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']/../following-sibling::div//select[@formcontrolname='subcategoryname']/../following-sibling::div//select[@formcontrolname='brandname']/../following-sibling::div//input[@formcontrolname='productname']/../following-sibling::div//input[@placeholder='Enter VA%']/../following-sibling::div//select[@formcontrolname='carat']/../following-sibling::div//input[@formcontrolname='price']/../following-sibling::div//textarea[@placeholder='Enter Description']")).sendKeys("GOLD");
        Thread.sleep(3000);
        
        Robot r = new Robot();
        
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        
        WebElement ChooseFileBtn = driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//select[@formcontrolname='categoryname']/../following-sibling::div//select[@formcontrolname='subcategoryname']/../following-sibling::div//select[@formcontrolname='brandname']/../following-sibling::div//input[@formcontrolname='productname']/../following-sibling::div//input[@placeholder='Enter VA%']/../following-sibling::div//select[@formcontrolname='carat']/../following-sibling::div//input[@formcontrolname='price']/../following-sibling::div//textarea[@placeholder='Enter Description']/../following-sibling::div//input[@formcontrolname='image']"));
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
        driver.findElement(By.xpath("//h1[.='Add Product Details']/../following-sibling::div//button[.='Add']")).click();
        Thread.sleep(3000);
       
             
	}
	

}
