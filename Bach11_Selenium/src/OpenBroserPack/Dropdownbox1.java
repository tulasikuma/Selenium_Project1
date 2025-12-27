package OpenBroserPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdownbox1 {

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
		List<WebElement> ddvalues = driver.findElements(By.tagName("option"));
		for(int i=0;i<ddvalues.size();i++) {
			System.out.println(ddvalues.get(i).getText());
			
		}
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@ href=\"./index.php?ACT=logout\"]")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
