package InterviewPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverCapabilities 

{

	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        
        DesiredCapabilities caps = new DesiredCapabilities();
        
    
        caps.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR , UnexpectedAlertBehaviour.ACCEPT);
        
        
        ChromeOptions options = new ChromeOptions();
        
        options.addArguments("--start-Maximized");
        
      
        options.merge(caps);
        
        //options.setUnhandledPromptBehaviour(null);
        
      
     
        WebDriver driver = new ChromeDriver(options);
        String baseUrl = "https://www.hyrtutorials.com/p/alertsdemo.html";
        driver.get(baseUrl);
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[@id='alertBox']")).click();
        
     
        

	}

}
