package com.hrms.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class BaseClass {
//Driver
	public static  WebDriver driver ;
	//Open Application,Close Application
	public static void openApplication() {
		System.setProperty("webdriver.chrome.driver", "E:\\ASISH FOLDER\\Software Testing\\AUTOMATION TESTING\\DRIVER\\chromedriver.exe");
		driver =new ChromeDriver();
driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
Reporter.log("Application lunch");
	}
	public static void CloseApplication() {
		driver.close();
		Reporter.log("Application Close");
	}

	}

