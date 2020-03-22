package Com.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Jpet_SearchForLink_page {
	WebDriver driver;
	public void Checkforlink() {
		//To go to application homepage
				driver.get("https://petstore.octoperf.com/actions/Catalog.action");
			
			// To check for link
				List<WebElement> link = driver.findElements(By.xpath("//*[@id=\\\"PoweredBy\\\"]/a"));
				int a=link.size();
					System.out.println("Checking link Persent :"+link.size());
					
					boolean c=false;
					if(a>0) {
						c=true;
						System.out.println("The link is present");
						Assert.assertTrue(c);
						
					}
					else {
						System.out.println("The link is not present");
						Assert.assertFalse(c);
						
					}
					driver.close();
			}
}
