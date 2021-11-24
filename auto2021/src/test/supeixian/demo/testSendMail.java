package test.supeixian.demo;

import java.io.IOException;

import javax.mail.MessagingException;

import org.testng.annotations.Test;
import sendMail.*;

public class testSendMail extends MailSender{
	
	@Test
	public void send() throws MessagingException, IOException {
		sendEmail("", "测试报告");
	}

}
