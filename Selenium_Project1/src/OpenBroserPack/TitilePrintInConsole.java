package OpenBroserPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitilePrintInConsole {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      
		System.setProperty("webdeiver,chrome,driver", "C:\\Software\\Selenium Software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/index.php");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		driver.findElement(By.name("txtPassword")).sendKeys("selenium");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		//relocating to anather web paage.
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		System.out.println(driver.getTitle());
        Thread.sleep(2000);
        driver.quit();
        
	}

}
