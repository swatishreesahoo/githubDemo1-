package packageObjectModel_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class pageFactoryImplementation1 {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\training_b6b.00.10\\\\Desktop\\\\Browsers and Drivers\\\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  pageFactory1 locateElements = PageFactory.initElements(driver, pageFactory1.class);
	  locateElements.loginMethod("swati123@gmail.com", "swati123");
  }
}
