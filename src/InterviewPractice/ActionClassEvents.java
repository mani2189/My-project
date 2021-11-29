package InterviewPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassEvents 

{

	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        String baseUrl = "http://www.ankpro.com/Account/Register";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts();
        
        Actions act = new Actions(driver);
        
		/* act.click(driver.findElement(By.xpath("//input[@id='Email']"))) */
       /* 		.sendKeys("mani.brook@gmail.com" + Keys.TAB)
                .sendKeys("password1234" + Keys.TAB)
                .sendKeys("password1234" + Keys.TAB)
                .build()
                .perform();
        
        Thread.sleep(2000);
        driver.quit();*/
        act.click(driver.findElement(By.xpath("//input[@id='Email']")))
               .sendKeys("mani.brook@gmail.com")
               .keyDown(Keys.CONTROL)
               .sendKeys("a")
               .sendKeys(Keys.BACK_SPACE)
               .build()
               .perform();
        Thread.sleep(2000);
 
        
        
        
               
               
        
                
        
        
                
                
        
        
        
        

	}

}
