package Webrdiverexamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesInList {

	public static void main(String[] args) 
	
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://the-internet.herokuapp.com/iframe");

		// find all your iframes
		List<WebElement> iframes = driver.findElements(By.xpath("//iframe"));
		        // print your number of frames
		        System.out.println(iframes.size());

		        // you can reach each frame on your site
		        for (WebElement iframe : iframes) {
					/*
					 * if(iframe.getAttribute("id").equalsIgnoreCase("id1")) {
					 * driver.switchTo().frame(iframe); break; }
					 */
                          
                          System.out.println(iframe.getText());
		            // switch to every frame
		             
                        

		            // now within the frame you can navigate like you are used to
		            //System.out.println(driver.findElement(By.id("tinymce")).getText());
		        }
		        
		       

	}

}
