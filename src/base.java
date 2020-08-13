import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class base {

	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
		
		File f = new File("src");
		File fs = new File(f,"ApiDemos-debug.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		//Emmulatotor
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Amit_Emmulator");
		
		//Real Device
//		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		cap.setCapability("appPackage", "com.android.chrome");
        cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
//		cap.setCapability("autoGrantPermissions", "true");

		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http:127.0.0.1:4723/wd/hub"),cap);  
		//127.0.0.1 is the ip for local host for every machine
		
		return driver;
		
		//Android UIAutomator
		

	}

}
