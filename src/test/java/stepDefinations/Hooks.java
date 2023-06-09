package stepDefinations;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.Home_Page;
import utilities.BrowserUtils;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver;

    @BeforeAll
    public static void openChrome(){

        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeoptions);;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://subscribe.stctv.com/sa-en");
        driver.manage().window().maximize();

    }

    @AfterAll
    public static void closeDriver(){
        BrowserUtils.waitFor(3);
        driver.quit();
    }

}
