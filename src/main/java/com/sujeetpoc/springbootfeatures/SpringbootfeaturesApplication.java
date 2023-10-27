package com.sujeetpoc.springbootfeatures;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling // For spring scheduler tasks
//@EnableDiscoveryClient // This will register as an app in Eureka Service Registry
public class SpringbootfeaturesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootfeaturesApplication.class, args);
	}

}
