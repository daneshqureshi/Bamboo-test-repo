package com.browserstack.bambootestsample;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testDan() throws MalformedURLException
    {
    	String username = System.getenv("BROWSERSTACK_USERNAME");
    	String accessKey = System.getenv("BROWSERSTACK_ACCESS_KEY");

    	DesiredCapabilities capabilities = new DesiredCapabilities();
    	capabilities.setCapability("os", "Windows");
    	capabilities.setCapability("browser", "chrome");
    	WebDriver driver = new RemoteWebDriver(new URL("https://" + username + ":" + accessKey + "@hub.browserstack.com/wd/hub"), capabilities);
    	driver.get("https://www.csgo500.com");
    	assertTrue( true );
    }
}
