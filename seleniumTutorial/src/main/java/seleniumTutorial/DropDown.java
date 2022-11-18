package seleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Manvendra Pratap\\eclipse-workspace\\seleniumTutorial\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
        driver.manage().window().maximize();
        WebElement BirthDay_dropdown =   driver.findElement(By.id("Birthday_Day"));
        WebElement BirthDayMonth_dropdown =driver.findElement(By.id("Birthday_Month"));
      WebElement BirthDayYear_dropdown= driver.findElement(By.id("Birthday_Year"));
       
		Select dropdown= new Select(BirthDay_dropdown);
		Select selectmonth= new Select(BirthDayMonth_dropdown);
		Select selectyear= new Select(BirthDayYear_dropdown);
		dropdown.selectByIndex(4);
		Thread.sleep(5000);
		dropdown.selectByValue("April");
		Thread.sleep(5000);
		dropdown.selectByVisibleText("2000");
	}    
}

