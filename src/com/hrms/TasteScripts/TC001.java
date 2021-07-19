package com.hrms.TasteScripts;

import org.testng.annotations.Test;

import com.hrms.Pages.Loginpage;
import com.hrms.Pages.LogoutPage;
import com.hrms.Utility.BaseClass;

public class TC001 {
	@Test
public static void tc001() {
	BaseClass.openApplication();
	Loginpage.login("admin", "admin");
	LogoutPage.Logout();
	BaseClass.CloseApplication();
}
	
}
