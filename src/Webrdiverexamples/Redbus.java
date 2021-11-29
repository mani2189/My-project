package Webrdiverexamples;

	

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Redbus {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub	
		
		        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		        ChromeOptions options = new ChromeOptions();	
		        options.addArguments("--disable-notifications");

		        WebDriver driver = new ChromeDriver(options);
		        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		        String baseUrl = "https://www.redbus.in/";
		        String actualTitle="";
		        actualTitle = driver.getTitle();
		        driver.get(baseUrl);
		        System.out.println(actualTitle);
		        driver.manage().window().maximize();
		        System.out.println(actualTitle);
		     
		        WebElement element = driver.findElement(By.xpath("//*[@id='sign-in-icon-down']"));
		        element.click();
		        driver.findElement(By.xpath("//*[@id='hc']"));
	           
	           driver.switchTo().frame(0);
	           driver.findElement(By.xpath("//*[contains(text(),'SIGN IN using Email')]"));
	           
	           driver.findElement(By.xpath("//input[2][@type='text']")).sendKeys("mani.brook@gmail.com");
	           driver.findElement(By.xpath("//input[@id='password']")).sendKeys("inam123");
	           driver.findElement(By.xpath("//button[@id='doSignin']")).click();
	           
	           
	           
	           
	         
               
	}
}
//
//		        
//		        driver.findElement(By.xpath(".//*[@id='global-nav-flights']")).click();
//		     
//		       WebElement element1 = driver.findElement(By.cssSelector("[tabindex='4']"));
//		       element1.clear();
//		       element1.sendKeys("Chennai (MAA)");
//		       
//		       WebElement element2 = driver.findElement(By.cssSelector("[tabindex='5']"));
//		       element2.sendKeys("Hyderabad (HYD)");
//		       
//		       driver.findElement(By.xpath(".//*[@id='taplc_trip_search_home_default_0']//span[1]/span[1]")).click();
		    
//		       
//		       String date = "31-Aug 2018";
//		       
//		       String splitter[] = date.split("-");
//		       
//		       String CheckInDay = splitter[0];
//		       String CheckInMonth = splitter[1];
//		       
//		       List<WebElement> element = driver.findElements(By.xpath(".//*[@id='BODY_BLOCK_JQUERY_REFLOW']//span[@class='rsdc-month-title']"));
//		       
//		       for(WebElement i : element) {
//		    	   
//		    	   String MonthText = i.getText();
//		    	   
//		    	   System.out.println(MonthText);
//		       }
//		       
		       
		      
		       		




