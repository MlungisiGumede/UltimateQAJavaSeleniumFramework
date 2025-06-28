package PageObjectLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
    private static WebElement element;
//automation locator
    public static WebElement login_automation(WebDriver driver) {
        element = driver.findElement(By.xpath("//a[text()='Login automation']"));
        return element;
    }

    public static WebElement homepage_text(WebDriver driver) {
        element = driver.findElement(By.xpath("//span[text()='Automation Practice']"));
        return element;
    }
    
    //fillout form locator
   public static WebElement fillout_form_locator(WebDriver driver) {
    	
    	//locate fillout form
        element = driver.findElement(By.xpath("//a[text()='Fill out forms']"));
        return element;
    }
   
   //fillout fake pricing
   public static WebElement fake_pricing_locator(WebDriver driver) {
    	
    	//locate fillout form
        element = driver.findElement(By.xpath("//a[text()='Fake Pricing Page']"));
        return element;
    }

}
