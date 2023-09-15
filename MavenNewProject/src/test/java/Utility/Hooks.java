package Utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void setUp() {
        Properties properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\MavenNewProject\\src\\test\\java\\config\\config.properties");
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String browser = properties.getProperty("browser");
        String url = properties.getProperty("url");

        switch (browser.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                throw new IllegalArgumentException("Invalid browser specified in config.properties");
        }

        driver.get(url);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.close();
    }
}





