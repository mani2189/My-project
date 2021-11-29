package Webrdiverexamples;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.hdfcbank.com/";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts();
        
        String homepage = driver.getWindowHandle();
        System.out.println(homepage);
        
        driver.findElement(By.xpath("//*[@id='loginsubmit']")).click();
        
        String popuppage = driver.getWindowHandle();
        System.out.println(popuppage);
        //ArraySet
        Set<String> Totalpopup = driver.getWindowHandles();
        int count = Totalpopup.size();
        System.out.println("Total popups count in the window is"+count);
        driver.manage().timeouts();
        
        java.util.Iterator<String> it = Totalpopup.iterator();
        
        String Parentid = it.next();
        System.out.println(Parentid);
        
        String childid = it.next();
        System.out.println(childid);
        
        driver.switchTo().window(childid);
        System.out.println("Childwindow title is" +driver.getTitle());
        
        driver.close();
        Thread.sleep(3000);
        
        driver.switchTo().window(Parentid);
        System.out.println("parentwindow title is" +driver.getTitle());
        
        
        
   
   
       
        
        
        
	}

}
