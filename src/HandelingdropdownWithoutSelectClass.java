import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class HandelingdropdownWithoutSelectClass 

{

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        String baseUrl = "http://demo.automationtesting.in/Register.html";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts();
        
        WebElement drop = driver.findElement(By.xpath("//select[@id='yearbox']"));
        
        drop.click();
        
      
        
        List<WebElement> list = driver.findElements(By.xpath("//select[@id='yearbox']"));
        
        for(WebElement element : list)
        
        {
        	if(element.getText().equals("India"));
        	{
        		element.click();
        		break;
        	}
        	
        }

	}

}
