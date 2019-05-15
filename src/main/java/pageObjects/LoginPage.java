package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public WebDriver driver;
    By username = By.id("user_login");
    By password = By.id("user_pass");
    By go = By.id("wp-submit");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUsername(){
        return driver.findElement(username);
    }
    public WebElement getPassword(){
        return driver.findElement(password);
    }
    public WebElement getsubmit(){
        return driver.findElement(go);
    }
}
