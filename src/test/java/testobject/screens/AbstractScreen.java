package testobject.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 * Created by man on 8/10/16.
 */
public class AbstractScreen {

    protected static Logger log = Logger.getLogger(AbstractScreen.class);

    protected final AppiumDriver driver;

    protected static final int TIMEOUT_SHORT = 5;
    protected static final int TIMEOUT_LONG = 30;
    protected static final int TIMEOUT_MEDIUM = 30;

    public AbstractScreen(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, TIMEOUT_SHORT, TimeUnit.SECONDS), this);
    }

    public boolean isAndroid(){
        return driver instanceof AndroidDriver;
    }

    public boolean isIOS(){
        return driver instanceof IOSDriver;
    }

    protected void hideKeyboard(){
        driver.hideKeyboard();
    }

    protected void swipeRight(){
        TouchAction swipeAction = new TouchAction(driver);
        Dimension size = driver.manage().window().getSize();
        int endx = (int)(size.width * 0.8);
        int startx = (int)(size.width * 0.20);
        int starty = size.height / 2;
        swipeAction.press(startx, starty).moveTo(endx, starty).release().perform();
    }

    protected void swipeLeft(){
        TouchAction swipeAction = new TouchAction(driver);
        Dimension size = driver.manage().window().getSize();
        int endx = (int)(size.width * 0.2);
        int startx = (int)(size.width * 0.8);
        int starty = size.height / 2;
        swipeAction.press(endx, starty).moveTo(startx, starty).release().perform();
    }

    public void scrollDown(){
        Dimension size = driver.manage().window().getSize();
        int startx = (int)(size.width / 2);
        int starty = (int)
    }
}
