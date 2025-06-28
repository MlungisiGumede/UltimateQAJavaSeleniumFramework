package PageObjectLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FakePricingPage {

	 private static WebElement element;
	 
	//automation locator for purchase button for 
	    public static WebElement basic_package_purchase_locator(WebDriver driver) {
	        element = driver.findElement(By.xpath("//h4[text()='Basic']/following::a[1]"));
	        return element;
	    }
	    
	  
	
}
