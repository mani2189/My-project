package Webrdiverexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StateElementExceptionEx2 {

	public static void main(String[] args) 
	
	{

		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
        String baseUrl = "http://chnsmqa02/speechminer/";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts();
        WebElement Authentication = driver.findElement(By.xpath("//*[@class='g-form-content g-widget-padding']//table[@id='radioAuthenticationType']//td[1]"));
        Authentication.click();
        WebElement Username = driver.findElement(By.xpath("//input[@name='loginName']"));
        Username.sendKeys("asaf2");
        
        WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
        Password.sendKeys("asaf2");
        driver.navigate().refresh();
        try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        try
        {
        	Authentication.click();
        	 Username.sendKeys("asaf2");
        }
        	 
        catch(StaleElementReferenceException e)
        {     
        	 Authentication = driver.findElement(By.xpath("//*[@class='g-form-content g-widget-padding']//table[@id='radioAuthenticationType']//td[1]"));
        	 Authentication.click();
        	 Username = driver.findElement(By.xpath("//input[@name='loginName']"));
        	 Username.sendKeys("asaf2");
        }
       

	}

}
