package Pro.Training.Tech.Students;

import org.testng.annotations.Test;

import Common.Reusable;
import Pages.Contact;


import org.testng.annotations.DataProvider;

public class ContactUsForm extends Reusable {
  @Test(dataProvider = "dp")
  public void f(String n, String s, String k) {

Contact ob=new Contact(driver);
 /*ob.FirstNameTexts("Shahbaz");
 ob.LastNameTexts("Saleem");
 ob.EmailTexts("Saleem@gmail.com");
 ob.FirstNameTexts("Sana");
 ob.LastNameTexts("Lodhi");
 ob.EmailTexts("Sana@gmail.com");
 ob.FirstNameTexts("John"); 
 ob.LastNameTexts("Saltana"); 
 ob.EmailTexts("John@gmail.com");*/
  
 ob.FirstNameTexts(n);
 ob.LastNameTexts(s);
 ob.EmailTexts(k);
  
  }
  

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Shahbaz", "Saleem", "Saleem@gmail.com"},
      new Object[] { "Sana", "Lodhi", "Sana@gmail.com" },
      new Object[] {"John", "Saltana", "John@gmail.com"}
    };
  }
}
