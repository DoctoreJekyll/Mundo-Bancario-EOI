package es.eoi.mundobancario.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Cuenta 
{
	private Integer id;
	private Integer numCuenta;
	private String alias;
	private double saldo;

}
