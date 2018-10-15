package com.example.aws.demoawsrds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication
public class DemoAwsRdsApplication extends SpringBootServletInitializer {
	
	/**
	 * configure method do configure in EE server (war mode)
	 */
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DemoAwsRdsApplication.class);
    }
	
	/**
	 * Jar mode
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
        new SpringApplication(DemoAwsRdsApplication.class).run(args);
    }
}
