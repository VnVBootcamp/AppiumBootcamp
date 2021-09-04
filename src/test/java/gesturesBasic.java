import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


public class gesturesBasic extends Base {
        public static void main(String[] args) throws MalformedURLException, InterruptedException {
                AndroidDriver<AndroidElement> driver = capabilities();
                Thread.sleep(2000);
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
                TouchAction tch = new TouchAction(driver);
                WebElement menuItem = driver.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']"));
                tch.tap(tapOptions().withElement(element(menuItem))).perform();
                driver.findElement(By.xpath("//android.widget.TextView[@text='1. Custom Adapter']")).click();
                menuItem = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
                tch.longPress(longPressOptions().withElement(element(menuItem)).withDuration(ofSeconds(2))).release().perform();
                Thread.sleep(2000);
                boolean check = driver.findElement(By.id("android:id/title")).isDisplayed();
                if (check==true) {
                        System.out.println("The title displays");
                } else {
                        System.out.println("The title Does not displays");
                }

        }
}
