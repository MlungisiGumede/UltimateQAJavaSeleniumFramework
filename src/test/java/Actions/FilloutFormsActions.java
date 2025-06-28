package Actions;

import org.openqa.selenium.WebDriver;

import PageObjectLocators.Homepage;
import PageObjectLocators.FillOutFormPage;
import Utils.DriverManager;

public class FilloutFormsActions {
	
	//click  fillout forms link
	 public static void click_fill_form_link() {
	        WebDriver driver = DriverManager.getDriver();

	        Homepage.fillout_form_locator(driver).click();
	        
	       	        
	        
	        System.out.println("Executed Successfully");
	    }
	 
	 //fill out name on text box 1
	 public static void fillname_1() {
	        WebDriver driver = DriverManager.getDriver();

	        FillOutFormPage.form_text_box_1(driver).sendKeys("Mlungisi Gumede");
	        
	        System.out.println("Executed Successfully");
	    }
	 
	 //fill out message input box
	 public static void messagebox_1() {
	        WebDriver driver = DriverManager.getDriver();

	        FillOutFormPage.form_text_box_message_1(driver).sendKeys("Howzit Grant Howzit this Framework? is it better?");        
	        System.out.println("Executed Successfully");
	    }
	 
	 //click submit button
	 public static void clicksubmitbutton_1() {
	        WebDriver driver = DriverManager.getDriver();

	        FillOutFormPage.submit_button_1(driver).click();
	        
	        //add validation for success
	        
	        System.out.println("Executed Successfully");
	    }
	 
	 
	 
	 //fill out name on text box 2
	 public static void fillname_2() {
	        WebDriver driver = DriverManager.getDriver();

	        FillOutFormPage.form_text_box_2(driver).sendKeys("Mlungisi Gumede");
	        
	        System.out.println("Executed Successfully");
	    }
	 
	 //fill out message input box
	 public static void messagebox_2() {
	        WebDriver driver = DriverManager.getDriver();

	        FillOutFormPage.form_text_box_message_2(driver).sendKeys("Howzit Grant Howzit this Framework? is it better?");        
	        System.out.println("Executed Successfully");
	    }
	 
	 
	 //extract the equation
	// ✅ Solve the math equation and input result into the answer field (form 2)
	 public static void solveAndFillEquation_2() {
	     WebDriver driver = DriverManager.getDriver();

	     try {
	         // Step 1: Get the equation text (e.g., "7 + 8")
	         String equationText = FillOutFormPage.equation(driver).getText().trim();
	         System.out.println("Equation found: " + equationText);

	         // Step 2: Split and solve it
	         String[] parts = equationText.split("\\+");
	         if (parts.length != 2) {
	             throw new IllegalArgumentException("Unexpected format: " + equationText);
	         }

	         int num1 = Integer.parseInt(parts[0].trim());
	         int num2 = Integer.parseInt(parts[1].trim());
	         int sum = num1 + num2;
	         System.out.println("Computed sum: " + sum);

	         // Step 3: Input the result in the answer field
	         FillOutFormPage.answer_box_2(driver).sendKeys(String.valueOf(sum));
	         System.out.println("Sum entered successfully.");
	     } catch (Exception e) {
	         System.out.println("Error in solveAndFillEquation_2: " + e.getMessage());
	         e.printStackTrace();
	     }
	 }

	 
	 //click submit button 2
	 public static void clicksubmitbutton_2() {
	        WebDriver driver = DriverManager.getDriver();

	        FillOutFormPage.submit_button_2(driver).click();
	        
	        //add validation for success
	        System.out.println("Executed Successfully");
	    }
}
