package resources;

//import org.apache.logging.log4j.core.util.FileUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {
    public WebDriver driver;
    public Properties prop;
    public WebDriver initializeDriver() throws IOException {
        prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\mmunteanu\\IdeaProjects\\E2EProject\\src\\main\\java\\resources\\data.properties");

        prop.load(fis);
        String browserName = prop.getProperty("browser");
        if (browserName.equals("chrome")){

            //execute in chrome
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmunteanu\\Downloads\\chromedriver_win32\\chromedriver.exe");

            driver = new ChromeDriver();
        }
        else if (browserName.equals("firefox")){
            //execute in firefox
            System.setProperty("webdriver.firefox.driver", "C:\\Users\\mmunteanu\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");

            driver = new FirefoxDriver();
        }
            else if (browserName.equals("IE")){
            //execute in IE
            System.setProperty("webdriver.IE.driver", "C:\\Users\\mmunteanu\\Downloads\\IEDriverServer_x64_3.8.0\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            return driver;
    }

    public void getScreenshot(String result) throws IOException
    {
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("C://Users//mmunteanu//Pictures//test//"+result+" screenshot.png"));
    }
}

