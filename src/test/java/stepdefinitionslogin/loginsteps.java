package stepdefinitionslogin;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Login;
import pageobjects.Logout;


public class loginsteps {
	Login login;
	WebDriver driver=Hooks.driver;

	
	@Given("User have to enter the URL of the website")
    public void user_is_on_login_page() {
        Hooks.driver.get("https://demo.guru99.com/V4/");
        login = new Login(Hooks.driver); 
    }
	@When("Enter Username and Password")
    public void enter_username_and_password() {
       login.enterUsername("mngr628729");
        login.enterPassword("YvEjunu");
    }
	@And("Click on Login button")
	public void click_on_login_button() {
		login.clickLogin();
		}
	@Then("Land on Homepage")
	public void land_on_homepage(){
		String expectedTitle = 	"Guru99 Bank Manager HomePage";
		String actualTitle = driver.getTitle();
		System.out.print("Print the get title" + actualTitle);
		if (actualTitle.contains(expectedTitle)) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Login Failed!");
        }
	}
	
	@And("Verify the logout")
	public void  verify_the_logout_button() {
		Logout logout = new Logout(driver);
		logout.clickLogout();

	}
	@Then("Go back to Login page")
	public void go_back_to_the_login_page() {
		Logout logout = new Logout(driver);
	    String alertMsg = logout.handleAlertIfPresent();
	    if (alertMsg != null) {
	        System.out.println("Alert message: " + alertMsg);
	    }
	}

	}
