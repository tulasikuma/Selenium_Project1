package OpenBroserPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropDownBox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver,chrome,driver", "C:\\Software\\Selenium Software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		WebElement dd=driver.findElement(By.xpath("//input[@ type=\"text\"]"));
		dd.sendKeys("selenium");
		driver.findElement(By.xpath("//input[@ name=\"txtPassword\"]")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@ type=\"Submit\"]")).click();
		driver.navigate().to("https://mail.google.com/");
		driver.navigate().back();
		Thread.sleep(1000);
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//option[@ value=\"2\"]")).click();
		
		
	}

}
