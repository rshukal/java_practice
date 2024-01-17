package SelWithJava;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Vindeep {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
	//	driver.get("https://vindeep.com/Calculators/FDCalc.aspx");
	//	String title=driver.getTitle();
	//	System.out.println("title="+title);
	//	if(title.equals("Fixed Deposit Calculator | Calculate FD Interest, Maturity value"))
		{
	//		System.out.println("title matched");
	//	driver.findElement(By.id("ContentPlaceHolder1_cphCentre_FDAmount")).clear();
	//	driver.findElement(By.id("ContentPlaceHolder1_cphCentre_FDAmount")).sendKeys("100000");
	//	driver.findElement(By.id("ContentPlaceHolder1_cphCentre_Period")).clear();
	//	driver.findElement(By.id("ContentPlaceHolder1_cphCentre_Period")).sendKeys("6");
			//code for FD Period Dropdownbox
	//		Select opts=new Select(driver.findElement(By.id("ContentPlaceHolder1_cphCentre_PeriodDropDown")));
	//		opts.selectByVisibleText("Days"); 
			//count no. of elements
	//		List<WebElement> allItems = opts.getOptions();
	//		System.out.println("Total Items="+allItems.size()); //3);
	//		for (int i=0;i<allItems.size();i++)
			{
	//			System.out.println(allItems.get(i).getText());
			}
					
	//	driver.findElement(By.id("ContentPlaceHolder1_cphCentre_InterestRate")).clear();
	//	driver.findElement(By.id("ContentPlaceHolder1_cphCentre_InterestRate")).sendKeys("7.0");
	//	driver.findElement(By.name("ctl00$ContentPlaceHolder1$cphCentre$btnFDMAmount")).click();
		
		}
	//	else
		{	
			
			
			
	//		System.out.println("Title not matched");
			
		}
	driver.get("https://vindeep.com/Calculators/EMICalc.aspx");
	//String title1=driver.getTitle();
		//System.out.println("title="+title1);
		//if(title1.equals("EMI Calculator - Calculate EMI and effective cost of loan"))
		{	
			//System.out.println("title matched");
			//driver.findElement(By.id("ContentPlaceHolder1_cphCentre_txtLoan")).clear();
			//driver.findElement(By.id("ContentPlaceHolder1_cphCentre_txtLoan")).sendKeys("100000");
			//driver.findElement(By.id("ContentPlaceHolder1_cphCentre_txtRate")).clear();
			//driver.findElement(By.id("ContentPlaceHolder1_cphCentre_txtRate")).sendKeys("2.3");
			//driver.findElement(By.id("ContentPlaceHolder1_cphCentre_txtPeriod")).clear();
			//driver.findElement(By.id("ContentPlaceHolder1_cphCentre_txtPeriod")).sendKeys("24");
			//driver.findElement(By.name("ctl00$ContentPlaceHolder1$cphCentre$btnGetEMI")).click();
		}
		//else
		
		{
			//System.out.println("title not mached");
		}
		{
			WebDriver driver2=new EdgeDriver(); 
			driver.get("https://vindeep.com/Calculators/SavingsCalculator.aspx");
				String title=driver.getTitle();
				System.out.println("title="+title);
				if(title.equals("Savings Calculator | Calculate future value of monthly savings"))
				{
					System.out.println("title matched");
					driver.findElement(By.id("ContentPlaceHolder1_cphCentre_RDAmount")).clear();
					driver.findElement(By.id("ContentPlaceHolder1_cphCentre_RDAmount")).sendKeys("2000");
					driver.findElement(By.id("ContentPlaceHolder1_cphCentre_Period")).clear();
					driver.findElement(By.id("ContentPlaceHolder1_cphCentre_Period")).sendKeys("20");
					driver.findElement(By.id("ContentPlaceHolder1_cphCentre_InterestRate")).clear();
					driver.findElement(By.id("ContentPlaceHolder1_cphCentre_InterestRate")).sendKeys("8");
					//Code for frequency dropdown box
					Select opts=new Select(driver.findElement(By.id("ContentPlaceHolder1_cphCentre_FrequencyDropDown")));
					opts.selectByVisibleText("Quarterly");
					//count no of elements
					List<WebElement> allItems = opts.getOptions();
					System.out.println("Total Items="+allItems.size());  //4;
					for(int i=0;i<allItems.size();i++)
					{
						System.out.println(allItems.get(i).getText());
					}
					
						
					
					}
					
				else
					{
					System.out.println("Title not matched");
					}
		}	
		}
		{
			}
		}
		
