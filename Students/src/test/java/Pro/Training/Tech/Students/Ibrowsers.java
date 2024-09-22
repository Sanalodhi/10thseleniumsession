package Pro.Training.Tech.Students;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ibrowsers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


	//how to setup the browser and how to open the
	//website into the browser
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanal\\eclipse-workspace\\Students\\Drivers\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://www.facebook.com");
	/*//Thread.sleep(6000);
	driver.navigate().refresh();
	driver.manage().window().maximize();
	//Thread.sleep(6000);
	driver.navigate().back();
	//Thread.sleep(6000);
	driver.navigate().forward();
	String sessions=driver.getWindowHandle();//Get sessionid for the browser
	System.out.println(sessions);
	String titles=driver.getTitle();
	System.out.println(titles);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	driver.close();
	/*i) id ii)linktext iii)partiallinktext iv)ClassName v)Name vi)Xpath vii)Css selector viii)Tagname
	 */
	
	WebElement emailenters=driver.findElement(By.id("email"));
	emailenters.sendKeys("sanajaved21@gmail.com");
	WebElement psswrd=driver.findElement(By.name("pass"));
	psswrd.sendKeys("yes");
	//WebElement forgtlk=(WebElement) driver.findElement(By.linkText("Forgot password"));
	
	WebElement forgtlk=(WebElement) driver.findElement(By.partialLinkText("Forgot"));
	forgtlk.click();	
	

    // Navigate to Facebook
    driver.navigate().to("http://www.facebook.com");

    // Click on the "Create New Account" button
    WebElement createNewAccount = driver.findElement(By.linkText("Create new account"));
    createNewAccount.click();

    
    Thread.sleep(2000);

   
    WebElement firstName = driver.findElement(By.name("firstname"));
    firstName.sendKeys("Sana");

    WebElement lastName = driver.findElement(By.name("lastname"));
    lastName.sendKeys("Javed");

    WebElement emailOrPhone = driver.findElement(By.name("reg_email__"));
    emailOrPhone.sendKeys("sanajaved27@gmail.com");

   
    Thread.sleep(2000);

    WebElement password = driver.findElement(By.name("reg_passwd__"));
    password.sendKeys("abc123");

    // Select Date of Birth
    WebElement birthDay = driver.findElement(By.name("birthday_day"));
    birthDay.sendKeys("21");

    WebElement birthMonth = driver.findElement(By.name("birthday_month"));
    birthMonth.sendKeys("May");

    WebElement birthYear = driver.findElement(By.name("birthday_year"));
    
    birthYear.sendKeys("1990");

   
    WebElement gender = driver.findElement(By.xpath("//input[@value='1']")); 
    gender.click();

    // Click on the "Sign Up" button
    WebElement signUpButton = driver.findElement(By.name("websubmit"));
    signUpButton.click();

    

 
}
	}



