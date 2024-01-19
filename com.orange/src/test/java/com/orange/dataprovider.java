package com.orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataprovider {

	@Test(dataProvider="loginTestData")
	public void TestLogin(String userName, String password)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("userName");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.id("login-button")).click();
		
	}
	
	@DataProvider(name="loginTestData")
	public Object[][] loginData()
	{
	
		Object[][] data= new Object[2][2];
		data[0][0]="standard_user";
		data[0][1]="secret_sauce";
		data[1][0]="standard_user";
		data[1][1]="hi";
		return data;
	}
}

/*Date provider will support object[](Single dimenational array)
 * object[][](Multiple dimenational array)
 * Iterator<object>
 * Interator<object[]>
 * */

 
