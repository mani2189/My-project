package Webrdiverexamples;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTableEx2

{

	public static void main(String[] args)

	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// comment the above 2 lines and uncomment below 2 lines to use Chrome
		// System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		String baseUrl = "http://demo.automationtesting.in";
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseUrl);
		driver.manage().window().maximize();
		// driver.findElement(By.xpath("//li[@class ='active xh-highlight']"));
		driver.findElement(By.xpath("//button[@id='btn2']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'WebTable')]")).click();

		
		  @SuppressWarnings("deprecation") WebDriverWait wait = new
		  WebDriverWait(driver,20);
		  
			/* String tableelement ="//body[@class='ng-scope']/section/div[1]/div[1]"; */
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='col-xs-12 myGrid ui-grid ng-isolate-scope grid1593317693130']")));
		 

		List<WebElement> NoofRows = driver
				.findElements(By.xpath("//div[@class='ui-grid-render-container ng-isolate-scope ui-grid-render-container-body']"));

		int rowcount = NoofRows.size();

		System.out.println(rowcount);

		List<WebElement> NoofColumns = driver
				.findElements(By.xpath("//div[@class='ui-grid-render-container ng-isolate-scope ui-grid-render-container-body']"));

		int colcount = NoofColumns.size();

		System.out.println(colcount);

	}

}
