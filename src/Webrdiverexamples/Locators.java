package Webrdiverexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
        driver.manage().timeouts();
        driver.findElement(By.className("login")).click();
        String title = "";
        title= driver.getTitle();
        System.out.println(title);
        driver.findElement(By.id("email_create")).sendKeys("mani.brook@gmail.com");
        driver.findElement(By.id("SubmitCreate")).click();
        
        
       

	}

}
