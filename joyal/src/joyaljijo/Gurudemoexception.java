package joyaljijo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gurudemoexception {
	public void login(){
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\joyal\\OneDrive\\Desktop\\selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.guru99.com/");
			
			driver.findElement(By.name("emailid")).sendKeys("joyaljijo");
			driver.findElement(By.name("btnLogins")).click();

		}
		catch(Exception exp) {
			System.out.println(exp);
		}
	}


	public static void main(String[] args) {
		Gurudemoexception obj =new Gurudemoexception();
		obj.login();
		

	}

}
