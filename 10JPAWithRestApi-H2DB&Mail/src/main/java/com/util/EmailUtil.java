package com.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;


@Component
public class EmailUtil {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	@Value("${spring.mail.username}")
	private String sender;
	
	public String sendSimpleEmail(String recepient,String subject,String messageBody) {
		
		try {
		SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
		simpleMailMessage.setFrom(sender);
		simpleMailMessage.setTo(recepient);
		simpleMailMessage.setSubject(subject);
		simpleMailMessage.setText(messageBody);
		javaMailSender.send(simpleMailMessage);
		
		}catch(Exception i) {
			i.printStackTrace();
			return "error";
		}
		return "success";
		
		
	}

}
