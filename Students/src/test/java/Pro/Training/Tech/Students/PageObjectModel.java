package Pro.Training.Tech.Students;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.Bestsellers;
import Pages.Home;
import Pages.Kindlestores;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;

public class PageObjectModel {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  Home ob=new Home(driver);
	  Thread.sleep(3000);
	  ob.BestSellersClick();
	  
	  Bestsellers oj=new Bestsellers(driver);
	  Thread.sleep(3000);
	  oj.StoresToClick();
	  
	  Kindlestores ok=new Kindlestores(driver);
	  String kindlestorestexts=ok.Kindlestoresget();
	  
	  System.out.println(kindlestorestexts);
	  SoftAssert jk=new SoftAssert();
	  
	  jk.assertEquals(kindlestorestexts, "Best sellers in Kindle Store");
	  //assert, soft-assert
	  System.out.println("This is after assertion");
	  jk.assertAll();
	  
  }
  @Test (dependsOnMethods= "f")
  
  public void seconds() {
	  System.out.println("This is second method");
  }
  
  @BeforeMethod
  public void beforeMethod() throws InterruptedException, IOException {
	  
	browsers ("chrome");
		driver.navigate().to("http://www.amazon.com");
		Thread.sleep(3000);
		//driver.navigate().refresh();
		driver.manage().window().maximize();
		screenshots();
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(6000);
	  driver.quit();
  }
  public void browsers(String browser) {
	  if(browser.equalsIgnoreCase("Chrome")) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanal\\eclipse-workspace\\Students\\Drivers\\chromedriver.exe");
		 
		driver=new ChromeDriver();
  } else if (browser.equalsIgnoreCase("Edge")) {
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\sanal\\eclipse-workspace\\Students\\Drivers\\msedgedriver.exe");
			
			driver=new EdgeDriver();
  }
  }
public void screenshots( ) throws IOException {
	Date dt=new Date();
	String jk=dt.toString().replace(" ", "_").replace(":","_");
	System.out.println(jk);
	
	File capture=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(capture, new File("C:\\Users\\sanal\\eclipse-workspace\\Students\\Pictures\\"+jk+"output.jpg"));
	
}
}
