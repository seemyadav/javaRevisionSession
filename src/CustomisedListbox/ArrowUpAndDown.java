package CustomisedListbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class ArrowUpAndDown
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(1500);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Actions act = new Actions(driver);
		act.click(month).perform();
		
		//act.sendKeys(Keys.ARROW_UP).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1500);
		act.sendKeys(Keys.ENTER).perform();
		
		
		
	}

}
