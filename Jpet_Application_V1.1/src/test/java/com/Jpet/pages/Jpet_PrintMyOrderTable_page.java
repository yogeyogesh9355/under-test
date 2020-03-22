package com.Jpet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Jpet_PrintMyOrderTable_page {
	WebDriver driver;
	WebElement Register;
	public void print_Myordertable()
	{
		driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a")).click();
		String s=driver.findElement(By.xpath("//*[@id=\"Content\"]/table/tbody")).getText();
		System.out.println(s);
		
	}
}
