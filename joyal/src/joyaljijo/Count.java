package joyaljijo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\joyal\\OneDrive\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String homepage="https://www.facebook.com/login/";
		driver.get(homepage);
		System.out.println("total link count"+driver.findElements(By.tagName("a")).size());
		WebElement foot=driver.findElement(By.id("pageFooter"));
		System.out.println("total link count in footer"+driver.findElements(By.tagName("a")).size());
		

	}

}
