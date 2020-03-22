package Com.pages;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jpet_CheckUserName_page {
	WebDriver driver;
	WebElement Register;
public void compare_name() throws InterruptedException {
			
	// To launch chrome browser	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		// To open application homepage
			driver.get("https://petstore.octoperf.com/actions/Catalog.action");
			//Click on signin button
			Register = driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]"));
			Register.click();
			
//sign in operation
			driver.findElement(By.name("username")).sendKeys("9");
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys("123");
			//click on signin button
			 driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();
			Thread.sleep(5000);
		//name compare function
		 String s = driver.findElement(By.xpath("//*[@id=\"WelcomeContent\"]")).getText();
		 String ss=s.substring(8,14);
		 String sss="Yogesh";
		 //boolean a = true;
		 Assert.assertEquals(ss, sss);
		System.out.println("Compare name passed");
		Thread.sleep(2000);
		driver.close();
		}
}
