package edu.bsuir.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.concurrent.TimeUnit;

public class WebDriverSingleton {

    private static WebDriver webDriver;

    public static WebDriver getInstance() {
        if (webDriver == null) {
            System.setProperty("webdriver.chrome.driver", "lib/drivers/chromedriver.exe");
            webDriver = new ChromeDriver();
            webDriver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
            webDriver.manage().window().maximize();
            webDriver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        }
        return webDriver;
    }

    public static void destroyInstance() {
        webDriver = null;
    }
}