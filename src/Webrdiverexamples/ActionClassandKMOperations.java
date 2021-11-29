package Webrdiverexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassandKMOperations 

{

	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        String baseUrl = "http:www.google.co.in";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts();
        
        WebElement element = driver.findElement(By.xpath("//input[@name='q']"));
        
        Actions act = new Actions(driver);
        
        act.keyDown(element, Keys.SHIFT).sendKeys("Selenium").build().perform();
        
        act.keyUp(element,Keys.SHIFT)
           .keyDown(element,Keys.CONTROL)
           .sendKeys("a")
           .keyDown(element,Keys.CONTROL)
           .sendKeys("x")
           .keyDown(element,Keys.CONTROL)
           .sendKeys("v")
           .build()
           .perform();
        
        
        
        

      
        
        
         
	}

}
