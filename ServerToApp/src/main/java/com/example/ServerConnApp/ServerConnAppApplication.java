package com.example.ServerConnApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/*@SpringBootApplication
public class ServerConnAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerConnAppApplication.class, args);
	}

}*/


@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class ServerConnAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerConnAppApplication.class, args);
	}
}
