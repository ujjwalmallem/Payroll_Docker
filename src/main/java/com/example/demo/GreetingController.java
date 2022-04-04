package com.example.demo;

import java.net.InetAddress;
import java.rmi.UnknownHostException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
     
	@RequestMapping("/hw")
	public String getGreeting() {
		return "Hello world";
	}
	
	@RequestMapping("/baby")
	public String getBaby() {
		return "baby";
	}
	
	@RequestMapping("/host")
	public String getHostname() throws java.net.UnknownHostException {
		InetAddress ip;
		ip = InetAddress.getLocalHost();	
		return (ip.getHostName());
		
	}
}
