package Com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jpet_PrintProductTable_page {
	WebDriver driver;
	public void printproducttable() {
		// To launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		// To open application homepage
		
			driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		// To print product table
			driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img")).click();
					String s = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody")).getText();
					System.out.println(s+" ");
					driver.close();
				}
}
