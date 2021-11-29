package Webrdiverexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdministrerUser 
{

	public static void main(String[] args) throws InterruptedException 
	
	{

			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//comment the above 2 lines and uncomment below 2 lines to use Chrome
			//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
			//WebDriver driver = new ChromeDriver();
	        String baseUrl = "http://chnsmqa02/speechminer";
	        driver.get(baseUrl);
	        driver.manage().window().maximize();
	        driver.manage().timeouts();
	        driver.findElement(By.xpath("//*[@class='g-form-content g-widget-padding']//table[@id='radioAuthenticationType']//td[1]")).click();
	        driver.findElement(By.xpath("//input[@name='loginName']")).sendKeys("administrator");
	        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Enterprise");
	        driver.findElement(By.xpath("//span[@class='ui-button-text']")).click();
	        Thread.sleep(3000);
	        WebElement admindrop= driver.findElement(By.xpath("//a/span[contains(text(),'administrator')]"));
	        admindrop.click();
	        driver.findElement(By.xpath("//a[contains(text(),'Administer Users')]")).click();
	       
	        int total_frames = driver.findElements(By.tagName("iframe")).size();
	        System.out.println("Total no of frames in the page is :"+total_frames);
	        Thread.sleep(3000);
	        driver.switchTo().frame("asp-page-iframe");
	       // WebElement frame = driver.findElement(By.xpath("//iframe[@id='asp-page-iframe']"));
	         driver.findElement(By.xpath("//a[@id='ctl00_MainContentPlaceHolder_newUser']")).click();
	       
             driver.switchTo().defaultContent();
	         Thread.sleep(3000);
		     driver.switchTo().frame("asp-page-iframe");
		     
	         driver.findElement(By.xpath("//input[@id='ctl00_MainContentPlaceHolder_loginName']")).sendKeys("training");
	         
	         driver.findElement(By.xpath("//input[@id='ctl00_MainContentPlaceHolder_RadioAuthenticationType_0']")).click();
	         driver.findElement(By.xpath("//input[@id='ctl00_MainContentPlaceHolder_password']")).sendKeys("Enterprise");
	         driver.findElement(By.xpath("//input[@id='ctl00_MainContentPlaceHolder_verPassword']")).sendKeys("Enterprise");
	         driver.findElement(By.xpath("//input[@id='ctl00_MainContentPlaceHolder_roleList_0']")).click();
	         driver.findElement(By.xpath("//input[@id='ctl00_MainContentPlaceHolder_groupList_0']")).click();
	         driver.findElement(By.xpath("//input[@id='ctl00_MainContentPlaceHolder_firstName']")).sendKeys("Mani");
	         driver.findElement(By.xpath("//input[@id='ctl00_MainContentPlaceHolder_lastName']")).sendKeys("Mani");
	         driver.findElement(By.xpath("//input[@id='ctl00_MainContentPlaceHolder_submit']")).click();
	        

	}

}
