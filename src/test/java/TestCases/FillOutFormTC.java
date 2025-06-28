package TestCases;


//personal imports
import Utils.DriverManager;
import Utils.WaitHelper;
import Actions.HomeActions;
import Actions.LoginAction;
import Utils.launchbrowser;
import Actions.LogoutAction;
import Actions.FilloutFormsActions;

import io.opentelemetry.api.internal.Utils;

//development imports

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FillOutFormTC {
    public static void main(String[] args) {
        WebDriver driver = null;

        try {
            driver = DriverManager.getDriver();
            //launch browser
            launchbrowser.launchduckgo();

            //Select Fillout Form 
            Thread.sleep(4000);
            FilloutFormsActions.click_fill_form_link();
      
          //input text on the chat box in the formpage  for name 1
            Thread.sleep(4000);
            FilloutFormsActions.fillname_1();
            
          //input text on the chat box in the formpage  for name 1
            Thread.sleep(4000);
            FilloutFormsActions.messagebox_1();
            
            //input text on the chat box in the formpage  for name 1
            Thread.sleep(4000);
            FilloutFormsActions.clicksubmitbutton_1();
            
            
            
            //input text on the chat box in the formpage  for name 1
            Thread.sleep(4000);
            FilloutFormsActions.fillname_2();
            
          //input text on the chat box in the formpage  for name 1
            Thread.sleep(4000);
            
            FilloutFormsActions.messagebox_2();
            //input the text for the quation
            Thread.sleep(4000);
            FilloutFormsActions.solveAndFillEquation_2();  
           
            
            //input text on the chat box in the formpage  for name 1
            Thread.sleep(4000);
            FilloutFormsActions.clicksubmitbutton_2();
            

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DriverManager.quitDriver();
        }
    }
}
