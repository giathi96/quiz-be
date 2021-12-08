package com.quiz.quizbe;

import com.quiz.quizbe.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class QuizBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizBeApplication.class, args);
	}

}
