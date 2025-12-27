package OpenBroserPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DoubleClickMouseActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver,chrome,driver", "C:\\Software\\Selenium Software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.google.com/");
    WebElement w=driver.findElement(By.xpath("//div[@id=\"SIvCob\"]/text()"));
    Thread.sleep(2000);
    Actions a=new Actions(driver);
    a.doubleClick(w).perform();
    Thread.sleep(4000);
	driver.quit();
	}

}
