package joyaljijo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guruexception {
	public void login(){
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\joyal\\OneDrive\\Desktop\\selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.guru99.com/test/newtours/");
			
			driver.findElement(By.name("userName")).sendKeys("joyaljijo");
			driver.findElement(By.name("password")).sendKeys("09876");
			driver.findElement(By.name("submit")).click();

		}
		catch(Exception exp) {
			System.out.println(exp);
		}
	}

	public static void main(String[] args) {
		Guruexception obj =new Guruexception();
		obj.login();

	}

}
