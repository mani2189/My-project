package Webrdiverexamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DisplayLinks {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedurl = "http://www.way2automation.com";
        //String actualTitle = driver.getTitle();
        //String actualTitle = "";
        driver.get(baseUrl);
        System.out.println("The value of the baseurl is"+baseUrl);
        if(expectedurl.contentEquals(baseUrl)) {
        	System.out.println("Test Passed!");
        }
        else {
        	System.out.println("Test Failed");
        }
        
         
         List<WebElement> links = driver.findElements(By.tagName("a"));
         int linkcount = links.size();
         System.out.println(linkcount);
         
         for (WebElement linktext:links) {
        	 String text = linktext.getText();
        	 System.out.println(text);
         }
         
         
        
      
		
	}
}
