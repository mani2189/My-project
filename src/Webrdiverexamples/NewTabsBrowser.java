package Webrdiverexamples;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabsBrowser 

{

	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        String baseUrl = "http://demo.automationtesting.in/Register.html";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts();
        
        JavascriptExecutor execute = (JavascriptExecutor)driver;
        
        execute.executeScript("window.open('https://www.orangehrm.com/')");
        
        Thread.sleep(3000);
        
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
                                                     
        int i =  tabs.size();
        
        System.out.println(i);
        
        driver.switchTo().window(tabs.get(0)).getTitle();
        
        System.out.println(driver.switchTo().window(tabs.get(0)).getTitle());
        
        Thread.sleep(3000);
        
        driver.switchTo().window(tabs.get(1));
        
        System.out.println(driver.switchTo().window(tabs.get(1)).getTitle());
        
        Thread.sleep(3000);
        
   
        
        
	}

}
