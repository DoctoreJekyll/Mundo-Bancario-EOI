package eoi.es.bancos.mundoBancario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"eoi.es.bancos.mundoBancario", "es.eoi.mundobancario"})
@EntityScan(basePackages = "es.eoi.mundobancario.entity")
@EnableJpaRepositories(basePackages = "es.eoi.mundobancario.repository")
public class MundoBancarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(MundoBancarioApplication.class, args);
	}

}
