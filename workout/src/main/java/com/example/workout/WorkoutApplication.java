package com.example.workout;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class WorkoutApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkoutApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
		return args->{
			System.out.println("let's inspect the beans");
			String[] beanNames= ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames){
				System.out.println(beanName);
			}

		};
	}

}
