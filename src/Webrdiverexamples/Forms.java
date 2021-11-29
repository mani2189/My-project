package Webrdiverexamples;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Forms

{

	public static void main(String[] args) throws InterruptedException
	
	
	{
	   
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
        String baseUrl = "http://chnsmqa02/speechminer";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts();
        driver.findElement(By.xpath("//*[@class='g-form-content g-widget-padding']//table[@id='radioAuthenticationType']//td[1]")).click();
        driver.findElement(By.xpath("//input[@name='loginName']")).sendKeys("administrator");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Enterprise");
        driver.findElement(By.xpath("//span[@class='ui-button-text']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[contains(text(),'Quality')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Forms Manager')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'New Form')]")).click();
        driver.findElement(By.xpath("//input[@placeholder='Untitled Form']")).sendKeys("FormSMTest1");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='btn-toolbar']//div[@class='btn-group btn-group-margin']//span[@class='icon-dropdown-arrow']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'From Library...')]")).click();

        String window = driver.getWindowHandle();
        driver.switchTo().window(window);
       	 
        Thread.sleep(3000);
       
     WebElement check =  driver.findElement(By.xpath("//div[contains(@class,'sel')]//div[1]//span[1]"));
     
     System.out.println("Check box is :"+check.isSelected());
     
     Thread.sleep(3000);
     
     check.click();
       
     Thread.sleep(3000);
  
      driver.findElement(By.xpath(" //button[contains(text(),'Insert (1)')]")).click();
       
       driver.switchTo().activeElement();
       
       Thread.sleep(2000);
       driver.findElement(By.xpath("//button[contains(@class,'btn btn-default pull-left')]")).click();
       driver.switchTo().window(window);
       Thread.sleep(3000);
       
       driver.findElement(By.xpath("//button[contains(text(),'Redistribute')]")).click();
       
       
       driver.findElement(By.xpath("//div[contains(@class,'modal-footer')]//button[contains(@class,'btn btn-primary')][contains(text(),'Done')]")).click();
       
       driver.switchTo().activeElement();
       
       Thread.sleep(3000);
       
       driver.findElement(By.xpath("//span[contains(@class,'toggle-switch-switch')]")).click();
        
	}

}

