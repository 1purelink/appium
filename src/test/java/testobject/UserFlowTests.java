package testobject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by man on 8/7/16.
 */
public class UserFlowTests {
    private AppiumDriver<MobileElement> driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "iPhpne 6");
        driver = new IOSDriver<MobileElement>(new URL("http://0.0.0.0.:4723/wd/hub"), capabilities);
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void mainScreenTest(){
        new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.name("Project")));
        driver.navigate().back();

        MobileElement dateField = driver.findElement(By.id(""));
     }
}
