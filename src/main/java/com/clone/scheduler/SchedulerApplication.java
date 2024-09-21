package com.clone.scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//This contains three annotaions
//@ComponentScan --> This is used to scan the spring annotation like @Service, @Controller and then create beans for this component
//@EnableAutoConfiguration --> This is used to scan the classpath of the dependency and automatically detects which and automatically
//configure certain bean on what it finds.
//@Configuration --> This is used when method is declared as bean, and it will return bean that will be manage by spring lifecycle.
@EnableScheduling // this will scan the method which actually contains the @Scheduled annotation.
public class SchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedulerApplication.class, args);
	}

}
