package rishiHerbal;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWbDriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
      driver.get("https://www.amazon.in/");
      Thread.sleep(4000);
      driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Poco f1");
      Thread.sleep(4000);
      driver.findElement(By.id("nav-search-submit-button")).click();
      Thread.sleep(4000);
      driver.findElement(By.id("nav-cart-count")).click();
      Thread.sleep(4000);
      driver.findElement(By.id("nav-hamburger-menu")).click();



      //System.out.println(driver.getTitle());
      //driver.quit();
	}

}
