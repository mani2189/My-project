package Webrdiverexamples;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

public class EventFiringWebelement 
{

	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        String baseUrl = "http://demo.automationtesting.in/WebTable.html";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        
        WebElement dropdown = driver.findElement(By.xpath("//select[@class='ng-pristine ng-untouched ng-valid']"));
        Select drop = new Select(dropdown);
        
       List<WebElement> items = drop.getOptions();
        
        
       int itemscount = items.size();
       System.out.println("The no of items inside the dropdown is" +itemscount);
       
       for(WebElement i:items) {
       	
       	String itemTexts = i.getText();
       	System.out.println(itemTexts);
       }
       
       drop.selectByVisibleText("30");
       
       Thread.sleep(5000);
 /*      
       EventFiringWebDriver execute = new EventFiringWebDriver(driver);
       
       execute.executeScript("document.querySelector(\"body.ng-scope:nth-child(2) section:nth-child(2) div.container:nth-child(1) div.row > div.col-xs-12.myGrid.ui-grid.ng-isolate-scope.grid1590122667137:nth-child(3)\").scrollTop= 500");
*/
       
       JavascriptExecutor js = (JavascriptExecutor)driver;
       
       WebElement element = driver.findElement(By.xpath("//div[@id='1590156623188-13-uiGrid-0007-cell']//div[@class='ui-grid-cell-contents ng-binding ng-scope'][contains(text(),'Male')]"));
       js.executeScript("arguments[0].scrollIntoView(true);",element);
       
       System.out.println(element.getText());
	}

}
