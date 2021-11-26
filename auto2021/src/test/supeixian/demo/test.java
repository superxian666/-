package test.supeixian.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class test {
	public static void main(String[] args) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date1 = new Date();
		
		System.out.println(dateFormat.format(date1));
		
	}


}
