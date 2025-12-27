package OpenBroserPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Passing_data_to_webpage {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Software\\Selenium Software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
    Thread.sleep(3000);
    WebElement un=driver.findElement(By.name("txtUserName"));
               un.sendKeys("selenium");
    WebElement up=driver.findElement(By.name("txtPassword"));
               up.sendKeys("selenium");
    Thread.sleep(3000);
    WebElement click=driver.findElement(By.name("Submit"));
               click.click();
    Thread.sleep(3000);
    driver.quit();
    
	}

}
