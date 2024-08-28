package com.joosep.Weather.AI;

import com.joosep.Weather.AI.config.WeatherConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(WeatherConfigProperties.class)
@SpringBootApplication
public class WeatherAiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherAiApplication.class, args);
	}

}
