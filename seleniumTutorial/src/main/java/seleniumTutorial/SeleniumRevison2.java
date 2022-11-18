package seleniumTutorial;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class SeleniumRevison2 {
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Manvendra Pratap\\eclipse-workspace\\seleniumTutorial\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        System.out.println("orange hrm url  is opened");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input.oxd-input")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input[name=password]")).sendKeys("admin123");
        driver.findElement(By.cssSelector("button[type=submit]")).click();
        driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")).click();
        driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
}
}