package packageObjectModel_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pomImplementation {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.00.10\\Desktop\\Browsers and Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	pageclass1 obj=new pageclass1(driver);
	driver.get("http://demowebshop.tricentis.com");
	obj.clickOnSignin();
	String username="swati123@gmail.com";
	obj.typeName(username);
	String password="swati123";
	obj.typePassword(password);
	obj.clickOnLogin();
	System.out.println("title is: "+driver.getTitle());
	}

}
