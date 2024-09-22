package Pro.Training.Tech.Students;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectors {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://www.facebook.com");
	//Thread.sleep(6000);
	driver.navigate().refresh();
	driver.manage().window().maximize();
	WebElement createanaccount=driver.findElement(By.linkText("Create new account"));
	Createanaccount.click();
	Thread.sleep(3000);
	WebElement 
	
	 
   WebElement male = driver.findElement(By.xpath((/html/body/div/div/div/div/div/div/div/div/form/form/div/div/span/span/input)[2])); 
   male.click();
	
	}

}
