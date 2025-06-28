package Actions;


import Utils.DriverManager;
import PageObjectLocators.Homepage;
import org.openqa.selenium.WebDriver;
import PageObjectLocators.LogoutPage;

public class LogoutAction {

	 public static void click_signout() {
	        WebDriver driver = DriverManager.getDriver();

	       LogoutPage.log_out_image_locator(driver).click();
	       LogoutPage.signout_button(driver).click();
	        
	        System.out.println("successfully logged out");
	    }
}
