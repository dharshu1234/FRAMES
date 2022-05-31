package Logic;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowsers {
	public static WebDriver driver;
	
	/**
	 * Method to launch desired browser
	 * @param browser
	 * @param url
	 */
	@BeforeTest
    @Parameters({"browser", "url"})
	public static void init(String browser, String url) {
		System.out.println("Gonna launch browser (_--_)");
//		WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
		
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	/**
	 * Method to close browser
	 */
    @AfterTest
    public void quit(){
       driver.quit();
        System.out.println("browser is closed");
    }
}
