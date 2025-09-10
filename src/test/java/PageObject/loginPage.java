package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	WebDriver Ldriver;   //local Webdriver
	public loginPage(WebDriver Rdriver){ //remote webdriver
		Ldriver=Rdriver;
		
		PageFactory.initElements(Rdriver, this);
	}
	
	@FindBy(id="Email")
	WebElement email;
	@FindBy(id="Password")
	WebElement password;
	@FindBy(xpath="//button[text()='Log in']")
	WebElement loginButton;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logoutButton;
	
	
	public void enterEmail(String emailAdd) {
		email.sendKeys(emailAdd);
	}
	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}
	public void clickOnLoginButton() {
		loginButton.click();
	}
	public void clickOnLogoutButton() {
		
		Actions actions = new Actions(Ldriver);
		actions.moveToElement(logoutButton).click().perform();
		
		//logoutButton.click();
	}
	
	public void ClearEmailAndPass() throws InterruptedException {
		email.clear();
		//Thread.sleep(2000);
		password.clear();
	}
	
	
	
	
}
