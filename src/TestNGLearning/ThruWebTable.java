package TestNGLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThruWebTable {
	WebDriver driver;
	@Test 
	public void readfrmWT()
	{
	driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	driver.manage().window().maximize();
	WebElement myTable=driver.findElement(By.id("customers"));
	List<WebElement> allRows=myTable.findElements(By.tagName("tr"));
	System.out.println("total number of rows="+allRows.size());
	for(int i=1; i<allRows.size();i++)	//Focus to Row
	{
		List<WebElement> allCols=allRows.get(i).findElements(By.tagName("td"));
		for(int j=0;j<allCols.size();j++)
		{
			System.out.println(allCols.get(j).getText());
			
		}
		
	}
	driver.quit();
	
}
}