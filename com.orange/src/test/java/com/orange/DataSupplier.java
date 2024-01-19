package com.orange;

import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//this is data provider class

public class DataSupplier 
{
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
	public String[] dp2() //String
	{
		String[] data=new String[]
				{
						"aaaa","bbb","ccc"
				};
		return data;
	}
}
