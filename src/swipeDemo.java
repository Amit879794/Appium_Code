import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.offset.ElementOption.element;

import io.appium.java_client.TouchAction;

import static java.time.Duration.ofSeconds;

public class swipeDemo extends base {
	
	public static void main(String args[]) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='2. Inline']").click();
//		driver.findElementsByClassName("android.widget.TextView").get(1).click();
		
		driver.findElementByXPath("//*[@content-desc='9']").click();
		
		//tap
		TouchAction action = new TouchAction(driver);
		
		//long press on element for `1 or 2 seconds and then move to another element and remove it.
		WebElement webelement = driver.findElementByXPath("//*[@content-desc='15']");
		WebElement webelement1 = driver.findElementByXPath("//*[@content-desc='45']");
		
		action.longPress(longPressOptions().withElement(element(webelement)).withDuration(ofSeconds(2))).moveTo(element(webelement1)).release().perform();
		
		
	}

}
