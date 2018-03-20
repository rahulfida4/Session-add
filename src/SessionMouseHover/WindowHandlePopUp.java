package SessionMouseHover;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandlePopUp {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html"); 
		
		driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
		
		Set<String> handler = driver.getWindowHandles();
		
		Iterator<String> it = handler.iterator();
		
		String parentWindowId = it.next();
		System.out.println("parentWindowId:"+parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("childWindowId:"+childWindowId);
		
		driver.switchTo().window(childWindowId);
		
		System.out.print("child Window Title:"+driver.getTitle());
		
		driver.close();
		
		

	}

}
