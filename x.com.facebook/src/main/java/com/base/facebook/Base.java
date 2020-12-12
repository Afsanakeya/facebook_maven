package com.base.facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
		static WebDriver driver;
		public static WebDriver getBrowser(WebDriver driver ,String browser) {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
				//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
				// /Users/afsanakeya/git/facebook_maven/x.com.facebook/drivers/chromedriver
				driver = new ChromeDriver();
				
				System.out.println(" chrome driver open ++++++++++++++++ ");

				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
			}
		return driver;
		}//Ends of WebDriver Method
	    
		private static String url= "https://www.facebook.com/";//using getter method to make it public
		public static String getUrl() {
			return url;
		}
		
		}


