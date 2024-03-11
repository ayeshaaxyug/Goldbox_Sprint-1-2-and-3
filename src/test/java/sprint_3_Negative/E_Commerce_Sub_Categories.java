package sprint_3_Negative;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class E_Commerce_Sub_Categories{
	
	WebDriverUtility w = new WebDriverUtility();
	
	//16TC
	
	@Test(groups = "Sprint-3", priority = 1)
	public void a_subcategoriesErrorTest()throws Exception
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
        WebElement SubCategoryBtn = driver.findElement(By.xpath("//a[.='Sub Category']"));
        Thread.sleep(2000);
        
        try {
        	if (SubCategoryBtn.isDisplayed())
            {
    			w.takeScreenShot(driver, "a_subcategoriesErrorTest");
    			Thread.sleep(2000);
    		} 
            else
            {
                System.out.println("Subcategories page is displayed");
    		}
		} finally {
			driver.quit();
		}
		
	}
	
	//17TC
	
	@Test(groups = "Sprint-3", priority = 2)
	public void b_searchEditFeildSubCategoryErrorTest() throws Exception
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
        driver.findElement(By.xpath("//a[.='Sub Category']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("StoneJewllery");
		
        try {
        	Thread.sleep(2000);
            w.takeScreenShot(driver, "b_searchEditFeildSubCategoryErrorTest");
		} finally {
			driver.quit();
		}
		
	}
	
	//18TC
	
	@Test(groups = "Sprint-3", priority = 3)
	public void c_addingSubCategoryNullErrorTest() throws Exception
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
        driver.findElement(By.xpath("//a[.='Sub Category']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add SubCategory']")).click();
        Thread.sleep(2000);
        WebElement Subcategory = driver.findElement(By.xpath("//button[.='Add']"));
        Thread.sleep(2000);
        
        try {
        	if (Subcategory.isDisplayed())
            {
    			w.takeScreenShot(driver,"c_addingSubCategoryNullErrorTest" );
    			Thread.sleep(2000);
    		} 
            else 
            {
                System.out.println("Added SubCategory Successfully");
    		}
		} finally {
			driver.quit();
		}
        
        
	}

	//19TC
	
	@Test(groups = "Sprint-3", priority = 4)
	public void d_addingSubCategoryCategoryOnlyErrorTest()throws Exception
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
        driver.findElement(By.xpath("//a[.='Sub Category']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add SubCategory']")).click();
        Thread.sleep(2000);
        
        WebElement SubCategoryCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add SubCategory']/../following-sibling::div//select[@placeholder='Select Category']"));

        // Create a Select object from the dropdown element
        Select SubCategoryCategoryNameDrpDwn = new Select(SubCategoryCategoryNameyDrpDwnElement);

        // Select an option by visible text
        SubCategoryCategoryNameDrpDwn.selectByVisibleText("Bangles");
        
        WebElement Subcategory = driver.findElement(By.xpath("//button[.='Add']"));
        Thread.sleep(2000);
        
        try {
        	if(Subcategory.isDisplayed())
            {
    			w.takeScreenShot(driver,"d_addingSubCategoryCategoryOnlyErrorTest" );
    			Thread.sleep(2000);
    		} 
            else 
            {
                System.out.println("Added SubCategory Successfully");
    		}
		} finally {
			driver.quit();
		}
        
	}
	
	//20TC
	
	@Test(groups = "Sprint-3", priority = 5)
	public void e_subCategory2ValuesErrorTest()throws Exception
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
        driver.findElement(By.xpath("//a[.='Sub Category']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add SubCategory']")).click();
        Thread.sleep(2000);
        
        WebElement SubCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Add SubCategory']/../following-sibling::div//select[@placeholder='Select Category']"));

        // Create a Select object from the dropdown element
        Select SubCategoryNameDrpDwn = new Select(SubCategoryNameyDrpDwnElement);

        // Select an option by visible text
        SubCategoryNameDrpDwn.selectByVisibleText("Bangles");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Add SubCategory']/../following-sibling::div//input[@placeholder='Enter SubCategory Name']")).sendKeys("Flower Bangles");
        Thread.sleep(2000);
        
        WebElement Subcategory = driver.findElement(By.xpath("//button[.='Add']"));
        Thread.sleep(2000);
        
        try {
        	if (Subcategory.isDisplayed())
            {
    			w.takeScreenShot(driver,"e_subCategory2ValuesErrorTest" );
    			Thread.sleep(2000);
    		} 
            else 
            {
                System.out.println("Added SubCategory Successfully");
    		}
		} finally {
			driver.quit();
		}
        
	}

	//21TC
	
	@Test(groups = "Sprint-3", priority = 6)
	public void f_SubCategoryEditButtonErrorTest()throws Exception
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
        driver.findElement(By.xpath("//a[.='Sub Category']")).click();
        Thread.sleep(2000);
        
        WebElement EditButton = driver.findElement(By.xpath("//td[.='Bangles']/following-sibling::td[.='Chains4343847']/..//td/button[.=' Edit ']"));
        Thread.sleep(2000);
        
        try {
        	if(EditButton.isDisplayed())
            {
    			w.takeScreenShot(driver, "f_SubCategoryEditButtonErrorTest");
    			Thread.sleep(2000);
    		} 
            else 
            {
               System.out.println("Update Page is Opened Successfully");
    		}
		} finally {
			driver.quit();
		}
        
	}
	
	//22TC
	
	@Test(groups = "Sprint-3", priority = 7)
	public void g_updatingWithoutPassingDetailsErrorTest() throws Exception
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
        driver.findElement(By.xpath("//a[.='Sub Category']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[.='Bangles']/following-sibling::td[.='Chains4343847']/..//td/button[.=' Edit ']")).click();
        Thread.sleep(2000);
        
        WebElement Update = driver.findElement(By.xpath("//h1[.='Update SubCategory']/../following-sibling::div//button[.='Update']"));
        
        try {
        	if (Update.isDisplayed())
            {
    			w.takeScreenShot(driver, "g_updatingWithoutPassingDetailsErrorTest");
    			Thread.sleep(2000);
    		} 
            else 
            {
               System.out.println("Update Page is Opened Successfully");
    		}
		} finally {
			driver.quit();
		}
        
        
        
	}
	
	//23TC
	
	@Test(groups = "Sprint-3", priority = 8)
	public void h_updatingByGivingOnlyCategoryNameErrorTest()throws Exception
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
        driver.findElement(By.xpath("//a[.='Sub Category']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[.='Bangles']/following-sibling::td[.='Chains4343847']/..//td/button[.=' Edit ']")).click();
        Thread.sleep(2000);
        
        WebElement UpdateSubCategoryCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Update SubCategory']/../following-sibling::div//select[@class='enter-input ng-untouched ng-pristine ng-valid']"));

        // Create a Select object from the dropdown element
        Select UpdateSubCategoryNameDrpDwn = new Select(UpdateSubCategoryCategoryNameyDrpDwnElement);

        // Select an option by visible text
        UpdateSubCategoryNameDrpDwn.selectByVisibleText("Bangles");
        
        Thread.sleep(2000);
        WebElement Updtae = driver.findElement(By.xpath("//h1[.='Update SubCategory']/../following-sibling::div//button[.='Update']"));
        Thread.sleep(2000);
        
        try {
        	if (Updtae.isDisplayed()) 
            {
    			w.takeScreenShot(driver, "h_updatingByGivingOnlyCategoryNameErrorTest");
    			Thread.sleep(2000);		
    		} 
            else 
            {
                 System.out.println("Update Successfully");
    		}
		} finally {
			driver.quit();
		}
       
	}
	
	//24TC
	
	@Test(groups = "Sprint-3", priority = 9)
	public void i_updatingSubCategoryByPassing2ValuesErrorTest()throws Exception
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
        driver.findElement(By.xpath("//a[.='Sub Category']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[.='Bangles']/following-sibling::td[.='Chains4343847']/..//td/button[.=' Edit ']")).click();
        Thread.sleep(2000);
        
        WebElement UpdateSubCategoryCategoryNameyDrpDwnElement = driver.findElement(By.xpath("//h1[.='Update SubCategory']/../following-sibling::div//select[@class='enter-input ng-untouched ng-pristine ng-valid']"));

        // Create a Select object from the dropdown element
        Select UpdateSubCategoryNameDrpDwn = new Select(UpdateSubCategoryCategoryNameyDrpDwnElement);

        // Select an option by visible text
        UpdateSubCategoryNameDrpDwn.selectByVisibleText("Bangles");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h1[.='Update SubCategory']/../following-sibling::div//input[@placeholder='Enter SubCategory Name']")).sendKeys("Gold Bangles");
        Thread.sleep(2000);
        WebElement Updtae = driver.findElement(By.xpath("//h1[.='Update SubCategory']/../following-sibling::div//button[.='Update']"));
        Thread.sleep(2000);
        
        try {
        	if(Updtae.isDisplayed()) 
            {
    			w.takeScreenShot(driver, "i_updatingSubCategoryByPassing2ValuesErrorTest");
    			Thread.sleep(2000);
    		} 
            else 
            {
                 System.out.println("Update Successfully");
    		}
		} finally {
			driver.quit();
		}
        
	}
	
	//25TC
	
	@Test(groups = "Sprint-3", priority = 10)
	public void j_subCategoryBootStrapButtonErrorTest() throws Exception
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
        driver.findElement(By.xpath("//a[.='Sub Category']")).click();
        Thread.sleep(2000);
        
        WebElement BootStrapButton = driver.findElement(By.xpath("//td[.='Bangles']/following-sibling::td[.='Chains4343847']/..//td/button[.=' Edit ']/..//div[@class='mdc-form-field']"));
        Thread.sleep(2000);
        
        try {
        	if(BootStrapButton.isDisplayed()) 
            {
    			w.takeScreenShot(driver, "j_subCategoryBootStrapButtonErrorTest");
    			Thread.sleep(2000);
    		} 
            else 
            {
                System.out.println("Switched On Successfully");
    		}
		} finally {
			driver.quit();
		}
        
		
		
	}
	
	//26TC
	
	@Test(groups = "Sprint-3", priority = 11)
	public void k_subCategoryDeleteButtonErrorTest()throws Exception
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
        driver.findElement(By.xpath("//a[.='Sub Category']")).click();
        Thread.sleep(2000);
        
        WebElement DeleteButton = driver.findElement(By.xpath("//td[.='Bangles']/following-sibling::td[.='Chains4343847']/..//td/button[.=' Edit ']/..//button[@class='btn-sm btn-edit bg-danger']"));
        Thread.sleep(2000);
        
        try {
        	if(DeleteButton.isDisplayed()) 
            {
    			w.takeScreenShot(driver, "k_subCategoryDeleteButtonErrorTest");
    			Thread.sleep(2000);
    		} 
            else 
            {
                System.out.println("Switched On Successfully");
    		}
		} finally {
			driver.quit();
		}
        
	}
	
	//27TC
	
	@Test(groups = "Sprint-3", priority = 12)
	public void l_closingSubCategoryPageErrorTest()throws Exception
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
        driver.findElement(By.xpath("//a[.='Sub Category']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Add SubCategory']")).click();
        Thread.sleep(2000);
        
        WebElement CloseButton = driver.findElement(By.xpath("//h1[.='Add SubCategory']/..//button[@aria-label='Close']"));
        Thread.sleep(2000);
        
        try {
        	if(CloseButton.isDisplayed()) 
            {
    			w.takeScreenShot(driver, "l_closingSubCategoryPageErrorTest");
    			Thread.sleep(2000);
    		} 
            else 
            {
                System.out.println("Closed Successfully");
    		}
		} finally {
			driver.quit();
		}
        
       
        
	}
}