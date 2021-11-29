package Webrdiverexamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick 
{

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        
        Actions act = new Actions(driver);
        
        WebElement q = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        
        act.contextClick(element).build().perform();//Right click on the element 
        
        driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']//span[contains(text(),'Copy')]")).click();
        
        Alert alert = driver.switchTo().alert();
        
        System.out.println(alert.getText());
        
        alert.accept();
        
        
        
        

	}

}
