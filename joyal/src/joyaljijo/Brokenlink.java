package joyaljijo;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlink {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\joyal\\OneDrive\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String homepage="https://www.facebook.com/login/";
		String url=null;
		HttpsURLConnection huc=null;
		int respcode=200;
		driver.manage().window().maximize();
		driver.get(homepage);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		Iterator<WebElement> it= links.iterator();
		while(it.hasNext()){
			url=it.next().getAttribute("href");
			System.out.println(url);
			if(url==null || url.isEmpty()) {
				System.out.println("url is configured or its empty");
				continue;
			}
			if(!url.startsWith(homepage)) {
				System.out.println("url belongs to another domain");
				continue;
			}
			try {
				huc=(HttpsURLConnection)(new URL(url).openConnection());
				huc.setRequestMethod("HEAD");
				huc.connect();
				respcode=huc.getResponseCode();
				if(respcode>=400) {
					System.out.println(url+"is a broken link");
				}
				else {
					System.out.println(url+"is a valid link");
				}
				
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		

	}

}
