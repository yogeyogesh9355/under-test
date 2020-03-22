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

public class Jpet_SearchForProduct_page {
	WebDriver driver;
	public void search() 
	{
		//To launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
// To open application homepage
			driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		
		// To search for products
			driver.findElement(By.xpath("//*[@id=\"SearchContent\"]/form/input[1]")).sendKeys("Angelfish");;
			driver.findElement(By.name("searchProducts")).click();
			System.out.println("search operation for product success");
	}
		public void takescreenshot6(String path) throws IOException, InterruptedException 
		{
			// To take screenshot for search function
			TakesScreenshot image=  ((TakesScreenshot)driver);
			Thread.sleep(5000);
			File source=image.getScreenshotAs(OutputType.FILE);
			Thread.sleep(5000);
			FileUtils.copyFile(source, new File(path));
			
			driver.close();
		}
}
