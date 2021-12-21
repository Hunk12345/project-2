package MultipleElementOperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckBoxes {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "J:\\SW testing\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");

		//List<WebElement> checkboxes = driver.findElements(By.tagName("input"));
		List<WebElement> clicktobe = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println(clicktobe.size());// Total no of checkboxes
		
//		for(int i=0; i<=clicktobe.size()-1;i++)
//		{
//			clicktobe.
//		}
		
		for(WebElement w:clicktobe)
		{
			w.click();
		}
		
		Thread.sleep(60000);
		driver.close();
	}

}
