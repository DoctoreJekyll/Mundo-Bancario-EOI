package es.eoi.mundobancario.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "Clientes")
@Getter
@Setter
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column
	private String user;
	
	@Column
	private String pass;
	
	@Column
	private String name;
	
	@Column
	private String email;
	
	@OneToMany(targetEntity = Cuenta.class)
	private List<Cuenta> accounts;
}
