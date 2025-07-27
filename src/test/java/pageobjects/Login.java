package pageobjects;
    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Login {	   
		WebDriver driver;

	    public Login(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this); // very important
	    }

	    @FindBy(xpath = "//input[@type='text']")
	    WebElement usernameField;

	    @FindBy(xpath = "//input[@type='password']")
	    WebElement passwordField;

	    @FindBy(xpath = "//input[@type='submit']")
	    WebElement loginButton;

	    public void enterUsername(String uname) {
	        usernameField.sendKeys(uname);
	    }

	    public void enterPassword(String pwd) {
	        passwordField.sendKeys(pwd);
	    }

	    public void clickLogin() {
	        loginButton.click();
	    }
	}