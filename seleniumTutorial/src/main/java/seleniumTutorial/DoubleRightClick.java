package seleniumTutorial;
import java.awt.Desktop.Action;

//import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleRightClick {
	 public static void main(String args[]) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Manvendra Pratap\\eclipse-workspace\\seleniumTutorial\\src\\main\\resources\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
	     driver.manage().window().maximize();
	     Thread.sleep(2000);
	     WebElement doubleClickBtn=driver.findElement(By.id("doubleClickBtn"));
	     WebElement rightClickBtn=driver.findElement(By.id("rightClickBtn"));
	     
	     Actions act=new Actions(driver);
	     act.doubleClick(doubleClickBtn).perform();
	     System.out.println("Double clicked");
	     Thread.sleep(2000);
	     driver.switchTo().alert().accept();
	     Thread.sleep(2000);
	     act.contextClick(rightClickBtn).perform();
	     Thread.sleep(2000);
	     driver.close();
}
}
