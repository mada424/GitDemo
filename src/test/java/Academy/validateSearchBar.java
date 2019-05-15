package Academy;

import org.junit.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pageObjects.SignInPage;
import resources.Base;

import java.io.IOException;

public class validateSearchBar extends Base {
    @Test
    public void validateSearchBar() throws IOException {

        driver=initializeDriver();
        driver.get("http://88.99.124.136/entest/wpwoo/index.php/shop/");
        SignInPage search1 = new SignInPage(driver);
        Assert.assertTrue(search1.getSearch().isDisplayed());
    }
}
