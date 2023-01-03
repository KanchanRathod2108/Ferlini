package KR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Index_VisibleText_Value {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Aakash/Downloads/chromedriver_win32 (6)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://techcanvass.com/Examples/multi-select.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement a= driver.findElement(By.id("multiselect"));
		Select s= new Select(a);
		//s.selectByIndex(0);
		//s.selectByVisibleText("Opel");
		//s.selectByValue("honda");
		s.deselectByIndex(0);
		s.deselectByVisibleText("Opel");
		s.deselectByValue("honda");
		
	}

}
