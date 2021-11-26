package test.supeixian.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class test extends BaseTest{
//	登录的方法，方便后面复用，减少代码重复量
	public void login(String username,String password) {
		webtest.open("");
//		webtest.open("localhost/jianyuluntan_2.4.6/");
		
		webtest.click("link=登录");
		webtest.click("name=user");
		webtest.type("name=user",username);
		
		webtest.click("name=pwd");
		webtest.type("name=pwd", password);

		webtest.click("id=submit");

	}
	
	@Test
	public void test1() {

		login("superxian","123456789spx");
		
//		webtest.click("link=superxian");
//		webtest.click("link=我的收藏");
//		
//		String url = webtest.getUrl();
//		Assert.assertEquals("http://localhost/jianyuluntan_2.4.6/index.php/user/index/mycollection.html",url);
//		System.out.println("test01成功");
//		
//		driver.quit();

	}


}
