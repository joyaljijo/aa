package joyaljijo;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Loginf {
	public void screen() {
		try {
			System.setProperty("WebDriver.chromr.driver","C:\\Users\\joyal\\OneDrive\\Desktop\\selenium\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://demo.guru99.com/test/newtours/");
			//File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//FileHandler.copy(screen, new File("C:\\Users\\joyal\\OneDrive\\Desktop\\joyal"));
			driver.findElement(By.linkText("REGISTER"));
			Set<String> a=driver.getWindowHandles();
			Iterator<String> it= a.iterator();
			while(it.hasNext()) {
				String child=it.next();
				driver.switchTo().window(child);			}
		}
		catch (Exception e) {
			System.out.println(e);
			
		}
	}

	public static void main(String[] args) {
		Loginf obj= new Loginf();
		obj.screen();
		//System.setProperty("WebDriver.chromr.driver","C:\\Users\\joyal\\OneDrive\\Desktop\\selenium\\chromedriver.exe");
		//WebDriver driver= new ChromeDriver();
		//driver.get("https://www.facebook.com/login/");
		//driver.get("https://www.facebook.com/login/");
		//driver.findElement(By.id("email")).sendKeys("jjj");
		//driver.findElement(By.id("pass")).sendKeys("iiii");
		//driver.findElement(By.id("loginbutton")).click();
		//String title=driver.getTitle();
		//System.out.println(title);
		//System.out.println("total"+driver.findElements(By.tagName("a")).size());
		//File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(screen, new File("C:\\Users\\joyal\\OneDrive\\Desktop\\joyal"));
		
	}

}
