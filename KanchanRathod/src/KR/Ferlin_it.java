package KR;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ferlin_it {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Aakash/Downloads/chromedriver_win32 (6)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Ferlini.it");;
				
				Actions b=new Actions(driver);
				b.sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h3[contains(text(),'Ferlini — Ferlini.it')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//header/div[2]/h1[1]/a[1]/img[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[contains(text(),'Ferlini')])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[contains(text(),'FOCUS')])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[contains(text(),'Stiamo Assumendo !')])[2]")).click();
		
	    
        }
	}
	

