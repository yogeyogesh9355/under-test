package com.Jpet.pages;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Jpet_SearchForProduct_page {
	WebDriver driver;
	public void type_a_product() {
		driver.findElement(By.xpath("//*[@id=\"SearchContent\"]/form/input[1]")).sendKeys("Angelfish");
	}
	public void search() 
	{
		// To search for products
			driver.findElement(By.name("searchProducts")).click();
	}
		public void takescreenshot6(String path) throws IOException, InterruptedException 
		{
			// To take screenshot for search function
			TakesScreenshot image=  ((TakesScreenshot)driver);
			Thread.sleep(5000);
			File source=image.getScreenshotAs(OutputType.FILE);
			Thread.sleep(5000);
			FileUtils.copyFile(source, new File(path));
			driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();
		}
}
