package com.Jpet.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Jpet_SearchForLink_page {
	WebDriver driver;
	List<WebElement> link;
	public int Checkforlink() {
			// To check for link
				 link = driver.findElements(By.linkText("www.mybatis.org"));
				int a=link.size();
					System.out.println("Checking link Persent :"+link.size());
					return a;
	}
					

			}

