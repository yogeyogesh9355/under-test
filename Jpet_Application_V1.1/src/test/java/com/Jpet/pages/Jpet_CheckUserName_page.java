package com.Jpet.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Jpet_CheckUserName_page {
	WebDriver driver;
	WebElement Register;
public void compare_name() throws InterruptedException {
		 String s = driver.findElement(By.xpath("//*[@id=\"WelcomeContent\"]")).getText();
		 String ss=s.substring(8,14);
		 String sss="Yogesh";
		 //boolean a = true;
		 Assert.assertEquals(ss, sss);
		System.out.println("Compare name passed");
		}
}
