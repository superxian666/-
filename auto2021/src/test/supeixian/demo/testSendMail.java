package test.supeixian.demo;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.mail.MessagingException;

import org.testng.annotations.Test;
import sendMail.*;

public class testSendMail extends MailSender{
	
	@Test
	public void send() throws MessagingException, IOException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date1 = new Date();
		
		sendEmail("", "测试报告"+dateFormat.format(date1)+"运行");
	}

}
