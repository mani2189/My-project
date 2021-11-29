package Webrdiverexamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandelingElements {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();

		Alert a = driver.switchTo().alert();
		String errormessage = a.getText();
		System.out.println(errormessage);
		

	}

}
