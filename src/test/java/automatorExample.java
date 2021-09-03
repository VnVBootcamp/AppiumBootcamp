import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class automatorExample extends Base {
        public static void main (String[] args) throws MalformedURLException {
                AndroidDriver<AndroidElement> driver = capabilities();
                driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
                driver.findElementByAndroidUIAutomator("text(\"Animation\")").click();
        }
}
