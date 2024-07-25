package joyaljijo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\joyal\\OneDrive\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		
		driver.findElement(By.name("userName")).sendKeys("joyaljijo");
		driver.findElement(By.name("password")).sendKeys("09876");
		driver.findElement(By.name("submit")).click();

	}

}
