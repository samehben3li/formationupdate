package tn.isima.formationupdate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;



@EnableJpaRepositories(basePackages ={"tn.isima.formationupdate.repo"})
@EntityScan(basePackages = {"tn.isima.formationupdate.model"})
@EnableEurekaClient
@SpringBootApplication
@CrossOrigin(origins = "*")
public class FormationUpadateApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormationUpadateApplication.class, args);
	}

	
}
