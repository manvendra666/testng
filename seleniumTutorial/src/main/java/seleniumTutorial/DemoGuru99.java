package seleniumTutorial;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoGuru99 {
	 public static void main(String[] args) throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\Manvendra Pratap\\eclipse-workspace\\seleniumTutorial\\src\\main\\resources\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
	        driver.manage().window().maximize();
	        System.out.println(driver.getTitle());
	        WebElement firstname_box=driver.findElement(By.xpath("//input[@name='firstName']"));
	        firstname_box.sendKeys("manvendra");
	        WebElement lastname_box=driver.findElement(By.xpath("//input[@name='lastName']"));
	        lastname_box.sendKeys("singh");
	        WebElement phone_box=driver.findElement(By.xpath("//input[@name='phone']"));
	        phone_box.sendKeys("6394132181");
	        WebElement userName_box=driver.findElement(By.xpath("//input[@name='userName']"));
	        userName_box.sendKeys("rathore13120@gmail.com");
	        WebElement country_dropdown=driver.findElement(By.xpath("//select[@name='country']"));
	        Select dropdown= new Select(country_dropdown);
	        dropdown.selectByIndex(1);
	        Thread.sleep(2000);
	        dropdown.selectByValue("INDIA");
	        Thread.sleep(2000);
	        dropdown.selectByVisibleText("BAHRAIN");
	        
	        
	        

	 }
}
