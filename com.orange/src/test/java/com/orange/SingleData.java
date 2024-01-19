package com.orange;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//Single Dimension array
public class SingleData {

	@Test(dataProvider="dp1")
	public void TestLogin(Object s)
	{
		System.out.println(s);
	}
	@DataProvider()
	public String[] dp1() //String
	{
		String[] data=new String[]
				{
						"abcd","xyz","pqr"
				};
		return data;
	}
	@DataProvider()
	public Integer[] dp2() //Integer
	{
		Integer[] data=new Integer[]
				{
						1,2,3
				};
		return data;
	}
	//when u have mixture of integer and string the we have to use Object bcoz all the data vaiables super class is Object
	@DataProvider()
	public Object[] dp3()
	{
		Object[] data=new Object[]
				{
						1,"Hello",3
				};
	return data;
	}
	
	
	
}
