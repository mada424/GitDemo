package Academy;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.SignInPage;
import resources.Base;

import java.io.IOException;

public class ShoppingCart extends Base {

    @Test(dataProvider = "getData")

    public void ShoppingCartNavigation(String Username, String Password, String text) throws IOException {
        driver = initializeDriver();
        driver.get("http://88.99.124.136/entest/wpwoo/index.php/shop/");
        SignInPage sign = new SignInPage(driver);
        sign.getLogin().click();
        LoginPage login = new LoginPage(driver);
        login.getUsername().sendKeys(Username);
        login.getPassword().sendKeys(Password);
        System.out.println(text);
        login.getsubmit().click();


    }
    @DataProvider
    public Object[][] getData(){
        Object[][] data= new Object[2][3];
        //0 row
        data[0][0]="aaaaaa";
        data[0][1]="wwwwww";
        data[0][2] = "restricted user";
         //1st row
        data[1][0]="bbbbb";
        data[1][1]="dddddd";
        data[1][2]="non restricted user";

        return data;
    }

}
