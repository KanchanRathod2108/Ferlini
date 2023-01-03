package KR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Next {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Aakash/Downloads/chromedriver_win32 (6)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ferlini.it/");
		
		
		driver.findElement(By.xpath("(//span[contains(text(),'Ferlini')])[2]")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'FOCUS')])[2]")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'Stiamo Assumendo !')])[2]")).click();
		
		
	}

}
