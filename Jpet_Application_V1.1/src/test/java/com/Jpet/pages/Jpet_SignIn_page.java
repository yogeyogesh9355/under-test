package com.Jpet.pages;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.excelutilities.ExcelData;

public class Jpet_SignIn_page {
	WebDriver driver;
	WebElement Register;
	public void clicksignin() {
		Register = driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]"));
		Register.click();
	}
	public void signin() throws IOException, InterruptedException {
		
			ExcelData ed = new ExcelData();	
		
			for(int i=1;i<=1;i++)
		{
			driver.findElement(By.name("username")).sendKeys(ed.excel_username(i));
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys(ed.excel_password(i));
			Thread.sleep(5000);
		}
	}
	public void clickonsignIn() {
		Register= driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input"));
		Register.click();
	}
}
