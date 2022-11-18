package seleniumTutorial;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class RadioButtons {
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Manvendra Pratap\\eclipse-workspace\\seleniumTutorial\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
        driver.manage().window().maximize();
       /* driver.findElement(By.xpath("//input[@type='radio' and @value='Female']")).click();
        System.out.println("Female radio button is selected");
        driver.findElement(By.xpath("//input[@type='checkbox' and @value='Drawing']")).click();
        driver.findElement(By.xpath("//input[@type='checkbox' and @value='Dancing']")).click();
        driver.findElement(By.xpath("//input[@name='Other_Hobby' and @type='text']")).click();
        System.out.println("every hobby is selected");*/
        List<WebElement> list= driver.findElements(By.xpath("//input[@type='chechkbox' and @value='Hobbies']"));
        for(int i=0;i<list.size();i++) {
        	WebElement raj= list.get(i);
        	String hobbies= raj.getAttribute("value");
        	//System.out.println("all the values are"+hobbies);
        	if(hobbies.contains("Dancing"));
        	raj.click();
        	Thread.sleep(10000);
        	break;
        }
      //  Thread.sleep(5000);
      //  driver.close();
}
}

  
