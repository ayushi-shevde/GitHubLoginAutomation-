package pageobjects;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logout {
WebDriver driver;


    public Logout(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // very important
    }

    @FindBy(xpath = "//a[text()='Log out']")
    private WebElement logoutBtn;
    WebElement LogoutField;


    public void clickLogout() {
    	
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", logoutBtn);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", logoutBtn);
    }

    public String handleAlertIfPresent() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.alertIsPresent());

            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            alert.accept();
            return alertText;
        } catch (NoAlertPresentException e) {
            System.out.println("Alert not present on page.");
            return null;
        }
    }
}
