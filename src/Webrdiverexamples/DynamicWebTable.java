package Webrdiverexamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable 

{

	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
        String baseUrl = "http://www.leafground.com/pages/table.html";
        
        driver.get(baseUrl);
        
        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='table_id']//th"));
        
        int columncount = columns.size();
        
        System.out.println(columncount);
        
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table_id']//tr"));
        
        int rowcount = rows.size();
        
        System.out.println(rowcount);
        
        WebElement getpercent = driver.findElement(By.xpath("//table[@id='table_id']//tr/td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
         
        String percentage = getpercent.getText();
        
        System.out.println(percentage);
        
       List<WebElement> progressdata= driver.findElements(By.xpath("//table[@id='table_id']//tr/td[2]"));
       
       List<Integer> progresscouunt = new ArrayList<Integer>();
       
       for(WebElement fetchProgress :progressdata)
       {
    	   String value = fetchProgress.getText().replace("%", "");
    	   
    	   progresscouunt.add(Integer.parseInt(value));
       }
       
       System.out.println(progresscouunt);
       
       int minvalue = Collections.min(progresscouunt);
      
       
       System.out.println(minvalue);
       
       String stringvalue = Integer.toString(minvalue);
       
		/*
		 * String finalxpath =
		 * "//table[@id='table_id']//tr/td[normalize-space()="+stringvalue+" "%""]//
		 * following::td[1]"
		 */    	   
	}

}
