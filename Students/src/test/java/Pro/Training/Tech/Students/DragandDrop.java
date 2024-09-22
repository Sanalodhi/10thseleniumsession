package Pro.Training.Tech.Students;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanal\\eclipse-workspace\\Students\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/droppable/");
		//Thread.sleep(6000);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		Actions ob=new Actions(driver);
		driver.switchTo().frame(0);
		Thread.sleep(6000);
		WebElement sj=driver.findElement(By.id("draggable"));
		WebElement kj=driver.findElement(By.id("droppable"));
		ob.dragAndDrop(sj, kj).build().perform();
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Resizable")).click();
	}

}

