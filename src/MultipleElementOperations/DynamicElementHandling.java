package MultipleElementOperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicElementHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "J:\\SW testing\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		
		Thread.sleep(2000);
		driver.findElement(By.className("desktop-searchBar")).sendKeys("Mens Sweatshirt");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@data-reactid='849']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@class='img-responsive'])[1]"));
		Thread.sleep(2000);
	    WebElement Review = driver.findElement(By.xpath("//h1[text()='Men Sweatshirt']"));
		Thread.sleep(2000);
		
		System.out.println(Review.getText());
		
		
		Thread.sleep(60000);
		driver.close();
	}

}
