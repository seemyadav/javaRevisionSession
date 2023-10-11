package AlertPopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertpopUp1
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//String Text = driver.switchTo().alert().getText();
		//System.out.println(Text);
		
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		Alert alt = driver.switchTo().alert();
		alt.accept();
		alt.accept();
		
	}

}
