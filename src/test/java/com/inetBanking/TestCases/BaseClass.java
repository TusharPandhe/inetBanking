package com.inetBanking.TestCases;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public String baseurl = "";
	public String Username = "";
	public String Password = "";
	public static WebDriver driver;
@BeforeClass
	public void setup() {
		System.setProperty("WebDriver.ChromeDriver.driver",
				System.getProperty("user.dir") + "//Driver//chromedriver.exe");

	}
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	

}
