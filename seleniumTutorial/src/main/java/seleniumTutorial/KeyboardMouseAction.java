package seleniumTutorial;

import java.awt.Desktop.Action;

//import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMouseAction {
 public static void main(String args[]) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Manvendra Pratap\\eclipse-workspace\\seleniumTutorial\\src\\main\\resources\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.google.com/");
     driver.manage().window().maximize();
     Thread.sleep(2000);
     WebElement googleSearch= driver.findElement(By.name("q"));
     Actions act=new Actions(driver);
   org.openqa.selenium.interactions.Action action=  act.keyDown(googleSearch, Keys.SHIFT)
     .sendKeys("selenium")
     .keyUp(googleSearch, Keys.SHIFT)
     .keyDown(googleSearch, Keys.CONTROL)
     .sendKeys("a")
     .keyDown(googleSearch, Keys.CONTROL)
     .sendKeys("x")
     .keyDown(googleSearch, Keys.CONTROL)
     .sendKeys("v")
     .build();
   action.perform();
    // driver.close();
 }
}

