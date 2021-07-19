package com.hrms.Pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.Utility.BaseClass;

public class Loginpage extends BaseClass {
	//object
	static By txt_Loginname = By.name("txtUserName");
	static By txt_Password = By.name("txtPassword");
	static By Login = By.name("Submit");
//function
	public static void login(String un, String pw) {
		driver.findElement(txt_Loginname).sendKeys(un);
		driver.findElement(txt_Password).sendKeys(pw);
		driver.findElement(Login).click();
		Reporter.log("Log in Complete");
	}
	
}
