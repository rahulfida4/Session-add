package SessionMouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.spicejet.com/");
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.id("ctl00_HyperLinkLogin"))).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Agents")).click();
		
		System.out.print(driver.getTitle());
		
		driver.close();

	}

}
