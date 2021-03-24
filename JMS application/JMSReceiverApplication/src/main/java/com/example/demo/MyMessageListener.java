package com.example.demo;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.stereotype.Component;

public class MyMessageListener implements MessageListener{

	@Override
	public void onMessage(Message message) {
		
		try {
			TextMessage msg=(TextMessage) message;
			System.out.println(msg.getText());
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
