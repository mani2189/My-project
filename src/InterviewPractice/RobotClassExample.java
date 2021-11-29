package InterviewPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassExample

{

	public static void main(String[] args) throws AWTException, InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.edureka.co/all-courses";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts();
        driver.findElement(By.linkText("Courses")).click();
        
        Robot robo = new Robot();
        
        Thread.sleep(2000);
        
        robo.keyPress(KeyEvent.VK_DOWN);//key is pressed
        
        Thread.sleep(4000);
        
        robo.keyPress(KeyEvent.VK_TAB);
        
        Thread.sleep(2000);
        
        System.out.println("a");
        
        robo.keyPress(KeyEvent.VK_TAB);
        
        Thread.sleep(2000);
        
        System.out.println("c");
        
        robo.mouseMove(30, 100);
        
        System.out.println("Mouse move");
        
        
       
       
        
        

	}

}
