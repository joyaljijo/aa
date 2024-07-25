package joyaljijo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {
	public void drag() {
		try {
			System.setProperty("Webdriver.chrome.driver", "C:\\Users\\joyal\\OneDrive\\Desktop\\selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.guru99.com/test/drag_drop.html");
			WebElement From=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
			WebElement To=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
			Actions act=new Actions(driver);
			act.dragAndDrop(From, To).build().perform();
			
			WebElement From1=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
			WebElement To1=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
			Actions act1=new Actions(driver);
			act1.dragAndDrop(From1, To1).build().perform();
			
			
			WebElement From2=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
			WebElement To2=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
			Actions act2=new Actions(driver);
			act2.dragAndDrop(From2, To2).build().perform();
			
			WebElement From3=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
			WebElement To3=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
			Actions act3=new Actions(driver);
			act3.dragAndDrop(From3, To3).build().perform();
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Draganddrop obj=new Draganddrop();
		obj.drag();

	}

}
