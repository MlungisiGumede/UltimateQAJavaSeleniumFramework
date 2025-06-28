package Utils;

import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class takescreenshots {

    public static void capture(WebDriver driver, String name) {
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);

            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String folderPath = "target/Screenshots";
            File folder = new File(folderPath);
            if (!folder.exists()) {
                boolean created = folder.mkdirs();
                System.out.println("Created screenshot folder: " + created);
            }

            String destPath = folderPath + "/" + name + "_" + timestamp + ".png";
            File destination = new File(destPath);

            FileHandler.copy(source, destination);
            System.out.println("Screenshot saved to: " + destPath);
        } catch (IOException e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
            e.printStackTrace();
        } catch (WebDriverException wde) {
            System.out.println("WebDriver error while taking screenshot: " + wde.getMessage());
            wde.printStackTrace();
        }
    }
}
