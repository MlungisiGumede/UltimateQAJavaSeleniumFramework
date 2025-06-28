package Utils;

import org.openqa.selenium.*;
import Utils.takescreenshots;

public class launchbrowser {

    public static void launchduckgo() {
        WebDriver driver = DriverManager.getDriver();

        try {
            // Step 1: Maximise browser window
            driver.manage().window().maximize();

            // Step 2: Navigate to DuckDuckGo
            driver.get("https://duckduckgo.com");

            // Step 3: Enter search text and submit
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("UltimateQA automation");
            searchBox.submit();

            // Step 4: Wait for the search result and click it
            WebElement result = WaitHelper.waitForElement(driver, By.xpath("//a[contains(@href, 'ultimateqa.com/automation')]"), 10);
            result.click();

            // Debug print for current working directory
            System.out.println("Working Directory = " + System.getProperty("user.dir"));

            // Step 5: Take screenshot after clicking the result
            takescreenshots.capture(driver, "UltimateQAPagescreenshot");

            System.out.println("DuckDuckGo navigation completed.");
        } catch (Exception e) {
            System.out.println("Error during DuckDuckGo launch: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
