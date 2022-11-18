package seleniumTutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsinSelenium {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Manvendra Pratap\\eclipse-workspace\\seleniumTutorial\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://s1.demo.opensourcecms.com/wordpress/wp-admin/install.php");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        // id locators
      //  driver.findElement(By.id("user_login")).sendKeys("opensourcecms");
     //   driver.findElement(By.id("pass1")).sendKeys("opensourcecms");
     //   driver.findElement(By.id("admin_email")).sendKeys("rathore13120@gmail.com");
        
       // name locator 
       //	driver.findElement(By.name("user_name")).sendKeys("opensourcescms");
     //  	driver.findElement(By.name("admin_password")).sendKeys("opensources");
    //   	driver.findElement(By.name("admin_email")).sendKeys("rathore13120@gmail.com");
        
        
        //classname locators
          List<WebElement>list= driver.findElements(By.className("input"));
          System.out.println(list.size());
          driver.close();
	}	
}

