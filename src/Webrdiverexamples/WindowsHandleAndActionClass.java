package Webrdiverexamples;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandleAndActionClass

{

	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        String baseUrl = "http://demo.automationtesting.in/Register.html";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts();
        
        Actions action = new Actions(driver);
        
        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]"));
        
        action.moveToElement(element).build().perform();
        
        List<WebElement> items = driver.findElements(By.xpath("//li[@class='dropdown'][1]//li"));
        
       int  itemscount = items.size();
       
       System.out.println(itemscount);
       
       for(  s:items)
       {
    	   String itemText = s.getText();
    	   System.out.println(itemText);
       }
       
       WebElement window = driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Windows')]"));
       
       action.moveToElement(window).click().build().perform();
       
       Thread.sleep(3000);
       
       driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]")).click();
       
       System.out.println(driver.getTitle());
       
      Set<String> getwindows= driver.getWindowHandles();
      
      int s = getwindows.size();
      
      System.out.println("The size ofthe window is:"+s);
      
      System.out.println("The id's of the windows are :" +getwindows);
      
      for(String i :getwindows)
      {
    	  String windowsname =driver.switchTo().window(i).getTitle();
    	  if(windowsname.contains("Frames & windows"))
    	  {
    		  driver.switchTo().window(windowsname);
    		  break;
    	  }
    	  
      }
        
      
        

	}

}
