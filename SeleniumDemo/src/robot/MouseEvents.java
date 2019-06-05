package robot;

import java.awt.AWTException;	
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;	

public class MouseEvents {	

    @Test	
    public static void  execution() throws InterruptedException, AWTException {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
        driver.manage().window().maximize();	

     // Launch facebook
        driver.get("http://www.facebook.com");
       
        // Create an object of Robot class
        Robot robot=new Robot();
       
         // Press Enter Key
        robot.mouseMove(1140, 160);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
    }	
}	