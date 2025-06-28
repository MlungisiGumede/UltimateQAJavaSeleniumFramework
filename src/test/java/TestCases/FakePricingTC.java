package TestCases;


//personal imports
import Utils.DriverManager;
import Utils.WaitHelper;
import Actions.HomeActions;
import Actions.LoginAction;
import Utils.launchbrowser;
import Actions.LogoutAction;
import Actions.FilloutFormsActions;
import Actions.FakePricingAction;

import io.opentelemetry.api.internal.Utils;

//development imports

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FakePricingTC {
    public static void main(String[] args) {
        WebDriver driver = null;

        try {
            driver = DriverManager.getDriver();
            //launch browser
            launchbrowser.launchduckgo();

            //Select Fake pricing link
            FakePricingAction.fake_pricing_link();
            
            //select basic package
            Thread.sleep(4000);
            FakePricingAction.select_basic_package();
            

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DriverManager.quitDriver();
        }
    }
}
