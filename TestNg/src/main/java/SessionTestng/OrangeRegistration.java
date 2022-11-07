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

public class OrangeRegistration {
	 public WebDriver driver;
	  @BeforeClass()
	    public void before() {
	        System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Manvendra Pratap\\\\eclipse-workspace\\\\seleniumTutorial\\\\src\\\\main\\\\resources\\\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    }
	  @Test//(priority=1)
	    public void lunch1() {
	    
	        driver.findElement(By.xpath("//div//input[@name=\"username\"]")).sendKeys("Admin");
	        driver.findElement(By.xpath("//div//input[@name=\"password\"]")).sendKeys("admin123");
	        driver.findElement(By.xpath("//div//button[@type=\"submit\"]")).click();
	        
	        }
	  @Test//(priority=2)
	    public void lunch2() {
	        driver.findElement(By.xpath("//span[text()=\"Admin\"]")).click();
	        driver.findElement(By.xpath("(//div//input[@class=\"oxd-input oxd-input--active\"])[2]")).sendKeys("manvendra singh");
	        driver.findElement(By.xpath("(//div[text()=\"-- Select --\"])[1]")).click();
	        List <WebElement> list = driver.findElements(By.xpath("//div[@role='option']"));
	    System.out.println(list.size());
	    WebElement element = list.get(1);
	    element.click();
	    driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]")).sendKeys("manvendra pratap singh");
	    WebElement dropDown = driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]"));
	    dropDown.click();
	    List <WebElement> dropDown2 = driver.findElements(By.xpath("//div[@role='option']"));
	    System.out.println(dropDown2.size());
	    WebElement element1 = dropDown2.get(2);
	    element1.click();
	    driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	    WebElement catchText = driver.findElement(By.xpath("//*[text()=\"No Records Found\"]"));
	    String actual = "No Records Found";
	    Assert.assertEquals(actual,catchText.getText());
	    
	    }

}
