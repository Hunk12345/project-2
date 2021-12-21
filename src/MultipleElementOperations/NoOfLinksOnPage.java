package MultipleElementOperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinksOnPage {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "J:\\SW testing\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://getintopc.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		//how many links are there
		System.out.println("Total no of links " +links.size()); //total no of links
		
		//1 - for loop
		//2 - iterator
		//3 - for each loop
		//4 - listIterator
		
		for(int i=0;i<=links.size()-1;i++)
		{
			System.out.println(links.get(i).getText());
			
		}
		
		
//		for(WebElement l:links)
//		{
//			System.out.println(l.getText());
//		}
		
		
		
		Thread.sleep(60000);
		driver.close();

	}

}
