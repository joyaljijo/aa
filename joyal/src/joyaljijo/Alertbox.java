package joyaljijo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.module.Input;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\joyal\\OneDrive\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String alert = "";
		driver.get("https://jsbin.com/usidix/1");
		
		driver.findElement(By.cssSelector("Input[value=\"Go!\"]")).click();
		alert=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(alert);

	}

}
