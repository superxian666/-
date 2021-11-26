package test.send.test;

import java.io.IOException;

import javax.mail.MessagingException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.WebDriverEngine;
import com.webtest.utils.Log;
import com.webtest.utils.ReadProperties;

import sendMail.*;

public class testSend extends BaseTest{
	
////	登录的方法，方便后面复用，减少代码重复量
//	public void login(String username,String password) {
//		
//		webtest.open("");
////		webtest.open("localhost/jianyuluntan_2.4.6/");
//		
//		webtest.click("link=登录");
//		webtest.click("name=user");
//		webtest.type("name=user",username);
//		
//		webtest.click("name=pwd");
//		webtest.type("name=pwd", password);
//
//		webtest.click("id=submit");
//
//		
//	}
//	
//	@BeforeMethod
//	public void doBeforeMehod() throws Exception {
//
//		driverType=ReadProperties.getPropertyValue("driverType");
//		driver = this.newWebDriver(driverType);
//		driver.manage().window().maximize();
//		Log.info(driverType);
//		webtest = new WebDriverEngine(driver);
//	}
	
	
	@Test(priority = 0)
	public void test1() throws InterruptedException {
		System.out.println("test1 Start running");
//		login("admin","123456789adm");
//		
//		webtest.click("link=superxian");
//		webtest.click("link=我的收藏");
//		
//		String url = webtest.getUrl();
//		Assert.assertEquals("http://localhost/jianyuluntan_2.4.6/index.php/user/index/mycollection.html",url);
//		System.out.println("test01成功");
//		
//		driver.quit();
		Thread.sleep(9168);
		System.out.println("test1 End operation");
	}

	@Test(priority = 1)
	public void test2() throws InterruptedException {
		System.out.println("test2 Start running");
//		login("admin","123456789adm");
//		
//		webtest.click("link=superxian");
//		webtest.click("link=我的收藏");
//		
//		String url = webtest.getUrl();
//		Assert.assertEquals("http://localhost/jianyuluntan_2.4.6/index.php/user/index/mycollection.html",url);
//		System.out.println("test01成功");
//		
//		driver.quit();
		Thread.sleep(4172);
		System.out.println("test2 End operation");
	}

	@Test(priority = 2)
	public void test3() throws InterruptedException {
		System.out.println("test3 Start running");
//		login("admin","123456789adm");
//		
//		webtest.click("link=superxian");
//		webtest.click("link=我的收藏");
//		
//		String url = webtest.getUrl();
//		Assert.assertEquals("http://localhost/jianyuluntan_2.4.6/index.php/user/index/mycollection.html",url);
//		System.out.println("test01成功");
//		
//		driver.quit();
		Thread.sleep(5158);
		System.out.println("test3 End operation");
	}
}
