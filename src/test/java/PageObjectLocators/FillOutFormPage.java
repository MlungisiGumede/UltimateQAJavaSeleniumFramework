package PageObjectLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FillOutFormPage {

	 private static WebElement element;
	//automation locator for textbox for my name
	    public static WebElement form_text_box_1(WebDriver driver) {
	        element = driver.findElement(By.xpath("//*[@id=\"et_pb_contact_name_0\"]"));
	        return element;
	    }
	    
	  //automation locator for textbox for the first message box
	    public static WebElement form_text_box_message_1(WebDriver driver) {
	        element = driver.findElement(By.xpath("//*[@id=\"et_pb_contact_message_0\"]"));
	        return element;
	    }
	    //First Submit button
	    public static WebElement submit_button_1(WebDriver driver) {
	        element = driver.findElement(By.xpath("//*[@id=\"et_pb_contact_form_0\"]/div[2]/form/div/button"));
	        return element;
	    }
	    
	    
	  //automation locator for textbox for my name
	    public static WebElement form_text_box_2(WebDriver driver) {
	        element = driver.findElement(By.xpath("//*[@id=\"et_pb_contact_name_1\"]"));
	        return element;
	    }
	    
	  //automation locator for textbox for the first message box
	    public static WebElement form_text_box_message_2(WebDriver driver) {
	        element = driver.findElement(By.xpath("//*[@id=\"et_pb_contact_message_1\"]"));
	        return element;
	    }
	    //second submit
	    public static WebElement submit_button_2(WebDriver driver) {
	        element = driver.findElement(By.xpath("//button[text()='Submit']"));
	        return element;
	    }
	    
	    //equation extract values
	    
	    public static WebElement equation(WebDriver driver) {
	        element = driver.findElement(By.xpath("//*[@id=\"et_pb_contact_form_1\"]/div[2]/form/div/button/preceding::span[1]"));
	        return element;
	    }
	    
	 // Locator for the answer field on the second form
	    public static WebElement answer_box_2(WebDriver driver) {
	        element = driver.findElement(By.xpath("//*[@id='et_pb_contact_form_1']/div[2]/form/div/div/p/input"));
	        return element;
	    }

	
}
