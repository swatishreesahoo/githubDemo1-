package stepdef1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testMe1 {
	WebDriver driver=null;
	@Given("the login page is opened")
	public void the_login_page_is_opened() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.00.10\\Desktop\\Browsers and Drivers\\chromedriver.exe");
	   driver=new ChromeDriver();
	   String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
	   driver.get(url);
	   driver.manage().window().maximize();
	   driver.findElement(By.linkText("SignIn")).click();
	}

	@When("user enters lalitha as username")
	public void user_enters_lalitha_as_username() {
	   driver.findElement(By.name("userName")).sendKeys("lalitha");
	    
	}

	@When("user enters password{int} as password")
	public void user_enters_password_as_password(Integer int1) {
		driver.findElement(By.name("password")).sendKeys("password123");
		driver.findElement(By.name("Login")).click();
		  
	}

	@Then("user will find a testmeapp homepage")
	public void user_will_find_a_testmeapp_homepage() {
	   System.out.println("home page title: "+driver.getTitle()); 
	}


}
