package SessionTestng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

@Test()
public class goibibo {
	public WebDriver driver;

	public void browserlaunch()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manvendra Pratap\\eclipse-workspace\\TestNg\\src\\main\\resources\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.navigate().to("https://www.goibibo.com/");
	}
	   public void city(){
		   WebElement from_box= driver.findElement(By.xpath("//div[@class=sc-ieecCq koynXZ fswFld ]"));
		   from_box.sendKeys("Delhi");
		   
	   }
	  /* public void destination() {
		   WebElement to_box= driver.findElement(By.xpath("//span[@class=sc-caiLqq fjtKpx"));
		   ((RemoteWebDriver) to_box).perform("varansi");
	   }*/
	}

	