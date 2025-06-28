package Actions;

import Utils.DriverManager;
import PageObjectLocators.Homepage;
import org.openqa.selenium.WebDriver;

public class HomeActions {
    public static void click_login() {
        WebDriver driver = DriverManager.getDriver();

        if (Homepage.homepage_text(driver).isDisplayed()) {
            System.out.println("Home page is visible successfully");
        } else {
            System.out.println("Home page is NOT visible");
        }

        Homepage.login_automation(driver).click();
        System.out.println("Clicked login automation");
    }
}
