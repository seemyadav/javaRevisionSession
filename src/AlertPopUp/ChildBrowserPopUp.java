package AlertPopUp;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		Set<String> allID = driver.getWindowHandles();
		
		ArrayList<String>al= new ArrayList<String>(allID);
		driver.switchTo().window(al.get(1));
		
		driver.findElement(By.xpath("(//span[@class='menu-text'])[23]")).click();
				
		
	}

}
