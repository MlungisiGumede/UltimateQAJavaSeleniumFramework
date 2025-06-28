package PageObjectLocators;
import PageObjectLocators.Homepage;
import PageObjectLocators.LoginPage;
//calling all my Java imports
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LogoutPage {
	
	//here we identify the elements adn the actions will be performed in the TC class using the instantiated locator in drivermanager
	private static WebElement element = null;
	
	//locate image to click so we can click sign out
	
	public static WebElement log_out_image_locator(WebDriver driver)
	{
		 element = driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/ul/li[2]/button"));
		return element;
	
		
	}
	//locate image to click so we can click sign out
	
		public static WebElement signout_button(WebDriver driver)
		{
			 element = driver.findElement(By.xpath("//*[@id=\"header-dropdown-menu\"]/li[4]/a"));
			return element;
		
			
		}

}
