package es.eoi.mundobancario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import es.eoi.mundobancario.entity.Prestamo;

@Component
public interface PrestamoRepository extends JpaRepository<Prestamo, Integer> {

}
