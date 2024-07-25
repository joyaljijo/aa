package joyaljijo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiocheck {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\joyal\\OneDrive\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		WebElement radio1=driver.findElement(By.id("vfb-7-1"));
		WebElement radio2=driver.findElement(By.id("vfb-7-2"));
		radio1.click();
		System.out.println("radio button1 clicked");
		radio2.click();
		System.out.println("radio button2 clicked");
		WebElement check1=driver.findElement(By.id("vfb-6-0"));
		check1.click();
		if(check1.isSelected()) {
			System.out.println("radio checkbox clicked");
		}

	}

}
