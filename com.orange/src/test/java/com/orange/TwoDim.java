package com.orange;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class TwoDim {

	@Test
	public void Test(String[] s)
	{
		System.out.println(s[0] + ">>"+s[1]);
	}
	//Two Dimension
		@DataProvider()
		public String[][] dp4()
		{
			String[][] data=new String[][]
					{
				{"hello","123"},
				{"How are you","f9"},
				{"hello","123"},
				
					};
					return data;
		}
		//jaged arrary {"123","asv"}
		//{"gggg","fff","111"}
}
