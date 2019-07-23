package stepdef1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class parameterization1 {
	WebDriver driver=null;
	@Given("User opened the application")
	public void user_opened_the_application() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.00.10\\Desktop\\Browsers and Drivers\\chromedriver.exe");
		   driver=new ChromeDriver();
		   String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
		   driver.get(url);
		   driver.manage().window().maximize();
		  
	}

	@When("User click on to signin link")
	public void user_click_on_to_signin_link() throws InterruptedException {
		 driver.findElement(By.linkText("SignIn")).click();
		 Thread.sleep(3000);
		 System.out.println("the title of the page is: "+driver.getTitle());
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String username, String password) throws InterruptedException {
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("Login")).click();
	    
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='logout.htm']")).click();
		
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_Login_Successfully() {
	  System.out.println("executed successfully");
	  driver.close();
	}

}
