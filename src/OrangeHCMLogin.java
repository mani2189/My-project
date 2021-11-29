import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHCMLogin
{

	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
        String baseUrl = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
        
        driver.get(baseUrl);
        
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
        
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        Thread.sleep(3000);
        
        String x = driver.getTitle();
        System.out.println(x);
        
        driver.findElement(By.xpath("//a[@id='welcome']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
        
        Thread.sleep(3000);
        String y = driver.getTitle();
        System.out.println(y);
        

	}

}
