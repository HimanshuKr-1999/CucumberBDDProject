package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObject.AddnewCustomerPage;
import PageObject.SearchCustomerPage;
import PageObject.loginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef extends BaseClass {
	
	
	
	@Given("User launches chrome browser")
	public void user_launches_chrome_browser() {
	    WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		LoginPg = new loginPage(driver);
		addNewCustPg= new AddnewCustomerPage(driver);
		searchNewCustPg = new SearchCustomerPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("User opens URL {string}")
	public void user_opens_url(String URL) {
		driver.get(URL);
	}

	@When("User enters Valid Email as {string} and Valid Password as {string}")
	public void user_enters_valid_email_as_and_valid_password_as(String email, String pass) throws InterruptedException {
		LoginPg.ClearEmailAndPass();
		LoginPg.enterEmail(email);
		LoginPg.enterPassword(pass);
	}

	@When("User clicks on Login")
	public void user_clicks_on_login() {
		LoginPg.clickOnLoginButton();

	}

//	@Then("Page Title should be {string}")
//	public void page_title_should_be(String expectedTitle) {
//		//String ExpectedTitle=driver.getTitle();
//		String ActualTitle =driver.getTitle();
//		if(ActualTitle.equalsIgnoreCase(expectedTitle)) {
//			Assert.assertTrue(true);
//		}
//		else
//			Assert.assertTrue(false);
//	}

	@When("user clicks on Log out link")
	public void user_clicks_on_log_out_link() throws InterruptedException {
		Thread.sleep(2000);
	 LoginPg.clickOnLogoutButton();
	}
	
	
	@Then("Page Title should be {string}")
	public void page_title_should_be(String expectedTitle){
		String ActualTitle =driver.getTitle();
		Assert.assertEquals(ActualTitle, expectedTitle, "Page title does not match!");}
	

	@Then("close browser")
	public void close_browser() {
	    driver.close();
	    driver.quit();
	}

	
	@Then("User can view Dashboard")
	public void user_can_view_dashboard() {
		
		String ActualTitle = addNewCustPg.getPageTitle();
		String ExpectedTitle= "Dashboard / nopCommerce administration";
		Assert.assertEquals(ActualTitle, ExpectedTitle, "Page title does not match!");}

		
	   
	

	@When("User click on customers Menu")
	public void user_click_on_customers_menu() {
		
		addNewCustPg.clickOnCustomersMenu();
	 
	}

	@When("click on customers Menu Item")
	public void click_on_customers_menu_item() {
	    addNewCustPg.clickOnCustomersMenuItem();
	}

	@When("click on Add new button")
	public void click_on_add_new_button() {
	   addNewCustPg.clickOnAddnew();
	}

	@Then("User can view Add new customer page")
	public void user_can_view_add_new_customer_page() {
		String actualTitle = addNewCustPg.getPageTitle();
		String expectedTitle = "Add a new customer / nopCommerce administration";

		if(actualTitle.equals(expectedTitle))
		{
		//	log.info("User can view Add new customer page- passed");

			Assert.assertTrue(true);//pass
		}
		else
		{
			//log.info("User can view Add new customer page- failed");

			Assert.assertTrue(false);//fail
		}
	}
	

	@When("User enter customer info")
	public void user_enter_customer_info() {
		addNewCustPg.enterEmail(GenerateEmailId() + "@gmail.com");     //generateEmailId()
		addNewCustPg.enterPassword("test1");
		addNewCustPg.enterFirstName("Prachi");
		addNewCustPg.enterLastName("Gupta");
		addNewCustPg.enterGender("Female");
		//addNewCustPg.enterDob("6/13/1988");
		addNewCustPg.CheckboxForTaxExmpted();
	//	addNewCustPg.enterCompanyName("CodeStudio");
		//addNewCustPg.enterAdminContent("Admin content");
		//addNewCustPg.enterManagerOfVendor("Vendor 1");

		//log.info("customer information entered");
	}

	@When("click on Save button")
	public void click_on_save_button() {
	  addNewCustPg.clickOnSave();
	}

	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String exptectedConfirmationMsg) {
		String bodyTagText = driver.findElement(By.tagName("Body")).getText();
		if(bodyTagText.contains(exptectedConfirmationMsg))
		{
			Assert.assertTrue(true);//pass
			//log.info("User can view confirmation message - passed");

		}
		else
		{
			//log.warn("User can view confirmation message - failed");

			Assert.assertTrue(false);//fail

		}

	}
	
	////////////////////////////////////////////SEARCH CUSGTOMER///////////////////////////////////////////////
	
	@When("Enter customer EMail")
	public void enter_customer_e_mail() {
		searchNewCustPg.enterEmailAdd("arthur_holmes@nopCommerce.com");
	  
	}
	
	@When("click on search button")
	public void click_on_search_button() {
	   searchNewCustPg.clickOnSearchButton();
	}


	@Then("User should get the Email in search result table")
	public void user_should_get_the_email_in_search_result_table() {
		String ExpectedEmail= "arthur_holmes@nopCommerce.com";
		
		Assert.assertTrue(searchNewCustPg.searchCustomerByEmail(ExpectedEmail));
		
//		if(searchNewCustPg.searchCustomerByEmail(ExpectedEmail)==true) {
//			Assert.assertTrue(true);
//		}
//		else
//			Assert.assertTrue(false);
	  
	}


}
