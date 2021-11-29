package Webrdiverexamples;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassExample 
{

	public static void main(String[] args) throws InterruptedException 
	{
		Robot robo = new Robot();
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        String baseUrl = "http://demo.automationtesting.in/Register.html";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts();
      
        driver.findElement(By.id("imagesrc")).click();
      
      Thread.sleep(3000);
        
      driver.manage().window().maximize();
      
      
      robo.setAutoDelay(3000);
	}

}
