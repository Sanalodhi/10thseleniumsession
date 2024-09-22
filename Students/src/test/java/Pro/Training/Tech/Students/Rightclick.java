package Pro.Training.Tech.Students;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Rightclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanal\\eclipse-workspace\\Students\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://deluxe-menu.com/popup-mode-sample.html");
		//Thread.sleep(6000);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		WebElement rightjk=driver.findElement(By.xpath("//img[@style='cursor: pointer;']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(null)));
		
		Actions ob=new Actions(driver);
		//Thread.sleep(3000);
		ob.contextClick(rightjk).build().perform();
		
		//Synchronization--Implicit wait --explicit wait
	}

}
