package Webrdiverexamples;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesWithExample 

{

	public static void main(String[] args) throws InterruptedException 
	
	
	{
		
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	        String baseUrl = "http://demo.automationtesting.in/Register.html";
	        
	        driver.get(baseUrl);
	        
	        Actions act = new Actions(driver);
	        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]"));
	        
	        
	        act.moveToElement(element).build().perform();
	        
	        List<WebElement> items = driver.findElements(By.xpath("//li[@class='dropdown'][1]//ul/li/a[1]"));
	        int itemscount =items.size();
	        System.out.println(itemscount);
	        for (WebElement i:items)
	        {
	        	System.out.println(i.getText());
	        	
	        	if(i.getText().equals("Frames"))
	        	{
	        		i.click();
	        		break;
	        	}
	        	
	        	
	        }
	        
			/*
			 * System.out.println("The Title of the Frame is :" +driver.getTitle());
			 * 
			 * 
			 * int total_frames = driver.findElements(By.tagName("iframe")).size();
			 * System.out.println("Total no of frames in the page is :"+total_frames);
			 */
			
			  WebElement frame2 = driver.findElement(By.
			  xpath("//a[contains(text(),'Iframe with in an Iframe')]"));
			  
			  frame2.click();
			 
			  driver.switchTo().frame(1);
			  
			  Thread.sleep(3000);
			  
			  driver.switchTo().frame(0);
			  
			  
			  
				/*
				 * System.out.println("The title of the second frame is:" +driver.getTitle());
				 * 
				 * int frame2count = driver.findElements(By.
				 * xpath("//a[contains(text(),'Iframe with in an Iframe')]")).size();
				 * System.out.println("Total no of frames in the page is :"+frame2count);
				 */
			  
			  driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input")).sendKeys("Mani");
			  
			  driver.switchTo().defaultContent();
			  
			  driver.findElement(By.xpath("//a[contains(text(),'Single Iframe')]")).click();
			  
			  
			  
			  
			 
	        
	        
	        
	}

}
