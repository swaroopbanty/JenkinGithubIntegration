package com.spring.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinGithubIntegrationApplication {
	
	public static Logger logger = LoggerFactory.getLogger(JenkinGithubIntegrationApplication.class);
	
	public void init(){
		logger.info("Application Started.........");
	}
	
	public static void main(String[] args) {
		logger.info("Application Executed.........");
		SpringApplication.run(JenkinGithubIntegrationApplication.class, args);
	}

}

