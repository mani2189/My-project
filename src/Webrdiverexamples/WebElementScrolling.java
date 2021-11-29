package Webrdiverexamples;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementScrolling 

{

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        String baseUrl = "http://demo.automationtesting.in/Register.html";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts();
        //driver.findElement(By.xpath("//*[@class='g-form-content g-widget-padding']//table[@id='radioAuthenticationType']//td[1]")).click();
        //WebElement key1 = driver.findElement(By.xpath("//input[@name='loginName']"));
     
        JavascriptExecutor js = (JavascriptExecutor)driver;
        
      WebElement element = driver.findElement(By.xpath("//label[contains(text(),'Confirm Password')]"));
      
      js.executeScript("arguments[0].scrollIntoView(true);",element);
      
      System.out.println(element.getText());
	}

}
