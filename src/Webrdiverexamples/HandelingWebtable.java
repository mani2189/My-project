 package Webrdiverexamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.org.apache.xpath.internal.functions.Function;

public class HandelingWebtable
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
        String baseUrl = "http://demo.automationtesting.in";
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl);
        driver.manage().window().maximize();
        //driver.findElement(By.xpath("//li[@class ='active xh-highlight']"));
        driver.findElement(By.xpath("//button[@id='btn2']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'WebTable')]")).click();
        @SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver,20);
        
        String tableelement ="//div[contains(@class,'col-xs-12 myGrid ui-grid ng-isolate-scope grid1586231805735')]//child::div[@class='ui-grid-cell ng-scope ui-grid-coluiGrid-0005']";
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("tableelement")));         		  
              
      
       
        List<WebElement> allemails = driver.findElements(By.cssSelector("tableelement"));
        List<String> emailids = new ArrayList<String>();
         
         for(WebElement emailid : allemails)
         {
         	
         	emailids.add(emailid.getText());
         }
         
         for(String printemail :emailids)
         {
         
         System.out.println(printemail);
         
         }
         
         System.out.println("-------------------------");
         
         if(emailids.contains("jangoolestanakiasto12@gmail.com"))
         { 
         	System.out.println("Test Passed!");
         }
         
         else
         {
         	System.out.println("Test Failed");
         }
         
         int position =0;
         
         for(WebElement emailrow : allemails)
         {
         	position++;
         	
         	if(emailrow.getText().equals("jangoolestanakiasto12@gmail.com"))
         			{
         		      break;
         			}
         }
 	
String desiredpencilicon = "//div[@class='ui-grid-canvas']//child::div[@class='ui-grid-row ng-scope']["+position+"]//child::div//child::div[6]//button[@class='btn btn-xs btn-custom']";
WebElement pencilicon = driver.findElement(By.cssSelector(desiredpencilicon));

Actions act = new Actions(driver);

act.moveToElement(pencilicon).doubleClick().build().perform();



  
		
	}
}


        
        
        
     
        
