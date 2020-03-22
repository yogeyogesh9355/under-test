package Com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jpet_PrintMyOrderTable_page {
	WebDriver driver;
	WebElement Register;
	public void print_Myordertable() throws InterruptedException
	{
		// to launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//to launch application home page
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		//to click on sign in button
		Register = driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]"));
		Register.click();
// sign in operation
		driver.findElement(By.name("username")).sendKeys("9");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("123");
		Register= driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input"));
		Register.click();
		//print my order operation
		driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a")).click();
		String s=driver.findElement(By.xpath("//*[@id=\"Content\"]/table/tbody")).getText();
		System.out.println(s);
		Thread.sleep(2000);
		driver.close();
		
	}
}
