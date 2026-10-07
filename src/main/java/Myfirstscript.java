import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Myfirstscript {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String title = driver.getTitle();
		System.out.println("Title is: "+title);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		username.sendKeys("Admin");

		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		password.sendKeys("admin123");

		WebElement submitBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		submitBtn.click();
		
		
		

				
	driver.close();
		driver.quit();
		
		

	}

}
