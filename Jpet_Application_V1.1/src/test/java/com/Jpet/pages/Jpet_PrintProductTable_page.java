package com.Jpet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Jpet_PrintProductTable_page {
	WebDriver driver;
	public void selectcategorytoprint()
	{
		driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img")).click();
	}
	public void printproducttable() {
					String s = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody")).getText();
					System.out.println(s+" ");
					driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();
				}
}
