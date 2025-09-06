package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsDefination {
	
	
	static WebDriver driver;
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.saucedemo.com/v1/");
	}

//	@When("User enters Valid {Username} and {Password}")
//	public void user_enters_valid_username_and_password( String String1, String String2) 
	@When("User enters Valid {string} and {string}")
	public void user_enters_valid_and(String string, String string2) 
	{
	    driver.findElement(By.id("user-name")).sendKeys(string);
	    driver.findElement(By.id("password")).sendKeys(string2);
	}

	@And("Clicks on submit button")
	public void clicks_on_submit_button() {
		  driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}

	@Then("user is navigated to Home page")
	public void user_is_navigated_to_home_page() {
	    String CurrentURL=driver.getCurrentUrl();
	    Assert.assertEquals(CurrentURL, "https://www.saucedemo.com/v1/inventory.html");
	}

	@And("Close the browser")
	public void close_the_browser() {
		driver.close();
	}

}
