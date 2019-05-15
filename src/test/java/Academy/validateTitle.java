package Academy;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.SignInPage;
import resources.Base;

import java.io.IOException;





public class validateTitle extends Base {
//    private static Logger logger = Logger.getLogger(Base.class.getName());
    Logger logger = Logger.getLogger( validateTitle.class);
    //private static Logger log =logManager.getLogger(Academy.validateTitle().getName());
    //final static Logger log = logManager.getLogger(base.class.getName());


    @BeforeTest
        public void initialize() throws IOException {
            driver = initializeDriver();
            logger.info("Driver is initialized");
            driver.get(prop.getProperty("url"));
            logger.info("Navigated to homepage");
        }

    @Test

    public void validateTitle() throws IOException {

        SignInPage sign = new SignInPage(driver);
        //compare the title from the browser with actual title
       // Assert.assertEquals(sign.getTitle1().getText(), "MADISON ISLAND");
        Assert.assertEquals(sign.getTitle(), "1111Madison Island");
        logger.info("Successful validated text message");

    }
    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
