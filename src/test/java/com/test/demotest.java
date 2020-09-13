package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jb.demo;

public class demotest {
	
	
	demo d =new demo();
	
	@Test
	public void Test(){
		int result = d.add(2,3);
		Assert.assertEquals(result, 5);
		
	}
	
	@Test
	public void Test2(){
		int result = d.sub(5,3);
		Assert.assertEquals(result, 2);
		
	}
}
