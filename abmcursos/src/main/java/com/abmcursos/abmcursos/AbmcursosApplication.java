package com.abmcursos.abmcursos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication(exclude = {RedisAutoConfiguration.class})
public class AbmcursosApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbmcursosApplication.class, args);
	}

}
