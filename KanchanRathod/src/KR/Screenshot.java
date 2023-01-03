package KR;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Aakash/Downloads/chromedriver_win32 (6)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://techcanvass.com/Examples/multi-select.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		File s= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File d= new File("C:/Users/Aakash/Desktop/KA/A.bmp");
		FileUtils.copyFile(s, d);
	}

}
