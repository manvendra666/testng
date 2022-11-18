package seleniumTutorial;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractise {
	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Manvendra Pratap\\eclipse-workspace\\seleniumTutorial\\src\\main\\resources\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.navigate().to("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjY2MDA1NDQwLCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
    driver.manage().window().maximize();
    System.out.println(driver.getTitle());
    
    Thread.sleep(2000);
    
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    WebElement username=driver.findElement((By.xpath("//input[@name='email']")));
    username.sendKeys("manvendra singh");
    
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    WebElement password=driver.findElement((By.xpath("//input[@name='pass']")));
    password.sendKeys("abcd@1234");
    
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    WebElement next1=driver.findElement((By.cssSelector("button#loginbutton")));
    next1.click();
    }
}