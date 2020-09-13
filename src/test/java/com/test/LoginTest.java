package com.test;
 

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jb.Login;

public class LoginTest {
Login log= new Login();
	
	@Test
	public void test01() {
		String title=log.login();
		Assert.assertEquals(title, "JavaByKiran | Dashboard");
	}
	
	
}
