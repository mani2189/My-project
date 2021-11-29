package Webrdiverexamples;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
        String baseUrl = "http://demo.automationtesting.in/Windows.html";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
        driver.manage().window().maximize();
        
        System.out.println("The title of the main window is :" +driver.getTitle());
        WebElement tabbedwindow = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
        tabbedwindow.click();
         Set<String> windows = driver.getWindowHandles();
        
        int wincount = windows.size();
        
        System.out.println("The no of windows count is :" +wincount);
        
        for(String child :windows)
        {
        	 driver.switchTo().window(child);
        }
        
      
        System.out.println("The title of the child window is :" +driver.getTitle());

      //div[contains(@class, 'col-xs-12 myGrid ui-grid ng-isolate-scope grid1585547206629')]

	}

}
