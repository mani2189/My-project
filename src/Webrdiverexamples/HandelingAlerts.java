package Webrdiverexamples;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandelingAlerts

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
       
       for(WebElement s:items)
       {
    	   String itemText = s.getText();
    	   System.out.println(itemText);
       }
       
       WebElement window = driver.findElement(By.xpath("//a[contains(text(),'Alerts')]"));
       
       action.moveToElement(window).click().build().perform();
       
       Thread.sleep(3000);
      
       
       driver.findElement(By.xpath("//div[@class='container center']//li[1]//a[1]")).click();
       
      //Alert with OK Button
       driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
       
       Alert alert = driver.switchTo().alert();
       
       //Capturing the alert text and Print
       String AlertText = alert.getText();
       
       System.out.println(AlertText);
       
       alert.accept();// It will accept the ALert means it will click OK automatically
       
       Thread.sleep(3000);
       
       //Alerts with Ok and Cancel
       
       driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
       
       driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
       
       alert.accept();
       
       String ExpectedTextOk = "You pressed Ok";
       String ExpectedTextCancel = "You Pressed Cancel";
       
       String ActualText = driver.findElement(By.xpath("//p[@id='demo']")).getText();
       
       if(ExpectedTextOk.equals(ActualText)==true)
       {
    	   System.out.println("Test is passed for Ok");
       }
       
       Thread.sleep(3000);
       
       driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
       alert.dismiss();
      
       ActualText = driver.findElement(By.xpath("//p[@id='demo']")).getText();
       if(ExpectedTextCancel.equals(ActualText)==true)
       {
    	   System.out.println("Test is passed for cancel");
       }
       
       
       
       
       
       
       
       
       
       
       
	}

}
