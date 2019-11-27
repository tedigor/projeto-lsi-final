package br.com.unifacisa.si.lsi.escola.materiaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MateriaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MateriaServiceApplication.class, args);
	}

}
