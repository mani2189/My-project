package Webrdiverexamples;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinks 

{

	public static void main(String[] args) throws IOException
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
        String baseUrl = "http://newtours.demoaut.com";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts();
        
        List<WebElement> links = driver.findElements(By.tagName("a"));
        
        System.out.println(links.size());
        
        for(int i =0; i<links.size();i++)
        {
        	WebElement elements = links.get(i);
        	
        	String Url = elements.getAttribute("href");
        	
        	URL link = new URL(Url);
        	
        	HttpURLConnection con = (HttpURLConnection) link.openConnection();
        	
        	con.connect();
        	
        	int rescode = con.getResponseCode();
        	 
        	if ( rescode>=400)
        	{
        		System.out.println(Url +"is broken");
        	}
        	
        	
        	  
        }

	}

}
