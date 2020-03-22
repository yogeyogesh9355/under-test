package com.Jpet.pages;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Jpet_RemoveFromCart_page {
	WebDriver driver;
	public void add_to_cart() {
		driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
	}
	public void removefromCart() {
			driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[8]/a")).click();
	}
			public void takescreenshot2(String path) throws IOException, InterruptedException {
				TakesScreenshot image=  ((TakesScreenshot)driver);
				Thread.sleep(5000);
				File source=image.getScreenshotAs(OutputType.FILE);
				Thread.sleep(5000);
				FileUtils.copyFile(source, new File(path));
				driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();
	}
}
