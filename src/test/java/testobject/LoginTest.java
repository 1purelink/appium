package testobject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by man on 8/8/16.
 */
public class LoginTest {
    private AppiumDriver<MobileElement> driver;

    @Before
    public void setup() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("iPhone 6", "iPhone 6");
        driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @Test
    public void liginWithValidCredentials(){
        MobileElement usernameField = (MobileElement)new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
    }
}
//newfeature
