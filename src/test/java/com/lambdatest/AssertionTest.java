package com.lambdatest;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTest {

	@Test
	public void testAssertion() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		/*String username = "Enter user name here"; //Enter your user name
	    String accesskey = "Enter access key here"; //Enter your access key
	    RemoteWebDriver driver = null;
	    String gridURL = "@hub.lambdatest.com/wd/hub";
	    DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("version", "70.0");
        capabilities.setCapability("platform", "win10"); // If this cap isn't specified, it will just get the any available one
        capabilities.setCapability("build", "SoftAssertionDemo");
        capabilities.setCapability("name", "SoftAssertionDemo");
        capabilities.setCapability("visual", true);
		driver=new RemoteWebDriver(new URL("https://"+username+":"+accesskey+gridURL), capabilities);*/
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lambdatest.com/");
		String expectedtitle="Most Powerful Cross Browser Testing Tool Online | LambdaTest";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, expectedtitle, "Title is not Matched");
		driver.close();
	}

}
