package testobject;

import org.testng.annotations.Test;

/**
 * Created by man on 8/10/16.
 */
public class LoginTest extends AbstractTest {
    @Test
    public void loginWithValidCredentials(){
        app.loginScreen().waitUntilLoaded();
        app.loginScreen().login("username", "password");

        assertTrue(app.dashboardScreen().isActive());
    }
    @Test
    public void loginWithInvalidCredentials(){
        app.loginScreen().waitUntilLoaded();
        app.loginScreen().login("invalidUser", "invalidPass");

        assertTrue(app.loginScreen().isErrorMessageShown());
    }
}
