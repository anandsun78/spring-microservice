package io.javabrains.movieinfoservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MovieInfoServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieInfoServicesApplication.class, args);
	}

}
