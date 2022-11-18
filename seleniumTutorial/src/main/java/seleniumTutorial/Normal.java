package seleniumTutorial;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Normal {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Manvendra Pratap\\eclipse-workspace\\seleniumTutorial\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tothenew.com/");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        
        Thread.sleep(5000);
                 
        
      //  WebElement text=driver.findElement(By.xpath("(//a[text()=\"About\"])[2]"));
     //   text.click();
     //   driver.close();
        List<WebElement> li= driver.findElements(By.xpath("(//a[text()=\"About\"])[2]"));
        System.out.println(li.size());
        }
}