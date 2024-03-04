package com.examenfomyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class FomyouApplication {

	public static void main(String[] args) {
		SpringApplication.run(FomyouApplication.class, args);
	}

}
