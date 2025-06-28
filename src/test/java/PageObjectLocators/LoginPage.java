package PageObjectLocators;
import PageObjectLocators.Homepage;
import PageObjectLocators.LoginPage;
//calling all my Java imports
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {
	
	//here we identify the elements adn the actions will be performed in the TC class using the instantiated locator in drivermanager
	private static WebElement element = null;
	
	//locate the text box for email
	
	public static WebElement email_textbox(WebDriver driver)
	{
		 element = driver.findElement(By.xpath("//*[@id=\"user[email]\"]"));
		return element;
	
		
	}
	
	
	//locate the text box for password input
	
	public static WebElement password_text(WebDriver driver)
	{
		 element = driver.findElement(By.xpath("//*[@id=\"user[password]\"]"));
		return element;
	
		
	}
	
	//locate the text box for password input
	
	public static WebElement signin_button(WebDriver driver)
	{
		 element = driver.findElement(By.xpath("//h2/following::button[1]"));
		return element;
	
		
	}


}
