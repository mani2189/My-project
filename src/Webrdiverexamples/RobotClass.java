package Webrdiverexamples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass 

{

	public static void main(String[] args) throws InterruptedException, AWTException
	
	{
		Robot robo = new Robot();
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        String baseUrl = "http://demo.automationtesting.in/Register.html";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts();
     
      
    
        
      driver.manage().window().maximize();
      
      
      robo.setAutoDelay(3000);
      
      Thread.sleep(3000);
      driver.findElement(By.id("imagesrc")).click();
        
		/* String path = "C:\\ISTQB.jpg"; */
        
        StringSelection selection = new StringSelection("C:\\Users\\Karthika\\Desktop\\ISTQB.jpg");
        
        ClipboardOwner owner = null;
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, owner);
		
		robo.setAutoDelay(1000);
		
		robo.keyPress(KeyEvent.VK_CONTROL);
		
		robo.keyPress(KeyEvent.VK_V);
		
        robo.keyRelease(KeyEvent.VK_CONTROL);
		
		robo.keyRelease(KeyEvent.VK_V);
		
		robo.setAutoDelay(1000);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		
	}

}
