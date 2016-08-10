package testobject;

import io.appium.java_client.AppiumDriver;

/**
 * Created by man on 8/10/16.
 */
public class App {
    private AppiumDriver driver;

    public App(AppiumDriver driver){
        this.driver = driver;
    }

    public LoginScreen loginScreen(){
        return new loginScreen(driver);
    }

    public void DashboardScreen dashboardScreen(){
        return new DashboardScreen(driver);
    }
}
