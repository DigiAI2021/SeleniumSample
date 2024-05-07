package rishiHerbal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWbDriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();

		//driver.findElement(By.linkText("Amazon miniTV")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ap_email")).sendKeys("9934633206");
		Thread.sleep(2000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ap_password")).sendKeys("Lalan@12345");
		Thread.sleep(2000);
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sell")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Best Sellers")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Today's Deals")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Mobiles")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("New Releases")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Customer Service")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Prime")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Electronics")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Gift Ideas")).click();












		




		

	}

}
