package stepDefinitions;

import org.openqa.selenium.By;
import Utilities.AppiumServer;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
/*import io.appium.java_client.AppiumDriver;*/
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.MobileElement;

public class StepDefinitions {
	
	AppiumServer appiumServer = new AppiumServer();
	/* AppiumDriver<MobileElement> driver; */
	AndroidDriver<MobileElement> driver;

	@Before("@setup")
	public void setUp() throws Throwable {

		int port = 4723;
		try {
			if (!appiumServer.checkIfServerIsRunnning(port)) {
				assign.startServer();
				appiumServer.stopServer();
			} else {
				System.out.println("Appium Server already running on Port - " + port);
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

		driver = appiumServer.startServer();
	}
	@After("@destroy")
	public void tearDown() throws Throwable {
		driver.close();
		appiumServer.stopServer();
	}

	public class LoginSteps {

		  private AppiumDriver<MobileElement> driver;

		  // Page Object Model classes for Login and Home screens (not shown here)

		  @Given("^I am on the Login screen$")
		  public void launchApp() throws InterruptedException {
		    // Code to launch the app and navigate to Login screen
		    driver = new AndroidDriver<>(); // Example for Android
		  }

		  @When("^I enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
		  public void enterCredentials(String username, String password) throws InterruptedException {
		    System.out.println("Step1");
		  }

		  @When("^I tap the Login button$")
		  public void clickLoginButton() throws InterruptedException {
			  System.out.println("Step2");
		  }

		  @Then("^I should see the Home screen$")
		  public void verifyHomeScreen() throws InterruptedException {
			  System.out.println("Step3");
		  }

		  @Then("^I should see an error message$")
		  public void verifyErrorMessage() throws InterruptedException {
			  System.out.println("Step4");
		  }
		   
