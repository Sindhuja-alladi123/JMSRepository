package com.example.demo;

import org.springframework.context.support.GenericXmlApplicationContext;  
public class TestJmsSender {  
public static void main(String[] args) {  
    GenericXmlApplicationContext ctx=new GenericXmlApplicationContext();  
    ctx.load("classpath:applicationContext.xml");  
    ctx.refresh();  
      
    MyMessageSender sender=ctx.getBean("messageSender",MyMessageSender.class);  
    sender.sendMessage("hello my first jms message ANIL KUAMR");  
      
}  
}  