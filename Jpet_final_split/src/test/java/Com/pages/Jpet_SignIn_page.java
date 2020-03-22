package Com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.excelutilites.Excel_Data;

public class Jpet_SignIn_page {
	WebDriver driver;
	WebElement Register;
	public void signin() throws IOException, InterruptedException {
		// to launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
// to launch application home page
			driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		

	 // to do signin operation
			Excel_Data ed = new Excel_Data();	
		
			for(int i=1;i<=3;i++)
		{
			Register = driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]"));
			Register.click();

			driver.findElement(By.name("username")).sendKeys(ed.excel_username(i));
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys(ed.excel_password(i));
			
			Register= driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input"));
			Register.click();
			Thread.sleep(5000);
			Register = driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]"));
			Register.click();
			System.out.println("Signin success for user "+i);
		}
			driver.close();
	}
}
