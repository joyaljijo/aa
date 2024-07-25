package Machinetest;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Shcollege {
	public void Exam() {
		try {
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\joyal\\OneDrive\\Desktop\\joyal\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.shcollege.online/login");
		driver.findElement(By.id("UserName")).sendKeys("joyal");
		driver.findElement(By.id("Password")).sendKeys("aaaa");
		driver.findElement(By.xpath("//*[@id=\"frmLogin\"]/div[4]/button")).click();
		
		File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screen, new File("C:\\Users\\joyal\\OneDrive\\Desktop\\joyal\\abcde.jpeg"));
		
		System.out.println("orginal title of web page is "+driver.getTitle());
		
		WebElement check=driver.findElement(By.id("RememberMe"));
		check.click();
	
		
		
		
	}
		catch (Exception e) {
			System.out.println(e);
			
		}
		
			
		}

	public static void main(String[] args) {
		Shcollege obj=new Shcollege();
		obj.Exam();

	}

}
