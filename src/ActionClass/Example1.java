package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//span[@role='button']")).click();
		WebElement signIn = driver.findElement(By.xpath("(//div[@class='_1Us3XD'])[1]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(signIn).perform();
		
		
		
	}

}
