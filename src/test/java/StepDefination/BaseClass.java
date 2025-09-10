package StepDefination;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import PageObject.AddnewCustomerPage;
import PageObject.SearchCustomerPage;
import PageObject.loginPage;

public class BaseClass {

	
	public WebDriver driver;
	public loginPage LoginPg;
	public AddnewCustomerPage addNewCustPg;
	public SearchCustomerPage searchNewCustPg;
	
	public String GenerateEmailId() {
		
		return( RandomStringUtils.randomAlphabetic(5));
	}
	
	
}
