package joyaljijo;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Fbscreenshot {
	public void screenshot(){
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\joyal\\OneDrive\\Desktop\\selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/login/");
			File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(screen,new File("C:\\Users\\joyal\\OneDrive\\Desktop\\joyal\\abc.jpeg"));
		}
		catch(Exception exp) {
			System.out.println(exp);
		}
	}

	public static void main(String[] args) {
		Fbscreenshot obj=new Fbscreenshot();
		obj.screenshot();

	}

}
