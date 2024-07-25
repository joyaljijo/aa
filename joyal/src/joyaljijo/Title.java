package joyaljijo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {
	public void title() {
		try {
			System.setProperty("WebDriver.chrome.driver","C:\\Users\\joyal\\OneDrive\\Desktop\\selenium.chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/login/");
			System.out.println("the title is"+driver.getTitle());
			String a="Log in to Facebook";
			String b=driver.getTitle();
			if(a.contentEquals(b)) {
				System.out.print("test case passed");
			}
			else {
				System.out.print("test case failed");
			}
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}
	

	public static void main(String[] args) {
		Title obj=new Title();
		obj.title();

	}

}
