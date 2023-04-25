package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;
    public void openBrowser(String baseURL){
        driver = new ChromeDriver();
        //Launch URL
        driver.get(baseURL);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");  // Disable browser notification
        //Maximise window
        driver.manage().window().maximize();
        //implicit time out
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    public void closeBrowser(){
        driver.quit();
    }
}
