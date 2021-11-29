package Webrdiverexamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownDisplay {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
        String baseUrl = "http://newtours.demoaut.com//";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts();
        
        WebElement element = driver.findElement(By.xpath("//table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[2]"));
          
        element.click();
        
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        WebElement country = driver.findElement(By.xpath("//form/table/tbody/tr[12]/td[2]/select"));
        Select dropdown =new Select(country);
        
        List<WebElement> items = dropdown.getOptions();
        
         int itemscount = items.size();
        System.out.println("The no of items inside the dropdown is" +itemscount);
        
        for(WebElement i:items) {
        	
        	String itemTexts = i.getText();
        	System.out.println(itemTexts);
        }   
}
	
	
	}
	

