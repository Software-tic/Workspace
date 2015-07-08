package alert.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Facultades entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "facultades", schema = "zyos")
public class Facultades implements java.io.Serializable {

	// Fields

	private Long identificador;
	private String facultad;

	// Constructors

	/** default constructor */
	public Facultades() {
	}

	/** minimal constructor */
	public Facultades(Long identificador) {
		this.identificador = identificador;
	}

	/** full constructor */
	public Facultades(Long identificador, String facultad) {
		this.identificador = identificador;
		this.facultad = facultad;
	}

	// Property accessors
	@Id
	@Column(name = "identificador", unique = true, nullable = false)
	public Long getIdentificador() {
		return this.identificador;
	}

	public void setIdentificador(Long identificador) {
		this.identificador = identificador;
	}

	@Column(name = "facultad")
	public String getFacultad() {
		return this.facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

}