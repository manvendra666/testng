package seleniumTutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SaeleniumRevision {
	 public static void main(String[] args) throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\Manvendra Pratap\\eclipse-workspace\\seleniumTutorial\\src\\main\\resources\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get(" http://automationpractice.com/index.php");
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	        driver.manage().window().maximize();
	        System.out.println(driver.getTitle());
	        WebElement username_box=driver.findElement(By.xpath("//input[@class=oxd-input oxd-input--active]"));
	        username_box.sendKeys("admin");
}
}
