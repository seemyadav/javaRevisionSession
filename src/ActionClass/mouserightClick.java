package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouserightClick
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		//WebElement TextField = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		//Actions act = new Actions(driver);
		//act.contextClick(TextField).perform();
		//WebElement TextField = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		//Actions act = new Actions(driver);
		//act.doubleClick(TextField).perform();
	}

}
