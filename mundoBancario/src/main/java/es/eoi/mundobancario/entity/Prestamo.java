package es.eoi.mundobancario.entity;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Prestamo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column
	private String description;
	
	@Column
	private Date date;
	
	@Column
	private Float amount;
	
	@Column
	private Integer deadlines;
	
	@ManyToOne(targetEntity = Cuenta.class)
	private Cuenta cuenta;
	
	@OneToMany(targetEntity = Amortizacion.class)
	private List<Amortizacion> amortizations;
	
}
