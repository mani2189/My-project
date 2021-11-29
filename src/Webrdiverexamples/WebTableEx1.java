package Webrdiverexamples;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableEx1 

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
	        
	        for(int i =2; i <=rowcount;i++)
	        {
	        	for(int j=1;j<=columncount;j++)
	        	{
	        		String table = driver.findElement(By.xpath("//table[@id='table_id']//tr["+i+"]/td["+j+"]")).getText()+ " ";
	        		
	        		System.out.print(table);
	        	}
	        	
	        	 System.out.println();
	        }
	        
	       

	}

}
