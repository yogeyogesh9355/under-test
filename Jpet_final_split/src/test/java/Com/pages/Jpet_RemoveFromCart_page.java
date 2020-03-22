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

public class Jpet_RemoveFromCart_page {
	WebDriver driver;
	public void removefromCart() {
		// to launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Lenovo\\\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
// to launch application home page
			driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		
		 // add to cart operation
			driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img")).click();
			driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
		
		//remove from cart operation
			driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[8]/a")).click();
			System.out.println("Remove from cart test case success");
	}
			public void takescreenshot2(String path) throws IOException, InterruptedException {
				TakesScreenshot image=  ((TakesScreenshot)driver);
				Thread.sleep(3000);
				File source=image.getScreenshotAs(OutputType.FILE);
				Thread.sleep(3000);
				FileUtils.copyFile(source, new File(path));
				
				driver.close();
	}
}
