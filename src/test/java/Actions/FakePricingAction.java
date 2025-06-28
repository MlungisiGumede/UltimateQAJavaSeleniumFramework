package Actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageObjectLocators.Homepage;
import PageObjectLocators.FillOutFormPage;
import PageObjectLocators.FakePricingPage;
import Utils.DriverManager;

public class FakePricingAction {
	
	//fill out name on text box 1
		 public static void fake_pricing_link() {
		        WebDriver driver = DriverManager.getDriver();

		        Homepage.fake_pricing_locator(driver).click();
		        
		        System.out.println("fake pricing selected Successfully");
		    }
		 
		//select fake pricing basic package
		 public static void select_basic_package() {
		        WebDriver driver = DriverManager.getDriver();
		        
		        //scroll element into view  by creating  this web element and colling in int he java executor
		        WebElement basicButton = FakePricingPage.basic_package_purchase_locator(driver);
		        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", basicButton);
		       // basicButton.click();

		        
		        FakePricingPage.basic_package_purchase_locator(driver).click();
		        
		        System.out.println("basic package selected Successfully");
		    }

}
