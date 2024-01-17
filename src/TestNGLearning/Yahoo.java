package TestNGLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class Yahoo {
	WebDriver driver;
	//@Test(description="Yahoo",priority=1)
	@BeforeClass
	public void launchyahoo ()
	{
		System.out.println("Launch Yahoo in chrome...");
		driver = new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		driver.findElement(By.linkText("Sign in")).click();
	
			
	}
	@Test(description="Login-Hard Assert",priority=2,enabled=false)
	public void loginYahoo1()
	{
		System.out.println("Login to Yahoo..");
		String title=driver.getTitle();
		System.out.println("title="+title);
		Assert.assertEquals(title, "Yahoo1");
		System.out.println("Assert Executed...");
	}
	@Test(description="Login-soft Assert",priority=2)
	public void loginYahoo()
	{
		SoftAssert assertion = new SoftAssert();
		System.out.println("Login to Yahoo..");
		String title=driver.getTitle();
		System.out.println("title="+title);
		assertion.assertEquals(title, "Yahoo1");
		System.out.println("Assert Executed...");
		assertion.assertAll();
	
	}
	private void assertion(String title, String string) {
		// TODO Auto-generated method stub
		
	}
	@Test(description="Close",priority=3)
	@AfterClass
	public void closeYahoo()

	{
		System.out.println("Close Yahoo..");
		driver.quit();
	}
}
