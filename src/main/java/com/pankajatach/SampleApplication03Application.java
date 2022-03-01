package com.pankajatach;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleApplication03Application {
   private static final String REST_URL="https://www.getscores.com/display";

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication03Application.class, args);
		int a=20;
	}

}
