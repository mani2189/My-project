package Webrdiverexamples;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class MyProject {


		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub	
			
			        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			        ChromeOptions options = new ChromeOptions();	
			        options.addArguments("--disable-notifications");

			        WebDriver driver = new ChromeDriver(options);
			        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			        String baseUrl = "http://www.mycontactform.com/samples.php";
			        String actualTitle="";
			        actualTitle = driver.getTitle();
			        driver.get(baseUrl);
			        driver.manage().window().maximize();
			        System.out.println(actualTitle);
			      
			       
			        driver.findElement(By.xpath("//input[@id='user']")).sendKeys("mkarunan");;
			        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Happy@2019");
		        driver.findElement(By.xpath("//*[@name='btnSubmit']")).click();
		        //Clicking the webelements
		        driver.findElement(By.linkText("Home")).click();
		        driver.findElement(By.linkText("Sample Forms")).click();
		        driver.findElement(By.linkText("Features")).click();
		        driver.findElement(By.linkText("Pricing")).click();
		        driver.findElement(By.linkText("Help")).click();
		        driver.findElement(By.linkText("About Us")).click();
		        driver.findElement(By.linkText("Resources")).click();
		        //printing all the links in the webpage
		        List<WebElement> links = driver.findElements(By.tagName("a"));
		         int linkcount = links.size();
		         System.out.println(linkcount);
	         
		         for (WebElement linktext:links) {
		        	 String text = linktext.getText();
		        	 System.out.println(text);
	         } 
		        driver.findElement(By.linkText("Sample Forms")).click(); 
		        
		     //Working with check boxes
		      
		        List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		        int checksize = checkbox.size();
		        System.out.println("The no of checkboxes are" +checksize);
		        String cbvalue ="Customer Service";
		        for(WebElement cb:checkbox ) {
		        	String cbvalues = cb.getText();
		        	System.out.println(cbvalues);
		        if(cb.equals(cbvalue)) {
		        	cb.click();
		        }
		        }
		      
		        driver.findElement(By.xpath("//input[@id='subject']")).sendKeys("Selenium Testing");
		        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mani.brook@gmail.com");
		        driver.findElement(By.xpath("//input[@id='q1']")).sendKeys("Mani");
		        WebElement country = driver.findElement(By.xpath("//select[@id='q3']"));
		        Select dropdown = new Select(country);
		        List<WebElement> items = dropdown.getOptions();
		        int dsize = items.size();
		        System.out.println("The no of dropdownvalues are" +dsize);
		        //printing the drop down values
		        for(WebElement dd:items) {
		        	dd.click();
		        	String dvalues = dd.getText();
		        	System.out.println(dvalues);
		       //***Selecting particular drop down value**
		        	String option = "Second Option";
		        if (dd.equals(option)){
		           
		            dd.click();
		     
		        }
		       
		      //printing the Radio button  values
		        
		        List<WebElement> RB = driver.findElements(By.xpath("//input[@type='radio']")); 
		        int rbsize = RB.size();
		        System.out.println("The no of radio buttons are:"+rbsize);
		        for(WebElement r:RB) {
		        String rval = r.getText();
		        System.out.println("rval");
		        String roption = "Fourth Option";
		        if(r.equals(roption)) {
		        r.click();
		        }
		        }
		        
		   driver.findElement(By.xpath("//input[@name='checkbox6[]']")).click();
		        
		   String date = "31-Aug 2018";	       
	       String splitter[] = date.split("-");
	       
	       String CheckInDay = splitter[0];
	       String CheckInMonth = splitter[1];
	       
	       List<WebElement> element = driver.findElements(By.xpath(".//*[@id='BODY_BLOCK_JQUERY_REFLOW']//span[@class='rsdc-month-title']"));
	       
	       for(WebElement i : element) {
	    	   
	    	   String MonthText = i.getText();
	    	   
	    	   System.out.println(MonthText);
		       }
		        	
		        	
		        }
		     
		        
			        

	}

}
