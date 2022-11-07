package SessionTestng;
import org.testng.annotations.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DemoTestng {

	public WebDriver driver;

	@Test
	public void browserlaunch()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manvendra Pratap\\eclipse-workspace\\TestNg\\src\\main\\resources\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.navigate().to("https://www.goibibo.com/");
	       
	}

	/* @Test
	 public void Previous()
	 {
	 driver.findElement(By.xpath("//a[@aria-label=Previous")).click();              
	               System.out.println("Previous page");

	        }
	@Test
	public void Next()
	{
		driver.findElement(By.xpath("//a[@aria-label=Next")).click();              
        System.out.println("Next page");

	

	
	         }
@Test
public void First() {
	driver.findElement(By.xpath("//a[@aria-label=First")).click();              
    System.out.println("First page");
	
}*/
//@Test
/*public void SelectPage(){
	 WebElement page_dropdown=driver.findElement(By.xpath("//select[@id='page-menu']"));
     Select dropdown= new Select(page_dropdown);
     dropdown.selectByIndex(1);
}
public void Search() {
	WebElement Search=driver.findElement(By.xpath("//input[@type=search]"));
	Search.sendKeys("carrot");
	
}
	@AfterMethod
	public void closingthebrowser()

	{
	driver.quit();

	}*/

	
        
}

