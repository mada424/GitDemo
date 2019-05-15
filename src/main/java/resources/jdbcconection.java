package resources;

import com.mysql.cj.protocol.Resultset;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.*;

public class jdbcconection {
    String host = "localhost";
    String port = "3306";
    Connection con;

    {
        try {
            con = DriverManager.getConnection("jdbc:mysql://hostname:port/dbname","username", "password");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    Statement s = con.createStatement();
    ResultSet rs = s.executeQuery("select * from credentials where scenario = 'zerobalance'");
    while (rs.next())

    {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://login.salesforce.com");
            driver.findElement(By.xpath(".//*[@id=username']")).sendKeys((rs.getString("username")));
            driver.findElement(By.xpath(".//*[@id=password']")).sendKeys(rs.getString("password"));


        }
        //public jdbcconection() throws SQLException {



    public jdbcconection() throws SQLException {
    }
}

