package Webrdiverexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StateElementException {

	public static void main(String[] args) throws InterruptedException
	
	{
     
		
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
        String baseUrl = "http://www.pavantestingtools.com/";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts();
        WebElement link = driver.findElement(By.xpath("//*[@class='menupbt nav-menu']//a[text()='Training']"));
        link.click();
        driver.navigate().back();
        Thread.sleep(20);
        try
        {
        	 link.click();
        }
        
        catch(StaleElementReferenceException e)
        {
             link = driver.findElement(By.xpath("//*[@class='menupbt nav-menu']//a[text()='Training']"));
             link.click();
        }
       
        

	}

}
