package testobject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by man on 8/8/16.
 */
public class AppiumDemo {

    public static AppiumDriver driver;

    @Test
    public void appiumTest() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "iPhone 6s Plus");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "9.2");
        capabilities.setCapability("app", "settings");

        driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIAStaticText[1]")).click();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIAStaticText[1]")).click();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")).click();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")).click();
        driver.quit();
    }
}
