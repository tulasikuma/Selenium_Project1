package OpenBroserPack;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stu
	System.setProperty("webdriver,chrome,driver", "C:\\Software\\Selenium Software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
	driver.findElement(By.xpath("//input[@ name=\"txtUserName\" ]")).sendKeys("selenium");
	driver.findElement(By.xpath("//input[@ name=\"txtPassword\" ]")).sendKeys("selenium");
	driver.findElement(By.xpath("//input[@ type=\"Submit\"]")).click();
	Thread.sleep(3000);
	driver.navigate().to("https://www.google.com/");
	driver.navigate().back();
	
	WebElement w=driver.findElement(By.xpath("//span[text()='Help']"));
	Actions a=new Actions(driver); //Mouse over action
	a.moveToElement(w).perform();
	driver.findElement(By.xpath("//span[ text()='Help Contents']")).click(); // Open First window.
	
	Thread.sleep(2000);
	a.moveToElement(w).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Support']")).click(); // Open second window.
	
	Thread.sleep(6000);
	a.moveToElement(w).perform();
	driver.findElement(By.xpath("//span[ text()='Forum']")).click(); // dOpen third window.
	
	Thread.sleep(6000);
	a.moveToElement(w).perform();
	driver.findElement(By.xpath("//span[ text()='Blog']")).click(); // Open forth window.
	Thread.sleep(9000);
	Set<String> allwindows=driver.getWindowHandles();
	System.out.println(allwindows.size()); // we will know number of windows are open
	
	ArrayList<String> array=new ArrayList<String>(allwindows);
	Thread.sleep(9000);
	driver.switchTo().window(array.get(0));// driver moved to Parent window.
	Thread.sleep(3000);
	driver.switchTo().window(array.get(1));// driver moved to first window.
	Thread.sleep(3000);
	driver.switchTo().window(array.get(2));// driver moved to second window.
	Thread.sleep(3000);
	driver.switchTo().window(array.get(3));// driver moved to third window.
	Thread.sleep(3000);
	driver.switchTo().window(array.get(4));// driver moved to forth window.
	Thread.sleep(3000);
	driver.close(); //Close current window. I mean forth window will close.
	
	Thread.sleep(9000);
	driver.quit(); //Close entair browser.
	}

}
