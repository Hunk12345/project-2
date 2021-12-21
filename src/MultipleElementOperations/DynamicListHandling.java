package MultipleElementOperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicListHandling {
	// also called as Unordered list-->ul, li-->List items

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "J:\\SW testing\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("kawasaki");
		Thread.sleep(2000);
		List<WebElement> KawasakiSearchResult = driver.findElements(By.xpath("((//ul[@class='G43f7e'])[1])//li"));
		System.out.println("Total Results are "+KawasakiSearchResult.size());


//		for(int i=0; i<=KawasakiSearchResult.size()-1;i++)
//		{
//			System.out.println(KawasakiSearchResult.get(i).getText());
//		}
		
		for(WebElement w:KawasakiSearchResult)
		{
			System.out.println(w.getText());
		}
		
		Thread.sleep(2000);
		String ExpectedResult = "kawasaki ninja h2r";
		
		for(WebElement w:KawasakiSearchResult)
		{
			if(ExpectedResult.equalsIgnoreCase(w.getText()));
			w.click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@data-hveid='CAEQAw']")).click();
			
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-hveid='CAEQAw']")).click();
		
		Thread.sleep(60000);
		driver.close();
		
		
		
	}

}
