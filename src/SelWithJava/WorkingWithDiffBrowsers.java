package SelWithJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingWithDiffBrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//WebDriver driver = new ChromeDriver();
WebDriver driver = new FirefoxDriver();
driver.get("https://www.Amazon.com/");
driver.manage().window().maximize();
String title=driver.getTitle();
System.out.println("title="+title);
driver.quit();



	}

}
