package com.bharat.locationweb.util;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

public class EmailDetailImpl implements EmailUtil{

	private JavaMailSender sender;
	
	@Override
	public void sendEmail(String toAddress, String toSubject, String body) {
		 MimeMessage message = sender.createMimeMessage();
		 
		 MimeMessageHelper helper=new MimeMessageHelper(message);
		// sender.send(message);
		 
		 try {
			helper.setTo(toAddress);
			helper.setSubject(toSubject);
			helper.setText(body);
		 }catch(MessagingException e) {
			 e.printStackTrace();
		 }
		sender.send(message);
	}

}
