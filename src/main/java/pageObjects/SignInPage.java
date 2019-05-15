package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {

    public WebDriver driver;
    By signin = By.xpath("//*[@id='meta-2']/ul/li[1]/a");

    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    //By text1 = By.cssSelector(".woocommerce-products-header__title");
    By title1 = By.cssSelector(".large");

    By searchBar = By.id("search-form-5c62bb3e1012a");

    public WebElement getLogin(){
        return driver.findElement(signin);
    }
    //public WebElement getText1(){
      //  return driver.findElement(text1);
    //}
    public WebElement getSearch(){
        return driver.findElement(searchBar);
    }

    public WebElement getTitle1(){
        return driver.findElement(title1);
    }
    public String getTitle(){
        return driver.getTitle();
    }
}
