package Common;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;

public class Reusable {
	public WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeMethod
  @Parameters({"browsers"})
  public void browsers(String browser) {
	if(browser.equalsIgnoreCase("Chrome")) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanal\\eclipse-workspace\\Students\\Drivers\\chromedriver.exe");
			 
			driver=new ChromeDriver();
	  } else if (browser.equalsIgnoreCase("Edge")) {
			  System.setProperty("webdriver.edge.driver", "C:\\Users\\sanal\\eclipse-workspace\\Students\\Drivers\\msedgedriver.exe");
				
				driver=new EdgeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  Thread.sleep(6000);
	  driver.quit();
  }
  }

}
