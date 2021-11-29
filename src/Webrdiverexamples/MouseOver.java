package Webrdiverexamples;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
        String baseUrl = "http://www.way2automation.com/";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts();
        
       WebElement element = driver.findElement(By.xpath(".//*[@id='navbar-collapse-1']/ul/li[3]/a"));
        Actions act = new Actions(driver);
        act.moveToElement(element).perform();
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        List<WebElement> texts =driver.findElements(By.xpath(".//*[@id='navbar-collapse-1']/ul/li[3]/ul/li"));
        int  linkcount = texts.size();
        
        System.out.println("Total no of links inside the mouse over is"+"\n" +linkcount);
        
        for (WebElement links:texts) {
        	
        	String linkText = links.getText();
        	System.out.println(linkText);
        	
        }
        
        
        
        
        
        
        
        
        
	}

}
