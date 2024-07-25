package joyaljijo;

import java.io.File;
import java.sql.Driver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Guruscreenshot {
	public void screenshot() {
		
		try {
			System.setProperty("WebDriver.chrome.driver", "C:\\Users\\joyal\\OneDrive\\Desktop\\selenium\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://demo.guru99.com/");
			
			File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(screen,new File("C:\\Users\\joyal\\OneDrive\\Desktop\\joyal\\abcd.jpeg"));
		}
		catch(Exception exp) {
			System.out.println(exp);
		}
	}

	public static void main(String[] args) {
		Guruscreenshot obj=new Guruscreenshot();
		obj.screenshot();

	}

}
