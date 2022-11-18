package seleniumTutorial;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class CssSlelectorDemo {
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
       WebElement username_box=driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]"));
       username_box.sendKeys("admin");
        WebElement userrole_dropdown=driver.findElement(By.xpath("(//div[@class=\"oxd-select-text oxd-select-text--active\"])[1]"));
        Select dropdown= new Select(userrole_dropdown);
        dropdown.selectByIndex(1);
        Thread.sleep(2000);
        dropdown.selectByValue("Admin");
        Thread.sleep(2000);
        WebElement employeename_box=driver.findElement(By.xpath("(//input[@placeholder=\"Type for hints...\"])[1]"));
        employeename_box.sendKeys("manvendra");
       driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
}
}
