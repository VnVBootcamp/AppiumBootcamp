import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class myTestOne extends Base{
        public static void main (String[] args) throws MalformedURLException {
                AndroidDriver<AndroidElement> driver = capabilities();
                driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
                driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
                driver.findElement(By.id("android:id/checkbox")).click();
                driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
                driver.findElement(By.className("android.widget.EditText")).sendKeys("Hello");
                driver.findElementsByClassName("android.widget.Button").get(1).click();
        }
}
