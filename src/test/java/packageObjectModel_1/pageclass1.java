package packageObjectModel_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageclass1 {
	
         WebDriver driver=null;
         By lnc=By.linkText("Log in");
         By uname=By.name("Email");
         By pwd=By.name("Password");
         By login=By.xpath("//input[@value='Log in']");
         
         public pageclass1(WebDriver driver) {
        	 this.driver=driver;
         }
         public void clickOnSignin() {
        	 driver.findElement(lnc).click();
         }
         public void typeName(String username) {
        	 driver.findElement(uname).sendKeys(username);
         }
         public void typePassword(String password) {
        	 driver.findElement(pwd).sendKeys(password);
         }
         public void clickOnLogin() {
        	 driver.findElement(login).click();
         }
}
