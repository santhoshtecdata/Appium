package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

public class appLaunch {


@Test
	public static void myMobile()throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "Android");
		caps.setCapability("appium:deviceName", "Infinix NOTE 30 5G");
		caps.setCapability("appium:platformVersion","14");
		caps.setCapability("appium:udid", "11215313CC121874"); 
		caps.setCapability("appium:automationName", "UiAutomator2");
		caps.setCapability("appium:appPackage", "com.android.chrome");
		caps.setCapability("appium:appActivity","com.google.android.apps.chrome.Main");
		caps.setCapability("appium:noReset", true);
		caps.setCapability("appium:autoGrantPermissions", true);

		AndroidDriver driver =new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);
	    driver.get("https://www.youtube.com");
       System.out.println("appium run successfully...");
	}

	@Test
	public void test() throws InterruptedException {
		UiAutomator2Options caps = new UiAutomator2Options();
		caps.setPlatformName("Android");
		caps.setDeviceName("Infinix NOTE 30 5G");
		caps.setPlatformVersion("14");
		caps.setUdid("11215313CC121874"); 
		caps.setAutomationName("UiAutomator2");
		caps.setAppPackage("com.vizzainsurance.vizzainsurance");
		caps.setAppActivity("com.vizzainsurance.vizzainsurance.MainActivity");
		caps.setCapability("chromedriverExecutable", "C:\\Users\\Tec Data\\AppData\\Roaming\\npm\\chromedriver");

		caps.setNoReset(true);
		caps.setAutoGrantPermissions( true);
		caps.setCapability("appium:enforceXPath1", true);
		AndroidDriver driver = null;
		try {
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Thread.sleep(5000);
        
        
     // Get all available contexts
        Set<String> contexts = driver.getContextHandles();
        for (String context : contexts) {
            System.out.println("Available context: " + context);
        }

        // Switch to WebView
      //  driver.context("WEBVIEW_com.vizzainsurance.vizzainsurance");
      //android.widget.Button[@text="Login "]
        WebElement loginButton = driver.findElement(By.xpath("//android.widget.Button[@text='Login ']"));
        loginButton.click();
    
       
       System.out.println("appium run successfully...New UiAutomator2Options");
		
	}
}
