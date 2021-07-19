package com.hrms.Pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.Utility.BaseClass;

public class LogoutPage extends BaseClass{
	//object
	static By link_Logout = By.linkText("Logout");
	//Function
	public static void Logout() {
		driver.findElement(link_Logout).click();
		Reporter.log("Log Out Complete");
	}
}
