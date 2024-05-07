package rishiHerbal;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RishiTest {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWbDriver\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rishiherbalindia.linker.store/");
		Thread.sleep(2000);
		driver.findElement(By.name("query")).sendKeys("HERBAL AGRO GROWTH BOOSTER");
		Thread.sleep(2000);
		driver.findElement(By.className("input-group-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log In")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".act_anim > .form-control")).sendKeys("lalankumar993463@gmail.com");
        Thread.sleep(2000);
		driver.findElement(By.cssSelector(".is-floating-label:nth-child(2) > .form-control")).sendKeys("DigiAI@34");
        Thread.sleep(2000);
		driver.findElement(By.cssSelector(".btn:nth-child(6)")).click();
        Thread.sleep(2000);
		driver.findElement(By.linkText("All")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("HEALTH")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("SAFETY")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("SKIN")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("PERSONAL")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("BABY")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("AGRICULTURE")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("VETERINARY")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("HOME")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("FOOD")).click();


		
		}

}
