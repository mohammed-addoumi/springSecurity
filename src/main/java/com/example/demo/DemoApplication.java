package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.security.core.userdetails.UserDetailsService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		UserDetailsService userDetailsService = context.getBean(UserDetailsService.class);
		System.out.println("user details service classe " + userDetailsService);
		//System.out.println("user details service infos " + userDetailsService.loadUserByUsername("simo"));
	}


}
