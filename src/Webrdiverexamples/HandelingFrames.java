package Webrdiverexamples;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.lang.model.util.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandelingFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
        String baseUrl = "http://demo.automationtesting.in/Register.html";
        
        driver.get(baseUrl);
        
        Actions act = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]"));
        
        
        act.moveToElement(element).build().perform();
        
        List<WebElement> items = driver.findElements(By.xpath("//li[@class='dropdown'][1]//ul/li/a[1]"));
        int itemscount =items.size();
        System.out.println(itemscount);
        for (WebElement i:items)
        {
        	System.out.println(i.getText());
        	
        	if(i.getText().equals("Frames"))
        	{
        		i.click();
        		break;
        	}
        }
        
        System.out.println(driver.getTitle());
        
      
        int total_frames = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Total no of frames in the page is :"+total_frames);
        
        
        WebElement frame = driver.findElement(By.xpath("//a[contains(text(),'Single Iframe')]"));
        
        driver.switchTo().frame(frame);
        
        WebElement textbox = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
        
        textbox.sendKeys("Selenium");
        
        
        
        
        
	}

}
