package es.eoi.mundobancario.entity;

import java.util.List;

import es.eoi.mundobancario.enums.TipoMovimientoEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class TipoMovimiento 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column
	private TipoMovimientoEnum moveTypEnum;
	
	@OneToMany(targetEntity = Movimiento.class)
	private List<Movimiento> moves;
}
