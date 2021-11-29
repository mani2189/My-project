package Webrdiverexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTabs 

{

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
        String baseUrl = "http://demo.automationtesting.in/Register.html";
        driver.get(baseUrl);
        System.out.println(driver.getTitle());
        
      /*  driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");*/
        
        driver.switchTo().newWindow(WindowType.TAB);
        
        driver.get("https://www.orangehrm.com/");
        System.out.println(driver.getTitle());
        
		/* driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t"); */
        

	}

}
