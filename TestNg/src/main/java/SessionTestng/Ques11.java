package SessionTestng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques11 {
	 public static void main(String[] args) throws InterruptedException {
	       System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Manvendra Pratap\\eclipse-workspace\\seleniumTutorial\\src\\main\\resources\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("http://demo.automationtesting.in/Register.html");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("manvendra");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("singh");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("manvendra.singh@tothenew.com");
	       System.out.println(driver.getTitle());
	       System.out.println(driver.findElement(By.xpath("//*[@id=\"Button1\"]")).isEnabled());
	       System.out.println( "header of refistration page is " + driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/h1")).isDisplayed());

	   }
	}


