package com.tommyhou.springboot;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Holyfan
 */
@SpringBootApplication
public class SpringbootApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) {
		
	}
}
