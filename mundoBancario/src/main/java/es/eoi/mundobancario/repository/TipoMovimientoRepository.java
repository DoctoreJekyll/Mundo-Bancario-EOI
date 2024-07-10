package es.eoi.mundobancario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import es.eoi.mundobancario.entity.TipoMovimiento;

@Component
public interface TipoMovimientoRepository extends JpaRepository<TipoMovimiento, Integer>{

}
