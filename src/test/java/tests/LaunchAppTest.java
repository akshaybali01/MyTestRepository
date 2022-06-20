package tests;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchAppTest {
	
	
	@Test
	public void launchDemoApp() {
		
		String apkPath = "C:\\MYTestProject\\Appium\\MyTestProject\\apks\\ApiDemos-debug.apk";
		File appPath= new File(apkPath);
		
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung");
		cap.setCapability(MobileCapabilityType.UDID, "8936aa69");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		//cap.setCapability(MobileCapabilityType.APP, new File("C:\\appium\\apks\\app-release-v1.2.7.apk").getAbsolutePath());
		
		cap.setCapability(MobileCapabilityType.APP, appPath.getAbsolutePath());
		
		cap.setCapability(MobileCapabilityType.NO_RESET, "true");
		cap.setCapability(MobileCapabilityType.FULL_RESET, "false");
		
		try {
			AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
			Thread.sleep(7000);
			driver.quit();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
