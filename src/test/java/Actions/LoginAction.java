package Actions;

import Utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginAction {
    public static void sign_in() {
        WebDriver driver = DriverManager.getDriver();

        driver.findElement(By.xpath("//*[@id=\"user[email]\"]")).sendKeys("u19074362@tuks.co.za");
        driver.findElement(By.xpath("//*[@id=\"user[password]\"]")).sendKeys("Mlungisi120!");
        driver.findElement(By.xpath("//h2/following::button[1]")).click();

        System.out.println("Sign in attempted");
    }
}
