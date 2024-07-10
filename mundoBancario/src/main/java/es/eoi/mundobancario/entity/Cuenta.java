package es.eoi.mundobancario.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity(name = "Cuentas")
public class Cuenta 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column
	private Integer accNum;
	
	@Column
	private String alias;
	
	@Column
	private double balance;
	
	@ManyToOne(targetEntity = Cliente.class)
	Cliente cliente;
	
	@OneToMany(targetEntity = Movimiento.class)
	private List<Movimiento> moves;	
	
	@OneToMany(targetEntity = Prestamo.class)
	private List<Prestamo> prestamo;

}
