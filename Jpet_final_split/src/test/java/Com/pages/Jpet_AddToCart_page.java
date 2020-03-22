package Com.pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jpet_AddToCart_page {
	WebDriver driver;
	public void addtocart() {
		// To launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	// To open application homepage
			driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		
		// To proceed add to cart function
			driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img")).click();
			driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
			System.out.println("Add to cart test case success");
	}
		public void takescreenshot1(String path) throws IOException, InterruptedException 
		{
			// To take screenshot for add to cart function
			TakesScreenshot image=  ((TakesScreenshot)driver);
			Thread.sleep(5000);
			File source=image.getScreenshotAs(OutputType.FILE);
			Thread.sleep(5000);
			FileUtils.copyFile(source, new File(path));
			
			driver.close();
		}
}
