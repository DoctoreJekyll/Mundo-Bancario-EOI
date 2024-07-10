package es.eoi.mundobancario.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "Amortizaciones")
@Getter
@Setter
public class Amortizacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column
	private Date date;
	
	@Column
	private Float amount;
	
	@ManyToOne(targetEntity = Prestamo.class)
	private Prestamo loans;
}
