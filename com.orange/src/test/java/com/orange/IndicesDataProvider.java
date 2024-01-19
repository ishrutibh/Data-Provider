package com.orange;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class IndicesDataProvider {
/*
 * {"gggg","fff","111"}
 * you want to send gggg and 111 so using index method
 * 0,2 index has to be passed this index is called indus
 * why we have to use indices: to pass parical data
 * how to use : @Dataprovider(indic[][]) pass index value
 * in real world in data provider if we have 100 set of data test run count is also 100, 
 * in 100 if 2 are fail to check those two test case we use 
 */
	@Test(dataProvider="dp1")
	public void Test(String s)
	{
		System.out.println(s);
	}
	
	@DataProvider(indices= {0,2})
	public String[] dp1()
	{
		String[] data=new String[]
				{
			"Hi",
			"Hello",
			"Shruti",
			"123"
				};
				return data;
	}
}

