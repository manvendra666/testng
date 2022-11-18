package seleniumTutorial;
 
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quiz {
   public static void main(String[] args)throws InterruptedException
   {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\Manvendra Pratap\\eclipse-workspace\\seleniumTutorial\\src\\main\\resources\\chromedriver.exe");
	   WebDriver driver= new ChromeDriver();
	   driver.get("https://www.amazon.in/");
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       driver.manage().window().maximize();
       System.out.println(driver.getTitle());
	   driver.findElement(By.xpath("//a[text()=\"Books\"]")).click();
	   driver.findElement(By.id("twotabsearchtextbox")).sendKeys("h");
	   List<WebElement> list=(List<WebElement>) driver.findElement(By.id("twotabsearchtextbox"));
	   System.out.println(list.size());
	   WebElement element=list.get(1);
	   element.click();
	 	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("o");   
	   List<WebElement> list1= driver.findElements(By.id("twotabsearchtextbox"));
	   System.out.println(list.size());
	   WebElement element1= list.get(1);
	   element1.click();
			   }
}

