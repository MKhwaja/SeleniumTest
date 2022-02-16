package AppTest.Resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class base {

    public WebDriver driver;

    public String loadProperties(String property) throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("src/AppTest/Resources/data.properties");
        prop.load(fis);
        return prop.getProperty(property);
    }

    public WebDriver intializeDriver() throws IOException {
        String browserName = loadProperties("browser");

        if(browserName.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver");
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        return driver;
    }
}
