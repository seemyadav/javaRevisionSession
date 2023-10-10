package CustomisedListbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeAndEndKey
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
		
		act.sendKeys(Keys.END).perform();
		Thread.sleep(1500);
		for(int i=0; i<=9; i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
		}
		//act.sendKeys(Keys.HOME).perform();
		//Thread.sleep(1500);
		//for(int i=0;i<=5;i++)
		//{
		//	act.sendKeys(Keys.ARROW_DOWN).perform();
		//}
		
		act.sendKeys(Keys.ENTER).perform();
			
		
	}

}
