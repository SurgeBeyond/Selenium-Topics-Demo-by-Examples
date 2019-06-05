package robot;

import java.awt.AWTException;	
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;	

public class KeyboardEvent {	

    @Test	
    public static void  execution() throws InterruptedException, AWTException {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
        driver.manage().window().maximize();	

     // Launch facebook
        driver.get("http://www.facebook.com");
        
        // Enter UserName
        driver.findElement(By.id("email")).sendKeys("QASurge@gmail.com");
       
        // Enter Password
        driver.findElement(By.id("pass")).sendKeys("QASurge");
       
        // Create an object of Robot class
        Robot robot=new Robot();
       
         // Press Enter Key
        robot.keyPress(KeyEvent.VK_ENTER);
       
         // Release Enter Key
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        robot.delay(3000);
        robot.keyPress(KeyEvent.VK_F5);
        robot.keyRelease(KeyEvent.VK_F5);
    }	
}	