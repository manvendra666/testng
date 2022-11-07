package SessionTestng;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ques1 {
	 public static void main(String[] args) {
	       System.setProperty("webdriver.gecko.driver", "C:\\Users\\Manvendra Pratap\\eclipse-workspace\\seleniumTutorial\\src\\main\\resources\\chromedriver.exe");
	       WebDriver driver = new FirefoxDriver();
	       driver.manage().window().maximize();
	       driver.navigate().to(" https://www.google.com");
	   }
	

}

