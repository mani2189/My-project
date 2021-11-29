package Webrdiverexamples;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.java.swing.plaf.windows.resources.windows;

public class SendingValuestoText 

{

	public static void main(String[] args) throws InterruptedException, AWTException
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        String baseUrl = "http://demo.automationtesting.in/Register.html";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts();
        //driver.findElement(By.xpath("//*[@class='g-form-content g-widget-padding']//table[@id='radioAuthenticationType']//td[1]")).click();
        //WebElement key1 = driver.findElement(By.xpath("//input[@name='loginName']"));
        Robot robo = new Robot();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        //js.executeScript("document.getElementById('email').value='mani.brook@gmail.com'");
       
        
        /*js.executeScript("document.querySelector(\"input[placeholder='First Name']\").value ='Mani'");*/
        /*js.executeScript("document.getElementById('enterimg').click()");*/
        
        Thread.sleep(3000);
        
        js.executeScript("document.getElementById('imagesrc').click()");
        
        robo.setAutoDelay(10000);
        
     
        /*
        String path = "C:\\Users\\mkarunan\\Desktop\\To Do List In Learning.txt";
        
        StringSelection string = new StringSelection(path);
        
        ClipboardOwner owner = null;
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(string, owner);
		
		robo.setAutoDelay(1000);
		
		robo.keyPress(KeyEvent.VK_CONTROL);
		
		robo.keyPress(KeyEvent.VK_V);
		
        robo.keyRelease(KeyEvent.VK_CONTROL);
		
		robo.keyRelease(KeyEvent.VK_V);
		
		robo.setAutoDelay(1000);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		
        */
        /*js.executeScript("window.history.back()");
        
        Thread.sleep(3000);
        js.executeScript("window.history.forward()");*/
        
    /*    js.executeScript("history.go(0)");*/
        
       /* String str =js.executeScript("return document.title").toString();
        
        System.out.println(str);
        
        String buttonText =js.executeScript("return document.getElementById('btn2').innerHTML").toString();
        
        System.out.println(buttonText);*/
        
       /* js.executeScript("document.getElementById('firstpassword').scrollIntoView()");*/
	}
}
      

