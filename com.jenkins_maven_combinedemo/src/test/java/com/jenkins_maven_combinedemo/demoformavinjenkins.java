package com.jenkins_maven_combinedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class demoformavinjenkins {
	
	 
	
	@Test
	public void try1()
	{
	 System.out.println("hi there JEnkins and Maven are integrated");	
	// DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	  
	 //capabilities.setCapability(CapabilityType.BROWSER_NAME, "CHROME");
	// capabilities.setCapability(ChromeDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
	 //System.setProperty("webdriver.chrome.driver", "G:\\Java_Software_Latest_version\\2.4 chrome driver\\chromedriver.exe");
	 System.setProperty("webdriver.chrome.driver","G:\\Java_Software_Latest_version\\2.4 chrome driver\\chromedriver.exe");
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("http://www.google.com");
	 String s=driver.getTitle();
	 System.out.println("-----------"+s+"--------");
	 
	// Assert.assertEquals(s, "hi");
	 
	 
	}

}
