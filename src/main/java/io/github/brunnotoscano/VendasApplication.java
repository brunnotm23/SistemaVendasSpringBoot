package io.github.brunnotoscano;

import io.github.brunnotoscano.domain.entity.Cliente;
import io.github.brunnotoscano.domain.repository.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class VendasApplication {


    public static void main(String[] args) {

        SpringApplication.run(VendasApplication.class, args);
    }
}
