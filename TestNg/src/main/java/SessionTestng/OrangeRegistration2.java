package SessionTestng;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class OrangeRegistration2 {
	public WebDriver driver;
	  @BeforeClass()
	    public void before() {
	        System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Manvendra Pratap\\\\eclipse-workspace\\\\seleniumTutorial\\\\src\\\\main\\\\resources\\\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    }
	  @Test(priority=1)
	    public void lunch1() {
	    
	        driver.findElement(By.xpath("//div//input[@name=\"username\"]")).sendKeys("Admin");
	        driver.findElement(By.xpath("//div//input[@name=\"password\"]")).sendKeys("admin123");
	        driver.findElement(By.xpath("//div//button[@type=\"submit\"]")).click();
}
	  @Test(priority=2)
	  public void lunch2() {
		  driver.findElement(By.xpath("//span[text()=\"Admin\"]")).click();
		  driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")).click();
		  List <WebElement> list = driver.findElements(By.xpath("//div[@class=\"oxd-select-text oxd-select-text--active\"]")) ;
		  System.out.println(list.size());
		    WebElement element = list.get(1);
		    element.click();
	  }
}
