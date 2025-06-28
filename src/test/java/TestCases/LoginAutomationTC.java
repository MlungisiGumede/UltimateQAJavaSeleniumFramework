package TestCases;


//personal imports
import Utils.DriverManager;
import Utils.WaitHelper;
import Actions.HomeActions;
import Actions.LoginAction;
import Utils.launchbrowser;
import Actions.LogoutAction;
import io.opentelemetry.api.internal.Utils;

//development imports

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginAutomationTC {
    public static void main(String[] args) {
        WebDriver driver = null;

        try {
            driver = DriverManager.getDriver();
            //launch browser
            launchbrowser.launchduckgo();

            //Wait for homepage and click login
            Thread.sleep(3000);
            HomeActions.click_login();

            //Wait and perform login
            Thread.sleep(4000);
            //add validation point that confirms login
            LoginAction.sign_in();
            
            //logout of web application
            Thread.sleep(4000);
            LogoutAction.click_signout();
            
            

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DriverManager.quitDriver();
        }
    }
}
