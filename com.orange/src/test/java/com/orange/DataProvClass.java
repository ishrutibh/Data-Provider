package com.orange;

import org.testng.annotations.Test;

public class DataProvClass {
	@Test(dataProvider="dp1",dataProviderClass=DataSupplier.class)
	public void TestLogin(Object s)
	{
		System.out.println(s);
	}
}
