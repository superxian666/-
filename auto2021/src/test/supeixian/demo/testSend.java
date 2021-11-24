package test.supeixian.demo;

import java.io.IOException;

import javax.mail.MessagingException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import sendMail.*;

public class testSend extends MailSender{
	
	@Test(priority = 0)
	public void test1() throws InterruptedException {
		System.out.println("test1 Start running");
		Thread.sleep(25168);
		System.out.println("test1 End operation");
	}

	@Test(priority = 1)
	public void test2() throws InterruptedException {
		System.out.println("test2 Start running");
		Thread.sleep(28172);
		System.out.println("test2 End operation");
	}

	@Test(priority = 2)
	public void test3() throws InterruptedException {
		System.out.println("test3 Start running");
		Thread.sleep(25158);
		System.out.println("test3 End operation");
	}

	@Test(priority = 3)
	public void test4() throws InterruptedException {
		System.out.println("test4 Start running");
		Thread.sleep(25102);
		System.out.println("test4 End operation");
	}

	@Test(priority = 4)
	public void test5() throws InterruptedException {
		System.out.println("test5 Start running");
		Thread.sleep(31941);
		System.out.println("test5 End operation");
	}
	
	@Test(priority = 5)
	public void test6() throws InterruptedException {
		System.out.println("test6 Start running");
		Thread.sleep(21977);
		System.out.println("test6 End operation");
	}
	
	@Test(priority = 6)
	public void test7() throws InterruptedException {
		System.out.println("test7 Start running");
		Thread.sleep(24994);
		System.out.println("test7 End operation");
	}

	
//	public void send() throws MessagingException, IOException {
//		sendEmail("", "测试报告");
//		System.out.println("发送成功");
//	}


	
	

}
