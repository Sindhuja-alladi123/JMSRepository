package com.example.demo;


import org.springframework.context.support.GenericXmlApplicationContext;  
public class TestListener {  
public static void main(String[] args) {  
    try (GenericXmlApplicationContext ctx = new GenericXmlApplicationContext()) {
		ctx.load("classpath:applicationContext.xml");  
		ctx.refresh();
	}  
    while(true)
    {
    	
    }  
}  
}  