package joyaljijo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Testngcheck {
	public String url="https://demo.guru99.com/test/newtours/";
	String path="C:\\Users\\joyal\\OneDrive\\Desktop\\selenium\\chromedriver.exe";
	public WebDriver driver;
  @Test
  public void f() {
	  String expected="Welcome: Mercury Tours";
	  String actual= driver.getTitle();
	  System.out.println(actual);
	  
	  Assert.assertEquals(actual, expected);
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("launching browser");
	  System.setProperty("WebDriver.chrome.driver", path);
	  WebDriver driver=new ChromeDriver();
	  driver.get(url);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
