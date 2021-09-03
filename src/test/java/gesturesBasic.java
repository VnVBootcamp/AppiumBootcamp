import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.TapOptions.tapOptions;


import java.net.MalformedURLException;

public class gesturesBasic extends Base {
        public static void main(String[] args) throws MalformedURLException {
                AndroidDriver<AndroidElement> driver = capabilities();
                driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
                TouchAction tch = new TouchAction(driver);
                WebElement menuItem = driver.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']"));
                tch.tap(tapOptions().withElement(element(menuItem))).perform();

        }
}
