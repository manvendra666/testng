package seleniumTutorial;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class fetchdata {
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Manvendra Pratap\\eclipse-workspace\\seleniumTutorial\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
       // driver.manage().window().maximize();
     //   System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        List  col = driver.findElements(By.xpath("(//table[@clas='dataTable'])//tr"));
        System.out.println("Total No of columns are : " +col.size());
        List  rows = driver.findElements(By.xpath (".//table[@class='dataTable']//th"));
        System.out.println("Total No of rows are : " + rows.size());
        

}
}
 
