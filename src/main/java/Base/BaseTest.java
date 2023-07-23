package Base;

import Utility.ReadDataFromPropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;


public class BaseTest {

    public static WebDriver driver;



    @BeforeMethod
    public void setup() throws IOException {
        String browser = ReadDataFromPropertiesFile.readPropertiesFile("browser");
        if(browser.equalsIgnoreCase("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("firefox"))
        {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge"))
        {
            WebDriverManager.edgedriver().setup();
            driver =  new EdgeDriver();

        }

        //Navigating Browser
        driver.get(ReadDataFromPropertiesFile.readPropertiesFile("url"));
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}
