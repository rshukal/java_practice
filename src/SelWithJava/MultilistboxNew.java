package SelWithJava;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class MultilistboxNew {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> exp_data = new ArrayList<String>();
		exp_data.add("");
		exp_data.add("");
		exp_data.add("");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.id("cars"));
		WebElement ele=driver.findElement(By.id("cars"));
		Select opts=new Select(ele);
		opts.selectByIndex(0);
		opts.selectByValue("saab");
		opts.selectByVisibleText("Audi");
		List<WebElement> allitems=opts.getOptions();
		System.out.println("total items="+allitems.size());
		System.out.println("Actual Elements are=");
		for(int i=0;i<allitems.size();i++)
		{

			System.out.println(allitems.get(i).getText());
			//if(allitems.get(i).getText().equals(exp_data.get(i)))
			if(allitems.get(i).getText().equals(exp_data.get(i)))
			{

				System.out.println("Item matched...");
				driver.quit();

			}

		}}}
