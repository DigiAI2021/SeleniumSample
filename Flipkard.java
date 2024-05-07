package rishiHerbal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Flipkard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWbDriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("poco m2");
		Thread.sleep(2000);
		driver.findElement(By.className("_2iLD__")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("_1XjE3T")).click();
		/*Thread.sleep(2000);
		driver.findElement(By.className("_1XjE3T")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("_1XjE3T")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("_1XjE3T")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("_1XjE3T")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("_1XjE3T")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("_1XjE3T")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("_1XjE3T")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("_1XjE3T")).click();*/









  
	}

}
