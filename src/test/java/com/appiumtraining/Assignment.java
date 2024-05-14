package com.appiumtraining;
import org.openqa.selenium.Platform;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
//import java.net.URL;
import java.net.URI;
import java.net.URISyntaxException;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;



public class Assignment {
	
	

	
	@Test
	public void AppiumTest()throws MalformedURLException, URISyntaxException
	
	{
		
		//code to start server
	//	AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File//("c://Users//sharma_rak//AppData//Roaming//npm//node_modules//appium//build//lib//main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();
		
		  
		//service.start();
		 
		UiAutomator2Options options = new UiAutomator2Options();
		options.autoGrantPermissions();
		options.noReset();
		options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
		options.setPlatformVersion("14.0");
		options.setPlatformName(Platform.ANDROID.name());
		options.setApp("E:/AppiumTraining/Training/src/test/resources/app/demos.apk").toString();
		options.setAppPackage("com.swaglabsmobileapp");
		options.setAppActivity("com.swaglabsmobileapp.MainActivity");
		options.setAppWaitForLaunch(true);
		
		
		AndroidDriver driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
		driver.findElement(AppiumBy.accessibilityId("test-username")).sendKeys("standard_user");
		driver.findElement(AppiumBy.accessibilityId("test-Password")).sendKeys("secret_souce");
		driver.findElement(AppiumBy.accessibilityId("test_login")).click();
		
	    // code to stop the server
	    //service.stop();
			
		
	}

}