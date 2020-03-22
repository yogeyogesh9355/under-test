package com.Jpet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Jpet_PrintBill_page {
	WebDriver driver;
	WebElement Register;
public void selectaproduct() {
	driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img")).click();
	driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"Cart\"]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();
	driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a")).click();
}
	public void Printbill() {
		
					String s = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table")).getText();
					System.out.println(s+" ");
					driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();
}
}