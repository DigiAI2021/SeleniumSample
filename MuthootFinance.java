package rishiHerbal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class MuthootFinance {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWbDriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.muthootfinance.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("xpath=//div[@id='services_menu']/div/div/div/ul/li/a/div[2]/h4"));
		Thread.sleep(2000);
		driver.findElement(By.linkText("corporate"));
		Thread.sleep(2000);
		driver.findElement(By.linkText("Investors"));
		Thread.sleep(2000);
		driver.findElement(By.linkText("Policy"));
		Thread.sleep(2000);
		driver.findElement(By.linkText("CAREERS"));
		Thread.sleep(2000);
		driver.findElement(By.linkText("MEDIA"));
		Thread.sleep(2000);
		driver.findElement(By.linkText("News"));
		Thread.sleep(2000);
		driver.findElement(By.linkText("Contact"));
		Thread.sleep(2000);
		driver.findElement(By.linkText("CUSTOMER SERVICE"));
		Thread.sleep(2000);
		driver.findElement(By.linkText("Blog"));


		

		



	}

}
