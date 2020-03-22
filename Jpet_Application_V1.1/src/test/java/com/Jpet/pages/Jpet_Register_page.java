package com.Jpet.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excelutilities.ExcelData;

public class Jpet_Register_page {
	WebDriver driver;
	WebElement Register;
public void launchapplication() {
	// To launch Chrome browser
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	
//To open application homepage
driver.get("https://petstore.octoperf.com/actions/Catalog.action");	
}
	public void register() throws IOException 
	{
		ExcelData ed = new ExcelData();	
		for(int i=1;i<=1;i++)	
		{
		// To click on signin button
			Register = driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]"));
			Register.click();
			System.out.println("click on sign In button");
		// To click on register now button
			Register = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a"));
			Register.click();
			System.out.println("click on register now button");
		// To get data from Excel	
			
			driver.findElement(By.name("username")).sendKeys(ed.excel_username(i));
			driver.findElement(By.name("password")).sendKeys(ed.excel_password(i));
			driver.findElement(By.name("repeatedPassword")).sendKeys(ed.excel_password(i));
			driver.findElement(By.name("account.firstName")).sendKeys(ed.Firstname(i));
			driver.findElement(By.name("account.lastName")).sendKeys(ed.Lastname(i));
			driver.findElement(By.name("account.email")).sendKeys(ed.Email(i));
			driver.findElement(By.name("account.phone")).sendKeys(ed.Phone(i));
			driver.findElement(By.name("account.address1")).sendKeys(ed.Address1(i));
			driver.findElement(By.name("account.address2")).sendKeys(ed.Address2(i));
			driver.findElement(By.name("account.city")).sendKeys(ed.City(i));
			driver.findElement(By.name("account.state")).sendKeys(ed.State(i));
			driver.findElement(By.name("account.zip")).sendKeys(ed.Zip(i));
			driver.findElement(By.name("account.country")).sendKeys(ed.Country(i));
			driver.findElement(By.name("account.listOption")).click();
			driver.findElement(By.name("account.bannerOption")).click();
			driver.findElement(By.name("newAccount")).click();
	}
	}
	public void quit() {
		//close browser
		driver.close();
	}
}
