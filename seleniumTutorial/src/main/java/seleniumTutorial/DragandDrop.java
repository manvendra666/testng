package seleniumTutorial;
import java.awt.Desktop.Action;

//import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	 public static void main(String args[]) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Manvendra Pratap\\eclipse-workspace\\seleniumTutorial\\src\\main\\resources\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://demoqa.com/droppable");
	     driver.manage().window().maximize();
	     Thread.sleep(1000);
	     WebElement from=driver.findElement(By.id("draggable"));
	     WebElement to=driver.findElement(By.id("droppable"));
	     Actions act= new Actions(driver);
	    // act.dragAndDrop(from, to).perform();
	    // act.dragAndDropBy(from, 133, 22).perform();
	     act.clickAndHold(from)
	     .moveToElement(to)
	     .release()
	     .build()
	     .perform();
	     WebElement droppedMsg=driver.findElement(By.xpath("//div/p[text()=Dropped']"));
	     if(droppedMsg.isDisplayed()) {
	    	 System.out.println("success");
	    	 System.out.println("message is" +droppedMsg.getText());
	     }else {
	    	 System.out.println("failed");
	     }
	     Thread.sleep(1000);
}
}
