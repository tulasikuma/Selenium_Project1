package OpenBroserPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverHandling {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
    System.setProperty("wedriver.chrome.driver", "C:\\Software\\Selenium Software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
    driver.findElement(By.name("txtUserName")).sendKeys("selenium");
    driver.findElement(By.name("txtPassword")).sendKeys("selenium");
    driver.findElement(By.name("Submit")).click();
    Thread.sleep(3000);
    driver.navigate().to("https://www.google.com/?zx=1765200248941&no_sw_cr=1");
    driver.navigate().back();
    WebElement web= driver.findElement(By.xpath("//span[@class='drop' and text()='Reports']"));
    Actions a=new Actions(driver);
    a.moveToElement(web).perform();
    
	}

}
