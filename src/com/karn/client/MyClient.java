package com.karn.client;

import com.karn.ws.CustomRequest;
import com.karn.ws.HelloWorld;
import com.karn.ws.HelloWorldProxy;

public class MyClient {
	public static void main(String[] args) throws  Exception {
		HelloWorld service=new HelloWorldProxy();
		String s=service.getHelloWorldAsString();
		System.out.println(s);
		
		CustomRequest c=new CustomRequest();
		c.setName("Ashish");
		c.setId(3);
		
		System.out.println(service.getHelloWorldCustom(c));
		
	}

}
