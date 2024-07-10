package es.eoi.mundobancario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import es.eoi.mundobancario.entity.Movimiento;

@Component
public interface MovimientoRepository extends JpaRepository<Movimiento, Integer> {

}
