package Com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jpet_PrintBill_page {
	WebDriver driver;
	WebElement Register;

	public void Printbill() throws InterruptedException {
		//to Launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Lenovo\\\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		// To launch application home page
			driver.get("https://petstore.octoperf.com/actions/Catalog.action");
	//to click on signin button
			Register = driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]"));
			Register.click();
			//signin operation
			driver.findElement(By.name("username")).sendKeys("9");
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys("123");
			driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();
		//purchase operation
			driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img")).click();
			driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"Cart\"]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();
			driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a")).click();
		
	//print bill operation
					String s = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table")).getText();
					System.out.println(s+" ");
					Thread.sleep(2000);
					driver.close();
}
}