package es.eoi.mundobancario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import es.eoi.mundobancario.entity.Cliente;

@Component
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
