package Webrdiverexamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calander {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\chromedriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.tripadvisor.in/";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts();
        driver.findElement(By.xpath(".//*[@id='global-nav-flights']")).click();
        Thread.sleep(3000);
       WebElement element1 = driver.findElement(By.cssSelector("[tabindex='4']"));
       element1.clear();
       element1.sendKeys("Chennai (MAA)");
       
       WebElement element2 = driver.findElement(By.cssSelector("[tabindex='5']"));
       element2.sendKeys("Hyderabad (HYD)");
       
       driver.findElement(By.xpath(".//*[@id='taplc_trip_search_home_default_0']//span[1]/span[1]")).click();
       Thread.sleep(3000);
//       
//       String date = "31-Aug 2018";
//       
//       String splitter[] = date.split("-");
//       
//       String CheckInDay = splitter[0];
//       String CheckInMonth = splitter[1];
//       
//       List<WebElement> element = driver.findElements(By.xpath(".//*[@id='BODY_BLOCK_JQUERY_REFLOW']//span[@class='rsdc-month-title']"));
//       
//       for(WebElement i : element) {
//    	   
//    	   String MonthText = i.getText();
//    	   
//    	   System.out.println(MonthText);
//       }
//       
       
      
       		

	}

}
