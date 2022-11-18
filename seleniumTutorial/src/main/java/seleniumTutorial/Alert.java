package seleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alert {
	 public static void main(String[] args) throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\Manvendra Pratap\\eclipse-workspace\\seleniumTutorial\\src\\main\\resources\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        
	        driver.get("https://demo.guru99.com/test/delete_customer.php");
	        WebElement submitbutton=driver.findElement(By.xpath("//input[@type='submit']"));
	       
	        submitbutton.click();
	        org.openqa.selenium.Alert alert= driver.switchTo().alert();
	       //capturing alert message.
	       
	       alert.accept();
	       System.out.println(alert.getText());
}
}
