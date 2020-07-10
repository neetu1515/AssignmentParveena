package assignment;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class assign_1 {
	@Test
	public void assignment() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// open website
		driver.get("http://www.techfios.com/ibilling/?ng=admin/");
		driver.manage().window().maximize();
		// 2. username
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		// 3. password
		driver.findElement(By.id("password")).sendKeys("abc123");
		// 4. login
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// driver.getCurrentUrl();
		Thread.sleep(2000);

		// 5. select transaction
		driver.findElement(By.linkText("Transactions")).click();
		Thread.sleep(2000);

		// 6. select new deposit
		driver.findElement(By.xpath("//a[contains(text(),'New Deposit')]")).click();
		Thread.sleep(2000);

		//7. select from dropdown
		driver.findElement(By.cssSelector("select#account")));
		select.selectByVisibleText("Pizza2071");
		Thread.sleep(2000);
		
		// 8. type description
		driver.findElement(By.xpath("//input[@id='description']")).sendKeys("MidSpring2020");
		Thread.sleep(2000);

		// 9. type amount
		driver.findElement(By.xpath("//input[@name='amount']")).sendKeys("100,000");
		Thread.sleep(2000);

		// 10. click on submit button
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);

		driver.close();
		driver.quit();
	}

}
