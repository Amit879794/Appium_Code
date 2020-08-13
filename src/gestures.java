import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.offset.ElementOption.element;

import static java.time.Duration.ofSeconds;


public class gestures extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		//tap
		TouchAction action = new TouchAction(driver);
		WebElement e = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		action.tap(tapOptions().withElement(element(e))).perform();
		
		//long press
		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		e = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		action.longPress(longPressOptions().withElement(element(e)).withDuration(ofSeconds(2))).release().perform();
//		Thread.sleep(2000);
		System.out.println(driver.findElementById("android:id/title").isDisplayed());
		
	}

}
