package com.qa.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
static WebDriver driver;
static Properties prop;

public TestBase() {
	try {
		prop = new Properties();
		FileInputStream ip = new FileInputStream("D:\\MyEclipseProject\\crmpageobject\\src\\main\\java\\com\\qa\\config\\config.properties");
		prop.load(ip);
	} catch (Exception e) {
		// TODO: handle exception
	}
}

public static void intialization()
{
	String browser = prop.getProperty("browser");
	if(browser.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "D:\\MyEclipseProject\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}else if (browser.equals("FireFox")) 
	{
		System.setProperty("webdriver.gecho.driver", "D:\\MyEclipseProject\\gecho.exe");
		driver= new FirefoxDriver();
	}
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
	
}




}
