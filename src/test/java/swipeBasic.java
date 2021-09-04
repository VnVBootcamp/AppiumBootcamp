import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class swipeBasic extends Base{
        public static void main(String[] args) throws MalformedURLException, InterruptedException {
                AndroidDriver<AndroidElement> driver = capabilities();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
                driver.findElement(By.xpath("//android.widget.TextView[@text='Date Widgets']")).click();
                driver.findElement(By.xpath("//android.widget.TextView[@text='2. Inline']")).click();
                Thread.sleep(3000);
                driver.findElement(By.xpath("//*[@content-desc='9']")).click();
                TouchAction tch=new TouchAction(driver);
                WebElement menu = driver.findElement(By.xpath("//*[@content-desc='15']"));
                WebElement menuEnd = driver.findElement(By.xpath("//*[@content-desc='45']"));
                tch.longPress(longPressOptions().withElement(element(menu)).withDuration(ofSeconds(2))).moveTo(element(menuEnd)).release().perform();


        }
}
